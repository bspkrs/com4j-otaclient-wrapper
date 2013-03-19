package com.hp.alm.otaclient;

import com4j.*;

/**
 * The version data of an entity.
 */
@IID("{AC9FDB6A-A502-4A08-8976-7D90AEC9668B}")
public interface IVersionData extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The version number.
     * </p>
     * <p>
     * Getter method for the COM property "VersionNumber"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int versionNumber();
    
    /**
     * <p>
     * The check-in date according to the server clock.
     * </p>
     * <p>
     * Getter method for the COM property "CheckInDate"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object checkInDate();
    
    /**
     * <p>
     * The check-out date according to the server clock.
     * </p>
     * <p>
     * Getter method for the COM property "CheckOutDate"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object checkOutDate();
    
    /**
     * <p>
     * The check-in comment.
     * </p>
     * <p>
     * Getter method for the COM property "CheckInComment"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String checkInComment();
    
    /**
     * <p>
     * The check-out comment.
     * </p>
     * <p>
     * Getter method for the COM property "CheckOutComment"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String checkOutComment();
    
    /**
     * <p>
     * The user name of the user who performed the check-in.
     * </p>
     * <p>
     * Getter method for the COM property "CheckedInBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String checkedInBy();
    
    /**
     * <p>
     * The user name of the user who performed the check-out.
     * </p>
     * <p>
     * Getter method for the COM property "CheckedOutBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String checkedOutBy();
    
    /**
     * <p>
     * Checks whether this version is checked out for editing.
     * </p>
     * <p>
     * Getter method for the COM property "IsCheckedOut"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    boolean isCheckedOut();
    
    /**
     * <p>
     * Checks whether this is the latest checked-in version.
     * </p>
     * <p>
     * Getter method for the COM property "IsCurrent"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    boolean isCurrent();
    
    // Properties:
}
