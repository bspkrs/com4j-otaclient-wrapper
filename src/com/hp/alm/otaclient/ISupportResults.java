package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a entity supporting Results Modeing feature.
 */
@IID("{8A7584BB-5F95-48D9-BDE9-892347DEDB30}")
public interface ISupportResults extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The ResultFactory for the current entity.
     * </p>
     * <p>
     * Getter method for the COM property "ResultFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject resultFactory();
    
    // Properties:
}
