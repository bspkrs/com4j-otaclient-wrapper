package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for creation of a filtered list of field objects without SQL.
 */
@IID("{452897AD-D9F8-4EAE-80DB-B9C11807507F}")
public interface ITDFilter extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Getter method for the COM property "_Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String _Text();
    
    /**
     * <p>
     * Setter method for the COM property "_Text"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(8)
    void _Text(
            java.lang.String pVal);
    
    /**
     * <p>
     * The filter condition for the field specified by the FieldName.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(9)
    @DefaultMethod
    java.lang.String filter(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The filter condition for the field specified by the FieldName.
     * </p>
     * <p>
     * Setter method for the COM property "Filter"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(10)
    @DefaultMethod
    void filter(
            java.lang.String fieldName,
            java.lang.String pVal);
    
    /**
     * <p>
     * The position of the specified field in the list of the sort fields. (zero-based).
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(11)
    int order(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The position of the specified field in the list of the sort fields. (zero-based).
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(12)
    void order(
            java.lang.String fieldName,
            int pVal);
    
    /**
     * <p>
     * The sort order: TDOLE_ASCENDING or TDOLE_DESCENDING.
     * </p>
     * <p>
     * Getter method for the COM property "OrderDirection"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type short
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(13)
    short orderDirection(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The sort order: TDOLE_ASCENDING or TDOLE_DESCENDING.
     * </p>
     * <p>
     * Setter method for the COM property "OrderDirection"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory short parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(14)
    void orderDirection(
            java.lang.String fieldName,
            short pVal);
    
    /**
     * <p>
     * Clears the current filter.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(15)
    void clear();
    
    /**
     * <p>
     * Creates a new list from current filter.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(16)
    com.hp.alm.otaclient.IList newList();
    
    @VTID(16)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object newList(
            int index);
    
    /**
     * <p>
     * The list of fields for the TDFilter's parent object.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(17)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(17)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Reads saved data and refreshes the fetched list according to the current filter, overwriting values in memory.
     * </p>
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(18)
    void refresh();
    
    /**
     * <p>
     * Indicates if the filter for the specified field is case sensitive. The default is False.
     * </p>
     * <p>
     * Getter method for the COM property "CaseSensitive"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(19)
    boolean caseSensitive(
            java.lang.String fieldName);
    
    /**
     * <p>
     * Indicates if the filter for the specified field is case sensitive. The default is False.
     * </p>
     * <p>
     * Setter method for the COM property "CaseSensitive"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(20)
    void caseSensitive(
            java.lang.String fieldName,
            boolean pVal);
    
    /**
     * <p>
     * The full fields filter as text.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String text();
    
    /**
     * <p>
     * The full fields filter as text.
     * </p>
     * <p>
     * Setter method for the COM property "Text"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(22)
    void text(
            java.lang.String pVal);
    
    /**
     * <p>
     * The cross filter according to the entity type.
     * </p>
     * <p>
     * Getter method for the COM property "XFilter"
     * </p>
     * 
     * @param crossEntity Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String xFilter(
            java.lang.String crossEntity);
    
    /**
     * <p>
     * The cross filter according to the entity type.
     * </p>
     * <p>
     * Setter method for the COM property "XFilter"
     * </p>
     * 
     * @param crossEntity Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(24)
    void xFilter(
            java.lang.String crossEntity,
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. The Union Filter according to the entity type.
     * </p>
     * <p>
     * Getter method for the COM property "UFilter"
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String uFilter(
            java.lang.String entityType);
    
    /**
     * <p>
     * For HP use. The Union Filter according to the entity type.
     * </p>
     * <p>
     * Setter method for the COM property "UFilter"
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(26)
    void uFilter(
            java.lang.String entityType,
            java.lang.String pVal);
    
    /**
     * <p>
     * The filtered entity type.
     * </p>
     * <p>
     * Getter method for the COM property "DataType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String dataType();
    
    // Properties:
}
