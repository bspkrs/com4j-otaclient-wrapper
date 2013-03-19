package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a run result.
 */
@IID("{F1C2D61F-7508-4839-A99A-85EDEA2B5737}")
public interface IResult extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Read/Write property - Result logical name
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * Read/Write property - Result logical name
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * Read-only ModifiedBy property. Contains last modified user name
     * </p>
     * <p>
     * Getter method for the COM property "ModifiedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String modifiedBy();
    
    /**
     * <p>
     * Read/Write Description property
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String description();
    
    /**
     * <p>
     * Read/Write Description property
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * property ResultType
     * </p>
     * <p>
     * Getter method for the COM property "ResultType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String resultType();
    
    /**
     * <p>
     * property ResultType
     * </p>
     * <p>
     * Setter method for the COM property "ResultType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void resultType(
            java.lang.String pVal);
    
    // Properties:
}
