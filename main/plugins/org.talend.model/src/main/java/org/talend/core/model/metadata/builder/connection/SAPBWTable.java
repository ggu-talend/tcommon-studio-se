/**
 */
package org.talend.core.model.metadata.builder.connection;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAPBW Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getSourceSystemName <em>Source System Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getInfoAreaName <em>Info Area Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getLastModifiedAt <em>Last Modified At</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isInMemoryOptimized <em>In Memory Optimized</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isInsertOnly <em>Insert Only</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isKeyUnique <em>Key Unique</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isTexts <em>Texts</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getAttributesSize <em>Attributes Size</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getTextsSize <em>Texts Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable()
 * @model
 * @generated
 */
public interface SAPBWTable extends SAPTable {

    /**
     * Returns the value of the '<em><b>Model Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Type</em>' attribute.
     * @see #setModelType(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_ModelType()
     * @model
     * @generated
     */
    String getModelType();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getModelType <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Type</em>' attribute.
     * @see #getModelType()
     * @generated
     */
    void setModelType(String value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_Active()
     * @model
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Source System Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source System Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source System Name</em>' attribute.
     * @see #setSourceSystemName(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_SourceSystemName()
     * @model
     * @generated
     */
    String getSourceSystemName();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getSourceSystemName <em>Source System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source System Name</em>' attribute.
     * @see #getSourceSystemName()
     * @generated
     */
    void setSourceSystemName(String value);

    /**
     * Returns the value of the '<em><b>Last Modified At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Modified At</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Modified At</em>' attribute.
     * @see #setLastModifiedAt(Date)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_LastModifiedAt()
     * @model
     * @generated
     */
    Date getLastModifiedAt();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getLastModifiedAt <em>Last Modified At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Modified At</em>' attribute.
     * @see #getLastModifiedAt()
     * @generated
     */
    void setLastModifiedAt(Date value);

    /**
     * Returns the value of the '<em><b>Info Area Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Info Area Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Info Area Name</em>' attribute.
     * @see #setInfoAreaName(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_InfoAreaName()
     * @model
     * @generated
     */
    String getInfoAreaName();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getInfoAreaName <em>Info Area Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Info Area Name</em>' attribute.
     * @see #getInfoAreaName()
     * @generated
     */
    void setInfoAreaName(String value);

    /**
     * Returns the value of the '<em><b>Last Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Modified By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Modified By</em>' attribute.
     * @see #setLastModifiedBy(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_LastModifiedBy()
     * @model
     * @generated
     */
    String getLastModifiedBy();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getLastModifiedBy <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Modified By</em>' attribute.
     * @see #getLastModifiedBy()
     * @generated
     */
    void setLastModifiedBy(String value);

    /**
     * Returns the value of the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' attribute.
     * @see #setOwner(String)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_Owner()
     * @model
     * @generated
     */
    String getOwner();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' attribute.
     * @see #getOwner()
     * @generated
     */
    void setOwner(String value);

    /**
     * Returns the value of the '<em><b>In Memory Optimized</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Memory Optimized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Memory Optimized</em>' attribute.
     * @see #setInMemoryOptimized(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_InMemoryOptimized()
     * @model default="false"
     * @generated
     */
    boolean isInMemoryOptimized();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isInMemoryOptimized <em>In Memory Optimized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Memory Optimized</em>' attribute.
     * @see #isInMemoryOptimized()
     * @generated
     */
    void setInMemoryOptimized(boolean value);

    /**
     * Returns the value of the '<em><b>Insert Only</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Insert Only</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Insert Only</em>' attribute.
     * @see #setInsertOnly(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_InsertOnly()
     * @model default="false"
     * @generated
     */
    boolean isInsertOnly();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isInsertOnly <em>Insert Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Insert Only</em>' attribute.
     * @see #isInsertOnly()
     * @generated
     */
    void setInsertOnly(boolean value);

    /**
     * Returns the value of the '<em><b>Key Unique</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Unique</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Unique</em>' attribute.
     * @see #setKeyUnique(boolean)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_KeyUnique()
     * @model default="false"
     * @generated
     */
    boolean isKeyUnique();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isKeyUnique <em>Key Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Unique</em>' attribute.
     * @see #isKeyUnique()
     * @generated
     */
    void setKeyUnique(boolean value);

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
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_Hierarchies()
     * @model default="false"
     * @generated
     */
    boolean isHierarchies();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isHierarchies <em>Hierarchies</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hierarchies</em>' attribute.
     * @see #isHierarchies()
     * @generated
     */
    void setHierarchies(boolean value);

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
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_Attributes()
     * @model default="false"
     * @generated
     */
    boolean isAttributes();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isAttributes <em>Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attributes</em>' attribute.
     * @see #isAttributes()
     * @generated
     */
    void setAttributes(boolean value);

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
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_Texts()
     * @model default="false"
     * @generated
     */
    boolean isTexts();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#isTexts <em>Texts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Texts</em>' attribute.
     * @see #isTexts()
     * @generated
     */
    void setTexts(boolean value);

    /**
     * Returns the value of the '<em><b>Attributes Size</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes Size</em>' attribute.
     * @see #setAttributesSize(int)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_AttributesSize()
     * @model default="0"
     * @generated
     */
    int getAttributesSize();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getAttributesSize <em>Attributes Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attributes Size</em>' attribute.
     * @see #getAttributesSize()
     * @generated
     */
    void setAttributesSize(int value);

    /**
     * Returns the value of the '<em><b>Texts Size</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Texts Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Texts Size</em>' attribute.
     * @see #setTextsSize(int)
     * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getSAPBWTable_TextsSize()
     * @model default="0"
     * @generated
     */
    int getTextsSize();

    /**
     * Sets the value of the '{@link org.talend.core.model.metadata.builder.connection.SAPBWTable#getTextsSize <em>Texts Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Texts Size</em>' attribute.
     * @see #getTextsSize()
     * @generated
     */
    void setTextsSize(int value);

} // SAPBWTable
