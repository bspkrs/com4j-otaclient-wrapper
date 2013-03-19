package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a user for purposes of adding and removing the user to and from user groups.
 */
@IID("{C10389DD-70AC-48F5-BCF0-9A1CBA5FCAD9}")
public interface ICustomizationUser extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * A text field that can be used to record user information as appropriate for the project.
     * </p>
     * <p>
     * Getter method for the COM property "Address"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String address();
    
    /**
     * <p>
     * A text field that can be used to record user information as appropriate for the project.
     * </p>
     * <p>
     * Setter method for the COM property "Address"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void address(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user's e-mail address.
     * </p>
     * <p>
     * Getter method for the COM property "Email"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String email();
    
    /**
     * <p>
     * The user's e-mail address.
     * </p>
     * <p>
     * Setter method for the COM property "Email"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void email(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user's full name.
     * </p>
     * <p>
     * Getter method for the COM property "FullName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String fullName();
    
    /**
     * <p>
     * The user's full name.
     * </p>
     * <p>
     * Setter method for the COM property "FullName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void fullName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user's telephone number.
     * </p>
     * <p>
     * Getter method for the COM property "Phone"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String phone();
    
    /**
     * <p>
     * The user's telephone number.
     * </p>
     * <p>
     * Setter method for the COM property "Phone"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(14)
    void phone(
            java.lang.String pVal);
    
    /**
     * <p>
     * A unique name by which to identify this user.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String name();
    
    /**
     * <p>
     * Indicates if the user's data was updated since the last synchronization with the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the user's data was updated since the last synchronization with the server.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(17)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * Removes this user from the specified user group.
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(18)
    void removeFromGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Adds this user to the specified user group.
     * </p>
     * 
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(19)
    void addToGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * Deprecated. User InGroup, which uses better error handling.
     * </p>
     * <p>
     * Getter method for the COM property "In_Group"
     * </p>
     * 
     * @param groupName Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(20)
    boolean in_Group(
            @MarshalAs(NativeType.VARIANT) java.lang.Object groupName);
    
    /**
     * <p>
     * Deprecated. User InGroup, which uses better error handling.
     * </p>
     * <p>
     * Setter method for the COM property "In_Group"
     * </p>
     * 
     * @param groupName Mandatory java.lang.Object parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(21)
    void in_Group(
            @MarshalAs(NativeType.VARIANT) java.lang.Object groupName,
            boolean pVal);
    
    /**
     * <p>
     * If true, this user is marked for deletion, but the deletion is not yet committed.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(22)
    boolean deleted();
    
    /**
     * <p>
     * If true, this user is marked for deletion, but the deletion is not yet committed.
     * </p>
     * <p>
     * Setter method for the COM property "Deleted"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(23)
    void deleted(
            boolean pVal);
    
    /**
     * <p>
     * The names of all the user groups to which this user belongs.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(24)
    com.hp.alm.otaclient.IList groupsList();
    
    @VTID(24)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object groupsList(
            int index);
    
    /**
     * <p>
     * Sets the user's password.
     * </p>
     * <p>
     * Setter method for the COM property "Password"
     * </p>
     * 
     * @param rhs Mandatory java.lang.String parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(25)
    void password(
            java.lang.String rhs);
    
    /**
     * <p>
     * Indicates if this user is a member of the specified group.
     * </p>
     * <p>
     * Getter method for the COM property "InGroup"
     * </p>
     * 
     * @param groupName Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(26)
    boolean inGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object groupName);
    
    /**
     * <p>
     * Indicates if this user is a member of the specified group.
     * </p>
     * <p>
     * Setter method for the COM property "InGroup"
     * </p>
     * 
     * @param groupName Mandatory java.lang.Object parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(27)
    void inGroup(
            @MarshalAs(NativeType.VARIANT) java.lang.Object groupName,
            boolean pVal);
    
    /**
     * <p>
     * The user credentials for LDAP authentication.
     * </p>
     * <p>
     * Getter method for the COM property "DomainAuthentication"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String domainAuthentication();
    
    /**
     * <p>
     * The user credentials for LDAP authentication.
     * </p>
     * <p>
     * Setter method for the COM property "DomainAuthentication"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(29)
    void domainAuthentication(
            java.lang.String pVal);
    
    // Properties:
}
