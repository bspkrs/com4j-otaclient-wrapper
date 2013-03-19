package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Milestone to Scope Item Link.
 */
@IID("{04E7CFC6-CD32-4139-B027-26243C6E6E05}")
public interface IMilestoneScopeItem extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Milestone's ID.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    int milestoneID();
    
    /**
     * <p>
     * Milestone's ID.
     * </p>
     * <p>
     * Setter method for the COM property "MilestoneID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void milestoneID(
            int pVal);
    
    /**
     * <p>
     * Milestone's ID.
     * </p>
     * <p>
     * Getter method for the COM property "ScopeItemID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    int scopeItemID();
    
    /**
     * <p>
     * Milestone's ID.
     * </p>
     * <p>
     * Setter method for the COM property "ScopeItemID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void scopeItemID(
            int pVal);
    
    /**
     * <p>
     * The milestoneScopeItem's KPIMilestoneScopeItem Factory.
     * </p>
     * <p>
     * Getter method for the COM property "KPIMilestoneScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiMilestoneScopeItemFactory();
    
    // Properties:
}
