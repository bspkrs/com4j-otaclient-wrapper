package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for managing sessions.
 */
@IID("{9B1C51AD-A124-465D-96EE-39DB5168FEFC}")
public interface IExtensionServiceProvider extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Current OTA connection.
     * </p>
     * <p>
     * Getter method for the COM property "QCConnection"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ITDConnection
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.ITDConnection qcConnection();
    
    /**
     * <p>
     * Current http connection.
     * </p>
     * <p>
     * Getter method for the COM property "WebConnection"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com4j.Com4jObject webConnection();
    
    /**
     * <p>
     * Interface providing cache related services.
     * </p>
     * <p>
     * Getter method for the COM property "CacheManager"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICacheManager
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.ICacheManager cacheManager();
    
    /**
     * <p>
     * Interface providing system fields related services.
     * </p>
     * <p>
     * Getter method for the COM property "SystemFieldService"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ISystemFieldService
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.ISystemFieldService systemFieldService();
    
    /**
     * <p>
     * Interface providing data management related services.
     * </p>
     * <p>
     * Getter method for the COM property "DataServiceProvider"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IDataServiceProvider
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IDataServiceProvider dataServiceProvider();
    
    /**
     * <p>
     * Interface providing permission related services.
     * </p>
     * <p>
     * Getter method for the COM property "CustomizationPermission"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICustomizationPermissionService
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    com.hp.alm.otaclient.ICustomizationPermissionService customizationPermission();
    
    /**
     * <p>
     * For HP use. Interface providing factories creation and other factory services from outside OTA.
     * </p>
     * <p>
     * Getter method for the COM property "FactoryService"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IFactoryService
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    com.hp.alm.otaclient.IFactoryService factoryService();
    
    /**
     * <p>
     * Returns the extended storage for specific extension.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @param extensionName Mandatory java.lang.String parameter.
     * @param serverRelativePath Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IExtendedStorage
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    com.hp.alm.otaclient.IExtendedStorage extendedStorage(
            java.lang.String extensionName,
            java.lang.String serverRelativePath);
    
    // Properties:
}
