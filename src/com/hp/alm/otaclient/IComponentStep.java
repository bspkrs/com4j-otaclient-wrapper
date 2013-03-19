package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a step in a business process test.
 */
@IID("{6687454E-8D1A-462E-BFDE-E342BFF132D3}")
public interface IComponentStep extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The description of the step.
     * </p>
     * <p>
     * Getter method for the COM property "StepDescription"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String stepDescription();
    
    /**
     * <p>
     * The description of the step.
     * </p>
     * <p>
     * Setter method for the COM property "StepDescription"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    void stepDescription(
            java.lang.String pVal);
    
    /**
     * <p>
     * The 1-based position of the step in the order of execution of the steps of the component.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    int order();
    
    /**
     * <p>
     * The 1-based position of the step in the order of execution of the steps of the component.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(23)
    void order(
            int pVal);
    
    /**
     * <p>
     * The parent Component.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * The component step name.
     * </p>
     * <p>
     * Getter method for the COM property "StepName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String stepName();
    
    /**
     * <p>
     * The component step name.
     * </p>
     * <p>
     * Setter method for the COM property "StepName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(26)
    void stepName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The expected result of the step.
     * </p>
     * <p>
     * Getter method for the COM property "StepExpectedResult"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String stepExpectedResult();
    
    /**
     * <p>
     * The expected result of the step.
     * </p>
     * <p>
     * Setter method for the COM property "StepExpectedResult"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(28)
    void stepExpectedResult(
            java.lang.String pVal);
    
    /**
     * <p>
     * Validate the step.
     * </p>
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(29)
    void validate();
    
    // Properties:
}
