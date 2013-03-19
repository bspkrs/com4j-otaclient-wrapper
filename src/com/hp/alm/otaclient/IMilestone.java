package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Milestone.
 */
@IID("{1550D2DC-815A-4B2A-A6BD-5329776A7955}")
public interface IMilestone extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The milestone's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * The milestone's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The milestone's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String description();
    
    /**
     * <p>
     * The milestone's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The milestone's due date.
     * </p>
     * <p>
     * Getter method for the COM property "DueDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    java.util.Date dueDate();
    
    /**
     * <p>
     * The milestone's due date.
     * </p>
     * <p>
     * Setter method for the COM property "DueDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    void dueDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * The milestone's start date.
     * </p>
     * <p>
     * Getter method for the COM property "StartDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    java.util.Date startDate();
    
    /**
     * <p>
     * The milestone's start date.
     * </p>
     * <p>
     * Setter method for the COM property "StartDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(30)
    void startDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * The milestone's parent release.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * The milestone's KPI Factory.
     * </p>
     * <p>
     * Getter method for the COM property "KPIFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiFactory();
    
    /**
     * <p>
     * The milestone's MilestoneScopeItem Factory.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject milestoneScopeItemFactory();
    
    /**
     * <p>
     * Checks whether the Milestone has at least one MilestoneScopeItem.
     * </p>
     * <p>
     * Getter method for the COM property "HasMilestoneScopeItems"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    boolean hasMilestoneScopeItems();
    
    /**
     * <p>
     * Checks whether the Milestone has at least one KPI.
     * </p>
     * <p>
     * Getter method for the COM property "HasKPIs"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(35)
    boolean hasKPIs();
    
    /**
     * <p>
     * Reschedule start and end dates of the milestone.
     * </p>
     * 
     * @param newStartDate Mandatory java.util.Date parameter.
     * @param newEndDate Mandatory java.util.Date parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(36)
    void rescheduleTimePeriod(
            java.util.Date newStartDate,
            java.util.Date newEndDate);
    
    // Properties:
}
