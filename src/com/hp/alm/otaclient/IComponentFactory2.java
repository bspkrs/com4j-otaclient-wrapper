package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing business components.
 */
@IID("{EAB7E2A5-8E0C-4DFE-A963-9AD073A9F2DC}")
public interface IComponentFactory2 extends com.hp.alm.otaclient.IComponentFactory
{
    // Methods:
    /**
     * <p>
     * For HP use. Converts one or more manual tests to components.
     * </p>
     * 
     * @param destFolderId Mandatory int parameter.
     * @param newComponentName Mandatory java.lang.String parameter.
     * @param testIDs Mandatory java.lang.String parameter.
     * @param numOfTests Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(74)
    //= 0x4a. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String convertManualTestToComponent(
            int destFolderId,
            java.lang.String newComponentName,
            java.lang.String testIDs,
            int numOfTests);
    
    /**
     * <p>
     * For HP use. Converts all manual tests in a folder or folders to components.
     * </p>
     * 
     * @param destFolderId Mandatory int parameter.
     * @param srcFolderIds Mandatory java.lang.String parameter.
     * @param recursive Mandatory int parameter.
     * @param newfolderName Mandatory java.lang.String parameter.
     * @param numOfFolders Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(75)
    //= 0x4b. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String convertAllManualTestsInFolder(
            int destFolderId,
            java.lang.String srcFolderIds,
            int recursive,
            java.lang.String newfolderName,
            int numOfFolders);
    
    /**
     * <p>
     * Mails the list of IBase Factory Items. 'Items' is a list of ID numbers.
     * </p>
     * 
     * @param items Mandatory java.lang.Object parameter.
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendCc Optional parameter. Default value is ""
     * @param option Optional parameter. Default value is 0
     * @param subject Optional parameter. Default value is ""
     * @param comment Optional parameter. Default value is ""
     */
    
    @DISPID(76)
    //= 0x4c. The runtime will prefer the VTID if present
    @VTID(20)
    void mail(
            @MarshalAs(NativeType.VARIANT) java.lang.Object items,
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String comment);
    
    // Properties:
}
