/**
 */
package org.talend.core.model.metadata.builder.connection.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.SAPBWTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPBW Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getSourceSystemName <em>Source System Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getInfoAreaName <em>Info Area Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getLastModifiedAt <em>Last Modified At</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isInMemoryOptimized <em>In Memory Optimized</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isInsertOnly <em>Insert Only</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isKeyUnique <em>Key Unique</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isTexts <em>Texts</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getAttributesSize <em>Attributes Size</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getTextsSize <em>Texts Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPBWTableImpl extends SAPTableImpl implements SAPBWTable {

    /**
     * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelType()
     * @generated
     * @ordered
     */
    protected static final String MODEL_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelType()
     * @generated
     * @ordered
     */
    protected String modelType = MODEL_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceSystemName() <em>Source System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceSystemName()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_SYSTEM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceSystemName() <em>Source System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceSystemName()
     * @generated
     * @ordered
     */
    protected String sourceSystemName = SOURCE_SYSTEM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getInfoAreaName() <em>Info Area Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfoAreaName()
     * @generated
     * @ordered
     */
    protected static final String INFO_AREA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInfoAreaName() <em>Info Area Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfoAreaName()
     * @generated
     * @ordered
     */
    protected String infoAreaName = INFO_AREA_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLastModifiedAt() <em>Last Modified At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedAt()
     * @generated
     * @ordered
     */
    protected static final Date LAST_MODIFIED_AT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastModifiedAt() <em>Last Modified At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedAt()
     * @generated
     * @ordered
     */
    protected Date lastModifiedAt = LAST_MODIFIED_AT_EDEFAULT;

    /**
     * The default value of the '{@link #getLastModifiedBy() <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedBy()
     * @generated
     * @ordered
     */
    protected static final String LAST_MODIFIED_BY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastModifiedBy() <em>Last Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedBy()
     * @generated
     * @ordered
     */
    protected String lastModifiedBy = LAST_MODIFIED_BY_EDEFAULT;

    /**
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected static final String OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected String owner = OWNER_EDEFAULT;

    /**
     * The default value of the '{@link #isInMemoryOptimized() <em>In Memory Optimized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInMemoryOptimized()
     * @generated
     * @ordered
     */
    protected static final boolean IN_MEMORY_OPTIMIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInMemoryOptimized() <em>In Memory Optimized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInMemoryOptimized()
     * @generated
     * @ordered
     */
    protected boolean inMemoryOptimized = IN_MEMORY_OPTIMIZED_EDEFAULT;

    /**
     * The default value of the '{@link #isInsertOnly() <em>Insert Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInsertOnly()
     * @generated
     * @ordered
     */
    protected static final boolean INSERT_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInsertOnly() <em>Insert Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInsertOnly()
     * @generated
     * @ordered
     */
    protected boolean insertOnly = INSERT_ONLY_EDEFAULT;

    /**
     * The default value of the '{@link #isKeyUnique() <em>Key Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKeyUnique()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKeyUnique() <em>Key Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKeyUnique()
     * @generated
     * @ordered
     */
    protected boolean keyUnique = KEY_UNIQUE_EDEFAULT;

    /**
     * The default value of the '{@link #isHierarchies() <em>Hierarchies</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHierarchies()
     * @generated
     * @ordered
     */
    protected static final boolean HIERARCHIES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHierarchies() <em>Hierarchies</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHierarchies()
     * @generated
     * @ordered
     */
    protected boolean hierarchies = HIERARCHIES_EDEFAULT;

    /**
     * The default value of the '{@link #isAttributes() <em>Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAttributes()
     * @generated
     * @ordered
     */
    protected static final boolean ATTRIBUTES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAttributes() <em>Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAttributes()
     * @generated
     * @ordered
     */
    protected boolean attributes = ATTRIBUTES_EDEFAULT;

    /**
     * The default value of the '{@link #isTexts() <em>Texts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTexts()
     * @generated
     * @ordered
     */
    protected static final boolean TEXTS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTexts() <em>Texts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTexts()
     * @generated
     * @ordered
     */
    protected boolean texts = TEXTS_EDEFAULT;

    /**
     * The default value of the '{@link #getAttributesSize() <em>Attributes Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributesSize()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTES_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAttributesSize() <em>Attributes Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributesSize()
     * @generated
     * @ordered
     */
    protected int attributesSize = ATTRIBUTES_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getTextsSize() <em>Texts Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextsSize()
     * @generated
     * @ordered
     */
    protected static final int TEXTS_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTextsSize() <em>Texts Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextsSize()
     * @generated
     * @ordered
     */
    protected int textsSize = TEXTS_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPBWTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConnectionPackage.Literals.SAPBW_TABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelType(String newModelType) {
        String oldModelType = modelType;
        modelType = newModelType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__MODEL_TYPE, oldModelType,
                    modelType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSourceSystemName() {
        return sourceSystemName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceSystemName(String newSourceSystemName) {
        String oldSourceSystemName = sourceSystemName;
        sourceSystemName = newSourceSystemName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME,
                    oldSourceSystemName, sourceSystemName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastModifiedAt(Date newLastModifiedAt) {
        Date oldLastModifiedAt = lastModifiedAt;
        lastModifiedAt = newLastModifiedAt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT,
                    oldLastModifiedAt, lastModifiedAt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInfoAreaName() {
        return infoAreaName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInfoAreaName(String newInfoAreaName) {
        String oldInfoAreaName = infoAreaName;
        infoAreaName = newInfoAreaName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME, oldInfoAreaName,
                    infoAreaName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastModifiedBy(String newLastModifiedBy) {
        String oldLastModifiedBy = lastModifiedBy;
        lastModifiedBy = newLastModifiedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_BY,
                    oldLastModifiedBy, lastModifiedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(String newOwner) {
        String oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInMemoryOptimized() {
        return inMemoryOptimized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInMemoryOptimized(boolean newInMemoryOptimized) {
        boolean oldInMemoryOptimized = inMemoryOptimized;
        inMemoryOptimized = newInMemoryOptimized;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__IN_MEMORY_OPTIMIZED,
                    oldInMemoryOptimized, inMemoryOptimized));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInsertOnly() {
        return insertOnly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInsertOnly(boolean newInsertOnly) {
        boolean oldInsertOnly = insertOnly;
        insertOnly = newInsertOnly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__INSERT_ONLY, oldInsertOnly,
                    insertOnly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isKeyUnique() {
        return keyUnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyUnique(boolean newKeyUnique) {
        boolean oldKeyUnique = keyUnique;
        keyUnique = newKeyUnique;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__KEY_UNIQUE, oldKeyUnique,
                    keyUnique));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isHierarchies() {
        return hierarchies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHierarchies(boolean newHierarchies) {
        boolean oldHierarchies = hierarchies;
        hierarchies = newHierarchies;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__HIERARCHIES, oldHierarchies,
                    hierarchies));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAttributes() {
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributes(boolean newAttributes) {
        boolean oldAttributes = attributes;
        attributes = newAttributes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__ATTRIBUTES, oldAttributes,
                    attributes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTexts() {
        return texts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTexts(boolean newTexts) {
        boolean oldTexts = texts;
        texts = newTexts;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__TEXTS, oldTexts, texts));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAttributesSize() {
        return attributesSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributesSize(int newAttributesSize) {
        int oldAttributesSize = attributesSize;
        attributesSize = newAttributesSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__ATTRIBUTES_SIZE,
                    oldAttributesSize, attributesSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTextsSize() {
        return textsSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextsSize(int newTextsSize) {
        int oldTextsSize = textsSize;
        textsSize = newTextsSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE__TEXTS_SIZE, oldTextsSize,
                    textsSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ConnectionPackage.SAPBW_TABLE__MODEL_TYPE:
            return getModelType();
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            return isActive();
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            return getSourceSystemName();
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            return getInfoAreaName();
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            return getLastModifiedAt();
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_BY:
            return getLastModifiedBy();
        case ConnectionPackage.SAPBW_TABLE__OWNER:
            return getOwner();
        case ConnectionPackage.SAPBW_TABLE__IN_MEMORY_OPTIMIZED:
            return isInMemoryOptimized();
        case ConnectionPackage.SAPBW_TABLE__INSERT_ONLY:
            return isInsertOnly();
        case ConnectionPackage.SAPBW_TABLE__KEY_UNIQUE:
            return isKeyUnique();
        case ConnectionPackage.SAPBW_TABLE__HIERARCHIES:
            return isHierarchies();
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES:
            return isAttributes();
        case ConnectionPackage.SAPBW_TABLE__TEXTS:
            return isTexts();
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES_SIZE:
            return getAttributesSize();
        case ConnectionPackage.SAPBW_TABLE__TEXTS_SIZE:
            return getTextsSize();
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
        case ConnectionPackage.SAPBW_TABLE__MODEL_TYPE:
            setModelType((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            setActive((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            setSourceSystemName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            setInfoAreaName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            setLastModifiedAt((Date) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_BY:
            setLastModifiedBy((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__OWNER:
            setOwner((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__IN_MEMORY_OPTIMIZED:
            setInMemoryOptimized((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__INSERT_ONLY:
            setInsertOnly((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__KEY_UNIQUE:
            setKeyUnique((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__HIERARCHIES:
            setHierarchies((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES:
            setAttributes((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__TEXTS:
            setTexts((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES_SIZE:
            setAttributesSize((Integer) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__TEXTS_SIZE:
            setTextsSize((Integer) newValue);
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
        case ConnectionPackage.SAPBW_TABLE__MODEL_TYPE:
            setModelType(MODEL_TYPE_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            setActive(ACTIVE_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            setSourceSystemName(SOURCE_SYSTEM_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            setInfoAreaName(INFO_AREA_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            setLastModifiedAt(LAST_MODIFIED_AT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_BY:
            setLastModifiedBy(LAST_MODIFIED_BY_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__OWNER:
            setOwner(OWNER_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__IN_MEMORY_OPTIMIZED:
            setInMemoryOptimized(IN_MEMORY_OPTIMIZED_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__INSERT_ONLY:
            setInsertOnly(INSERT_ONLY_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__KEY_UNIQUE:
            setKeyUnique(KEY_UNIQUE_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__HIERARCHIES:
            setHierarchies(HIERARCHIES_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES:
            setAttributes(ATTRIBUTES_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__TEXTS:
            setTexts(TEXTS_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES_SIZE:
            setAttributesSize(ATTRIBUTES_SIZE_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__TEXTS_SIZE:
            setTextsSize(TEXTS_SIZE_EDEFAULT);
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
        case ConnectionPackage.SAPBW_TABLE__MODEL_TYPE:
            return MODEL_TYPE_EDEFAULT == null ? modelType != null : !MODEL_TYPE_EDEFAULT.equals(modelType);
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            return active != ACTIVE_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            return SOURCE_SYSTEM_NAME_EDEFAULT == null ? sourceSystemName != null : !SOURCE_SYSTEM_NAME_EDEFAULT
                    .equals(sourceSystemName);
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            return INFO_AREA_NAME_EDEFAULT == null ? infoAreaName != null : !INFO_AREA_NAME_EDEFAULT.equals(infoAreaName);
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            return LAST_MODIFIED_AT_EDEFAULT == null ? lastModifiedAt != null : !LAST_MODIFIED_AT_EDEFAULT.equals(lastModifiedAt);
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_BY:
            return LAST_MODIFIED_BY_EDEFAULT == null ? lastModifiedBy != null : !LAST_MODIFIED_BY_EDEFAULT.equals(lastModifiedBy);
        case ConnectionPackage.SAPBW_TABLE__OWNER:
            return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
        case ConnectionPackage.SAPBW_TABLE__IN_MEMORY_OPTIMIZED:
            return inMemoryOptimized != IN_MEMORY_OPTIMIZED_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__INSERT_ONLY:
            return insertOnly != INSERT_ONLY_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__KEY_UNIQUE:
            return keyUnique != KEY_UNIQUE_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__HIERARCHIES:
            return hierarchies != HIERARCHIES_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES:
            return attributes != ATTRIBUTES_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__TEXTS:
            return texts != TEXTS_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__ATTRIBUTES_SIZE:
            return attributesSize != ATTRIBUTES_SIZE_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__TEXTS_SIZE:
            return textsSize != TEXTS_SIZE_EDEFAULT;
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
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (modelType: ");
        result.append(modelType);
        result.append(", active: ");
        result.append(active);
        result.append(", sourceSystemName: ");
        result.append(sourceSystemName);
        result.append(", infoAreaName: ");
        result.append(infoAreaName);
        result.append(", lastModifiedAt: ");
        result.append(lastModifiedAt);
        result.append(", lastModifiedBy: ");
        result.append(lastModifiedBy);
        result.append(", owner: ");
        result.append(owner);
        result.append(", inMemoryOptimized: ");
        result.append(inMemoryOptimized);
        result.append(", insertOnly: ");
        result.append(insertOnly);
        result.append(", keyUnique: ");
        result.append(keyUnique);
        result.append(", hierarchies: ");
        result.append(hierarchies);
        result.append(", attributes: ");
        result.append(attributes);
        result.append(", texts: ");
        result.append(texts);
        result.append(", attributesSize: ");
        result.append(attributesSize);
        result.append(", textsSize: ");
        result.append(textsSize);
        result.append(')');
        return result.toString();
    }

} //SAPBWTableImpl
