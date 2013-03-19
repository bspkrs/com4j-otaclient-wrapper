package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the notification rules.
 */
@IID("{FCBDBAD5-380A-43F5-B4D4-4CD988B0C924}")
public interface IRuleManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets a traceability notification rule by its ID.
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getRule(
            int id);
    
    /**
     * <p>
     * A list of all the Rule objects.
     * </p>
     * <p>
     * Getter method for the COM property "Rules"
     * </p>
     * 
     * @param needRefresh Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList rules(
            @Optional @DefaultValue("0") boolean needRefresh);
    
    // Properties:
}
