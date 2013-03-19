package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a basic data field or entity, such as an attachment.
 */
@IID("{E4DC1359-6281-42FA-B739-CFA8E4ECC23F}")
public interface IBaseField3 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Writes all changed values to database.
     * </p>
     * 
     * @param undoOnFailure Optional parameter. Default value is false
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void post(
            @Optional @DefaultValue("-1") boolean undoOnFailure);
    
    // Properties:
}
