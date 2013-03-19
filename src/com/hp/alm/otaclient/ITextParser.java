package com.hp.alm.otaclient;

import com4j.*;

/**
 * Utilities for handling parameters in a string.
 */
@IID("{328737D2-7777-4E5E-BB9A-488277C730C5}")
public interface ITextParser extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the number of parameters.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int count();
    
    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * Getter method for the COM property "ParamValue"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String paramValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * Setter method for the COM property "ParamValue"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void paramValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam,
            java.lang.String pVal);
    
    /**
     * <p>
     * Clear the parameter - Set its value to null.
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void clearParam(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * Gets the Parameter Type - predefined, null, or regular.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    int type(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * Gets the user-defined Parameter Type.
     * </p>
     * <p>
     * Getter method for the COM property "ParamType"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String paramType(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * Checks if a parameter with the specified name exists.
     * </p>
     * <p>
     * Getter method for the COM property "ParamExist"
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    boolean paramExist(
            java.lang.String paramName);
    
    /**
     * <p>
     * Gets the parameter name.
     * </p>
     * <p>
     * Getter method for the COM property "ParamName"
     * </p>
     * 
     * @param nPosition Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String paramName(
            int nPosition);
    
    /**
     * <p>
     * Initializes the parser.
     * </p>
     * 
     * @param startClose Optional parameter. Default value is "<%"
     * @param endClose Optional parameter. Default value is "%>"
     * @param typeClose Optional parameter. Default value is "?"
     * @param maxLen Optional parameter. Default value is -1
     * @param defaultType Optional parameter. Default value is "string"
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    void initialize(
            @Optional @DefaultValue("<%") java.lang.String startClose,
            @Optional @DefaultValue("%>") java.lang.String endClose,
            @Optional @DefaultValue("?") java.lang.String typeClose,
            @Optional @DefaultValue("-1") int maxLen,
            @Optional @DefaultValue("string") java.lang.String defaultType);
    
    /**
     * <p>
     * The text to be parsed.
     * </p>
     * <p>
     * Setter method for the COM property "Text"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(16)
    void text(
            java.lang.String pVal);
    
    /**
     * <p>
     * The text to be parsed.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    java.lang.String text();
    
    /**
     * <p>
     * Converts the parameters to their values.
     * </p>
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void evaluateText();
    
    // Properties:
}
