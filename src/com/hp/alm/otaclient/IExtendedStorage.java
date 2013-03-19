package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a storage structure used to transfer files between the server and client file system and delete files.
 */
@IID("{BF9B38B0-935B-4112-92EC-49FED46AC64D}")
public interface IExtendedStorage extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The storage root.
     * </p>
     * <p>
     * Getter method for the COM property "Root"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject root();
    
    /**
     * <p>
     * Downloads the storage structure to the client file system.
     * </p>
     * 
     * @param fSysFilter Optional parameter. Default value is "*.*"
     * @param synchronize Optional parameter. Default value is false
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String load(
            @Optional @DefaultValue("*.*") java.lang.String fSysFilter,
            @Optional @DefaultValue("0") boolean synchronize);
    
    /**
     * <p>
     * Uploads the storage structure to the server.
     * </p>
     * 
     * @param fSysFilter Optional parameter. Default value is "*.*"
     * @param synchronize Optional parameter. Default value is false
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void save(
            @Optional @DefaultValue("*.*") java.lang.String fSysFilter,
            @Optional @DefaultValue("0") boolean synchronize);
    
    /**
     * <p>
     * Deletes files locally or from the server.
     * </p>
     * 
     * @param fSysFilter Mandatory java.lang.String parameter.
     * @param nDeleteType Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void delete(
            java.lang.String fSysFilter,
            int nDeleteType);
    
    /**
     * <p>
     * Deprecated. The location on the server from which to download or to which to upload.
     * </p>
     * <p>
     * Getter method for the COM property "ServerPath"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String serverPath();
    
    /**
     * <p>
     * Deprecated. The location on the server from which to download or to which to upload.
     * </p>
     * <p>
     * Setter method for the COM property "ServerPath"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void serverPath(
            java.lang.String pVal);
    
    /**
     * <p>
     * The location on the client to which to download or from which to upload.
     * </p>
     * <p>
     * Getter method for the COM property "ClientPath"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String clientPath();
    
    /**
     * <p>
     * The location on the client to which to download or from which to upload.
     * </p>
     * <p>
     * Setter method for the COM property "ClientPath"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void clientPath(
            java.lang.String pVal);
    
    /**
     * <p>
     * Cancels the load or save action.
     * </p>
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    void cancel();
    
    /**
     * <p>
     * Checks if the load or save action is finished.
     * </p>
     * <p>
     * Getter method for the COM property "ActionFinished"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    int actionFinished();
    
    /**
     * <p>
     * Polls the progress of the last action (Load or Save).
     * </p>
     * 
     * @param total Mandatory Holder<Integer> parameter.
     * @param current Mandatory Holder<Integer> parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    java.lang.String progress(
            Holder<Integer> total,
            Holder<Integer> current);
    
    /**
     * <p>
     * Gets the last error that occurred during asynchronous load and save operations.
     * </p>
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    void getLastError();
    
    /**
     * <p>
     * Uploads the storage structure to the server.
     * </p>
     * 
     * @param fSysFilter Mandatory java.lang.String parameter.
     * @param synchronize Mandatory boolean parameter.
     * @param pVal Mandatory Holder<com.hp.alm.otaclient.IList> parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    boolean saveEx(
            java.lang.String fSysFilter,
            boolean synchronize,
            Holder<com.hp.alm.otaclient.IList> pVal);
    
    /**
     * <p>
     * Downloads the storage structure to the client file system.
     * </p>
     * 
     * @param fSysFilter Mandatory java.lang.String parameter.
     * @param synchronize Mandatory boolean parameter.
     * @param pVal Mandatory Holder<com.hp.alm.otaclient.IList> parameter.
     * @param pNonFatalErrorOccured Mandatory Holder<Boolean> parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String loadEx(
            java.lang.String fSysFilter,
            boolean synchronize,
            Holder<com.hp.alm.otaclient.IList> pVal,
            Holder<Boolean> pNonFatalErrorOccured);
    
    // Properties:
}
