package com.hp.alm.otaclient;

import com4j.*;

/**
 * The collection of configurations for custom automatic mail notifications.
 */
@IID("{2D05E2CD-60E9-4C56-A05D-D25872A00335}")
public interface ICustomizationMailConditions extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the CustomizationMailCondition specified by the name and type.
     * </p>
     * <p>
     * Getter method for the COM property "Condition"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param conditionType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject condition(
            java.lang.String name,
            int conditionType);
    
    /**
     * <p>
     * Gets the list of CustomizationMailCondition objects.
     * </p>
     * <p>
     * Getter method for the COM property "Conditions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList conditions();
    
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object conditions(
            int index);
    
    /**
     * <p>
     * Creates a new CustomizationMailCondition.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param conditionType Mandatory int parameter.
     * @param conditionText Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addCondition(
            java.lang.String name,
            int conditionType,
            java.lang.String conditionText);
    
    /**
     * <p>
     * Deletes the specified CustomizationMailCondition.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param conditionType Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void removeCondition(
            java.lang.String name,
            int conditionType);
    
    /**
     * <p>
     * Checks if the specified mail customization condition exists.
     * </p>
     * <p>
     * Getter method for the COM property "ConditionExist"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param conditionType Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean conditionExist(
            java.lang.String name,
            int conditionType);
    
    // Properties:
}
