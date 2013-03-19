package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the customization modules.
 */
@IID("{109DCBCF-8D7D-4280-837B-4F950604B48B}")
public interface ICustomizationModules3 extends com.hp.alm.otaclient.ICustomizationModules2
{
    // Methods:
    /**
     * <p>
     * The list of project module IDs.
     * </p>
     * <p>
     * Getter method for the COM property "Modules"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(18)
    com.hp.alm.otaclient.IList modules();
    
    @VTID(18)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object modules(
            int index);
    
    /**
     * <p>
     * Returns the module specified by the module ID.
     * </p>
     * <p>
     * Getter method for the COM property "Module"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IModule
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(19)
    com.hp.alm.otaclient.IModule module(
            int moduleID);
    
    // Properties:
}
