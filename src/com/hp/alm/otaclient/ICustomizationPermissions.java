package com.hp.alm.otaclient;

import com4j.*;

/**
 * Properties that define the ability of user groups to add, remove, and modify entities.
 */
@IID("{7EE7D348-AED6-4B3C-8FC7-5D9D8EA8E4C9}")
public interface ICustomizationPermissions extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Indicates if members of the specified group can add the specified type of entity.
     * </p>
     * <p>
     * Getter method for the COM property "CanAddItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean canAddItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members of the specified group can add the specified type of entity.
     * </p>
     * <p>
     * Setter method for the COM property "CanAddItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void canAddItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pVal);
    
    /**
     * <p>
     * Indicates if members or owners of the specified group can remove the specified type of entity.
     * </p>
     * <p>
     * Getter method for the COM property "CanRemoveItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    int canRemoveItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members or owners of the specified group can remove the specified type of entity.
     * </p>
     * <p>
     * Setter method for the COM property "CanRemoveItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void canRemoveItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            int pVal);
    
    /**
     * <p>
     * Indicates if members or owners of the specified group can modify the specified field.
     * </p>
     * <p>
     * Getter method for the COM property "CanModifyField"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param field Mandatory java.lang.Object parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    int canModifyField(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object field,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members or owners of the specified group can modify the specified field.
     * </p>
     * <p>
     * Setter method for the COM property "CanModifyField"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param field Mandatory java.lang.Object parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void canModifyField(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object field,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            int pVal);
    
    /**
     * <p>
     * The transition rules for the specified field and group.
     * </p>
     * <p>
     * Getter method for the COM property "TransitionRules"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param field Mandatory java.lang.Object parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject transitionRules(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object field,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members owners of the specified group can handle the specified type of entity attachments.
     * </p>
     * <p>
     * Getter method for the COM property "CanAllowAttachment"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    int canAllowAttachment(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members owners of the specified group can handle the specified type of entity attachments.
     * </p>
     * <p>
     * Setter method for the COM property "CanAllowAttachment"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    void canAllowAttachment(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            int pVal);
    
    /**
     * <p>
     * Checks if the fields of the specified entity can be restricted for owner modifications only.
     * </p>
     * <p>
     * Getter method for the COM property "CanUseOwnerSensible"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    boolean canUseOwnerSensible(
            java.lang.String entityName);
    
    /**
     * <p>
     * Checks if the entity specified by the EntityName parameter can have attachments.
     * </p>
     * <p>
     * Getter method for the COM property "HasAttachmentField"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(17)
    boolean hasAttachmentField(
            java.lang.String entityName);
    
    /**
     * <p>
     * Indicates if the specified Bug field is visible for the specified group in a new defect form.
     * </p>
     * <p>
     * Setter method for the COM property "IsVisibleInNewBug"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param field Mandatory java.lang.Object parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(18)
    void isVisibleInNewBug(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object field,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the specified Bug field is visible for the specified group in a new defect form.
     * </p>
     * <p>
     * Getter method for the COM property "IsVisibleInNewBug"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param field Mandatory java.lang.Object parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(19)
    boolean isVisibleInNewBug(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object field,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates if members of the specified group can modify the specified entity.
     * </p>
     * <p>
     * Setter method for the COM property "CanModifyItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(20)
    void canModifyItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pVal);
    
    /**
     * <p>
     * Indicates if members of the specified group can modify the specified entity.
     * </p>
     * <p>
     * Getter method for the COM property "CanModifyItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(21)
    boolean canModifyItem(
            java.lang.String entityName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * For HP use. property AuditAddItem.
     * </p>
     * <p>
     * Getter method for the COM property "AuditAddItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(22)
    boolean auditAddItem(
            java.lang.String entityName);
    
    /**
     * <p>
     * For HP use. property AuditAddItem.
     * </p>
     * <p>
     * Setter method for the COM property "AuditAddItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(23)
    void auditAddItem(
            java.lang.String entityName,
            boolean pVal);
    
    /**
     * <p>
     * For HP use. property AuditRemoveItem.
     * </p>
     * <p>
     * Getter method for the COM property "AuditRemoveItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(24)
    boolean auditRemoveItem(
            java.lang.String entityName);
    
    /**
     * <p>
     * For HP use. property AuditRemoveItem.
     * </p>
     * <p>
     * Setter method for the COM property "AuditRemoveItem"
     * </p>
     * 
     * @param entityName Mandatory java.lang.String parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(25)
    void auditRemoveItem(
            java.lang.String entityName,
            boolean pVal);
    
    // Properties:
}
