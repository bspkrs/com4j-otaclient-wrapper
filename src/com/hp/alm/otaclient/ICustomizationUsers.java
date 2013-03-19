package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationUser objects.
 */
@IID("{DCFC6A77-C0F7-4F36-82E2-5164749254AF}")
public interface ICustomizationUsers extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationUser object representing the specified user.
     * </p>
     * <p>
     * Getter method for the COM property "User"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject user(
            java.lang.String name);
    
    /**
     * <p>
     * Adds an existing site user to the current project.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addUser(
            java.lang.String name);
    
    /**
     * <p>
     * The list of customization users.
     * </p>
     * <p>
     * Getter method for the COM property "Users"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList users();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object users(
            int index);
    
    /**
     * <p>
     * Removes a user from the collection.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void removeUser(
            java.lang.String name);
    
    /**
     * <p>
     * For HP use. An internal structure that contains all of the domain users' details.
     * </p>
     * <p>
     * Getter method for the COM property "DomainUsers"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String domainUsers();
    
    /**
     * <p>
     * Creates a new site user.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param fullName Mandatory java.lang.String parameter.
     * @param email Mandatory java.lang.String parameter.
     * @param description Mandatory java.lang.String parameter.
     * @param phone Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    void addSiteUser(
            java.lang.String userName,
            java.lang.String fullName,
            java.lang.String email,
            java.lang.String description,
            java.lang.String phone,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    /**
     * <p>
     * For HP use. Gets all the users that are in the domain and are not in the project.
     * </p>
     * <p>
     * Getter method for the COM property "DomainUsersWithoutProjectUsers"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String domainUsersWithoutProjectUsers();
    
    /**
     * <p>
     * Adds site user with credentials for LDAP authentication.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param fullName Mandatory java.lang.String parameter.
     * @param email Mandatory java.lang.String parameter.
     * @param description Mandatory java.lang.String parameter.
     * @param phone Mandatory java.lang.String parameter.
     * @param domainAuthentication Mandatory java.lang.String parameter.
     * @param group Mandatory java.lang.Object parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    void addSiteAuthenticatedUser(
            java.lang.String userName,
            java.lang.String fullName,
            java.lang.String email,
            java.lang.String description,
            java.lang.String phone,
            java.lang.String domainAuthentication,
            @MarshalAs(NativeType.VARIANT) java.lang.Object group);
    
    // Properties:
}
