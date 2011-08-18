// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.swtbot.items;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.talend.swtbot.Utilities;
import org.talend.swtbot.Utilities.TalendItemType;

/**
 * DOC fzhong class global comment. Detailled comment
 */
public class TalendFileItem extends TalendMetadataItem {

    protected String filePath;

    public TalendFileItem(TalendItemType itemType, String filePath) {
        super(itemType);
        setFilePath(filePath);
        setExpectResultFromFile(filePath + ".result");
    }

    public TalendFileItem(String itemName, TalendItemType itemType, String filePath) {
        super(itemName, itemType);
        setFilePath(filePath);
        setExpectResultFromFile(filePath + ".result");
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public File getSourceFile() throws IOException, URISyntaxException {
        return Utilities.getFileFromCurrentPluginSampleFolder(filePath);
    }

    public File getSourceFileOfResult() throws IOException, URISyntaxException {
        return Utilities.getFileFromCurrentPluginSampleFolder(filePath + ".result");
    }
}
