/**
 */
package Architecturemodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Architecturemodeling.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link Architecturemodeling.Connector#getTarget <em>Target</em>}</li>
 *   <li>{@link Architecturemodeling.Connector#isTwoWay <em>Two Way</em>}</li>
 *   <li>{@link Architecturemodeling.Connector#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.Component#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnector_Source()
	 * @see Architecturemodeling.Component#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Architecturemodeling.Component#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Component)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnector_Target()
	 * @see Architecturemodeling.Component#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Component getTarget();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Component value);

	/**
	 * Returns the value of the '<em><b>Two Way</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Way</em>' attribute.
	 * @see #setTwoWay(boolean)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnector_TwoWay()
	 * @model default="false"
	 * @generated
	 */
	boolean isTwoWay();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Connector#isTwoWay <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Two Way</em>' attribute.
	 * @see #isTwoWay()
	 * @generated
	 */
	void setTwoWay(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Architecturemodeling.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Architecturemodeling.ConnectorType
	 * @see #setType(ConnectorType)
	 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnector_Type()
	 * @model required="true"
	 * @generated
	 */
	ConnectorType getType();

	/**
	 * Sets the value of the '{@link Architecturemodeling.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Architecturemodeling.ConnectorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorType value);

} // Connector
