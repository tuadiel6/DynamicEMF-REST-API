/**
 */
package Architecturemodeling.impl;

import Architecturemodeling.ArchitectureElement;
import Architecturemodeling.ArchitectureModel;
import Architecturemodeling.ArchitecturemodelingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.impl.ArchitectureElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ArchitectureElementImpl#isHighlighted <em>Highlighted</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ArchitectureElementImpl#getArchmodel <em>Archmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureElementImpl extends MinimalEObjectImpl.Container implements ArchitectureElement {
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
	 * The default value of the '{@link #isHighlighted() <em>Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighlighted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGHLIGHTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHighlighted() <em>Highlighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighlighted()
	 * @generated
	 * @ordered
	 */
	protected boolean highlighted = HIGHLIGHTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturemodelingPackage.Literals.ARCHITECTURE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHighlighted() {
		return highlighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighlighted(boolean newHighlighted) {
		boolean oldHighlighted = highlighted;
		highlighted = newHighlighted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__HIGHLIGHTED, oldHighlighted, highlighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonBackReference
	public ArchitectureModel getArchmodel() {
		if (eContainerFeatureID() != ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL) return null;
		return (ArchitectureModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchmodel(ArchitectureModel newArchmodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newArchmodel, ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchmodel(ArchitectureModel newArchmodel) {
		if (newArchmodel != eInternalContainer() || (eContainerFeatureID() != ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL && newArchmodel != null)) {
			if (EcoreUtil.isAncestor(this, newArchmodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArchmodel != null)
				msgs = ((InternalEObject)newArchmodel).eInverseAdd(this, ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS, ArchitectureModel.class, msgs);
			msgs = basicSetArchmodel(newArchmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL, newArchmodel, newArchmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetArchmodel((ArchitectureModel)otherEnd, msgs);
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
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				return basicSetArchmodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				return eInternalContainer().eInverseRemove(this, ArchitecturemodelingPackage.ARCHITECTURE_MODEL__ARCHITECTUREELEMENTS, ArchitectureModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__NAME:
				return getName();
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__HIGHLIGHTED:
				return isHighlighted();
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				return getArchmodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__HIGHLIGHTED:
				setHighlighted((Boolean)newValue);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				setArchmodel((ArchitectureModel)newValue);
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
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__HIGHLIGHTED:
				setHighlighted(HIGHLIGHTED_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				setArchmodel((ArchitectureModel)null);
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
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__HIGHLIGHTED:
				return highlighted != HIGHLIGHTED_EDEFAULT;
			case ArchitecturemodelingPackage.ARCHITECTURE_ELEMENT__ARCHMODEL:
				return getArchmodel() != null;
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
		result.append(", highlighted: ");
		result.append(highlighted);
		result.append(')');
		return result.toString();
	}

} //ArchitectureElementImpl
