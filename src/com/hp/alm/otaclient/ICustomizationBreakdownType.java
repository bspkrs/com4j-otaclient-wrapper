package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The QPM KPI Type.
 */
@IID("{336BF924-F26A-4B5E-B79B-4E3E666AE20A}")
public interface ICustomizationBreakdownType extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Breakdown Type ID.
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
     * Breakdown Type ID.
     * </p>
     * <p>
     * Setter method for the COM property "ID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void id(
            int pVal);
    
    /**
     * <p>
     * Breakdown Type ID.
     * </p>
     * <p>
     * Getter method for the COM property "KPIType"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiType();
    
    /**
     * <p>
     * Breakdown Type name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String name();
    
    /**
     * <p>
     * Breakdown Type name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * Breakdown Type filter.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String filter();
    
    /**
     * <p>
     * Breakdown Type filter.
     * </p>
     * <p>
     * Setter method for the COM property "Filter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void filter(
            java.lang.String pVal);
    
    /**
     * <p>
     * Breakdown Type group by column name.
     * </p>
     * <p>
     * Getter method for the COM property "GroupByColumnName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String groupByColumnName();
    
    /**
     * <p>
     * Breakdown Type group by column name.
     * </p>
     * <p>
     * Setter method for the COM property "GroupByColumnName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    void groupByColumnName(
            java.lang.String pVal);
    
    /**
     * <p>
     * Breakdown Type function name.
     * </p>
     * <p>
     * Getter method for the COM property "FunctionName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String functionName();
    
    /**
     * <p>
     * Breakdown Type function name.
     * </p>
     * <p>
     * Setter method for the COM property "FunctionName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(17)
    void functionName(
            java.lang.String pVal);
    
    /**
     * <p>
     * Breakdown Type function field.
     * </p>
     * <p>
     * Getter method for the COM property "FunctionField"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String functionField();
    
    /**
     * <p>
     * Breakdown Type function field.
     * </p>
     * <p>
     * Setter method for the COM property "FunctionField"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(19)
    void functionField(
            java.lang.String pVal);
    
    /**
     * <p>
     * Breakdown Type default graph layout.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultGraphLayout"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String defaultGraphLayout();
    
    /**
     * <p>
     * Breakdown Type default graph layout.
     * </p>
     * <p>
     * Setter method for the COM property "DefaultGraphLayout"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(21)
    void defaultGraphLayout(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if the Breakdown Type has been created but not posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "Enabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(22)
    boolean enabled();
    
    /**
     * <p>
     * Indicates if the Breakdown Type has been created but not posted to the server.
     * </p>
     * <p>
     * Setter method for the COM property "Enabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(23)
    void enabled(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the Breakdown Type object has changed locally since last synchronized with the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(24)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the Breakdown Type has been removed, but the deletion has not been posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(25)
    boolean deleted();
    
    /**
     * <p>
     * Indicates if the Breakdown Type has been created but not posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "New"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(26)
    boolean _new();
    
    // Properties:
}
