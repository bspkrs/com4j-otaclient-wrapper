package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single Business Process Test.
 */
@IID("{CED907EB-C569-490F-84B1-C3E106C536AA}")
public interface IBusinessProcess2 extends com.hp.alm.otaclient.IBusinessProcess
{
    // Methods:
    /**
     * <p>
     * Deprecated. Use BPOutputParamFactory of IBusinessProcess4. The list of flow output parameters for the test.
     * </p>
     * <p>
     * Getter method for the COM property "FlowOutputParameters"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(117)
    //= 0x75. The runtime will prefer the VTID if present
    @VTID(65)
    com.hp.alm.otaclient.IList flowOutputParameters();
    
    @VTID(65)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object flowOutputParameters(
            int index);
    
    /**
     * <p>
     * Deprecated. Use BPOutputParamFactory of IBusinessProcess4. Adds a flow output parameter to the test.
     * </p>
     * 
     * @param pSrcBPParam Mandatory com4j.Com4jObject parameter.
     * @param iteration Mandatory int parameter.
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(118)
    //= 0x76. The runtime will prefer the VTID if present
    @VTID(66)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addFlowOutputParam(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pSrcBPParam,
            int iteration,
            java.lang.String name);
    
    /**
     * <p>
     * Deprecated. Use BPOutputParamFactory of IBusinessProcess4. Deletes the flow output parameter from the test.
     * </p>
     * 
     * @param pShadowCompParam Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(119)
    //= 0x77. The runtime will prefer the VTID if present
    @VTID(67)
    void deleteFlowOutputParam(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pShadowCompParam);
    
    /**
     * <p>
     * For HP use. Checks whether the test contains flows.
     * </p>
     * <p>
     * Getter method for the COM property "IsWithFlows"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(120)
    //= 0x78. The runtime will prefer the VTID if present
    @VTID(68)
    boolean isWithFlows();
    
    /**
     * <p>
     * For HP use. Checks whether the test contains at least one dynamic date parameters values.
     * </p>
     * <p>
     * Getter method for the COM property "HasDynamicDateParameterValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(121)
    //= 0x79. The runtime will prefer the VTID if present
    @VTID(69)
    boolean hasDynamicDateParameterValue();
    
    /**
     * <p>
     * For HP use. Locks the test's components. Returns true on success.
     * </p>
     * <p>
     * Getter method for the COM property "LockComponents"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(122)
    //= 0x7a. The runtime will prefer the VTID if present
    @VTID(70)
    boolean lockComponents();
    
    /**
     * <p>
     * For HP use. Unlocks the test's components.
     * </p>
     */
    
    @DISPID(123)
    //= 0x7b. The runtime will prefer the VTID if present
    @VTID(71)
    void unlockALLComponents();
    
    /**
     * <p>
     * For HP use. Returns the runtime flow parameters. If groupLevel is 1, parameters are grouped by components. If groupLevel is 2,by
     * iterations.
     * </p>
     * 
     * @param groupLevel Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(124)
    //= 0x7c. The runtime will prefer the VTID if present
    @VTID(72)
    com.hp.alm.otaclient.IList getParameterGroups(
            int groupLevel);
    
    /**
     * <p>
     * For HP use. Returns the list of IComponent objects in which the IRTParam value is used.
     * </p>
     * 
     * @param pRTParam Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(125)
    //= 0x7d. The runtime will prefer the VTID if present
    @VTID(73)
    com.hp.alm.otaclient.IList getRTParamOccurrences(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pRTParam);
    
    // Properties:
}
