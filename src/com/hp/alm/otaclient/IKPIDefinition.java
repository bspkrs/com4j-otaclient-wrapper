package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a KPIDefinition.
 */
@IID("{3A2849F2-077A-4BF6-A10F-69593D6B137F}")
public interface IKPIDefinition extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Get definition's name.
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
     * Get definition's name.
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
     * Get definition's Minimum Value.
     * </p>
     * <p>
     * Getter method for the COM property "MinimumValue"
     * </p>
     * 
     * @return Returns a value of type double
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    double minimumValue();
    
    /**
     * <p>
     * Get definition's Minimum Value.
     * </p>
     * <p>
     * Setter method for the COM property "MinimumValue"
     * </p>
     * 
     * @param pVal Mandatory double parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void minimumValue(
            double pVal);
    
    /**
     * <p>
     * Get definition's Maximum Value.
     * </p>
     * <p>
     * Getter method for the COM property "MaximumValue"
     * </p>
     * 
     * @return Returns a value of type double
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    double maximumValue();
    
    /**
     * <p>
     * Get definition's Maximum Value.
     * </p>
     * <p>
     * Setter method for the COM property "MaximumValue"
     * </p>
     * 
     * @param pVal Mandatory double parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    void maximumValue(
            double pVal);
    
    /**
     * <p>
     * Get definition's measurement direction.
     * </p>
     * <p>
     * Getter method for the COM property "DirectionIsUp"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    boolean directionIsUp();
    
    /**
     * <p>
     * Get definition's measurement direction.
     * </p>
     * <p>
     * Setter method for the COM property "DirectionIsUp"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(30)
    void directionIsUp(
            boolean pVal);
    
    /**
     * <p>
     * Get KPI definition's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String description();
    
    /**
     * <p>
     * Get KPI definition's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(32)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * Get KPI definition's entity type.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(33)
    java.lang.String entityType();
    
    /**
     * <p>
     * Get KPI definition's entity type.
     * </p>
     * <p>
     * Setter method for the COM property "EntityType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(34)
    void entityType(
            java.lang.String pVal);
    
    /**
     * <p>
     * Get KPI definition's numerator filter.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String numeratorFilter();
    
    /**
     * <p>
     * Get KPI definition's numerator filter.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(36)
    void numeratorFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * Get KPI definition's denominator filter.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(37)
    java.lang.String denominatorFilter();
    
    /**
     * <p>
     * Get KPI definition's denominator filter.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(38)
    void denominatorFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * Get KPI definition's entity type.
     * </p>
     * <p>
     * Getter method for the COM property "MetricType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String metricType();
    
    /**
     * <p>
     * Get KPI definition's entity type.
     * </p>
     * <p>
     * Setter method for the COM property "MetricType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(40)
    void metricType(
            java.lang.String pVal);
    
    // Properties:
}
