/**
 */
package Example.impl;

import Example.ExamplePackage;
import Example.Family;
import Example.FamilyModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Example.impl.FamilyModelImpl#getFamilys <em>Familys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyModelImpl extends MinimalEObjectImpl.Container implements FamilyModel {
	/**
	 * The cached value of the '{@link #getFamilys() <em>Familys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilys()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> familys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.FAMILY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonManagedReference
	public EList<Family> getFamilys() {
		if (familys == null) {
			familys = new EObjectContainmentEList<Family>(Family.class, this, ExamplePackage.FAMILY_MODEL__FAMILYS);
		}
		return familys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExamplePackage.FAMILY_MODEL__FAMILYS:
				return ((InternalEList<?>)getFamilys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExamplePackage.FAMILY_MODEL__FAMILYS:
				return getFamilys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExamplePackage.FAMILY_MODEL__FAMILYS:
				getFamilys().clear();
				getFamilys().addAll((Collection<? extends Family>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExamplePackage.FAMILY_MODEL__FAMILYS:
				getFamilys().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExamplePackage.FAMILY_MODEL__FAMILYS:
				return familys != null && !familys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyModelImpl
