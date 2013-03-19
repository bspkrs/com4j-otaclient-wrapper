package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the customization modules.
 */
@IID("{2EEC167C-FBBF-4A2F-8DE6-DE8A05EDDB50}")
public interface ICustomizationModules extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The Module name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name(
            int moduleID);
    
    /**
     * <p>
     * The Module name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void name(
            int moduleID,
            java.lang.String pVal);
    
    /**
     * <p>
     * The Module's globally unique ID.
     * </p>
     * <p>
     * Getter method for the COM property "GUID"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String guid(
            int moduleID);
    
    /**
     * <p>
     * The Module's globally unique ID.
     * </p>
     * <p>
     * Setter method for the COM property "GUID"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void guid(
            int moduleID,
            java.lang.String pVal);
    
    /**
     * <p>
     * The Module description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String description(
            int moduleID);
    
    /**
     * <p>
     * The Module description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void description(
            int moduleID,
            java.lang.String pVal);
    
    /**
     * <p>
     * A bit-mask that indicates for which groups the module is visible in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "Visible"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    int visible(
            int moduleID);
    
    /**
     * <p>
     * A bit-mask that indicates for which groups the module is visible in the user interface.
     * </p>
     * <p>
     * Setter method for the COM property "Visible"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(14)
    void visible(
            int moduleID,
            int pVal);
    
    // Properties:
}
