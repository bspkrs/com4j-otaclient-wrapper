package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Version Control System connection.
 */
@IID("{5D2F9000-FB53-42D0-AFEF-A98AA3355B3B}")
public interface IVersionControl extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Saves the changes to the current object.
     * </p>
     * 
     * @param comment Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void checkIn(
            java.lang.String comment);
    
    /**
     * <p>
     * Checks out the object, enabling editing.
     * </p>
     * 
     * @param comment Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void checkOut(
            java.lang.String comment);
    
    /**
     * <p>
     * Removes the checked out version of the object.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void undoCheckout();
    
    /**
     * <p>
     * Returns a list of references to the IVersionedEntity objects of this entity.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList versions();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object versions(
            int index);
    
    /**
     * <p>
     * Overrides the last version and performs check in without promoting the version number.
     * </p>
     * 
     * @param comment Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void checkInAndOverrideLastVersion(
            java.lang.String comment);
    
    /**
     * <p>
     * Returns the XML that details for each version in which baselines it participates.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String versionsRelationsToBaselines();
    
    // Properties:
}
