package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a KPI.
 */
@IID("{59E6B833-C293-4AD7-894C-4EBE5377B5FC}")
public interface IKPI extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The KPI's Name.
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
     * The KPI's Name.
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
     * The KPI's Description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String description();
    
    /**
     * <p>
     * The KPI's Description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The KPI Filter.
     * </p>
     * <p>
     * Getter method for the COM property "KPIFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String kpiFilter();
    
    /**
     * <p>
     * The KPI Filter.
     * </p>
     * <p>
     * Setter method for the COM property "KPIFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void kpiFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * The KPI Definition ID.
     * </p>
     * <p>
     * Getter method for the COM property "KPIDefinitionId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    int kpiDefinitionId();
    
    /**
     * <p>
     * The KPI Definition ID.
     * </p>
     * <p>
     * Setter method for the COM property "KPIDefinitionId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void kpiDefinitionId(
            int pVal);
    
    /**
     * <p>
     * The KPI's parent milestone.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * The Threshold Value Factory.
     * </p>
     * <p>
     * Getter method for the COM property "ThresholdValueFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(29)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject thresholdValueFactory();
    
    // Properties:
}
