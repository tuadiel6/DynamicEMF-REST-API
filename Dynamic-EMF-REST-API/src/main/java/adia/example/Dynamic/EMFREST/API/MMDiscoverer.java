package adia.example.Dynamic.EMFREST.API;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.codegen.ecore.generator.Generator;
//import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import java.io.File;


/*
 * A listener to detect a newly added metamodel, generate GenModel automatically and generate the corresponding java code
 */
@Service
public class MMDiscoverer implements Runnable {
		
	private final Path directory = Paths.get("/Users/adielt./git/repository2/Dynamic-EMF-REST-API/src/main/resources/MDERepository");
	
	String outputDirectory = "/Users/adielt./git/repository2/Dynamic-EMF-REST-API/src/main/java";
		
    @PostConstruct
    public void init() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            // Register the Ecore resource factory
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

            // Create a WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Register the directory for watch with events to be monitored (only ENTRY_CREATE)
            directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

            // Infinite loop to watch for events
            while (true) {
                WatchKey key;
                try {
                    // Wait for an event
                    key = watchService.take();
                } catch (InterruptedException e) {
                    return;
                }

                // Process all events for the key
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    // Retrieve the file name associated with the event
                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();

                    // Notify that a new file was added
                    if (kind == StandardWatchEventKinds.ENTRY_CREATE && fileName.toString().endsWith(".ecore")) {
                        System.out.println("New file added: " + fileName);

                        // Generate genmodel file from Ecore model
                        generateGenModel(directory.resolve(fileName.toString()));
                        
                     // After generating the GenModel, print the contents of the output directory
                        codeRepo(outputDirectory);
                    }
                }

                // Reset the key
                boolean valid = key.reset();
                if (!valid) {
                    break; // Exit loop if directory is inaccessible
                }
            }
                       
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /*
    private void generateGenModel(Path ecoreFilePath) {
        try {
            // Load the Ecore model
            ResourceSet resourceSet = createResourceSet();
            Resource ecoreResource = loadEcoreModel(resourceSet, ecoreFilePath.toString());
            if (ecoreResource == null) return;

            // Extract the model name from the file name
            String fileName = ecoreFilePath.getFileName().toString();
            String modelName = fileName.substring(0, fileName.lastIndexOf('.'));

            // Create and configure the GenModel
            GenModel genModel = createGenModel(ecoreResource, ecoreFilePath.getParent().toString(), modelName);
            //setGenPackageBasePackage(genModel, "com.example");

            // Save the GenModel
            String genModelFileName = fileName.replace(".ecore", ".genmodel");
            Path genModelFilePath = ecoreFilePath.getParent().resolve("codegen").resolve(genModelFileName);
            saveGenModel(resourceSet, genModel, genModelFilePath.toString());

            // Optionally, generate code from the GenModel
            generateCode(genModel, ecoreFilePath.getParent().resolve("java").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    
    private void generateGenModel(Path ecoreFilePath) {
        try {
            // Load the Ecore model
            ResourceSet resourceSet = createResourceSet();
            Resource ecoreResource = loadEcoreModel(resourceSet, ecoreFilePath.toString());
            if (ecoreResource == null) return;

            // Extract the model name from the file name
            String fileName = ecoreFilePath.getFileName().toString();
            String modelName = fileName.substring(0, fileName.lastIndexOf('.'));

            
            // Create and configure the GenModel
            GenModel genModel = createGenModel(ecoreResource, ecoreFilePath.getParent().toString(), modelName);
            //setGenPackageBasePackage(genModel, "com.example");

            // Save the GenModel
            String genModelFileName = fileName.replace(".ecore", ".genmodel");
            
            // Ensure the "genModel" directory exists
            Path genModelDir = ecoreFilePath.getParent().resolve("genModel");
            if (!Files.exists(genModelDir)) {
                Files.createDirectories(genModelDir);
            }
            
            Path genModelFilePath = genModelDir.resolve(genModelFileName);
            saveGenModel(resourceSet, genModel, genModelFilePath.toString());
            
            
            //Path genModelFilePath = ecoreFilePath.getParent().resolve("codegen").resolve(genModelFileName);
            //saveGenModel(resourceSet, genModel, genModelFilePath.toString());

            // Optionally, generate code from the GenModel
            //generateCode(genModel, ecoreFilePath.getParent().resolve("java").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ResourceSet createResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMLResourceFactoryImpl());

        // Adding the URIConverter setup
        //resourceSet.getURIConverter().getURIMap().putAll(EcoreUtil.getURIMap());
        return resourceSet;
    }

    private Resource loadEcoreModel(ResourceSet resourceSet, String ecorePath) {
        System.out.println("Loading Ecore file: " + ecorePath);
        URI ecoreURI = URI.createFileURI(ecorePath);
        Resource ecoreResource = resourceSet.getResource(ecoreURI, true);
        try {
            ecoreResource.load(null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        if (ecoreResource.getContents().isEmpty()) {
            System.err.println("Error: The Ecore file does not contain any packages.");
            return null;
        }

        System.out.println("Loading Ecore file completed.");
        return ecoreResource;
    }

    private GenModel createGenModel(Resource ecoreResource, String outputDirectory, String modelName) {
        EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
        GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
        genModel.initialize(Collections.singleton(ePackage));
        genModel.setModelName(modelName);
        //genModel.setModelDirectory(outputDirectory.replace("\\", "/"));
        genModel.setModelDirectory("/Dynamic-EMF-REST-API/src/main/java");
        genModel.setCanGenerate(true);
        genModel.setValidateModel(true);

        System.out.println("Configuring GenModel completed.");
        return genModel;
    }

    private void setGenPackageBasePackage(GenModel genModel, String basePackage) {
        for (GenPackage genPackage : genModel.getGenPackages()) {
            genPackage.setBasePackage(basePackage);
        }
    }

    private void saveGenModel(ResourceSet resourceSet, GenModel genModel, String genModelPath) {
        URI genModelURI = URI.createFileURI(genModelPath);
        Resource genModelResource = resourceSet.createResource(genModelURI);
        genModelResource.getContents().add(genModel);
        try {
            genModelResource.save(null);
            System.out.println("Saving GenModel completed: " + genModelPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateCode(GenModel genModel, String outputDirectory) {
        genModel.reconcile();
        genModel.setCanGenerate(true);
        genModel.setValidateModel(true);
        genModel.setForceOverwrite(true);

        Generator generator = new Generator();
        generator.setInput(genModel);
        generator.getAdapterFactoryDescriptorRegistry().addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);

        boolean canGenerate = generator.canGenerate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE);
        System.out.println("Can generate: " + canGenerate);

        logGenModelDetails(genModel);

        if (canGenerate) {
            System.out.println("Starting MODEL_PROJECT_TYPE generation...");
            generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
            System.out.println("MODEL_PROJECT_TYPE generation completed.");
        } else {
            System.err.println("Cannot generate code. Please check the GenModel configuration.");
        }

        File generatedDir = new File(outputDirectory);
        File[] generatedFiles = generatedDir.listFiles();
        if (generatedFiles != null && generatedFiles.length > 0) {
            System.out.println("Java code generated successfully in the directory: " + outputDirectory);
            for (File file : generatedFiles) {
                System.out.println("Generated: " + file.getAbsolutePath());
            }
        } else {
            System.err.println("Error: No files generated in the output directory.");
        }
    }

    
    private void codeRepo(String outputDirectory) {
        File generatedDir = new File(outputDirectory);
        File[] generatedFiles = generatedDir.listFiles();

        if (generatedFiles != null && generatedFiles.length > 0) {
            System.out.println("Java code generated successfully in the directory: " + outputDirectory);
            for (File file : generatedFiles) {
                System.out.println("Generated: " + file.getAbsolutePath());
            }
        } else {
            System.err.println("Error: No files generated in the output directory.");
        }
    }
    
    
    private void logGenModelDetails(GenModel genModel) {
        System.out.println("-------------------:");
        System.out.println("GenModel Details:");
        System.out.println("Model Name: " + genModel.getModelName());
        System.out.println("Model Directory: " + genModel.getModelDirectory());
        System.out.println("Can Generate: " + genModel.canGenerate());
        System.out.println("Validate Model: " + genModel.isValidateModel());
        for (GenPackage genPackage : genModel.getGenPackages()) {
            System.out.println("GenPackage: " + genPackage.getEcorePackage().getName());
            System.out.println("Base Package: " + genPackage.getBasePackage());
        }
    }


}
