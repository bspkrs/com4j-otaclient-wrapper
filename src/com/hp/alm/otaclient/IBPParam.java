package com.hp.alm.otaclient;

import com4j.*;

/**
 * An instance of a Component Parameter in a business component.
 */
@IID("{51A0C1D6-F748-41D1-988F-B0B93013F1BC}")
public interface IBPParam extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The output BPParameter object that is the source of the value for this parameter.
     * </p>
     * <p>
     * Getter method for the COM property "Reference"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reference();
    
    /**
     * <p>
     * The output BPParameter object that is the source of the value for this parameter.
     * </p>
     * <p>
     * Setter method for the COM property "Reference"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(21)
    void reference(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * The parameter type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(22)
    int type();
    
    /**
     * <p>
     * The ComponentParam object from which this BPParam was created.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParam"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentParam();
    
    /**
     * <p>
     * The name of the ComponentParam object from which this BPParam was created.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParamName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String componentParamName();
    
    /**
     * <p>
     * Indicates if the ComponentParam from which this BPParam was created is an output parameter. If 0, input parameter.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParamIsOut"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(25)
    int componentParamIsOut();
    
    /**
     * <p>
     * The BPComponent object to which this parameter belongs.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpComponent();
    
    /**
     * <p>
     * The position of the ComponentParam object from which this BPParam was created.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParamOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(27)
    int componentParamOrder();
    
    // Properties:
}
