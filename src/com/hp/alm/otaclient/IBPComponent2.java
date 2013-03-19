package com.hp.alm.otaclient;

import com4j.*;

/**
 * An instance of a Component in a Business Process.
 */
@IID("{2239284B-2357-4D4E-A39F-2279E58B16C2}")
public interface IBPComponent2 extends com.hp.alm.otaclient.IBPComponent
{
    // Methods:
    /**
     * <p>
     * The BPIterationFactory for this Business Process Component.
     * </p>
     * <p>
     * Getter method for the COM property "BPIterationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpIterationFactory();
    
    /**
     * <p>
     * The BPParamFactory for this Business Process Component.
     * </p>
     * <p>
     * Getter method for the COM property "BPParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(38)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpParamFactory();
    
    /**
     * <p>
     * The BPComponentFactory for this Business Process Component.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponentFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(39)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpComponentFactory();
    
    /**
     * <p>
     * For HP use. Get preceding out BP ouptut parameters.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(40)
    com.hp.alm.otaclient.IList getPrecedingOutputBpParameters();
    
    @VTID(40)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object getPrecedingOutputBpParameters(
            int index);
    
    /**
     * <p>
     * For HP use. The number of iterations of the BPComponent.
     * </p>
     * <p>
     * Getter method for the COM property "IterationsCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(41)
    int iterationsCount();
    
    /**
     * <p>
     * For HP use. The number of iterations of the BPComponent.
     * </p>
     * <p>
     * Setter method for the COM property "IterationsCount"
     * </p>
     * 
     * @param plVal Mandatory int parameter.
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(42)
    void iterationsCount(
            int plVal);
    
    /**
     * <p>
     * For HP use. The IDs of the input BP Params that are referencing output parameters and their iterations mismatch
     * </p>
     * <p>
     * Getter method for the COM property "InBPParamsIdsWithIterationsMismatch"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(43)
    com.hp.alm.otaclient.IList inBPParamsIdsWithIterationsMismatch();
    
    @VTID(43)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object inBPParamsIdsWithIterationsMismatch(
            int index);
    
    /**
     * <p>
     * For HP use. The IDs of the input BP Params that are referencing output parameters and their iterations mismatch
     * </p>
     * <p>
     * Setter method for the COM property "InBPParamsIdsWithIterationsMismatch"
     * </p>
     * 
     * @param pList Mandatory com.hp.alm.otaclient.IList parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(44)
    void inBPParamsIdsWithIterationsMismatch(
            com.hp.alm.otaclient.IList pList);
    
    // Properties:
}
