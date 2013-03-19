package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Manages the system cache in conjunction with the ExtendedStorage objects.
 */
@IID("{30300941-F52E-4FFD-8314-3EA232206EB0}")
public interface ICacheMgr extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Starts the CacheMgr thread and returns immediately.
     * </p>
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void run();
    
    /**
     * <p>
     * The cache manager is running.
     * </p>
     * <p>
     * Getter method for the COM property "IsRunning"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int isRunning();
    
    /**
     * <p>
     * Use the date of download from the server instead of the access date when determining older files for deletion.
     * </p>
     * 
     * @param bsFilePath Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void setFileTime(
            java.lang.String bsFilePath);
    
    /**
     * <p>
     * Method SetUpdateRegistry.
     * </p>
     * 
     * @param bAllowUpdate Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void setUpdateRegistry(
            int bAllowUpdate);
    
    /**
     * <p>
     * Method SetCurrentTest.
     * </p>
     * 
     * @param bsTestPath Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void setCurrentTest(
            java.lang.String bsTestPath);
    
    // Properties:
}
