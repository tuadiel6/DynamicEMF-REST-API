/**
 */
package Architecturemodeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Architecturemodeling.ArchitecturemodelingFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturemodelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Architecturemodeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.disim.univaq/architecturemodeling/v2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecturemodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturemodelingPackage eINSTANCE = Architecturemodeling.impl.ArchitecturemodelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Architecturemodeling.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Architecturemodeling.impl.ArchitectureModelImpl
	 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getArchitectureModel()
	 * @generated
	 */
	int ARCHITECTURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Architectureelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Architecturemodeling.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Architecturemodeling.impl.ArchitectureElementImpl
	 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getArchitectureElement()
	 * @generated
	 */
	int ARCHITECTURE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Highlighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__HIGHLIGHTED = 1;

	/**
	 * The feature id for the '<em><b>Archmodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__ARCHMODEL = 2;

	/**
	 * The number of structural features of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Architecturemodeling.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Architecturemodeling.impl.ComponentImpl
	 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Highlighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HIGHLIGHTED = ARCHITECTURE_ELEMENT__HIGHLIGHTED;

	/**
	 * The feature id for the '<em><b>Archmodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ARCHMODEL = ARCHITECTURE_ELEMENT__ARCHMODEL;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CHILD = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTGOING = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCOMING = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTS = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MANDATORY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POSITION_X = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POSITION_Y = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Architecturemodeling.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Architecturemodeling.impl.ConnectorImpl
	 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Highlighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HIGHLIGHTED = ARCHITECTURE_ELEMENT__HIGHLIGHTED;

	/**
	 * The feature id for the '<em><b>Archmodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ARCHMODEL = ARCHITECTURE_ELEMENT__ARCHMODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Two Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TWO_WAY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Architecturemodeling.ConnectorType <em>Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Architecturemodeling.ConnectorType
	 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link Architecturemodeling.ArchitectureModel <em>Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Model</em>'.
	 * @see Architecturemodeling.ArchitectureModel
	 * @generated
	 */
	EClass getArchitectureModel();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.ArchitectureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Architecturemodeling.ArchitectureModel#getName()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EAttribute getArchitectureModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.ArchitectureModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see Architecturemodeling.ArchitectureModel#getAuthor()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EAttribute getArchitectureModel_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link Architecturemodeling.ArchitectureModel#getArchitectureelements <em>Architectureelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectureelements</em>'.
	 * @see Architecturemodeling.ArchitectureModel#getArchitectureelements()
	 * @see #getArchitectureModel()
	 * @generated
	 */
	EReference getArchitectureModel_Architectureelements();

	/**
	 * Returns the meta object for class '{@link Architecturemodeling.ArchitectureElement <em>Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Element</em>'.
	 * @see Architecturemodeling.ArchitectureElement
	 * @generated
	 */
	EClass getArchitectureElement();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.ArchitectureElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Architecturemodeling.ArchitectureElement#getName()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EAttribute getArchitectureElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.ArchitectureElement#isHighlighted <em>Highlighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlighted</em>'.
	 * @see Architecturemodeling.ArchitectureElement#isHighlighted()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EAttribute getArchitectureElement_Highlighted();

	/**
	 * Returns the meta object for the container reference '{@link Architecturemodeling.ArchitectureElement#getArchmodel <em>Archmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Archmodel</em>'.
	 * @see Architecturemodeling.ArchitectureElement#getArchmodel()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EReference getArchitectureElement_Archmodel();

	/**
	 * Returns the meta object for class '{@link Architecturemodeling.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Architecturemodeling.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link Architecturemodeling.Component#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see Architecturemodeling.Component#getChild()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Child();

	/**
	 * Returns the meta object for the reference list '{@link Architecturemodeling.Component#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see Architecturemodeling.Component#getOutgoing()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link Architecturemodeling.Component#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see Architecturemodeling.Component#getIncoming()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link Architecturemodeling.Component#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see Architecturemodeling.Component#getImplements()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implements();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Component#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see Architecturemodeling.Component#getMandatory()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Component#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see Architecturemodeling.Component#getPositionX()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Component#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see Architecturemodeling.Component#getPositionY()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Architecturemodeling.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for class '{@link Architecturemodeling.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see Architecturemodeling.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link Architecturemodeling.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Architecturemodeling.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link Architecturemodeling.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Architecturemodeling.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Connector#isTwoWay <em>Two Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Two Way</em>'.
	 * @see Architecturemodeling.Connector#isTwoWay()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TwoWay();

	/**
	 * Returns the meta object for the attribute '{@link Architecturemodeling.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Architecturemodeling.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for enum '{@link Architecturemodeling.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Type</em>'.
	 * @see Architecturemodeling.ConnectorType
	 * @generated
	 */
	EEnum getConnectorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitecturemodelingFactory getArchitecturemodelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Architecturemodeling.impl.ArchitectureModelImpl <em>Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Architecturemodeling.impl.ArchitectureModelImpl
		 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getArchitectureModel()
		 * @generated
		 */
		EClass ARCHITECTURE_MODEL = eINSTANCE.getArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_MODEL__NAME = eINSTANCE.getArchitectureModel_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_MODEL__AUTHOR = eINSTANCE.getArchitectureModel_Author();

		/**
		 * The meta object literal for the '<em><b>Architectureelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS = eINSTANCE.getArchitectureModel_Architectureelements();

		/**
		 * The meta object literal for the '{@link Architecturemodeling.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Architecturemodeling.impl.ArchitectureElementImpl
		 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getArchitectureElement()
		 * @generated
		 */
		EClass ARCHITECTURE_ELEMENT = eINSTANCE.getArchitectureElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_ELEMENT__NAME = eINSTANCE.getArchitectureElement_Name();

		/**
		 * The meta object literal for the '<em><b>Highlighted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_ELEMENT__HIGHLIGHTED = eINSTANCE.getArchitectureElement_Highlighted();

		/**
		 * The meta object literal for the '<em><b>Archmodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_ELEMENT__ARCHMODEL = eINSTANCE.getArchitectureElement_Archmodel();

		/**
		 * The meta object literal for the '{@link Architecturemodeling.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Architecturemodeling.impl.ComponentImpl
		 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CHILD = eINSTANCE.getComponent_Child();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTGOING = eINSTANCE.getComponent_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INCOMING = eINSTANCE.getComponent_Incoming();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTS = eINSTANCE.getComponent_Implements();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MANDATORY = eINSTANCE.getComponent_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__POSITION_X = eINSTANCE.getComponent_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__POSITION_Y = eINSTANCE.getComponent_PositionY();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '{@link Architecturemodeling.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Architecturemodeling.impl.ConnectorImpl
		 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

		/**
		 * The meta object literal for the '<em><b>Two Way</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TWO_WAY = eINSTANCE.getConnector_TwoWay();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '{@link Architecturemodeling.ConnectorType <em>Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Architecturemodeling.ConnectorType
		 * @see Architecturemodeling.impl.ArchitecturemodelingPackageImpl#getConnectorType()
		 * @generated
		 */
		EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

	}

} //ArchitecturemodelingPackage
