/**
 */
package org.talend.core.model.metadata.builder.connection.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.SAPBWTableField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPBW Table Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#getLogicalName <em>Logical Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isTexts <em>Texts</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isTimeDependentAttr <em>Time Dependent Attr</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#getAttrTableName <em>Attr Table Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isLanguageDependentText <em>Language Dependent Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isMediumText <em>Medium Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isShortText <em>Short Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#getTextTableName <em>Text Table Name</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isTimeDependentText <em>Time Dependent Text</em>}</li>
 *   <li>{@link org.talend.core.model.metadata.builder.connection.impl.SAPBWTableFieldImpl#isLowerCaseAllowed <em>Lower Case Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPBWTableFieldImpl extends SAPTableFieldImpl implements SAPBWTableField {

    /**
     * The default value of the '{@link #getLogicalName() <em>Logical Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogicalName()
     * @generated
     * @ordered
     */
    protected static final String LOGICAL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogicalName() <em>Logical Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogicalName()
     * @generated
     * @ordered
     */
    protected String logicalName = LOGICAL_NAME_EDEFAULT;

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
     * The default value of the '{@link #isTimeDependentAttr() <em>Time Dependent Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTimeDependentAttr()
     * @generated
     * @ordered
     */
    protected static final boolean TIME_DEPENDENT_ATTR_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTimeDependentAttr() <em>Time Dependent Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTimeDependentAttr()
     * @generated
     * @ordered
     */
    protected boolean timeDependentAttr = TIME_DEPENDENT_ATTR_EDEFAULT;

    /**
     * The default value of the '{@link #getAttrTableName() <em>Attr Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttrTableName()
     * @generated
     * @ordered
     */
    protected static final String ATTR_TABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttrTableName() <em>Attr Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttrTableName()
     * @generated
     * @ordered
     */
    protected String attrTableName = ATTR_TABLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isLanguageDependentText() <em>Language Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLanguageDependentText()
     * @generated
     * @ordered
     */
    protected static final boolean LANGUAGE_DEPENDENT_TEXT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLanguageDependentText() <em>Language Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLanguageDependentText()
     * @generated
     * @ordered
     */
    protected boolean languageDependentText = LANGUAGE_DEPENDENT_TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #isMediumText() <em>Medium Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMediumText()
     * @generated
     * @ordered
     */
    protected static final boolean MEDIUM_TEXT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMediumText() <em>Medium Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMediumText()
     * @generated
     * @ordered
     */
    protected boolean mediumText = MEDIUM_TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #isShortText() <em>Short Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShortText()
     * @generated
     * @ordered
     */
    protected static final boolean SHORT_TEXT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isShortText() <em>Short Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShortText()
     * @generated
     * @ordered
     */
    protected boolean shortText = SHORT_TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getTextTableName() <em>Text Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextTableName()
     * @generated
     * @ordered
     */
    protected static final String TEXT_TABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextTableName() <em>Text Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextTableName()
     * @generated
     * @ordered
     */
    protected String textTableName = TEXT_TABLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isTimeDependentText() <em>Time Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTimeDependentText()
     * @generated
     * @ordered
     */
    protected static final boolean TIME_DEPENDENT_TEXT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTimeDependentText() <em>Time Dependent Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTimeDependentText()
     * @generated
     * @ordered
     */
    protected boolean timeDependentText = TIME_DEPENDENT_TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #isLowerCaseAllowed() <em>Lower Case Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLowerCaseAllowed()
     * @generated
     * @ordered
     */
    protected static final boolean LOWER_CASE_ALLOWED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLowerCaseAllowed() <em>Lower Case Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLowerCaseAllowed()
     * @generated
     * @ordered
     */
    protected boolean lowerCaseAllowed = LOWER_CASE_ALLOWED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPBWTableFieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConnectionPackage.Literals.SAPBW_TABLE_FIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogicalName(String newLogicalName) {
        String oldLogicalName = logicalName;
        logicalName = newLogicalName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__LOGICAL_NAME,
                    oldLogicalName, logicalName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__ATTRIBUTES, oldAttributes,
                    attributes));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__HIERARCHIES,
                    oldHierarchies, hierarchies));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__TEXTS, oldTexts, texts));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTimeDependentAttr() {
        return timeDependentAttr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeDependentAttr(boolean newTimeDependentAttr) {
        boolean oldTimeDependentAttr = timeDependentAttr;
        timeDependentAttr = newTimeDependentAttr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_ATTR,
                    oldTimeDependentAttr, timeDependentAttr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttrTableName() {
        return attrTableName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttrTableName(String newAttrTableName) {
        String oldAttrTableName = attrTableName;
        attrTableName = newAttrTableName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__ATTR_TABLE_NAME,
                    oldAttrTableName, attrTableName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLanguageDependentText() {
        return languageDependentText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLanguageDependentText(boolean newLanguageDependentText) {
        boolean oldLanguageDependentText = languageDependentText;
        languageDependentText = newLanguageDependentText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__LANGUAGE_DEPENDENT_TEXT,
                    oldLanguageDependentText, languageDependentText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMediumText() {
        return mediumText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMediumText(boolean newMediumText) {
        boolean oldMediumText = mediumText;
        mediumText = newMediumText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__MEDIUM_TEXT,
                    oldMediumText, mediumText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isShortText() {
        return shortText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShortText(boolean newShortText) {
        boolean oldShortText = shortText;
        shortText = newShortText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__SHORT_TEXT, oldShortText,
                    shortText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTextTableName() {
        return textTableName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextTableName(String newTextTableName) {
        String oldTextTableName = textTableName;
        textTableName = newTextTableName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__TEXT_TABLE_NAME,
                    oldTextTableName, textTableName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTimeDependentText() {
        return timeDependentText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeDependentText(boolean newTimeDependentText) {
        boolean oldTimeDependentText = timeDependentText;
        timeDependentText = newTimeDependentText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_TEXT,
                    oldTimeDependentText, timeDependentText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLowerCaseAllowed() {
        return lowerCaseAllowed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerCaseAllowed(boolean newLowerCaseAllowed) {
        boolean oldLowerCaseAllowed = lowerCaseAllowed;
        lowerCaseAllowed = newLowerCaseAllowed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.SAPBW_TABLE_FIELD__LOWER_CASE_ALLOWED,
                    oldLowerCaseAllowed, lowerCaseAllowed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOGICAL_NAME:
            return getLogicalName();
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTRIBUTES:
            return isAttributes();
        case ConnectionPackage.SAPBW_TABLE_FIELD__HIERARCHIES:
            return isHierarchies();
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXTS:
            return isTexts();
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_ATTR:
            return isTimeDependentAttr();
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTR_TABLE_NAME:
            return getAttrTableName();
        case ConnectionPackage.SAPBW_TABLE_FIELD__LANGUAGE_DEPENDENT_TEXT:
            return isLanguageDependentText();
        case ConnectionPackage.SAPBW_TABLE_FIELD__MEDIUM_TEXT:
            return isMediumText();
        case ConnectionPackage.SAPBW_TABLE_FIELD__SHORT_TEXT:
            return isShortText();
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXT_TABLE_NAME:
            return getTextTableName();
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_TEXT:
            return isTimeDependentText();
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOWER_CASE_ALLOWED:
            return isLowerCaseAllowed();
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
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOGICAL_NAME:
            setLogicalName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTRIBUTES:
            setAttributes((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__HIERARCHIES:
            setHierarchies((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXTS:
            setTexts((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_ATTR:
            setTimeDependentAttr((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTR_TABLE_NAME:
            setAttrTableName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__LANGUAGE_DEPENDENT_TEXT:
            setLanguageDependentText((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__MEDIUM_TEXT:
            setMediumText((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__SHORT_TEXT:
            setShortText((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXT_TABLE_NAME:
            setTextTableName((String) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_TEXT:
            setTimeDependentText((Boolean) newValue);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOWER_CASE_ALLOWED:
            setLowerCaseAllowed((Boolean) newValue);
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
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOGICAL_NAME:
            setLogicalName(LOGICAL_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTRIBUTES:
            setAttributes(ATTRIBUTES_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__HIERARCHIES:
            setHierarchies(HIERARCHIES_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXTS:
            setTexts(TEXTS_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_ATTR:
            setTimeDependentAttr(TIME_DEPENDENT_ATTR_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTR_TABLE_NAME:
            setAttrTableName(ATTR_TABLE_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__LANGUAGE_DEPENDENT_TEXT:
            setLanguageDependentText(LANGUAGE_DEPENDENT_TEXT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__MEDIUM_TEXT:
            setMediumText(MEDIUM_TEXT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__SHORT_TEXT:
            setShortText(SHORT_TEXT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXT_TABLE_NAME:
            setTextTableName(TEXT_TABLE_NAME_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_TEXT:
            setTimeDependentText(TIME_DEPENDENT_TEXT_EDEFAULT);
            return;
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOWER_CASE_ALLOWED:
            setLowerCaseAllowed(LOWER_CASE_ALLOWED_EDEFAULT);
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
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOGICAL_NAME:
            return LOGICAL_NAME_EDEFAULT == null ? logicalName != null : !LOGICAL_NAME_EDEFAULT.equals(logicalName);
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTRIBUTES:
            return attributes != ATTRIBUTES_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__HIERARCHIES:
            return hierarchies != HIERARCHIES_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXTS:
            return texts != TEXTS_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_ATTR:
            return timeDependentAttr != TIME_DEPENDENT_ATTR_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__ATTR_TABLE_NAME:
            return ATTR_TABLE_NAME_EDEFAULT == null ? attrTableName != null : !ATTR_TABLE_NAME_EDEFAULT.equals(attrTableName);
        case ConnectionPackage.SAPBW_TABLE_FIELD__LANGUAGE_DEPENDENT_TEXT:
            return languageDependentText != LANGUAGE_DEPENDENT_TEXT_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__MEDIUM_TEXT:
            return mediumText != MEDIUM_TEXT_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__SHORT_TEXT:
            return shortText != SHORT_TEXT_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__TEXT_TABLE_NAME:
            return TEXT_TABLE_NAME_EDEFAULT == null ? textTableName != null : !TEXT_TABLE_NAME_EDEFAULT.equals(textTableName);
        case ConnectionPackage.SAPBW_TABLE_FIELD__TIME_DEPENDENT_TEXT:
            return timeDependentText != TIME_DEPENDENT_TEXT_EDEFAULT;
        case ConnectionPackage.SAPBW_TABLE_FIELD__LOWER_CASE_ALLOWED:
            return lowerCaseAllowed != LOWER_CASE_ALLOWED_EDEFAULT;
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
        result.append(" (logicalName: ");
        result.append(logicalName);
        result.append(", attributes: ");
        result.append(attributes);
        result.append(", hierarchies: ");
        result.append(hierarchies);
        result.append(", texts: ");
        result.append(texts);
        result.append(", timeDependentAttr: ");
        result.append(timeDependentAttr);
        result.append(", attrTableName: ");
        result.append(attrTableName);
        result.append(", languageDependentText: ");
        result.append(languageDependentText);
        result.append(", mediumText: ");
        result.append(mediumText);
        result.append(", shortText: ");
        result.append(shortText);
        result.append(", textTableName: ");
        result.append(textTableName);
        result.append(", timeDependentText: ");
        result.append(timeDependentText);
        result.append(", lowerCaseAllowed: ");
        result.append(lowerCaseAllowed);
        result.append(')');
        return result.toString();
    }

} //SAPBWTableFieldImpl
