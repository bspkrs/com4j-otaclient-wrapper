package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a basic data field or entity, such as an attachment.
 */
@IID("{E2F29752-72F0-42DB-995C-3DB385F4CCE5}")
public interface IBaseField extends com.hp.alm.otaclient.IObjectLockingSupport
{
    // Methods:
    /**
     * <p>
     * The value of the specified field.
     * </p>
     * <p>
     * Getter method for the COM property "Field"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(10)
    @DefaultMethod
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object field(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The value of the specified field.
     * </p>
     * <p>
     * Setter method for the COM property "Field"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(11)
    @DefaultMethod
    void field(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The item ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object id();
    
    /**
     * <p>
     * If true, the database is updated immediately when the field value changes.
     * </p>
     * <p>
     * Getter method for the COM property "AutoPost"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    boolean autoPost();
    
    /**
     * <p>
     * If true, the database is updated immediately when the field value changes.
     * </p>
     * <p>
     * Setter method for the COM property "AutoPost"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void autoPost(
            boolean pVal);
    
    /**
     * <p>
     * Posts all changed values into database.
     * </p>
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    void post();
    
    /**
     * <p>
     * Reads saved values, overwriting values in memory.
     * </p>
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    void refresh();
    
    /**
     * <p>
     * Undoes changes to field values that have not been posted.
     * </p>
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    void undo();
    
    /**
     * <p>
     * Checks if the item has been modified since last refresh or post operation. If true, the field properties on the server side are not
     * up to date.
     * </p>
     * <p>
     * Getter method for the COM property "Modified"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    boolean modified();
    
    /**
     * <p>
     * Checks if this is a virtual item, that is, an item that does not have a corresponding database record.
     * </p>
     * <p>
     * Getter method for the COM property "Virtual"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    boolean virtual();
    
    // Properties:
}
