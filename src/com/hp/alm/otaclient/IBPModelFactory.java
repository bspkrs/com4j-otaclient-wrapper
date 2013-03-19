package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing BP Models.
 */
@IID("{46F7D33E-46BF-4A90-9435-0834558D9165}")
public interface IBPModelFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Get the link between all the models in a project
     * </p>
     * <p>
     * Getter method for the COM property "BPModelNetworkLinks"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    com.hp.alm.otaclient.IList bpModelNetworkLinks();
    
    @VTID(17)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object bpModelNetworkLinks(
            int index);
    
    // Properties:
}
