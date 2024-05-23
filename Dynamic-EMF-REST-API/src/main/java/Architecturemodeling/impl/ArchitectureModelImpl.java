/**
 */
package Architecturemodeling.impl;

import Architecturemodeling.ArchitectureElement;
import Architecturemodeling.ArchitectureModel;
import Architecturemodeling.ArchitecturemodelingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.impl.ArchitectureModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ArchitectureModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ArchitectureModelImpl#getArchitectureelements <em>Architectureelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureModelImpl extends MinimalEObjectImpl.Container implements ArchitectureModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArchitectureelements() <em>Architectureelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureElement> architectureelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturemodelingPackage.Literals.ARCHITECTURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.ARCHITECTURE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.ARCHITECTURE_MODEL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonManagedReference
	public EList<ArchitectureElement> getArchitectureelements() {
		if (architectureelements == null) {
			architectureelements = new EObjectContainmentWithInverseEList<ArchitectureElement>(ArchitectureElement.class, this, ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS, ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL);
		}
		return architectureelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArchitectureelements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				return ((InternalEList<?>)getArchitectureelements()).basicRemove(otherEnd, msgs);
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
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__NAME:
				return getName();
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__AUTHOR:
				return getAuthor();
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				return getArchitectureelements();
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
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__NAME:
				setName((String)newValue);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				getArchitectureelements().clear();
				getArchitectureelements().addAll((Collection<? extends ArchitectureElement>)newValue);
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
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				getArchitectureelements().clear();
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
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS:
				return architectureelements != null && !architectureelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //ArchitectureModelImpl
