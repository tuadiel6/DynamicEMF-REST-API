# Dynamic provisioning of RESTful services for Model Management

<p align="justify">We present an approach for provisioning a REST API middleware for a distributed modeling platform. This approach leverages model reflection to dynamically provide a REST API specifically tailored to the metamodels and models stored in the repository.</p>

<div align="justify">Our approach consists of the following main components: (a) an MDE (Model-Driven Engineering) repository, (b) a middleware interface, which offers a REST API to access the models stored within the MDE repository, and (c) discovery component to detect a metamodel update and generating Java code </div>

## (a) MDE Repository
This repository was created to store model-based artifacts, primarily focusing on metamodels and their corresponding models.

## (b) Middleware
The middleware has been developed using the [Spring Boot framework](https://spring.io/projects/spring-boot), a component of the Spring ecosystem that simplifies application development by reducing manual configuration. Spring Boot simplifies service setup and deployment with an embedded server, facilitating the creation of microservices in our REST API middleware. In our approach, the middleware is responsible for enabling the interaction with the stored models.
<p align="justify">The implemented middleware follows a three-layer architecture, inspired by the Spring Boot framework, consisting of the code repository, service, and controller layers. Below, we describe the main responsibilities of each layer in our approach:</p>

### (1) Code Repository Layer
<p align="justify">This layer is the primary gateway for data access within our system. It handles the retrieval, storage, and manipulation of data, encapsulating fundamental CRUD (Create, Read, Update, Delete) operations and translating them into model manipulation operations.</p>

> [!NOTE]
> It is important to note that this layer executes model operations in stateless mode, thus ensuring that each operation is self-contained and independent.

### (2) Service Layer
<p align="justify">This layer acts as an intermediary between the Repository and Controller layers, encapsulating the application's core business logic. It processes model data to be provided as a REST service. This layer also includes a Model Validator, which checks whether the model adheres to the metamodel's formal specification and constraints, ensuring it is suitable for further manipulation.</p>

### (3) Controller Layer
<p align="justify">This layer exposes the REST API endpoints, managing incoming requests, processing them, and formulating appropriate responses, thereby facilitating client interaction with the middleware.</p>

#### Operational flow
> [!TIP]
> An example of an operational flow is described as follows: The operational flow begins at the controller layer, which handles incoming requests. The service layer processes these requests, often requiring data interactions with the code repository layer. Once processing is complete, the service layer relays the outcomes to the controller, which then builds a response.

### [Swagger](https://swagger.io/)
<p align="justify">To alleviate the complexity of metamodel’s structures and enable model manipulation operations without a deep understanding of the underlying concepts, we rely on Swagger, a specification to document and present REST API endpoints.</p>

## (c) Discovery component
<p align="justify">The provisioning process is launched whenever an update is introduced into the MDE Repository. Upon detecting a metamodel update, the process performs two steps: (1) updating the generator model (GenModel) and (2) generating the corresponding Java code. Once the GenModel is updated, the system regenerates the corresponding Java code, ensuring the new (or updated) metamodel is fully integrated into our middleware without the need to redeploy and restart the application.</p>

> [!NOTE]
> A GenModel is a configuration model used by EMF to generate Java code from metamodels that will be hosted in the code repository.
