package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. A Treshold Value.
 */
@IID("{C19EC7A7-F640-4277-B83D-71AFAB1807EF}")
public interface IThresholdValue extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * Get the treshold value parent ID.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    int parentId();
    
    /**
     * <p>
     * Get the treshold value due date.
     * </p>
     * <p>
     * Getter method for the COM property "DueDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    java.util.Date dueDate();
    
    /**
     * <p>
     * Get the treshold value due date.
     * </p>
     * <p>
     * Setter method for the COM property "DueDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    void dueDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * Get the treshold target value.
     * </p>
     * <p>
     * Getter method for the COM property "TargetValue"
     * </p>
     * 
     * @return Returns a value of type double
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    double targetValue();
    
    /**
     * <p>
     * Get the treshold target value.
     * </p>
     * <p>
     * Setter method for the COM property "TargetValue"
     * </p>
     * 
     * @param pVal Mandatory double parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    void targetValue(
            double pVal);
    
    /**
     * <p>
     * Get the treshold value tolerance.
     * </p>
     * <p>
     * Getter method for the COM property "Tolerance"
     * </p>
     * 
     * @return Returns a value of type double
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(25)
    double tolerance();
    
    /**
     * <p>
     * Get the treshold value tolerance.
     * </p>
     * <p>
     * Setter method for the COM property "Tolerance"
     * </p>
     * 
     * @param pVal Mandatory double parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    void tolerance(
            double pVal);
    
    // Properties:
}
