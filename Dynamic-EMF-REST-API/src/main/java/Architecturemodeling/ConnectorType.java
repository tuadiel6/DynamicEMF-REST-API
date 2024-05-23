/**
 */
package Architecturemodeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Architecturemodeling.ArchitecturemodelingPackage#getConnectorType()
 * @model
 * @generated
 */
public enum ConnectorType implements Enumerator {
	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(0, "optional", "optional"),

	/**
	 * The '<em><b>Onetoone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONETOONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONETOONE(1, "onetoone", "onetoone"),

	/**
	 * The '<em><b>Onetomany</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONETOMANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONETOMANY(2, "onetomany", "onetomany"),

	/**
	 * The '<em><b>Manytoone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANYTOONE_VALUE
	 * @generated
	 * @ordered
	 */
	MANYTOONE(3, "manytoone", "manytoone"),

	/**
	 * The '<em><b>Manytomany</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANYTOMANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANYTOMANY(4, "manytomany", "manytomany");

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Onetoone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONETOONE
	 * @model name="onetoone"
	 * @generated
	 * @ordered
	 */
	public static final int ONETOONE_VALUE = 1;

	/**
	 * The '<em><b>Onetomany</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONETOMANY
	 * @model name="onetomany"
	 * @generated
	 * @ordered
	 */
	public static final int ONETOMANY_VALUE = 2;

	/**
	 * The '<em><b>Manytoone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANYTOONE
	 * @model name="manytoone"
	 * @generated
	 * @ordered
	 */
	public static final int MANYTOONE_VALUE = 3;

	/**
	 * The '<em><b>Manytomany</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANYTOMANY
	 * @model name="manytomany"
	 * @generated
	 * @ordered
	 */
	public static final int MANYTOMANY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorType[] VALUES_ARRAY =
		new ConnectorType[] {
			OPTIONAL,
			ONETOONE,
			ONETOMANY,
			MANYTOONE,
			MANYTOMANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(int value) {
		switch (value) {
			case OPTIONAL_VALUE: return OPTIONAL;
			case ONETOONE_VALUE: return ONETOONE;
			case ONETOMANY_VALUE: return ONETOMANY;
			case MANYTOONE_VALUE: return MANYTOONE;
			case MANYTOMANY_VALUE: return MANYTOMANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectorType
