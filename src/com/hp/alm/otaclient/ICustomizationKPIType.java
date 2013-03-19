package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The QPM KPI Type.
 */
@IID("{C657B5E5-E0C6-484B-AF08-ED24C2E59BDE}")
public interface ICustomizationKPIType extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * KPI Type name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name();
    
    /**
     * <p>
     * KPI Type name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String description();
    
    /**
     * <p>
     * KPI Type description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type entity type.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String entityType();
    
    /**
     * <p>
     * KPI Type default threshold target value.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultTargetValue"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    int defaultTargetValue();
    
    /**
     * <p>
     * KPI Type default threshold target value.
     * </p>
     * <p>
     * Setter method for the COM property "DefaultTargetValue"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void defaultTargetValue(
            int pVal);
    
    /**
     * <p>
     * KPI Type measurement type.
     * </p>
     * <p>
     * Getter method for the COM property "MeasurementType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String measurementType();
    
    /**
     * <p>
     * KPI Type numerator function name.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorFunctionName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String numeratorFunctionName();
    
    /**
     * <p>
     * KPI Type numerator function name.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorFunctionName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    void numeratorFunctionName(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator function summary field.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorFunctionSumField"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(17)
    java.lang.String numeratorFunctionSumField();
    
    /**
     * <p>
     * KPI Type numerator function summary field.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorFunctionSumField"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(18)
    void numeratorFunctionSumField(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator filter.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String numeratorFilter();
    
    /**
     * <p>
     * KPI Type numerator filter.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(20)
    void numeratorFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator transition field.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorTransitionField"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String numeratorTransitionField();
    
    /**
     * <p>
     * KPI Type numerator transition field.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorTransitionField"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(22)
    void numeratorTransitionField(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator transition field from values.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorTransitionFieldFromValues"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String numeratorTransitionFieldFromValues();
    
    /**
     * <p>
     * KPI Type numerator transition field from values.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorTransitionFieldFromValues"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(24)
    void numeratorTransitionFieldFromValues(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator transition field to values.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorTransitionFieldToValues"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String numeratorTransitionFieldToValues();
    
    /**
     * <p>
     * KPI Type numerator transition field to values.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorTransitionFieldToValues"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(26)
    void numeratorTransitionFieldToValues(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type numerator transition period.
     * </p>
     * <p>
     * Getter method for the COM property "NumeratorTransitionPeriod"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String numeratorTransitionPeriod();
    
    /**
     * <p>
     * KPI Type numerator transition period.
     * </p>
     * <p>
     * Setter method for the COM property "NumeratorTransitionPeriod"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(28)
    void numeratorTransitionPeriod(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator function name.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorFunctionName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String denominatorFunctionName();
    
    /**
     * <p>
     * KPI Type denominator function name.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorFunctionName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(30)
    void denominatorFunctionName(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator function summary field.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorFunctionSumField"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String denominatorFunctionSumField();
    
    /**
     * <p>
     * KPI Type denominator function summary field.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorFunctionSumField"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(32)
    void denominatorFunctionSumField(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator filter.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(33)
    java.lang.String denominatorFilter();
    
    /**
     * <p>
     * KPI Type denominator filter.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(34)
    void denominatorFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator transition field.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorTransitionField"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String denominatorTransitionField();
    
    /**
     * <p>
     * KPI Type denominator transition field.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorTransitionField"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(36)
    void denominatorTransitionField(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator transition field from values.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorTransitionFieldFromValues"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(37)
    java.lang.String denominatorTransitionFieldFromValues();
    
    /**
     * <p>
     * KPI Type denominator transition field from values.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorTransitionFieldFromValues"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(38)
    void denominatorTransitionFieldFromValues(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type denominator transition field to values.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorTransitionFieldToValues"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String denominatorTransitionFieldToValues();
    
    /**
     * <p>
     * KPI Type denominator transition field to values.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorTransitionFieldToValues"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(40)
    void denominatorTransitionFieldToValues(
            java.lang.String pVal);
    
    /**
     * <p>
     * KPI Type direction.
     * </p>
     * <p>
     * Getter method for the COM property "KPIBetterWhenHigher"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(41)
    boolean kpiBetterWhenHigher();
    
    /**
     * <p>
     * KPI Type direction.
     * </p>
     * <p>
     * Setter method for the COM property "KPIBetterWhenHigher"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(42)
    void kpiBetterWhenHigher(
            boolean pVal);
    
    /**
     * <p>
     * KPI Type denominator transition period.
     * </p>
     * <p>
     * Getter method for the COM property "DenominatorTransitionPeriod"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(43)
    java.lang.String denominatorTransitionPeriod();
    
    /**
     * <p>
     * KPI Type denominator transition period.
     * </p>
     * <p>
     * Setter method for the COM property "DenominatorTransitionPeriod"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(44)
    void denominatorTransitionPeriod(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if the kpi type object has changed locally since last synchronized with the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(45)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the kpi type has been removed, but the deletion has not been posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(46)
    boolean deleted();
    
    /**
     * <p>
     * Indicates if the kpi type has been removed, but the deletion has not been posted to the server.
     * </p>
     * <p>
     * Setter method for the COM property "Deleted"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(47)
    void deleted(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the KPI type has been created but not posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "New"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(48)
    boolean _new();
    
    /**
     * <p>
     * The KPI Type ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(49)
    int id();
    
    /**
     * <p>
     * KPI Type default threshold value tolerance.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultTolerance"
     * </p>
     * 
     * @return Returns a value of type double
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(50)
    double defaultTolerance();
    
    /**
     * <p>
     * KPI Type default threshold value tolerance.
     * </p>
     * <p>
     * Setter method for the COM property "DefaultTolerance"
     * </p>
     * 
     * @param pVal Mandatory double parameter.
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(51)
    void defaultTolerance(
            double pVal);
    
    /**
     * <p>
     * The list of BreakdownType objects for this KPI type.
     * </p>
     * <p>
     * Getter method for the COM property "BreakdownTypes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICustomizationBreakdownTypes
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(52)
    com.hp.alm.otaclient.ICustomizationBreakdownTypes breakdownTypes();
    
    /**
     * <p>
     * Checks if a KPI Type is used by a KPI.
     * </p>
     * <p>
     * Getter method for the COM property "IsReferenced"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(53)
    boolean isReferenced();
    
    /**
     * <p>
     * Checks if a KPI Type is linked to template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(54)
    boolean isTemplate();
    
    // Properties:
}
