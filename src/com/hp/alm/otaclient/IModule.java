package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Quality Center module, such as Requirements, Defects, TestPlan, and so on.
 */
@IID("{56799AB1-FA33-4ED4-BD4F-3CAB0E207EEB}")
public interface IModule extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The module ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * The module name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * The module name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The module description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String description();
    
    /**
     * <p>
     * The module description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The module GUID.
     * </p>
     * <p>
     * Getter method for the COM property "GUID"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String guid();
    
    /**
     * <p>
     * The module GUID.
     * </p>
     * <p>
     * Setter method for the COM property "GUID"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void guid(
            java.lang.String pVal);
    
    /**
     * <p>
     * A bit-mask string that indicates for which groups the module is visible in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "Visible"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String visible();
    
    /**
     * <p>
     * A bit-mask string that indicates for which groups the module is visible in the user interface.
     * </p>
     * <p>
     * Setter method for the COM property "Visible"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    void visible(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if the object has been modified since being downloaded from database.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the object has been modified since being downloaded from database.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(17)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * Updates visibility for the specified user group.
     * </p>
     * <p>
     * Setter method for the COM property "VisibleForGroup"
     * </p>
     * 
     * @param groupId Mandatory int parameter.
     * @param rhs Mandatory boolean parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(18)
    void visibleForGroup(
            int groupId,
            boolean rhs);
    
    /**
     * <p>
     * Updates visibility with numeric value for the specified user group.
     * </p>
     * <p>
     * Setter method for the COM property "NumericVisible"
     * </p>
     * 
     * @param rhs Mandatory int parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(19)
    void numericVisible(
            int rhs);
    
    /**
     * <p>
     * The module position in the framework sidebar.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(20)
    int order();
    
    /**
     * <p>
     * The module position in the framework sidebar.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(21)
    void order(
            int pVal);
    
    // Properties:
}
