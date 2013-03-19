package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for supporting copy and paste.
 */
@IID("{EBB38286-D5A3-41DD-9EBA-F2791C10522F}")
public interface ISupportCopyPaste extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Pastes data from clipboard.
     * </p>
     * 
     * @param clipboardData Mandatory java.lang.String parameter.
     * @param targetID Optional parameter. Default value is ""
     * @param mode Optional parameter. Default value is 0
     * @param orderID Optional parameter. Default value is -1
     */
    
    @VTID(3)
    void pasteFromClipBoard(
            java.lang.String clipboardData,
            @Optional @DefaultValue("") java.lang.String targetID,
            @Optional @DefaultValue("0") int mode,
            @Optional @DefaultValue("-1") int orderID);
    
    /**
     * <p>
     * Copies data into clipboard.
     * </p>
     * 
     * @param idsFilter Mandatory java.lang.String parameter.
     * @param mode Optional parameter. Default value is 0
     * @param path Optional parameter. Default value is ""
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(4)
    java.lang.String copyToClipBoard(
            java.lang.String idsFilter,
            @Optional @DefaultValue("0") int mode,
            @Optional @DefaultValue("") java.lang.String path);
    
    // Properties:
}
