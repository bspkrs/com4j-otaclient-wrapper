package com.hp.alm.otaclient;

import com4j.*;

/**
 * A parameter for a manual test.
 */
@IID("{242048FE-29EA-4D57-A878-15614CFE355C}")
public interface ITestParameter extends com.hp.alm.otaclient.IBaseField
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
     * The parameter's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    void name(
            java.lang.String pVal);
    
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
    @VTID(22)
    java.lang.String description();
    
    /**
     * <p>
     * The parameter description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The test that owns this parameter.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerTest"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject ownerTest();
    
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
    @VTID(25)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object defaultValue();
    
    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * <p>
     * Setter method for the COM property "DefaultValue"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(26)
    void defaultValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * Checks if the test parameter is used.
     * </p>
     * <p>
     * Getter method for the COM property "IsUsed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(27)
    boolean isUsed();
    
    // Properties:
}
