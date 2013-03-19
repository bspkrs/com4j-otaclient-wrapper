package com.hp.alm.otaclient;

import com4j.*;

/**
 * Deprecated. Use ParameterValue and ParameterValueFactory. A collection of test parameters.
 */
@IID("{B4776982-5666-4075-99A3-0574EDA12EF2}")
public interface IStepParams extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The number of parameters for the object.
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
     * The value of the specified parameter.
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
     * The value of the specified parameter.
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
     * Clears the parameter value by setting it to null.
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
     * For HP use. Gets Parameter Type - such as defined by user.
     * </p>
     * <p>
     * Getter method for the COM property "ParamType"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String paramType(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * For HP use. Gets Parameter Type - such as defined by user.
     * </p>
     * <p>
     * Setter method for the COM property "ParamType"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void paramType(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam,
            java.lang.String pVal);
    
    /**
     * <p>
     * Checks if a parameter of this name exists.
     * </p>
     * <p>
     * Getter method for the COM property "ParamExist"
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    boolean paramExist(
            java.lang.String paramName);
    
    /**
     * <p>
     * For HP use. Gets a more basic value of the parameter - some default.
     * </p>
     * <p>
     * Getter method for the COM property "BaseValue"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @param hasBaseValue Mandatory Holder<Boolean> parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String baseValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam,
            Holder<Boolean> hasBaseValue);
    
    /**
     * <p>
     * The name of the parameter in the specified position in the StepParams collection (zero-based).
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
    @VTID(15)
    java.lang.String paramName(
            int nPosition);
    
    /**
     * <p>
     * Gets the parameter type: predefined, null, or regular.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @param vParam Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    int type(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vParam);
    
    /**
     * <p>
     * Uploads the parameter definitions to the database.
     * </p>
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void save();
    
    /**
     * <p>
     * Refreshes the data from the database, discarding changes.
     * </p>
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void refresh();
    
    /**
     * <p>
     * Adds a new parameter to the object.
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     * @param paramType Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    void addParam(
            java.lang.String paramName,
            java.lang.String paramType);
    
    /**
     * <p>
     * Deletes the specified parameter.
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    void deleteParam(
            java.lang.String paramName);
    
    // Properties:
}
