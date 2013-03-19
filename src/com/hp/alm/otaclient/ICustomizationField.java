package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for customizing project fields.
 */
@IID("{E34F74EC-DC52-42D8-A7E4-B4F06A56CF40}")
public interface ICustomizationField extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * A user-defined field label.
     * </p>
     * <p>
     * Getter method for the COM property "UserLabel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String userLabel();
    
    /**
     * <p>
     * A user-defined field label.
     * </p>
     * <p>
     * Setter method for the COM property "UserLabel"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void userLabel(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the table that stores the active field.
     * </p>
     * <p>
     * Getter method for the COM property "TableName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String tableName();
    
    /**
     * <p>
     * For HP use. The field's edit mask.
     * </p>
     * <p>
     * Getter method for the COM property "EditStyle"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String editStyle();
    
    /**
     * <p>
     * For HP use. The field's edit mask.
     * </p>
     * <p>
     * Setter method for the COM property "EditStyle"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void editStyle(
            java.lang.String pVal);
    
    /**
     * <p>
     * Checks if the field is a system field.
     * </p>
     * <p>
     * Getter method for the COM property "IsSystem"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    boolean isSystem();
    
    /**
     * <p>
     * Checks if the field is a system field.
     * </p>
     * <p>
     * Setter method for the COM property "IsSystem"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void isSystem(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the field is filter-enabled.
     * </p>
     * <p>
     * Getter method for the COM property "IsCanFilter"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    boolean isCanFilter();
    
    /**
     * <p>
     * Checks if the field is filter-enabled.
     * </p>
     * <p>
     * Setter method for the COM property "IsCanFilter"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    void isCanFilter(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the field is a database key field.
     * </p>
     * <p>
     * Getter method for the COM property "IsKey"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    boolean isKey();
    
    /**
     * <p>
     * Checks if the field is a database key field.
     * </p>
     * <p>
     * Setter method for the COM property "IsKey"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(17)
    void isKey(
            boolean pVal);
    
    /**
     * <p>
     * The position of the field in multi-field database key (1-based).
     * </p>
     * <p>
     * Getter method for the COM property "KeyOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(18)
    int keyOrder();
    
    /**
     * <p>
     * The position of the field in multi-field database key (1-based).
     * </p>
     * <p>
     * Setter method for the COM property "KeyOrder"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(19)
    void keyOrder(
            int pVal);
    
    /**
     * <p>
     * Indicates if the field is active. Inactive user-defined fields are not visible in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(20)
    boolean isActive();
    
    /**
     * <p>
     * Indicates if the field is active. Inactive user-defined fields are not visible in the user interface.
     * </p>
     * <p>
     * Setter method for the COM property "IsActive"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(21)
    void isActive(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the field can be edited.
     * </p>
     * <p>
     * Getter method for the COM property "IsEdit"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(22)
    boolean isEdit();
    
    /**
     * <p>
     * Indicates if the field can be edited.
     * </p>
     * <p>
     * Setter method for the COM property "IsEdit"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(23)
    void isEdit(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if change history is stored for the field.
     * </p>
     * <p>
     * Getter method for the COM property "IsHistory"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(24)
    boolean isHistory();
    
    /**
     * <p>
     * Indicates if change history is stored for the field.
     * </p>
     * <p>
     * Setter method for the COM property "IsHistory"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(25)
    void isHistory(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if Users on the list to be notified of changes are notified when this field is changed.
     * </p>
     * <p>
     * Getter method for the COM property "IsMail"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(26)
    boolean isMail();
    
    /**
     * <p>
     * Indicates if Users on the list to be notified of changes are notified when this field is changed.
     * </p>
     * <p>
     * Setter method for the COM property "IsMail"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(27)
    void isMail(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the field requires verification.
     * </p>
     * <p>
     * Getter method for the COM property "IsVerify"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(28)
    boolean isVerify();
    
    /**
     * <p>
     * Indicates if the field requires verification.
     * </p>
     * <p>
     * Setter method for the COM property "IsVerify"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(29)
    void isVerify(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the field stores the Tree Node ID, rather than the passed value.
     * </p>
     * <p>
     * Getter method for the COM property "IsByCode"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(30)
    boolean isByCode();
    
    /**
     * <p>
     * Indicates if the field stores the Tree Node ID, rather than the passed value.
     * </p>
     * <p>
     * Setter method for the COM property "IsByCode"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(31)
    void isByCode(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the field is required.
     * </p>
     * <p>
     * Getter method for the COM property "IsRequired"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(32)
    boolean isRequired();
    
    /**
     * <p>
     * Checks if the field is required.
     * </p>
     * <p>
     * Setter method for the COM property "IsRequired"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(33)
    void isRequired(
            boolean pVal);
    
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
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(34)
    java.lang.String userColumnType();
    
    /**
     * <p>
     * The user column type: char, number, date, memo, or empty string.
     * </p>
     * <p>
     * Setter method for the COM property "UserColumnType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(35)
    void userColumnType(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. Indicates if the last value for the field is stored.
     * </p>
     * <p>
     * Getter method for the COM property "IsKeepValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(36)
    boolean isKeepValue();
    
    /**
     * <p>
     * For HP use. Indicates if the last value for the field is stored.
     * </p>
     * <p>
     * Setter method for the COM property "IsKeepValue"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(37)
    void isKeepValue(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the field is displayed in the customization user interface.
     * </p>
     * <p>
     * Getter method for the COM property "IsCustomizable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(38)
    boolean isCustomizable();
    
    /**
     * <p>
     * Indicates if the field is displayed in the customization user interface.
     * </p>
     * <p>
     * Setter method for the COM property "IsCustomizable"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(39)
    void isCustomizable(
            boolean pVal);
    
    /**
     * <p>
     * The size of the field in the database. For BLOB fields, the size is -1.
     * </p>
     * <p>
     * Getter method for the COM property "FieldSize"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(40)
    int fieldSize();
    
    /**
     * <p>
     * The size of the field in the database. For BLOB fields, the size is -1.
     * </p>
     * <p>
     * Setter method for the COM property "FieldSize"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(41)
    void fieldSize(
            int pVal);
    
    /**
     * <p>
     * The column name.
     * </p>
     * <p>
     * Getter method for the COM property "ColumnName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(42)
    java.lang.String columnName();
    
    /**
     * <p>
     * The database column type: char, date, memo, number, or time.
     * </p>
     * <p>
     * Getter method for the COM property "ColumnType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(43)
    java.lang.String columnType();
    
    /**
     * <p>
     * The database column type: char, date, memo, number, or time.
     * </p>
     * <p>
     * Setter method for the COM property "ColumnType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(44)
    void columnType(
            java.lang.String pVal);
    
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
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(45)
    java.lang.String editMask();
    
    /**
     * <p>
     * The input mask for string fields.
     * </p>
     * <p>
     * Setter method for the COM property "EditMask"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(46)
    void editMask(
            java.lang.String pVal);
    
    /**
     * <p>
     * The CustomizationList assigned to the field.
     * </p>
     * <p>
     * Getter method for the COM property "List"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(47)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject list();
    
    /**
     * <p>
     * The CustomizationList assigned to the field.
     * </p>
     * <p>
     * Setter method for the COM property "List"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(48)
    void list(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * If the field contains a list, the ID of the list root node. If not, RootId is NULL.
     * </p>
     * <p>
     * Getter method for the COM property "RootId"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(49)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object rootId();
    
    /**
     * <p>
     * If the field contains a list, the ID of the list root node. If not, RootId is NULL.
     * </p>
     * <p>
     * Setter method for the COM property "RootId"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(50)
    void rootId(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The Field type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(51)
    int type();
    
    /**
     * <p>
     * The Field type.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(52)
    void type(
            int pVal);
    
    /**
     * <p>
     * Indicates if the object has been modified since the last download from the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(53)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the object has been modified since the last download from the server.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(54)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * The bit mask that indicates which user groups can modify the field.
     * </p>
     * <p>
     * Getter method for the COM property "GrantModifyMask"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(55)
    int grantModifyMask();
    
    /**
     * <p>
     * The bit mask that indicates which user groups can modify the field.
     * </p>
     * <p>
     * Setter method for the COM property "GrantModifyMask"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(56)
    void grantModifyMask(
            int pVal);
    
    /**
     * <p>
     * The bit mask that indicates for which groups this field can be modified only by its owner.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerSensibleMask"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(57)
    int ownerSensibleMask();
    
    /**
     * <p>
     * The bit mask that indicates for which groups this field can be modified only by its owner.
     * </p>
     * <p>
     * Setter method for the COM property "OwnerSensibleMask"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(58)
    void ownerSensibleMask(
            int pVal);
    
    /**
     * <p>
     * Indicates if the field is visible for the specified groups in a new defect form.
     * </p>
     * <p>
     * Getter method for the COM property "IsVisibleInNewBug"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(59)
    int isVisibleInNewBug();
    
    /**
     * <p>
     * Indicates if the field is visible for the specified groups in a new defect form.
     * </p>
     * <p>
     * Setter method for the COM property "IsVisibleInNewBug"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(60)
    void isVisibleInNewBug(
            int pVal);
    
    /**
     * <p>
     * Indicates if the field has transition logic.
     * </p>
     * <p>
     * Getter method for the COM property "IsTransitionLogic"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(61)
    boolean isTransitionLogic();
    
    /**
     * <p>
     * Indicates if the field has transition logic.
     * </p>
     * <p>
     * Setter method for the COM property "IsTransitionLogic"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(62)
    void isTransitionLogic(
            boolean pVal);
    
    /**
     * <p>
     * The default value of the field.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(63)
    java.lang.String defaultValue();
    
    /**
     * <p>
     * The default value of the field.
     * </p>
     * <p>
     * Setter method for the COM property "DefaultValue"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(64)
    void defaultValue(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. Indicates if a summation of the field can be obtained for graph presentation.
     * </p>
     * <p>
     * Getter method for the COM property "IsToSum"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(65)
    boolean isToSum();
    
    /**
     * <p>
     * For HP use. Indicates if a summation of the field can be obtained for graph presentation.
     * </p>
     * <p>
     * Setter method for the COM property "IsToSum"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(66)
    void isToSum(
            boolean pVal);
    
    /**
     * <p>
     * The bit mask that indicates which user groups can see this field.
     * </p>
     * <p>
     * Getter method for the COM property "VisibleForGroups"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(67)
    int visibleForGroups();
    
    /**
     * <p>
     * The bit mask that indicates which user groups can see this field.
     * </p>
     * <p>
     * Setter method for the COM property "VisibleForGroups"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(68)
    void visibleForGroups(
            int pVal);
    
    /**
     * <p>
     * Indicates if the field is under version control.
     * </p>
     * <p>
     * Getter method for the COM property "VersionControl"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(69)
    boolean versionControl();
    
    /**
     * <p>
     * Indicates if the field is under version control.
     * </p>
     * <p>
     * Setter method for the COM property "VersionControl"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(70)
    void versionControl(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the field was created but not posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "NewCreated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(71)
    boolean newCreated();
    
    /**
     * <p>
     * Indicates if the field was created but not posted to the server.
     * </p>
     * <p>
     * Setter method for the COM property "NewCreated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(72)
    void newCreated(
            boolean pVal);
    
    // Properties:
}
