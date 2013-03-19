package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single transition rule. A transition rule allows a change in value from a given source value to a given destination value.
 */
@IID("{93FF8BA2-20E4-40C0-BB37-638B5BFD8DAC}")
public interface ICustomizationTransitionRule extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The source value of the transition rule, that is, the value before the change.
     * </p>
     * <p>
     * Getter method for the COM property "SourceValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String sourceValue();
    
    /**
     * <p>
     * The source value of the transition rule, that is, the value before the change.
     * </p>
     * <p>
     * Setter method for the COM property "SourceValue"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void sourceValue(
            java.lang.String pVal);
    
    /**
     * <p>
     * The destination value of the transition rule, that is, the value after the change.
     * </p>
     * <p>
     * Getter method for the COM property "DestinationValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String destinationValue();
    
    /**
     * <p>
     * The destination value of the transition rule, that is, the value after the change.
     * </p>
     * <p>
     * Setter method for the COM property "DestinationValue"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void destinationValue(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. The action defined in the DestinationValue and SourceValue properties is allowed.
     * </p>
     * <p>
     * Getter method for the COM property "IsAllowed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    boolean isAllowed();
    
    /**
     * <p>
     * For HP use. The action defined in the DestinationValue and SourceValue properties is allowed.
     * </p>
     * <p>
     * Setter method for the COM property "IsAllowed"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void isAllowed(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the object has been modified since last synchronized with server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the object has been modified since last synchronized with server.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(14)
    void updated(
            boolean pVal);
    
    // Properties:
}
