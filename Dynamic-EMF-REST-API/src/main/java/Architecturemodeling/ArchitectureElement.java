/**
 */
package Architecturemodeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.ArchitectureElement#getName <em>Name</em>}</li>
 *   <li>{@link Architecturemodeling.ArchitectureElement#isHighlighted <em>Highlighted</em>}</li>
 *   <li>{@link Architecturemodeling.ArchitectureElement#getArchmodel <em>Archmodel</em>}</li>
 * </ul>
 *
 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureElement()
 * @model
 * @generated
 */
public interface ArchitectureElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Architecturemodeling.ArchitectureElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Highlighted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlighted</em>' attribute.
	 * @see #setHighlighted(boolean)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureElement_Highlighted()
	 * @model default="false"
	 * @generated
	 */
	boolean isHighlighted();

	/**
	 * Sets the value of the '{@link Architecturemodeling.ArchitectureElement#isHighlighted <em>Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlighted</em>' attribute.
	 * @see #isHighlighted()
	 * @generated
	 */
	void setHighlighted(boolean value);

	/**
	 * Returns the value of the '<em><b>Archmodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.ArchitectureModel#getArchitectureelements <em>Architectureelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archmodel</em>' container reference.
	 * @see #setArchmodel(ArchitectureModel)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureElement_Archmodel()
	 * @see Architecturemodeling.ArchitectureModel#getArchitectureelements
	 * @model opposite="architectureelements" transient="false"
	 * @generated
	 */
	ArchitectureModel getArchmodel();

	/**
	 * Sets the value of the '{@link Architecturemodeling.ArchitectureElement#getArchmodel <em>Archmodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archmodel</em>' container reference.
	 * @see #getArchmodel()
	 * @generated
	 */
	void setArchmodel(ArchitectureModel value);

} // ArchitectureElement
