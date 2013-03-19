package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test parameter value entity.
 */
@IID("{B8D89E0F-5164-420B-A8A4-9C6D982487BF}")
public interface IParameterValue extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The parameter's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * The parameter description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String description();
    
    /**
     * <p>
     * The owner entity.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerEntity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject ownerEntity();
    
    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object defaultValue();
    
    /**
     * <p>
     * The value of the param.
     * </p>
     * <p>
     * Getter method for the COM property "ActualValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object actualValue();
    
    /**
     * <p>
     * The value of the param.
     * </p>
     * <p>
     * Setter method for the COM property "ActualValue"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(25)
    void actualValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * Checks if the parameter is used.
     * </p>
     * <p>
     * Getter method for the COM property "IsUsed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(26)
    boolean isUsed();
    
    // Properties:
}
