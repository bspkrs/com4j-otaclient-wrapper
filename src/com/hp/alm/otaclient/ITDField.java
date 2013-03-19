package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a field with field system properties and other properties.
 */
@IID("{3D416474-2373-446E-9090-DBC083B6C382}")
public interface ITDField extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The database name of the current field.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    java.lang.String name();
    
    /**
     * <p>
     * The field database type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    int type();
    
    /**
     * <p>
     * The FieldProperty object associated with the current field.
     * </p>
     * <p>
     * Getter method for the COM property "Property"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject property();
    
    /**
     * <p>
     * Checks if the input value is valid for the field.
     * </p>
     * 
     * @param value Mandatory java.lang.Object parameter.
     * @param pObject Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void isValidValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object value,
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pObject);
    
    // Properties:
}
