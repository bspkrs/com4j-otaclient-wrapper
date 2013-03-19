package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IAnalysis Interface.
 */
@IID("{557AF6E9-FB13-4934-9A8F-6620BA38C547}")
public interface IAnalysis extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * property Filter : analysis filter.
     * </p>
     * <p>
     * Getter method for the COM property "FilterText"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String filterText();
    
    /**
     * <p>
     * property Filter : analysis filter.
     * </p>
     * <p>
     * Setter method for the COM property "FilterText"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void filterText(
            java.lang.String pVal);
    
    /**
     * <p>
     * property Type: analysis object type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String type();
    
    /**
     * <p>
     * property Type: analysis object type.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void type(
            java.lang.String pVal);
    
    /**
     * <p>
     * Gets distinct values for specified fields.
     * </p>
     * 
     * @param fields Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object getDistinctValues(
            @MarshalAs(NativeType.VARIANT) java.lang.Object fields);
    
    /**
     * <p>
     * Gets summary data.
     * </p>
     * 
     * @param fields Mandatory java.lang.Object parameter.
     * @param dataFields Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object getSummaryData(
            @MarshalAs(NativeType.VARIANT) java.lang.Object fields,
            @MarshalAs(NativeType.VARIANT) java.lang.Object dataFields);
    
    /**
     * <p>
     * property JoinCondition: analysis join condition.
     * </p>
     * <p>
     * Getter method for the COM property "JoinCondition"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String joinCondition();
    
    /**
     * <p>
     * property JoinCondition: analysis join condition.
     * </p>
     * <p>
     * Setter method for the COM property "JoinCondition"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void joinCondition(
            java.lang.String pVal);
    
    // Properties:
}
