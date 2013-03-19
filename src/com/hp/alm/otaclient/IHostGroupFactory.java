package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing definitions of groups of host servers.
 */
@IID("{FA8C3437-3B5B-4246-B775-523DEEB2734A}")
public interface IHostGroupFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Removes host from all groups.
     * </p>
     * 
     * @param host Mandatory java.lang.Object parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    void removeHost(
            @MarshalAs(NativeType.VARIANT) java.lang.Object host);
    
    // Properties:
}
