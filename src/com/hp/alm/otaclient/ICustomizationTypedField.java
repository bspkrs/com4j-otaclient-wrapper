package com.hp.alm.otaclient;

import com4j.*;

/**
 * An association between a CustomizationField and an object of a class that implements ICustomizationType.
 */
@IID("{780EDB90-97D3-4146-AD5F-F2F313EDF29E}")
public interface ICustomizationTypedField extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the CustomizationField associated with this object.
     * </p>
     * <p>
     * Getter method for the COM property "Field"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject field();
    
    /**
     * <p>
     * Gets the CustomizationType associated with this object.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject type();
    
    /**
     * <p>
     * Indicates whether the field is required for the specific type.
     * </p>
     * <p>
     * Getter method for the COM property "IsRequired"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean isRequired();
    
    /**
     * <p>
     * Indicates whether the field is required for the specific type.
     * </p>
     * <p>
     * Setter method for the COM property "IsRequired"
     * </p>
     * 
     * @param pbRequired Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void isRequired(
            boolean pbRequired);
    
    /**
     * <p>
     * Returns a reference to the CustomizationSubtype associated with this object.
     * </p>
     * <p>
     * Getter method for the COM property "EntitySubtype"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entitySubtype();
    
    // Properties:
}
