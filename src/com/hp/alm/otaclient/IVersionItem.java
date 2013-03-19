package com.hp.alm.otaclient;

import com4j.*;

/**
 * Information on a specific version.
 */
@IID("{38D402FA-9823-4D25-979E-62C377AC2E77}")
public interface IVersionItem extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The check-in comment.
     * </p>
     * <p>
     * Getter method for the COM property "Comments"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String comments();
    
    /**
     * <p>
     * The version checked in.
     * </p>
     * <p>
     * Getter method for the COM property "Version"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String version();
    
    /**
     * <p>
     * Obsolete. Always returns false.
     * </p>
     * <p>
     * Getter method for the COM property "IsLocked"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean isLocked();
    
    /**
     * <p>
     * The check-in date using the server's date.
     * </p>
     * <p>
     * Getter method for the COM property "Date"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String date();
    
    /**
     * <p>
     * The user name of the user who performed the check-in.
     * </p>
     * <p>
     * Getter method for the COM property "User"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String user();
    
    /**
     * <p>
     * The check-in time using the server's time.
     * </p>
     * <p>
     * Getter method for the COM property "Time"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String time();
    
    // Properties:
}
