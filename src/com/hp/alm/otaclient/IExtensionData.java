package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The properties of an extension as they appear in the extension.xml file.
 */
@IID("{3A3FE6C4-6DE7-47AB-8BF1-EE578637596A}")
public interface IExtensionData extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The unique extension name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name();
    
    /**
     * <p>
     * The extension's display name.
     * </p>
     * <p>
     * Getter method for the COM property "DisplayName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String displayName();
    
    /**
     * <p>
     * The extension UI data provider CLSID.
     * </p>
     * <p>
     * Getter method for the COM property "UIDataProviderId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String uiDataProviderId();
    
    /**
     * <p>
     * The extension version.
     * </p>
     * <p>
     * Getter method for the COM property "Version"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String version();
    
    /**
     * <p>
     * The extension OTA data provider CLSID.
     * </p>
     * <p>
     * Getter method for the COM property "OtaDataProviderId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String otaDataProviderId();
    
    /**
     * <p>
     * The the list of extension modules.
     * </p>
     * <p>
     * Getter method for the COM property "Modules"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    com.hp.alm.otaclient.IList modules();
    
    @VTID(12)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object modules(
            int index);
    
    /**
     * <p>
     * The root of the extension relative to the project repository root.
     * </p>
     * <p>
     * Getter method for the COM property "RepositoryRoot"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String repositoryRoot();
    
    // Properties:
}
