/**
 */
package Architecturemodeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.Component#getChild <em>Child</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getImplements <em>Implements</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link Architecturemodeling.Component#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link Architecturemodeling.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Child()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureElement> getChild();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link Architecturemodeling.Connector}.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Outgoing()
	 * @see Architecturemodeling.Connector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connector> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link Architecturemodeling.Connector}.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Incoming()
	 * @see Architecturemodeling.Connector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connector> getIncoming();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link Architecturemodeling.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Implements()
	 * @model
	 * @generated
	 */
	EList<Component> getImplements();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(Boolean)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Mandatory()
	 * @model default="false"
	 * @generated
	 */
	Boolean getMandatory();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Component#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(float)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_PositionX()
	 * @model
	 * @generated
	 */
	float getPositionX();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Component#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(float value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(float)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_PositionY()
	 * @model
	 * @generated
	 */
	float getPositionY();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Component#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getComponent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Component#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Component
