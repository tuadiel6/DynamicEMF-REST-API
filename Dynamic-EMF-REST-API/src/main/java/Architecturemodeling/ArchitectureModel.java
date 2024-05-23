/**
 */
package Architecturemodeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.ArchitectureModel#getName <em>Name</em>}</li>
 *   <li>{@link Architecturemodeling.ArchitectureModel#getAuthor <em>Author</em>}</li>
 *   <li>{@link Architecturemodeling.ArchitectureModel#getArchitectureelements <em>Architectureelements</em>}</li>
 * </ul>
 *
 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureModel()
 * @model
 * @generated
 */
public interface ArchitectureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Architecturemodeling.ArchitectureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link Architecturemodeling.ArchitectureModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Architectureelements</b></em>' containment reference list.
	 * The list contents are of type {@link Architecturemodeling.ArchitectureElement}.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.ArchitectureElement#getArchmodel <em>Archmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectureelements</em>' containment reference list.
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getArchitectureModel_Architectureelements()
	 * @see Architecturemodeling.ArchitectureElement#getArchmodel
	 * @model opposite="archmodel" containment="true" required="true"
	 * @generated
	 */
	EList<ArchitectureElement> getArchitectureelements();

} // ArchitectureModel
