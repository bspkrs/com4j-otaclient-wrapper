package com.hp.alm.otaclient;

import com4j.*;

/**
 * Global project parameters and settings.
 */
@IID("{59A79946-0678-4E59-B4B0-9967E4314CCA}")
public interface IProjectProperties extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The number of parameters in the project.
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
     * The value of the parameter.
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
     * Gets the parameter name.
     * </p>
     * <p>
     * Getter method for the COM property "ParamName"
     * </p>
     * 
     * @param paramIndex Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String paramName(
            int paramIndex);
    
    /**
     * <p>
     * Checks if a parameter of this name exists.
     * </p>
     * <p>
     * Getter method for the COM property "IsParam"
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    boolean isParam(
            java.lang.String paramName);
    
    // Properties:
}
