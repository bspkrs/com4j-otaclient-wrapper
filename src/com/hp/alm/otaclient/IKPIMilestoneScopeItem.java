package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Milestone-Scope Item (link) to KPI Link.
 */
@IID("{5B8D7899-06FB-4AE5-B702-6C25CE41F230}")
public interface IKPIMilestoneScopeItem extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * MilestoneScopeItem's ID.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneScopeItemID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    int milestoneScopeItemID();
    
    /**
     * <p>
     * MilestoneScopeItem's ID.
     * </p>
     * <p>
     * Setter method for the COM property "MilestoneScopeItemID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void milestoneScopeItemID(
            int pVal);
    
    /**
     * <p>
     * KPI ID.
     * </p>
     * <p>
     * Getter method for the COM property "KPIID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    int kpiid();
    
    /**
     * <p>
     * KPI ID.
     * </p>
     * <p>
     * Setter method for the COM property "KPIID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void kpiid(
            int pVal);
    
    /**
     * <p>
     * Indicates whether this KPI is active for the Scope Item in the Milestone.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    boolean isActive();
    
    /**
     * <p>
     * Indicates whether this KPI is active for the Scope Item in the Milestone.
     * </p>
     * <p>
     * Setter method for the COM property "IsActive"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    void isActive(
            boolean pVal);
    
    /**
     * <p>
     * Indicates whether there is an override to the threshold.
     * </p>
     * <p>
     * Getter method for the COM property "IsThresholdCustom"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    boolean isThresholdCustom();
    
    /**
     * <p>
     * Indicates whether there is an override to the threshold.
     * </p>
     * <p>
     * Setter method for the COM property "IsThresholdCustom"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(30)
    void isThresholdCustom(
            boolean pVal);
    
    /**
     * <p>
     * The Threshold Value Factory.
     * </p>
     * <p>
     * Getter method for the COM property "ThresholdValueFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject thresholdValueFactory();
    
    /**
     * <p>
     * Copies the threshold values from the KPI.
     * </p>
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    void copyThresholdValues();
    
    /**
     * <p>
     * Restores the threshold values to the default
     * </p>
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    void restoreDefaultThresholdValues();
    
    // Properties:
}
