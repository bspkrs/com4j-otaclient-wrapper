package com.hp.alm.otaclient;

import com4j.*;

/**
 * A Version Control System connection for Test objects.
 */
@IID("{6C66F3F1-52E8-4B39-840B-FB1C9800C676}")
public interface IVCS extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The version the current user is viewing.
     * </p>
     * <p>
     * Getter method for the COM property "Version"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String version();
    
    /**
     * <p>
     * Checks if the object is in CHECKED-OUT or GET status.
     * </p>
     * <p>
     * Getter method for the COM property "IsCheckedOut"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean isCheckedOut();
    
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
     * For HP use. Adds an object to the Version control database.
     * </p>
     * 
     * @param ignored Optional parameter. Default value is "1.1.1"
     * @param comments Optional parameter. Default value is "Object Created in VCS."
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void addObjectToVcs(
            @Optional @DefaultValue("1.1.1") java.lang.String ignored,
            @Optional @DefaultValue("Object Created in VCS.") java.lang.String comments);
    
    /**
     * <p>
     * For HP use. Generally unnecessary as Test deletion covers this functionality. Deletes the object from the Version Control database.
     * </p>
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void deleteObjectFromVCS();
    
    /**
     * <p>
     * Checks out an object.
     * </p>
     * 
     * @param version Mandatory java.lang.String parameter.
     * @param comment Mandatory java.lang.String parameter.
     * @param ignored Mandatory boolean parameter.
     * @param readOnly Optional parameter. Default value is false
     * @param ignored1 Optional parameter. Default value is false
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    void checkOut(
            java.lang.String version,
            java.lang.String comment,
            boolean ignored,
            @Optional @DefaultValue("0") boolean readOnly,
            @Optional @DefaultValue("-1") boolean ignored1);
    
    /**
     * <p>
     * Checks in an object.
     * </p>
     * 
     * @param ignored Mandatory java.lang.String parameter.
     * @param comments Mandatory java.lang.String parameter.
     * @param ignored1 Optional parameter. Default value is false
     * @param ignored2 Optional parameter. Default value is false
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    void checkIn(
            java.lang.String ignored,
            java.lang.String comments,
            @Optional @DefaultValue("-1") boolean ignored1,
            @Optional @DefaultValue("-1") boolean ignored2);
    
    /**
     * <p>
     * [DEPRECATED]For HP use. This method is potentially destructive. Use only if necessary and with care. Sets the VCS object current
     * version.
     * </p>
     * 
     * @param version Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    void setCurrentVersion(
            java.lang.String version);
    
    /**
     * <p>
     * For HP use. Changes VCS object status from GET to CHECK-OUT. The object must be in a GET status to use this method.
     * </p>
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    void lockVcsObject();
    
    /**
     * <p>
     * Undoes the check out operation, falling back to the current version on the server.
     * </p>
     * 
     * @param ignored Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(16)
    void undoCheckout(
            boolean ignored);
    
    /**
     * <p>
     * The current object latest version.
     * </p>
     * <p>
     * Getter method for the COM property "CurrentVersion"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(17)
    java.lang.String currentVersion();
    
    /**
     * <p>
     * A reference to a VersionItem object, containing the checkout information of the current object.
     * </p>
     * <p>
     * Getter method for the COM property "CheckoutInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject checkoutInfo();
    
    /**
     * <p>
     * For HP use. Returns a list of references to the VersionItem objects of this entity.
     * </p>
     * <p>
     * Getter method for the COM property "Versions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(19)
    com.hp.alm.otaclient.IList versions();
    
    @VTID(19)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object versions(
            int index);
    
    /**
     * <p>
     * The name of the locking user.
     * </p>
     * <p>
     * Getter method for the COM property "LockedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String lockedBy();
    
    /**
     * <p>
     * A reference to a VersionItem object containing information about a specific version, specified by the Version argument.
     * </p>
     * <p>
     * Getter method for the COM property "VersionInfo"
     * </p>
     * 
     * @param version Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject versionInfo(
            java.lang.String version);
    
    /**
     * <p>
     * For HP use. Method ViewVersion.
     * </p>
     * 
     * @param bstrVersion Mandatory java.lang.String parameter.
     * @param bstrViewPath Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    void viewVersion(
            java.lang.String bstrVersion,
            Holder<java.lang.String> bstrViewPath);
    
    /**
     * <p>
     * For future use.
     * </p>
     * 
     * @param bstrVersion Optional parameter. Default value is ""
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    void clearView(
            @Optional @DefaultValue("") java.lang.String bstrVersion);
    
    /**
     * <p>
     * A list of IVersionItem references for accessing the details of each version of the object.
     * </p>
     * <p>
     * Getter method for the COM property "VersionsEx"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    com.hp.alm.otaclient.IList versionsEx();
    
    @VTID(24)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object versionsEx(
            int index);
    
    /**
     * <p>
     * Refreshes the VCS object from the server to the client, overwriting values in memory.
     * </p>
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(25)
    void refresh();
    
    /**
     * <p>
     * Checks in an object.
     * </p>
     * 
     * @param ignored Mandatory java.lang.String parameter.
     * @param comments Mandatory java.lang.String parameter.
     * @param ignored1 Optional parameter. Default value is false
     * @param ignored2 Optional parameter. Default value is false
     * @param forceCheckin Optional parameter. Default value is false
     * @param ignored3 Optional parameter. Default value is 0
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(26)
    void checkInEx(
            java.lang.String ignored,
            java.lang.String comments,
            @Optional @DefaultValue("-1") boolean ignored1,
            @Optional @DefaultValue("-1") boolean ignored2,
            @Optional @DefaultValue("0") boolean forceCheckin,
            @Optional @DefaultValue("0") int ignored3);
    
    // Properties:
}
