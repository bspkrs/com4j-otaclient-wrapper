package com.hp.alm.otaclient;

import com4j.*;

/**
 * This interface will allow us to get the extended storage of the qc resource
 */
@IID("{F2D411C8-4ADC-4CC6-A437-139BB6103E87}")
public interface IQCResource2 extends com.hp.alm.otaclient.IQCResource
{
    // Methods:
    /**
     * <p>
     * The ExtendedStorage object for this resource.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @param nEntityType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(38)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extendedStorage(
            int nEntityType);
    
    // Properties:
}
