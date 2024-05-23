/**
 */
package Architecturemodeling.impl;

import Architecturemodeling.ArchitectureElement;
import Architecturemodeling.ArchitecturemodelingPackage;
import Architecturemodeling.Component;
import Architecturemodeling.Connector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getChild <em>Child</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ComponentImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ArchitectureElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureElement> child;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> incoming;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> implements_;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANDATORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected Boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected float positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected float positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturemodelingPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonManagedReference
	public EList<ArchitectureElement> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<ArchitectureElement>(ArchitectureElement.class, this, ArchitecturemodelingPackage.COMPONENT__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonManagedReference
	public EList<Connector> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this, ArchitecturemodelingPackage.COMPONENT__OUTGOING, ArchitecturemodelingPackage.CONNECTOR__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonManagedReference
	public EList<Connector> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this, ArchitecturemodelingPackage.COMPONENT__INCOMING, ArchitecturemodelingPackage.CONNECTOR__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonBackReference
	public EList<Component> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<Component>(Component.class, this, ArchitecturemodelingPackage.COMPONENT__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(Boolean newMandatory) {
		Boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.COMPONENT__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(float newPositionX) {
		float oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.COMPONENT__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(float newPositionY) {
		float oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.COMPONENT__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.COMPONENT__ID, oldId, id));
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
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case ArchitecturemodelingPackage.COMPONENT__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case ArchitecturemodelingPackage.COMPONENT__CHILD:
				return getChild();
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				return getOutgoing();
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				return getIncoming();
			case ArchitecturemodelingPackage.COMPONENT__IMPLEMENTS:
				return getImplements();
			case ArchitecturemodelingPackage.COMPONENT__MANDATORY:
				return getMandatory();
			case ArchitecturemodelingPackage.COMPONENT__POSITION_X:
				return getPositionX();
			case ArchitecturemodelingPackage.COMPONENT__POSITION_Y:
				return getPositionY();
			case ArchitecturemodelingPackage.COMPONENT__ID:
				return getId();
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
			case ArchitecturemodelingPackage.COMPONENT__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends ArchitectureElement>)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Connector>)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Connector>)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__POSITION_X:
				setPositionX((Float)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__POSITION_Y:
				setPositionY((Float)newValue);
				return;
			case ArchitecturemodelingPackage.COMPONENT__ID:
				setId((String)newValue);
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
			case ArchitecturemodelingPackage.COMPONENT__CHILD:
				getChild().clear();
				return;
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				getOutgoing().clear();
				return;
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				getIncoming().clear();
				return;
			case ArchitecturemodelingPackage.COMPONENT__IMPLEMENTS:
				getImplements().clear();
				return;
			case ArchitecturemodelingPackage.COMPONENT__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.COMPONENT__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.COMPONENT__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.COMPONENT__ID:
				setId(ID_EDEFAULT);
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
			case ArchitecturemodelingPackage.COMPONENT__CHILD:
				return child != null && !child.isEmpty();
			case ArchitecturemodelingPackage.COMPONENT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ArchitecturemodelingPackage.COMPONENT__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ArchitecturemodelingPackage.COMPONENT__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case ArchitecturemodelingPackage.COMPONENT__MANDATORY:
				return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
			case ArchitecturemodelingPackage.COMPONENT__POSITION_X:
				return positionX != POSITION_X_EDEFAULT;
			case ArchitecturemodelingPackage.COMPONENT__POSITION_Y:
				return positionY != POSITION_Y_EDEFAULT;
			case ArchitecturemodelingPackage.COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
