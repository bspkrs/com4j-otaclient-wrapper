package com.hp.alm.otaclient;

import com4j.*;

/**
 * The Customization Workflow Object.
 */
@IID("{29FB4DA4-BD3B-47C3-AD0D-09EC7DF0D278}")
public interface ICustomizationWorkflow extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Indicates whether the Project Workflow Scripts were modified since last synchronization.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectScriptsUpdated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean projectScriptsUpdated();
    
    /**
     * <p>
     * Indicates whether the Project Workflow Scripts were modified since last synchronization.
     * </p>
     * <p>
     * Setter method for the COM property "ProjectScriptsUpdated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void projectScriptsUpdated(
            boolean pVal);
    
    /**
     * <p>
     * Indicates whether the Template Workflow Scripts were modified since last synchronization.
     * </p>
     * <p>
     * Getter method for the COM property "TemplateScriptsUpdated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    boolean templateScriptsUpdated();
    
    /**
     * <p>
     * Indicates whether the Template Workflow Scripts were modified since last synchronization.
     * </p>
     * <p>
     * Setter method for the COM property "TemplateScriptsUpdated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void templateScriptsUpdated(
            boolean pVal);
    
    // Properties:
}
