package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a type of user action such as adding or deleting a bug.
 */
@IID("{217D92D5-CD8A-4ADA-8ECC-9D13C224DCA8}")
public interface ICustomizationAction extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The name of the action.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name();
    
    /**
     * <p>
     * A list of the user groups for which the current action is allowed.
     * </p>
     * <p>
     * Getter method for the COM property "Groups"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList groups();
    
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object groups(
            int index);
    
    /**
     * <p>
     * Adds a user group to the list of user groups for which the current action is allowed.
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void addGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Removes the specified user group from the list of groups for which the current action is allowed.
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void removeGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * The user group that owns the action.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerGroup"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject ownerGroup();
    
    /**
     * <p>
     * The user group that owns the action.
     * </p>
     * <p>
     * Setter method for the COM property "OwnerGroup"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void ownerGroup(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
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
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
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
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the group specified by the Group parameter has permission to perform the current action.
     * </p>
     * <p>
     * Getter method for the COM property "IsGroupPermited"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    boolean isGroupPermited(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Checks if the user group specified by the Group parameter is the owner of the current action.
     * </p>
     * <p>
     * Getter method for the COM property "IsOwnerGroup"
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    boolean isOwnerGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Checks if the user specified by the User parameter is permitted to perform the current action.
     * </p>
     * <p>
     * Getter method for the COM property "IsUserPermited"
     * </p>
     * 
     * @param user Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    boolean isUserPermited(
            @MarshalAs(NativeType.VARIANT) java.lang.Object user);
    
    /**
     * <p>
     * For HP use. Get/Set audit event.
     * </p>
     * <p>
     * Getter method for the COM property "AuditAction"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    boolean auditAction();
    
    /**
     * <p>
     * For HP use. Get/Set audit event.
     * </p>
     * <p>
     * Setter method for the COM property "AuditAction"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    void auditAction(
            boolean pVal);
    
    // Properties:
}
