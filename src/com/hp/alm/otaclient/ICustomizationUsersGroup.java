package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a user group for purposes of adding and removing users.
 */
@IID("{7E12617E-3B01-42BD-A16F-13118038D0B7}")
public interface ICustomizationUsersGroup extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The user group ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * The user group name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * The user group name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * Deprecated. Use IsSystem, which uses better error handling.
     * </p>
     * <p>
     * Getter method for the COM property "Is_System"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    boolean is_System();
    
    /**
     * <p>
     * Adds a new user to the user group.
     * </p>
     * 
     * @param user Mandatory java.lang.Object parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    void addUser(
            @MarshalAs(NativeType.VARIANT) java.lang.Object user);
    
    /**
     * <p>
     * Removes a user from the user group.
     * </p>
     * 
     * @param user Mandatory java.lang.Object parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void removeUser(
            @MarshalAs(NativeType.VARIANT) java.lang.Object user);
    
    /**
     * <p>
     * A list of all members of the user group.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    com.hp.alm.otaclient.IList usersList();
    
    @VTID(13)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object usersList(
            int index);
    
    /**
     * <p>
     * Indicates if the object has been modified since being downloaded from database.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the object has been modified since being downloaded from database.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * If true, the object is marked for deletion, but the deletion has not been committed.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    boolean deleted();
    
    /**
     * <p>
     * If true, the object is marked for deletion, but the deletion has not been committed.
     * </p>
     * <p>
     * Setter method for the COM property "Deleted"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    void deleted(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the user group is a built-in system user group.
     * </p>
     * <p>
     * Getter method for the COM property "IsSystem"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    boolean isSystem();
    
    /**
     * <p>
     * The data hiding filter for the entity specified by the FilterType parameter.
     * </p>
     * <p>
     * Getter method for the COM property "HideFilter"
     * </p>
     * 
     * @param filterType Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String hideFilter(
            java.lang.String filterType);
    
    /**
     * <p>
     * The data hiding filter for the entity specified by the FilterType parameter.
     * </p>
     * <p>
     * Setter method for the COM property "HideFilter"
     * </p>
     * 
     * @param filterType Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(20)
    void hideFilter(
            java.lang.String filterType,
            java.lang.String pVal);
    
    // Properties:
}
