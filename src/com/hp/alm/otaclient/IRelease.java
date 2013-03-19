package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Release.
 */
@IID("{B08CEC57-0E62-49BB-9791-0D764F613B2E}")
public interface IRelease extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The release's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The release's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The release's start date.
     * </p>
     * <p>
     * Getter method for the COM property "StartDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.util.Date startDate();
    
    /**
     * <p>
     * The release's start date.
     * </p>
     * <p>
     * Setter method for the COM property "StartDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void startDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * The release's end date.
     * </p>
     * <p>
     * Getter method for the COM property "EndDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.util.Date endDate();
    
    /**
     * <p>
     * The release's end date.
     * </p>
     * <p>
     * Setter method for the COM property "EndDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void endDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * The release's status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String status();
    
    /**
     * <p>
     * The release's status.
     * </p>
     * <p>
     * Setter method for the COM property "Status"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    void status(
            java.lang.String pVal);
    
    /**
     * <p>
     * The CycleFactory object for cycles of this release.
     * </p>
     * <p>
     * Getter method for the COM property "CycleFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject cycleFactory();
    
    /**
     * <p>
     * The release's parent release folder.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * Returns the number of days until the scheduled release date.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    int daysLeft();
    
    /**
     * <p>
     * The release information.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseManagementInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseManagementInfo();
    
    // Properties:
}
