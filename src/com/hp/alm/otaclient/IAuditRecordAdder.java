package com.hp.alm.otaclient;

import com4j.*;

/**
 * Custom audit events.
 */
@IID("{0936F9CD-8DD6-44CF-A658-D9C062DB3ACA}")
public interface IAuditRecordAdder extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Adds a custom audit record.
     * </p>
     * 
     * @param pAuditRecordData Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void addAuditRecord(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pAuditRecordData);
    
    // Properties:
}
