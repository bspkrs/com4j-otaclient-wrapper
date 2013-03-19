package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single design step in a test.
 */
@IID("{E04B8E16-1118-4D05-90CE-3DCC39633158}")
public interface IDesignStep extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The design step name.
     * </p>
     * <p>
     * Getter method for the COM property "StepName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String stepName();
    
    /**
     * <p>
     * The design step name.
     * </p>
     * <p>
     * Setter method for the COM property "StepName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void stepName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The description of the design step.
     * </p>
     * <p>
     * Getter method for the COM property "StepDescription"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String stepDescription();
    
    /**
     * <p>
     * The description of the design step.
     * </p>
     * <p>
     * Setter method for the COM property "StepDescription"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void stepDescription(
            java.lang.String pVal);
    
    /**
     * <p>
     * The expected results of the step.
     * </p>
     * <p>
     * Getter method for the COM property "StepExpectedResult"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String stepExpectedResult();
    
    /**
     * <p>
     * The expected results of the step.
     * </p>
     * <p>
     * Setter method for the COM property "StepExpectedResult"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    void stepExpectedResult(
            java.lang.String pVal);
    
    /**
     * <p>
     * The order of the design step in the test procedure.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    int order();
    
    /**
     * <p>
     * The order of the design step in the test procedure.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(30)
    void order(
            int pVal);
    
    /**
     * <p>
     * A template test to be linked to the design step.
     * </p>
     * <p>
     * Getter method for the COM property "LinkTest"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object linkTest();
    
    /**
     * <p>
     * A template test to be linked to the design step.
     * </p>
     * <p>
     * Setter method for the COM property "LinkTest"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(32)
    void linkTest(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * Deprecated. Use ParameterValueFactory of ISupportParameterValues. The linked test parameters.
     * </p>
     * <p>
     * Getter method for the COM property "LinkedParams"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject linkedParams();
    
    /**
     * <p>
     * The ID of the linked test.
     * </p>
     * <p>
     * Getter method for the COM property "LinkTestID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(34)
    int linkTestID();
    
    /**
     * <p>
     * The design step description.
     * </p>
     * <p>
     * Getter method for the COM property "EvaluatedStepDescription"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String evaluatedStepDescription();
    
    /**
     * <p>
     * The design step expected result string.
     * </p>
     * <p>
     * Getter method for the COM property "EvaluatedStepExpectedResult"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(36)
    java.lang.String evaluatedStepExpectedResult();
    
    /**
     * <p>
     * The test object to which the design step belongs.
     * </p>
     * <p>
     * Getter method for the COM property "ParentTest"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parentTest();
    
    // Properties:
}
