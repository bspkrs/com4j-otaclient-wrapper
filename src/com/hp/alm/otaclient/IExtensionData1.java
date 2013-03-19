package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The properties of an extension as they appear in the extension.xml file.
 */
@IID("{70DF698A-FD62-4F14-AE2B-6A1206902B24}")
public interface IExtensionData1 extends com.hp.alm.otaclient.IExtensionData
{
    // Methods:
    /**
     * <p>
     * The extension OTA data provider type name.
     * </p>
     * <p>
     * Getter method for the COM property "OtaNetDataProviderName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String otaNetDataProviderName();
    
    /**
     * <p>
     * The extension UI data provider type name.
     * </p>
     * <p>
     * Getter method for the COM property "UINetDataProviderName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String uiNetDataProviderName();
    
    // Properties:
}
