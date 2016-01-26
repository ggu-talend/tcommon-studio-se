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
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getSourceSystemName <em>Source System Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getLastModifiedAt <em>Last Modified At</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getInfoAreaName <em>Info Area Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isInMemoryOptimized <em>In Memory Optimized</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isInsertOnly <em>Insert Only</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableImpl#isKeyUnique <em>Key Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPBWTableImpl extends MetadataTableImpl implements SAPBWTable {

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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            return isActive();
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            return getSourceSystemName();
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            return getLastModifiedAt();
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            return getInfoAreaName();
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
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            setActive((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            setSourceSystemName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            setLastModifiedAt((Date) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            setInfoAreaName((String) newValue);
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
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            setActive(ACTIVE_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            setSourceSystemName(SOURCE_SYSTEM_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            setLastModifiedAt(LAST_MODIFIED_AT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            setInfoAreaName(INFO_AREA_NAME_EDEFAULT);
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
        case ConnectionPackage.SAPBW_TABLE__ACTIVE:
            return active != ACTIVE_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE__SOURCE_SYSTEM_NAME:
            return SOURCE_SYSTEM_NAME_EDEFAULT == null ? sourceSystemName != null : !SOURCE_SYSTEM_NAME_EDEFAULT
                    .equals(sourceSystemName);
        case ConnectionPackage.SAPBW_TABLE__LAST_MODIFIED_AT:
            return LAST_MODIFIED_AT_EDEFAULT == null ? lastModifiedAt != null : !LAST_MODIFIED_AT_EDEFAULT.equals(lastModifiedAt);
        case ConnectionPackage.SAPBW_TABLE__INFO_AREA_NAME:
            return INFO_AREA_NAME_EDEFAULT == null ? infoAreaName != null : !INFO_AREA_NAME_EDEFAULT.equals(infoAreaName);
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
        result.append(" (active: ");
        result.append(active);
        result.append(", sourceSystemName: ");
        result.append(sourceSystemName);
        result.append(", lastModifiedAt: ");
        result.append(lastModifiedAt);
        result.append(", infoAreaName: ");
        result.append(infoAreaName);
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
        result.append(')');
        return result.toString();
    }

} //SAPBWTableImpl
