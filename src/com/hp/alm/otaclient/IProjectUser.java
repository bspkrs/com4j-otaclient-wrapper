package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a project user.
 */
@IID("{AA21670C-D2C5-44D4-91A1-F00EDC953D8D}")
public interface IProjectUser extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The user's ID number.
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
     * The user's login name.
     * </p>
     * <p>
     * Getter method for the COM property "UserName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String userName();
    
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
    @VTID(9)
    java.lang.String fullName();
    
    /**
     * <p>
     * The user's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String description();
    
    /**
     * <p>
     * The user's Email address.
     * </p>
     * <p>
     * Getter method for the COM property "Email"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String email();
    
    /**
     * <p>
     * Checks whether this user is a project administrator.
     * </p>
     * <p>
     * Getter method for the COM property "IsAdmin"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    boolean isAdmin();
    
    // Properties:
}
