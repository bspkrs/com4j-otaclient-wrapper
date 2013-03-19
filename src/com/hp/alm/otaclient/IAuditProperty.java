package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a property associated with an AuditRecord.
 */
@IID("{DD1C7F94-5C11-416D-B11D-DA062309D43A}")
public interface IAuditProperty extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The database table in which the change was recorded.
     * </p>
     * <p>
     * Getter method for the COM property "TableName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String tableName();
    
    /**
     * <p>
     * The database definition name of field that was changed.
     * </p>
     * <p>
     * Getter method for the COM property "FieldName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String fieldName();
    
    /**
     * <p>
     * The custom label for the field that was changed.
     * </p>
     * <p>
     * Getter method for the COM property "PropertyName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String propertyName();
    
    /**
     * <p>
     * The value before the change.
     * </p>
     * <p>
     * Getter method for the COM property "OldValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object oldValue();
    
    /**
     * <p>
     * The new value after the change.
     * </p>
     * <p>
     * Getter method for the COM property "NewValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object newValue();
    
    /**
     * <p>
     * The ID of the associated AuditRecord object.
     * </p>
     * <p>
     * Getter method for the COM property "ActionID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    int actionID();
    
    /**
     * <p>
     * The database activity that caused creation of this record. For example, INSERT, UPDATE, or DELETE.
     * </p>
     * <p>
     * Getter method for the COM property "Action"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String action();
    
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
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
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
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
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
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String time();
    
    /**
     * <p>
     * The type of the entity that changed. For example, BUG, REQ.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(30)
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
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String entityID();
    
    // Properties:
}
