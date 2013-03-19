package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{F43CD028-5FE2-4E17-BA63-4301BC39DF58}")
public interface ICustomizationField4 extends com.hp.alm.otaclient.ICustomizationField3
{
    // Methods:
    /**
     * <p>
     * Returns true if this field is a cross subtype field.
     * </p>
     * <p>
     * Getter method for the COM property "IsCrossSubtype"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(51)
    //= 0x33. The runtime will prefer the VTID if present
    @VTID(97)
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
    
    @DISPID(52)
    //= 0x34. The runtime will prefer the VTID if present
    @VTID(98)
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
    
    @DISPID(53)
    //= 0x35. The runtime will prefer the VTID if present
    @VTID(99)
    boolean isSupportsRequired();
    
    /**
     * <p>
     * Returns the table referenced by this column.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(54)
    //= 0x36. The runtime will prefer the VTID if present
    @VTID(100)
    java.lang.String getReferenceTable();
    
    // Properties:
}
