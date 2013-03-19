package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a condition for a test to be executed.
 */
@IID("{8A01DC68-2D34-4CB2-81D7-968F37C50715}")
public interface ICondition extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The Condition status value.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object value();
    
    /**
     * <p>
     * The Condition status value.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(8)
    @DefaultMethod
    void value(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * For HP use. The condition type: TDCOND_RUN for a test run status, or any other value for a time condition.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type short
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(9)
    short type();
    
    /**
     * <p>
     * For a run condition, the source condition ID. For a time condition, a date-time string.
     * </p>
     * <p>
     * Getter method for the COM property "Source"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object source();
    
    /**
     * <p>
     * The target test instance number of the condition.
     * </p>
     * <p>
     * Getter method for the COM property "Target"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object target();
    
    /**
     * <p>
     * The Condition description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String description();
    
    /**
     * <p>
     * The Condition description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Condition ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object id();
    
    /**
     * <p>
     * For HP use. For a run condition, the source test instance number of the condition.
     * </p>
     * <p>
     * Getter method for the COM property "SourceInstance"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object sourceInstance();
    
    /**
     * <p>
     * For HP use. The target test instance number of the condition.
     * </p>
     * <p>
     * Getter method for the COM property "TargetInstance"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object targetInstance();
    
    /**
     * <p>
     * For HP use. The source test ID.
     * </p>
     * <p>
     * Getter method for the COM property "SourceTestId"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object sourceTestId();
    
    /**
     * <p>
     * For HP use. The target test instance number of the condition.
     * </p>
     * <p>
     * Getter method for the COM property "TargetTestId"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object targetTestId();
    
    // Properties:
}
