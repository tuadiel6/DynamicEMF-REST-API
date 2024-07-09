/**
 */
package ProductManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProductManagement.ProductModel#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see ProductManagement.ProductManagementPackage#getProductModel()
 * @model
 * @generated
 */
public interface ProductModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference.
	 * @see #setProducts(Product)
	 * @see ProductManagement.ProductManagementPackage#getProductModel_Products()
	 * @model containment="true"
	 * @generated
	 */
	Product getProducts();

	/**
	 * Sets the value of the '{@link ProductManagement.ProductModel#getProducts <em>Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' containment reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Product value);

} // ProductModel
