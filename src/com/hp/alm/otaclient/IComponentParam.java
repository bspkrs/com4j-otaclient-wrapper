package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing Business Process Test parameters.
 */
@IID("{F65AD9CD-D5A3-4EC5-8904-017E4E9D2351}")
public interface IComponentParam extends com.hp.alm.otaclient.IBaseParam
{
    // Methods:
    /**
     * <p>
     * The Component containing the parameter.
     * </p>
     * <p>
     * Getter method for the COM property "Component"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject component();
    
    /**
     * <p>
     * Indicates if this is an output parameter. 1 indicates an output parameter. Any other value indicates an input parameter.
     * </p>
     * <p>
     * Getter method for the COM property "IsOut"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(31)
    int isOut();
    
    /**
     * <p>
     * Indicates if this is an output parameter. 1 indicates an output parameter. Any other value indicates an input parameter.
     * </p>
     * <p>
     * Setter method for the COM property "IsOut"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    void isOut(
            int pVal);
    
    // Properties:
}
