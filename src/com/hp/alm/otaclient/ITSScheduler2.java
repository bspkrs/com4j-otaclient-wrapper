package com.hp.alm.otaclient;

import com4j.*;

/**
 * Responsible for executing selected automated tests.
 */
@IID("{39B5BBE5-9E03-40F3-82DF-881A0867CDF8}")
public interface ITSScheduler2 extends com.hp.alm.otaclient.ITSScheduler
{
    // Methods:
    /**
     * <p>
     * Indicates whether change detection mode is enabled.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeDetectEnabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(23)
    boolean changeDetectEnabled();
    
    /**
     * <p>
     * Indicates whether change detection mode is enabled.
     * </p>
     * <p>
     * Setter method for the COM property "ChangeDetectEnabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(24)
    void changeDetectEnabled(
            boolean pVal);
    
    /**
     * <p>
     * Indicates whether to skip components that are not change detectable.
     * </p>
     * <p>
     * Getter method for the COM property "SkipNonChangeDetectableComponentsEnabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(25)
    boolean skipNonChangeDetectableComponentsEnabled();
    
    /**
     * <p>
     * Indicates whether to skip components that are not change detectable.
     * </p>
     * <p>
     * Setter method for the COM property "SkipNonChangeDetectableComponentsEnabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(26)
    void skipNonChangeDetectableComponentsEnabled(
            boolean pVal);
    
    // Properties:
}
