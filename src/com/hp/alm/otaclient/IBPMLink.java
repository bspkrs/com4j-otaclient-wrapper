package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a bpm link association between two requirements.
 */
@IID("{9DECA059-1AAA-4A1C-A26C-D70FC9D8B700}")
public interface IBPMLink extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The requirement from which the bpm link association is defined.
     * </p>
     * <p>
     * Getter method for the COM property "FromReq"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fromReq();
    
    /**
     * <p>
     * The requirement to which the bpm link association is defined.
     * </p>
     * <p>
     * Getter method for the COM property "ToReq"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject toReq();
    
    // Properties:
}
