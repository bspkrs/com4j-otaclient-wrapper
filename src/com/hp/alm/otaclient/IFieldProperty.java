package com.hp.alm.otaclient;

import com4j.*;

/**
 * Properties for a field.
 */
@IID("{C2E1AF68-28C8-4DA3-8C65-5E1D230B1FF6}")
public interface IFieldProperty extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The user-defined label.
     * </p>
     * <p>
     * Getter method for the COM property "UserLabel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    java.lang.String userLabel();
    
    /**
     * <p>
     * The database table name.
     * </p>
     * <p>
     * Getter method for the COM property "DBTableName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String dbTableName();
    
    /**
     * <p>
     * The database column name.
     * </p>
     * <p>
     * Getter method for the COM property "DBColumnName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String dbColumnName();
    
    /**
     * <p>
     * The database column type.
     * </p>
     * <p>
     * Getter method for the COM property "DBColumnType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String dbColumnType();
    
    /**
     * <p>
     * The user interface control type used to edit this field.
     * </p>
     * <p>
     * Getter method for the COM property "EditStyle"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String editStyle();
    
    /**
     * <p>
     * The input mask for string fields.
     * </p>
     * <p>
     * Getter method for the COM property "EditMask"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String editMask();
    
    /**
     * <p>
     * Checks if this is a predefined system field.
     * </p>
     * <p>
     * Getter method for the COM property "IsSystem"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    boolean isSystem();
    
    /**
     * <p>
     * Checks if the field is displayed in the filter dialog box.
     * </p>
     * <p>
     * Getter method for the COM property "IsCanFilter"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    boolean isCanFilter();
    
    /**
     * <p>
     * Checks if this is a database key field.
     * </p>
     * <p>
     * Getter method for the COM property "IsKey"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    boolean isKey();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "KeyOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(16)
    int keyOrder();
    
    /**
     * <p>
     * Checks if the field can be edited.
     * </p>
     * <p>
     * Getter method for the COM property "IsEdit"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(17)
    boolean isEdit();
    
    /**
     * <p>
     * Checks if the field is can be displayed in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(18)
    boolean isActive();
    
    /**
     * <p>
     * Checks if change history is stored for the field.
     * </p>
     * <p>
     * Getter method for the COM property "IsHistory"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(19)
    boolean isHistory();
    
    /**
     * <p>
     * Checks if e-mail is sent to the users on the notification list when this field changes.
     * </p>
     * <p>
     * Getter method for the COM property "IsMail"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(20)
    boolean isMail();
    
    /**
     * <p>
     * Checks if the field requires verification.
     * </p>
     * <p>
     * Getter method for the COM property "IsVerify"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    boolean isVerify();
    
    /**
     * <p>
     * The tree root connected to the field.
     * </p>
     * <p>
     * Getter method for the COM property "Root"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject root();
    
    /**
     * <p>
     * Checks if the field saves the Tree Node ID (True), or the passed value (False).
     * </p>
     * <p>
     * Getter method for the COM property "IsByCode"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    boolean isByCode();
    
    /**
     * <p>
     * Checks if this is a required field.
     * </p>
     * <p>
     * Getter method for the COM property "IsRequired"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(24)
    boolean isRequired();
    
    /**
     * <p>
     * The user column type: char, number, date, memo, or empty string.
     * </p>
     * <p>
     * Getter method for the COM property "UserColumnType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String userColumnType();
    
    /**
     * <p>
     * Checks if the last value for the field is stored.
     * </p>
     * <p>
     * Getter method for the COM property "IsKeepValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(26)
    boolean isKeepValue();
    
    /**
     * <p>
     * Checks if the field is displayed in the customization UI.
     * </p>
     * <p>
     * Getter method for the COM property "IsCustomizable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(27)
    boolean isCustomizable();
    
    /**
     * <p>
     * The size of the field in the database (-1 for BLOB fields).
     * </p>
     * <p>
     * Getter method for the COM property "FieldSize"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(28)
    int fieldSize();
    
    /**
     * <p>
     * Checks if the field is visible in the New Bug form.
     * </p>
     * <p>
     * Getter method for the COM property "IsVisibleInNewBug"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(29)
    boolean isVisibleInNewBug();
    
    /**
     * <p>
     * Checks if this is a read-only field.
     * </p>
     * <p>
     * Getter method for the COM property "ReadOnly"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(30)
    boolean readOnly();
    
    /**
     * <p>
     * Checks if this field is summed for graphs.
     * </p>
     * <p>
     * Getter method for the COM property "IsToSum"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(31)
    boolean isToSum();
    
    /**
     * <p>
     * Checks if the user currently logged on the TDConnection is permitted to modify this field.
     * </p>
     * <p>
     * Getter method for the COM property "IsModify"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(32)
    boolean isModify();
    
    /**
     * <p>
     * Checks if the field is under version control.
     * </p>
     * <p>
     * Getter method for the COM property "IsVersionControl"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(33)
    boolean isVersionControl();
    
    /**
     * <p>
     * For HP future use.
     * </p>
     * <p>
     * Getter method for the COM property "IsVisible"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(34)
    boolean isVisible();
    
    // Properties:
}
