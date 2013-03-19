package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to allow changes to an entity to be tracked.
 */
@IID("{3DE03C28-EC6B-4953-96C2-E3216051C907}")
public interface IAuditable extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The AuditRecordFactory object to handle AuditRecords for the changed object.
     * </p>
     * <p>
     * Getter method for the COM property "AuditRecordFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject auditRecordFactory();
    
    /**
     * <p>
     * The AuditPropertyFactory object to handle AuditProperty objects for the changed object.
     * </p>
     * <p>
     * Getter method for the COM property "AuditPropertyFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject auditPropertyFactory();
    
    // Properties:
}
