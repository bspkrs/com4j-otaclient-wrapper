package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The Customization Workflow Object
 */
@IID("{2D799F8D-6105-44C6-AC7D-E1470E49954A}")
public interface ICustomizationWorkflow_Touch extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Indicates whether the Project Workflows were edited during the current session.
     * </p>
     * <p>
     * Getter method for the COM property "IsTouched"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(3)
    boolean isTouched();
    
    // Properties:
}
