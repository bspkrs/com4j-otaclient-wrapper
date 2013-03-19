package com.hp.alm.otaclient;

import com4j.*;

/**
 * A collection of CustomizationTransitionRule objects applied to a specific field and user group.
 */
@IID("{365FA56C-AE1E-46EB-A776-6EDDB82BF290}")
public interface ICustomizationTransitionRules extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The number of CustomizationTransitionRule objects contained by the current object.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int count();
    
    /**
     * <p>
     * The CustomizationTransitionRule specified by its position in the list of transition rules.
     * </p>
     * <p>
     * Getter method for the COM property "TransitionRule"
     * </p>
     * 
     * @param position Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject transitionRule(
            int position);
    
    /**
     * <p>
     * Adds a new CustomizationTransitionRule to the current object.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addTransitionRule();
    
    /**
     * <p>
     * Removes the specified transition rule from the current object.
     * </p>
     * 
     * @param rule Mandatory java.lang.Object parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void removeTransitionRule(
            @MarshalAs(NativeType.VARIANT) java.lang.Object rule);
    
    /**
     * <p>
     * Indicates if the object has been modified since the last synchronization with database.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the object has been modified since the last synchronization with database.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * The CustomizationField object to which the transition rules in the current object are attached.
     * </p>
     * <p>
     * Getter method for the COM property "Field"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject field();
    
    /**
     * <p>
     * The CustomizationUsersGroup object to which the transition rules in the current object are attached.
     * </p>
     * <p>
     * Getter method for the COM property "Group"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject group();
    
    /**
     * <p>
     * The location (database table) of the field to which the transition rules in the current object are attached.
     * </p>
     * <p>
     * Getter method for the COM property "EntityName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String entityName();
    
    // Properties:
}
