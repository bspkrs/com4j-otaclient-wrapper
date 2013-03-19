package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing business components.
 */
@IID("{A4CEDAE3-5E32-43FC-9D39-FDA737799A1E}")
public interface IComponentFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Checks if the specified name is a valid name for a business component.
     * </p>
     * 
     * @param bsName Mandatory java.lang.String parameter.
     * @param pbsErrorString Mandatory Holder<java.lang.String> parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(17)
    boolean isComponentNameValid(
            java.lang.String bsName,
            Holder<java.lang.String> pbsErrorString);
    
    // Properties:
}
