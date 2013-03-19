package com.hp.alm.otaclient;

import com4j.*;

/**
 * Custom audit events.
 */
@IID("{F4EC0532-85B6-4F7D-872A-84AB8B2158E6}")
public interface IAuditRecordData extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The action for which a custom audit is required.
     * </p>
     * <p>
     * Getter method for the COM property "Action"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String action();
    
    /**
     * <p>
     * The action for which a custom audit is required.
     * </p>
     * <p>
     * Setter method for the COM property "Action"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void action(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ID of the entity for which a custom audit is required.
     * </p>
     * <p>
     * Getter method for the COM property "EntityID"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String entityID();
    
    /**
     * <p>
     * The ID of the entity for which a custom audit is required.
     * </p>
     * <p>
     * Setter method for the COM property "EntityID"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void entityID(
            java.lang.String pVal);
    
    /**
     * <p>
     * The type of the entity for which a custom audit is required.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String entityType();
    
    /**
     * <p>
     * The type of the entity for which a custom audit is required.
     * </p>
     * <p>
     * Setter method for the COM property "EntityType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void entityType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The description of the custom audit event.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String description();
    
    /**
     * <p>
     * The description of the custom audit event.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(14)
    void description(
            java.lang.String pVal);
    
    // Properties:
}
