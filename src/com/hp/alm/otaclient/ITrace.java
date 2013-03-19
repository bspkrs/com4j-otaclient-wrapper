package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a traceability association between two requirements.
 */
@IID("{47ED7949-FBFC-4C85-9AE0-32A3180D7256}")
public interface ITrace extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The requirement from which the association is defined.
     * </p>
     * <p>
     * Getter method for the COM property "FromReq"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fromReq();
    
    /**
     * <p>
     * The requirement to which the association is defined.
     * </p>
     * <p>
     * Getter method for the COM property "ToReq"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject toReq();
    
    /**
     * <p>
     * The other requirement that the initiating requirement forms a trace with.
     * </p>
     * <p>
     * Setter method for the COM property "TracedReq"
     * </p>
     * 
     * @param rhs Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(22)
    void tracedReq(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject rhs);
    
    // Properties:
}
