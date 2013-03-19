package com.hp.alm.otaclient;

import com4j.*;

/**
 * A data change that is tracked.
 */
@IID("{1754ECE8-1386-456C-AA7C-AD448412EDA3}")
public interface IAuditRecord extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The AuditPropertyFactory Object for the current AuditRecord.
     * </p>
     * <p>
     * Getter method for the COM property "AuditPropertyFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject auditPropertyFactory();
    
    /**
     * <p>
     * The name of the action that caused the tracked change.
     * </p>
     * <p>
     * Getter method for the COM property "Action"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String action();
    
    /**
     * <p>
     * The type of the entity that changed.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String entityType();
    
    /**
     * <p>
     * The ID of the entity that changed.
     * </p>
     * <p>
     * Getter method for the COM property "EntityID"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String entityID();
    
    /**
     * <p>
     * The username of the user who performed the action.
     * </p>
     * <p>
     * Getter method for the COM property "UserName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String userName();
    
    /**
     * <p>
     * The Quality Center Session ID under which the action was performed.
     * </p>
     * <p>
     * Getter method for the COM property "SessionID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    int sessionID();
    
    /**
     * <p>
     * The time stamp of the change according to the database server clock.
     * </p>
     * <p>
     * Getter method for the COM property "Time"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String time();
    
    /**
     * <p>
     * For HP use. Get Context Action ID.
     * </p>
     * <p>
     * Getter method for the COM property "ContextID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    int contextID();
    
    /**
     * <p>
     * The description of the audited change.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String description();
    
    /**
     * <p>
     * The ID of the AuditRecord.
     * </p>
     * <p>
     * Getter method for the COM property "ActionID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    int actionID();
    
    // Properties:
}
