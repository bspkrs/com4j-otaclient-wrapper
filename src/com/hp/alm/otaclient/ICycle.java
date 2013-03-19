package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Cycle.
 */
@IID("{328B58D8-2591-4E09-AAFB-C3C1321B18FA}")
public interface ICycle extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The cycle's name.
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
     * The cycle's name.
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
     * The cycle's start date.
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
     * The cycle's start date.
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
     * The cycle's end date.
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
     * The cycle's end date.
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
     * The cycle's status.
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
     * The cycle's status.
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
     * The cycle's parent release.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * Returns the number of days until the scheduled end of the cycle.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    int daysLeft();
    
    /**
     * <p>
     * Returns the cycle information.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseManagementInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseManagementInfo();
    
    // Properties:
}
