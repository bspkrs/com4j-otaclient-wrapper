package com.hp.alm.otaclient;

import com4j.*;

/**
 * Field property Interface. Exposes cross-subtype property
 */
@IID("{67463C0D-9E4A-4A92-AE70-D81D0A516529}")
public interface IFieldProperty6 extends com.hp.alm.otaclient.IFieldProperty5
{
    // Methods:
    /**
     * <p>
     * Indicates if this is a cross subtype column.
     * </p>
     * <p>
     * Getter method for the COM property "IsCrossSubtype"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(43)
    boolean isCrossSubtype();
    
    /**
     * <p>
     * Indicates if this field supports history.
     * </p>
     * <p>
     * Getter method for the COM property "IsSupportsHistory"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(44)
    boolean isSupportsHistory();
    
    /**
     * <p>
     * Indicates if this field supports required.
     * </p>
     * <p>
     * Getter method for the COM property "IsSupportsRequired"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(45)
    boolean isSupportsRequired();
    
    // Properties:
}
