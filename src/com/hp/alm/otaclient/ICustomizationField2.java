package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for customizing project fields.
 */
@IID("{2FA7E440-704F-4EFE-B500-EB93E7AFD294}")
public interface ICustomizationField2 extends com.hp.alm.otaclient.ICustomizationField
{
    // Methods:
    /**
     * <p>
     * Indicates whether members of the group can change the value of this field.
     * </p>
     * <p>
     * Getter method for the COM property "GrantModifyForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(73)
    boolean grantModifyForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates whether members of the group can change the value of this field.
     * </p>
     * <p>
     * Setter method for the COM property "GrantModifyForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @param pGrant Mandatory boolean parameter.
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(74)
    void grantModifyForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pGrant);
    
    /**
     * <p>
     * The list of groups whose members can modify this field.
     * </p>
     * <p>
     * Getter method for the COM property "AuthorizedModifyForGroups"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(75)
    com.hp.alm.otaclient.IList authorizedModifyForGroups();
    
    @VTID(75)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object authorizedModifyForGroups(
            int index);
    
    /**
     * <p>
     * Indicates whether the field can be modified by the owner if the owner belongs to the specified group.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerSensibleForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(76)
    boolean ownerSensibleForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates whether the field can be modified by the owner if the owner belongs to the specified group.
     * </p>
     * <p>
     * Setter method for the COM property "OwnerSensibleForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @param pGrant Mandatory boolean parameter.
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(77)
    void ownerSensibleForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pGrant);
    
    /**
     * <p>
     * The list of CustomizationUsersGroup objects of the groups for which only the owner can modify the field.
     * </p>
     * <p>
     * Getter method for the COM property "AuthorizedOwnerSensibleForGroups"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(78)
    com.hp.alm.otaclient.IList authorizedOwnerSensibleForGroups();
    
    @VTID(78)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object authorizedOwnerSensibleForGroups(
            int index);
    
    /**
     * <p>
     * Indicates whether the field is visible to the specified group in the new defect dialog.
     * </p>
     * <p>
     * Getter method for the COM property "VisibleInNewBugForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(79)
    boolean visibleInNewBugForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates whether the field is visible to the specified group in the new defect dialog.
     * </p>
     * <p>
     * Setter method for the COM property "VisibleInNewBugForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @param pGrant Mandatory boolean parameter.
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(80)
    void visibleInNewBugForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pGrant);
    
    /**
     * <p>
     * The list of CustomizationUsersGroup objects of the groups for which the field is visible in the new defect dialog.
     * </p>
     * <p>
     * Getter method for the COM property "AuthorizedVisibleInNewBugForGroups"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(81)
    com.hp.alm.otaclient.IList authorizedVisibleInNewBugForGroups();
    
    @VTID(81)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object authorizedVisibleInNewBugForGroups(
            int index);
    
    /**
     * <p>
     * Indicates whether the field is visible in the New Defect dialog to the specified group.
     * </p>
     * <p>
     * Getter method for the COM property "VisibleForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(82)
    boolean visibleForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Indicates whether the field is visible in the New Defect dialog to the specified group.
     * </p>
     * <p>
     * Setter method for the COM property "VisibleForGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @param pGrant Mandatory boolean parameter.
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(83)
    void visibleForGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group,
            boolean pGrant);
    
    /**
     * <p>
     * The list of CustomizationUsersGroup objects of the groups for which the field is visible in customization dialogs.
     * </p>
     * <p>
     * Getter method for the COM property "AuthorizedVisibleForGroups"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(42)
    //= 0x2a. The runtime will prefer the VTID if present
    @VTID(84)
    com.hp.alm.otaclient.IList authorizedVisibleForGroups();
    
    @VTID(84)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object authorizedVisibleForGroups(
            int index);
    
    /**
     * <p>
     * Indicates if items of this type can form groups with others of the same type.
     * </p>
     * <p>
     * Getter method for the COM property "IsCanGroup"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(43)
    //= 0x2b. The runtime will prefer the VTID if present
    @VTID(85)
    boolean isCanGroup();
    
    /**
     * <p>
     * Indicates if items of this type can form groups with others of the same type.
     * </p>
     * <p>
     * Setter method for the COM property "IsCanGroup"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(43)
    //= 0x2b. The runtime will prefer the VTID if present
    @VTID(86)
    void isCanGroup(
            boolean pVal);
    
    /**
     * <p>
     * For future use. Indicates whether history is kept for changes to the field.
     * </p>
     * <p>
     * Getter method for the COM property "AuditUpdate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(44)
    //= 0x2c. The runtime will prefer the VTID if present
    @VTID(87)
    boolean auditUpdate();
    
    /**
     * <p>
     * For future use. Indicates whether history is kept for changes to the field.
     * </p>
     * <p>
     * Setter method for the COM property "AuditUpdate"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(44)
    //= 0x2c. The runtime will prefer the VTID if present
    @VTID(88)
    void auditUpdate(
            boolean pVal);
    
    /**
     * <p>
     * Indicates whether the content of the field is searched by the Search method.
     * </p>
     * <p>
     * Getter method for the COM property "IsSearchable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(45)
    //= 0x2d. The runtime will prefer the VTID if present
    @VTID(89)
    boolean isSearchable();
    
    /**
     * <p>
     * Indicates whether the content of the field is searched by the Search method.
     * </p>
     * <p>
     * Setter method for the COM property "IsSearchable"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(45)
    //= 0x2d. The runtime will prefer the VTID if present
    @VTID(90)
    void isSearchable(
            boolean pVal);
    
    /**
     * <p>
     * Checks if search can be enabled for the field.
     * </p>
     * <p>
     * Getter method for the COM property "CanMakeSearchable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(46)
    //= 0x2e. The runtime will prefer the VTID if present
    @VTID(91)
    boolean canMakeSearchable();
    
    /**
     * <p>
     * Checks if the field has a physical representation in the database. If True, there is no physical representation.
     * </p>
     * <p>
     * Getter method for the COM property "IsVirtual"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(47)
    //= 0x2f. The runtime will prefer the VTID if present
    @VTID(92)
    boolean isVirtual();
    
    /**
     * <p>
     * Indicates whether the field can store more than one value.
     * </p>
     * <p>
     * Getter method for the COM property "IsMultiValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(48)
    //= 0x30. The runtime will prefer the VTID if present
    @VTID(93)
    boolean isMultiValue();
    
    /**
     * <p>
     * Indicates whether the field can store more than one value.
     * </p>
     * <p>
     * Setter method for the COM property "IsMultiValue"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(48)
    //= 0x30. The runtime will prefer the VTID if present
    @VTID(94)
    void isMultiValue(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the field can be configured to store multiple values. If False, IsMultiValue cannot be set to True.
     * </p>
     * <p>
     * Getter method for the COM property "CanMakeMultiValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(49)
    //= 0x31. The runtime will prefer the VTID if present
    @VTID(95)
    boolean canMakeMultiValue();
    
    // Properties:
}
