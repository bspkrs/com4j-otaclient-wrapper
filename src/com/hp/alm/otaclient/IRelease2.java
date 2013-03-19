package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Release.
 */
@IID("{D5D0C310-8B8D-489F-947A-0F14FA1112AD}")
public interface IRelease2 extends com.hp.alm.otaclient.IRelease
{
    // Methods:
    /**
     * <p>
     * The MilestoneFactory object for milestones of this release.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(36)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject milestoneFactory();
    
    /**
     * <p>
     * The ScopeItemFactory object for ScopeItems of this release.
     * </p>
     * <p>
     * Getter method for the COM property "ScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject scopeItemFactory();
    
    /**
     * <p>
     * Checks whether the release has at least one scope item.
     * </p>
     * <p>
     * Getter method for the COM property "HasScopeItems"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(38)
    boolean hasScopeItems();
    
    /**
     * <p>
     * Checks whether the release has at least one milestone.
     * </p>
     * <p>
     * Getter method for the COM property "HasMilestones"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(39)
    boolean hasMilestones();
    
    /**
     * <p>
     * Reschedule start and end dates of the release.
     * </p>
     * 
     * @param newStartDate Mandatory java.util.Date parameter.
     * @param newEndDate Mandatory java.util.Date parameter.
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(40)
    void rescheduleTimePeriod(
            java.util.Date newStartDate,
            java.util.Date newEndDate);
    
    // Properties:
}
