package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing Business Process Test parameters.
 */
@IID("{0256A835-30D8-494C-A1E1-725F5A71B296}")
public interface IComponentParam2 extends com.hp.alm.otaclient.IComponentParam
{
    // Methods:
    /**
     * <p>
     * For HP use. The flow output parameter's source.
     * </p>
     * <p>
     * Getter method for the COM property "FlowOutputParamSrc"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject flowOutputParamSrc();
    
    /**
     * <p>
     * Checks if the component parameter is used.
     * </p>
     * <p>
     * Getter method for the COM property "IsUsed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    boolean isUsed();
    
    // Properties:
}
