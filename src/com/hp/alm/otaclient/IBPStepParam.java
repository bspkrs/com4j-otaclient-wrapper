package com.hp.alm.otaclient;

import com4j.*;

/**
 * A step parameter for a manual run of the business process test.
 */
@IID("{6BA5E493-366C-4068-B572-93D27D405DFE}")
public interface IBPStepParam extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The name of this parameter.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * The name of this parameter.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The value of this parameter.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String value();
    
    /**
     * <p>
     * The value of this parameter.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void value(
            java.lang.String pVal);
    
    /**
     * <p>
     * The parameter type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    int type();
    
    /**
     * <p>
     * The parameter type.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void type(
            int pVal);
    
    /**
     * <p>
     * The parameter ID of the referenced parameter.
     * </p>
     * <p>
     * Getter method for the COM property "ReferencedParamID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    int referencedParamID();
    
    /**
     * <p>
     * The parameter ID of the referenced parameter.
     * </p>
     * <p>
     * Setter method for the COM property "ReferencedParamID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void referencedParamID(
            int pVal);
    
    /**
     * <p>
     * The ID of the step in which this parameter occurs.
     * </p>
     * <p>
     * Getter method for the COM property "StepID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    int stepID();
    
    // Properties:
}
