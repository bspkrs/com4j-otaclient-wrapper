package com.hp.alm.otaclient;

import com4j.*;

/**
 * An instance of a business component parameter that belongs to a single iteration.
 */
@IID("{B40742AD-3BED-40B4-BD58-0F24E41ACDD2}")
public interface IBPIterationParam extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The BPParameter object of which this is an instance.
     * </p>
     * <p>
     * Getter method for the COM property "BPParameter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpParameter();
    
    /**
     * <p>
     * The value of the parameter for this iteration.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String value();
    
    /**
     * <p>
     * The value of the parameter for this iteration.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(22)
    void value(
            java.lang.String pVal);
    
    // Properties:
}
