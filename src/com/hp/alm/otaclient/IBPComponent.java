package com.hp.alm.otaclient;

import com4j.*;

/**
 * An instance of a Component in a Business Process.
 */
@IID("{42AD6542-9DBC-4A66-BC3F-7692832D33CB}")
public interface IBPComponent extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Get the Component object from which this BPComponent was created.
     * </p>
     * <p>
     * Getter method for the COM property "Component"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject component();
    
    /**
     * <p>
     * The position of the BPComponent in the BusinessProcess (1-based).
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    int order();
    
    /**
     * <p>
     * The position of the BPComponent in the BusinessProcess (1-based).
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param plVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void order(
            int plVal);
    
    /**
     * <p>
     * The parent business process test.
     * </p>
     * <p>
     * Getter method for the COM property "Test"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject test();
    
    /**
     * <p>
     * Indicates the behavior of the business process test if this component fails.
     * </p>
     * <p>
     * Getter method for the COM property "FailureCondition"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String failureCondition();
    
    /**
     * <p>
     * Indicates the behavior of the business process test if this component fails.
     * </p>
     * <p>
     * Setter method for the COM property "FailureCondition"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    void failureCondition(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the component from which this BPComponent was created.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String name();
    
    /**
     * <p>
     * The BPGroup to which this component belongs.
     * </p>
     * <p>
     * Getter method for the COM property "Group"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject group();
    
    /**
     * <p>
     * For HP use. Property GroupID.
     * </p>
     * <p>
     * Setter method for the COM property "GroupId"
     * </p>
     * 
     * @param rhs Mandatory int parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    void groupId(
            int rhs);
    
    /**
     * <p>
     * Deprecated. Use BPParamFactory of IBPComponent2. The list of the BPComponents parameters.
     * </p>
     * <p>
     * Getter method for the COM property "BPParams"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    com.hp.alm.otaclient.IList bpParams();
    
    @VTID(32)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object bpParams(
            int index);
    
    /**
     * <p>
     * Deprecated. Use BPIterationFactory of IBPComponent2. The list of the BPComponents Iterations.
     * </p>
     * <p>
     * Getter method for the COM property "Iterations"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    com.hp.alm.otaclient.IList iterations();
    
    @VTID(33)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object iterations(
            int index);
    
    /**
     * <p>
     * Deprecated. Use BPIterationFactory of IBPComponent2. Adds an Iteration to the BPComponent.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addIteration();
    
    /**
     * <p>
     * Deprecated. Use BPIterationFactory of IBPComponent2. Delete the specified BPIteration from the BPComponent.
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(35)
    void deleteIteration(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * @param pComponentParam Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(36)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject _AddBPParameter(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pComponentParam);
    
    // Properties:
}
