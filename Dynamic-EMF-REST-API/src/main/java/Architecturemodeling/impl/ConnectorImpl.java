/**
 */
package Architecturemodeling.impl;

import Architecturemodeling.ArchitecturemodelingPackage;
import Architecturemodeling.Component;
import Architecturemodeling.Connector;
import Architecturemodeling.ConnectorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ConnectorImpl#isTwoWay <em>Two Way</em>}</li>
 *   <li>{@link Architecturemodeling.impl.ConnectorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends ArchitectureElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Component source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Component target;

	/**
	 * The default value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TWO_WAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected boolean twoWay = TWO_WAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorType TYPE_EDEFAULT = ConnectorType.OPTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturemodelingPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonBackReference
	public Component getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Component)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturemodelingPackage.CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Component newSource, NotificationChain msgs) {
		Component oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Component newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ArchitecturemodelingPackage.COMPONENT__OUTGOING, Component.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ArchitecturemodelingPackage.COMPONENT__OUTGOING, Component.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@JsonBackReference
	public Component getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Component)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturemodelingPackage.CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Component newTarget, NotificationChain msgs) {
		Component oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Component newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ArchitecturemodelingPackage.COMPONENT__INCOMING, Component.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ArchitecturemodelingPackage.COMPONENT__INCOMING, Component.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTwoWay() {
		return twoWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwoWay(boolean newTwoWay) {
		boolean oldTwoWay = twoWay;
		twoWay = newTwoWay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__TWO_WAY, oldTwoWay, twoWay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectorType newType) {
		ConnectorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturemodelingPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ArchitecturemodelingPackage.COMPONENT__OUTGOING, Component.class, msgs);
				return basicSetSource((Component)otherEnd, msgs);
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ArchitecturemodelingPackage.COMPONENT__INCOMING, Component.class, msgs);
				return basicSetTarget((Component)otherEnd, msgs);
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
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				return basicSetSource(null, msgs);
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				return basicSetTarget(null, msgs);
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
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ArchitecturemodelingPackage.CONNECTOR__TWO_WAY:
				return isTwoWay();
			case ArchitecturemodelingPackage.CONNECTOR__TYPE:
				return getType();
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
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				setSource((Component)newValue);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				setTarget((Component)newValue);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TWO_WAY:
				setTwoWay((Boolean)newValue);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TYPE:
				setType((ConnectorType)newValue);
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
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				setSource((Component)null);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				setTarget((Component)null);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TWO_WAY:
				setTwoWay(TWO_WAY_EDEFAULT);
				return;
			case ArchitecturemodelingPackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ArchitecturemodelingPackage.CONNECTOR__SOURCE:
				return source != null;
			case ArchitecturemodelingPackage.CONNECTOR__TARGET:
				return target != null;
			case ArchitecturemodelingPackage.CONNECTOR__TWO_WAY:
				return twoWay != TWO_WAY_EDEFAULT;
			case ArchitecturemodelingPackage.CONNECTOR__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (twoWay: ");
		result.append(twoWay);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
