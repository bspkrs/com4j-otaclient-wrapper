package com.hp.alm.otaclient;

import com4j.*;

/**
 * The design-time definition of a business component iteration.
 */
@IID("{F96FB8D9-0CD2-4B82-85FA-AB07C435F87F}")
public interface IBPIteration extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The BPComponent object of which this an iteration.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpComponent();
    
    /**
     * <p>
     * Deprecated. Use BPIterationParamFactory of IBPIteration2. The list of BPIterationParam objects associated with this iteration.
     * </p>
     * <p>
     * Getter method for the COM property "IterationParams"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    com.hp.alm.otaclient.IList iterationParams();
    
    @VTID(21)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object iterationParams(
            int index);
    
    /**
     * <p>
     * Deprecated. Use BPIterationParamFactory of IBPIteration2. Add the specified BPParameter Object to the iteration.
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addParam(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * Deprecated. Use BPIterationParamFactory of IBPIteration2. Delete the specified BPParameter from the iteration.
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    void deleteParam(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * Deprecated. Use BPIterationParamFactory of IBPIteration2. Delete all the parameters from the iteration.
     * </p>
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    void deleteIterationParams();
    
    /**
     * <p>
     * The 0-based execution position of this iteration in the set of iterations of this component.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(25)
    int order();
    
    /**
     * <p>
     * The 0-based execution position of this iteration in the set of iterations of this component.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(26)
    void order(
            int pVal);
    
    // Properties:
}
