/**
 */
package org.talend.core.model.metadata.builder.connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAPBW Table Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getLogicalName <em>Logical Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTexts <em>Texts</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTimeDependentAttr <em>Time Dependent Attr</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getAttrTableName <em>Attr Table Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isLanguageDependentText <em>Language Dependent Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isMediumText <em>Medium Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isShortText <em>Short Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getTextTableName <em>Text Table Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTimeDependentText <em>Time Dependent Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isLowerCaseAllowed <em>Lower Case Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField()
 * @model
 * @generated
 */
public interface SAPBWTableField extends SAPTableField {

    /**
     * Returns the value of the '<em><b>Logical Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logical Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logical Name</em>' attribute.
     * @see #setLogicalName(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_LogicalName()
     * @model
     * @generated
     */
    String getLogicalName();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getLogicalName <em>Logical Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logical Name</em>' attribute.
     * @see #getLogicalName()
     * @generated
     */
    void setLogicalName(String value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' attribute.
     * @see #setAttributes(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_Attributes()
     * @model default="false"
     * @generated
     */
    boolean isAttributes();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isAttributes <em>Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attributes</em>' attribute.
     * @see #isAttributes()
     * @generated
     */
    void setAttributes(boolean value);

    /**
     * Returns the value of the '<em><b>Hierarchies</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchies</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchies</em>' attribute.
     * @see #setHierarchies(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_Hierarchies()
     * @model default="false"
     * @generated
     */
    boolean isHierarchies();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isHierarchies <em>Hierarchies</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hierarchies</em>' attribute.
     * @see #isHierarchies()
     * @generated
     */
    void setHierarchies(boolean value);

    /**
     * Returns the value of the '<em><b>Texts</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Texts</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Texts</em>' attribute.
     * @see #setTexts(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_Texts()
     * @model default="false"
     * @generated
     */
    boolean isTexts();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTexts <em>Texts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Texts</em>' attribute.
     * @see #isTexts()
     * @generated
     */
    void setTexts(boolean value);

    /**
     * Returns the value of the '<em><b>Time Dependent Attr</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Dependent Attr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Dependent Attr</em>' attribute.
     * @see #setTimeDependentAttr(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_TimeDependentAttr()
     * @model default="false"
     * @generated
     */
    boolean isTimeDependentAttr();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTimeDependentAttr <em>Time Dependent Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Dependent Attr</em>' attribute.
     * @see #isTimeDependentAttr()
     * @generated
     */
    void setTimeDependentAttr(boolean value);

    /**
     * Returns the value of the '<em><b>Attr Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attr Table Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attr Table Name</em>' attribute.
     * @see #setAttrTableName(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_AttrTableName()
     * @model
     * @generated
     */
    String getAttrTableName();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getAttrTableName <em>Attr Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attr Table Name</em>' attribute.
     * @see #getAttrTableName()
     * @generated
     */
    void setAttrTableName(String value);

    /**
     * Returns the value of the '<em><b>Language Dependent Text</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language Dependent Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language Dependent Text</em>' attribute.
     * @see #setLanguageDependentText(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_LanguageDependentText()
     * @model default="false"
     * @generated
     */
    boolean isLanguageDependentText();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isLanguageDependentText <em>Language Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language Dependent Text</em>' attribute.
     * @see #isLanguageDependentText()
     * @generated
     */
    void setLanguageDependentText(boolean value);

    /**
     * Returns the value of the '<em><b>Medium Text</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Medium Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Medium Text</em>' attribute.
     * @see #setMediumText(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_MediumText()
     * @model default="false"
     * @generated
     */
    boolean isMediumText();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isMediumText <em>Medium Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Medium Text</em>' attribute.
     * @see #isMediumText()
     * @generated
     */
    void setMediumText(boolean value);

    /**
     * Returns the value of the '<em><b>Short Text</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Text</em>' attribute.
     * @see #setShortText(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_ShortText()
     * @model default="false"
     * @generated
     */
    boolean isShortText();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isShortText <em>Short Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Text</em>' attribute.
     * @see #isShortText()
     * @generated
     */
    void setShortText(boolean value);

    /**
     * Returns the value of the '<em><b>Text Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Table Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Table Name</em>' attribute.
     * @see #setTextTableName(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_TextTableName()
     * @model
     * @generated
     */
    String getTextTableName();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#getTextTableName <em>Text Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Table Name</em>' attribute.
     * @see #getTextTableName()
     * @generated
     */
    void setTextTableName(String value);

    /**
     * Returns the value of the '<em><b>Time Dependent Text</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Dependent Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Dependent Text</em>' attribute.
     * @see #setTimeDependentText(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_TimeDependentText()
     * @model default="false"
     * @generated
     */
    boolean isTimeDependentText();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isTimeDependentText <em>Time Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Dependent Text</em>' attribute.
     * @see #isTimeDependentText()
     * @generated
     */
    void setTimeDependentText(boolean value);

    /**
     * Returns the value of the '<em><b>Lower Case Allowed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Case Allowed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Case Allowed</em>' attribute.
     * @see #setLowerCaseAllowed(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTableField_LowerCaseAllowed()
     * @model default="false"
     * @generated
     */
    boolean isLowerCaseAllowed();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTableField#isLowerCaseAllowed <em>Lower Case Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Case Allowed</em>' attribute.
     * @see #isLowerCaseAllowed()
     * @generated
     */
    void setLowerCaseAllowed(boolean value);

} // SAPBWTableField
