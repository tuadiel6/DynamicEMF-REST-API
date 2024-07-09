/**
 */
package ProductManagement.impl;

import ProductManagement.Product;
import ProductManagement.ProductManagementPackage;
import ProductManagement.ProductModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProductManagement.impl.ProductModelImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductModelImpl extends EObjectImpl implements ProductModel {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Product products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.PRODUCT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducts(Product newProducts, NotificationChain msgs) {
		Product oldProducts = products;
		products = newProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductManagementPackage.PRODUCT_MODEL__PRODUCTS, oldProducts, newProducts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducts(Product newProducts) {
		if (newProducts != products) {
			NotificationChain msgs = null;
			if (products != null)
				msgs = ((InternalEObject)products).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductManagementPackage.PRODUCT_MODEL__PRODUCTS, null, msgs);
			if (newProducts != null)
				msgs = ((InternalEObject)newProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductManagementPackage.PRODUCT_MODEL__PRODUCTS, null, msgs);
			msgs = basicSetProducts(newProducts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductManagementPackage.PRODUCT_MODEL__PRODUCTS, newProducts, newProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MODEL__PRODUCTS:
				return basicSetProducts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MODEL__PRODUCTS:
				return getProducts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MODEL__PRODUCTS:
				setProducts((Product)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MODEL__PRODUCTS:
				setProducts((Product)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MODEL__PRODUCTS:
				return products != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductModelImpl
