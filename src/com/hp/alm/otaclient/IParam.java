package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing parameters for a Command object.
 */
@IID("{AE1410CC-D940-4356-A926-6DF6C1F45AED}")
public interface IParam extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Number of parameters in current command.
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
     * @param key Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object paramValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object key);
    
    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * Setter method for the COM property "ParamValue"
     * </p>
     * 
     * @param key Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void paramValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object key,
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The parameter name by parameter index. The index is 0-based.
     * </p>
     * <p>
     * Getter method for the COM property "ParamName"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String paramName(
            int index);
    
    /**
     * <p>
     * The parameter index by parameter name.
     * </p>
     * <p>
     * Getter method for the COM property "ParamIndex"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    int paramIndex(
            java.lang.String name);
    
    /**
     * <p>
     * Adds new parameter to Command object.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param initialValue Mandatory java.lang.Object parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void addParam(
            java.lang.String name,
            @MarshalAs(NativeType.VARIANT) java.lang.Object initialValue);
    
    /**
     * <p>
     * Deletes the specified parameter from Command object.
     * </p>
     * 
     * @param key Mandatory java.lang.Object parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    void deleteParam(
            @MarshalAs(NativeType.VARIANT) java.lang.Object key);
    
    /**
     * <p>
     * Deletes all parameters from Command object.
     * </p>
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    void deleteParams();
    
    /**
     * <p>
     * The data type of the specified parameter. The index is 0-based.
     * </p>
     * <p>
     * Getter method for the COM property "ParamType"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    int paramType(
            int index);
    
    // Properties:
}
