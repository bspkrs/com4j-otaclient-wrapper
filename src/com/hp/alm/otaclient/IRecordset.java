package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the entire set of records resulting from an executed command. At any given time, the Recordset object refers to a single
 * record within the record set as the current record.
 */
@IID("{025854DA-9D81-40E8-853D-F4EA33073A77}")
public interface IRecordset extends com.hp.alm.otaclient.IColumnInfo
{
    // Methods:
    /**
     * <p>
     * The value for the specified field.
     * </p>
     * <p>
     * Getter method for the COM property "FieldValue"
     * </p>
     * 
     * @param fieldKey Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(12)
    @DefaultMethod
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object fieldValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object fieldKey);
    
    /**
     * <p>
     * The value for the specified field.
     * </p>
     * <p>
     * Setter method for the COM property "FieldValue"
     * </p>
     * 
     * @param fieldKey Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(13)
    @DefaultMethod
    void fieldValue(
            @MarshalAs(NativeType.VARIANT) java.lang.Object fieldKey,
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The number of records in the Recordset.
     * </p>
     * <p>
     * Getter method for the COM property "RecordCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    int recordCount();
    
    /**
     * <p>
     * Checks if the record cursor is on the first record.
     * </p>
     * <p>
     * Getter method for the COM property "BOR"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    boolean bor();
    
    /**
     * <p>
     * Checks if the record cursor is after the last record.
     * </p>
     * <p>
     * Getter method for the COM property "EOR"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    boolean eor();
    
    /**
     * <p>
     * The number of records in the recordset that are cached locally in memory.
     * </p>
     * <p>
     * Getter method for the COM property "CacheSize"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    int cacheSize();
    
    /**
     * <p>
     * The number of records in the recordset that are cached locally in memory.
     * </p>
     * <p>
     * Setter method for the COM property "CacheSize"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    void cacheSize(
            int pVal);
    
    /**
     * <p>
     * The current record position (0-based).
     * </p>
     * <p>
     * Getter method for the COM property "Position"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    int position();
    
    /**
     * <p>
     * The current record position (0-based).
     * </p>
     * <p>
     * Setter method for the COM property "Position"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(20)
    void position(
            int pVal);
    
    /**
     * <p>
     * Moves to the first record and makes it the current record.
     * </p>
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    void first();
    
    /**
     * <p>
     * Moves to the next record and makes it the current record.
     * </p>
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    void next();
    
    /**
     * <p>
     * Moves to the previous record and makes it the current record.
     * </p>
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(23)
    void prev();
    
    /**
     * <p>
     * Moves to the last record and makes it the current record.
     * </p>
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void last();
    
    /**
     * <p>
     * Creates a duplicate of this Recordset object.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject clone();
    
    /**
     * <p>
     * Refreshes the Recordset, overwriting values in memory.
     * </p>
     * 
     * @param range Optional parameter. Default value is 0
     * @param low Optional parameter. Default value is 0
     * @param high Optional parameter. Default value is 0
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    void refresh(
            @Optional @DefaultValue("0") int range,
            @Optional int low,
            @Optional int high);
    
    // Properties:
}
