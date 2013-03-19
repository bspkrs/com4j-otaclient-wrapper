package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IBaselineItem Interface.
 */
@IID("{3401C02A-79DD-4366-81F7-853F490137E7}")
public interface IBaselineItem extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The IBaseline object this item belongs to.
     * </p>
     * <p>
     * Getter method for the COM property "Baseline"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IBaseline
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IBaseline baseline();
    
    /**
     * <p>
     * The entity as it appeared in the baseline.
     * </p>
     * <p>
     * Getter method for the COM property "Entity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entity();
    
    // Properties:
}
