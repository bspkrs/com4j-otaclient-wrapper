package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents column information for a Recordset.
 */
@IID("{0993EF6D-FAF3-42FF-BCF9-85BBB83753F6}")
public interface IColumnInfo extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the number of columns in the current Recordset object.
     * </p>
     * <p>
     * Getter method for the COM property "ColCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int colCount();
    
    /**
     * <p>
     * The physical size as defined in the database of the fields in the column specified by Index (zero-based).
     * </p>
     * <p>
     * Getter method for the COM property "ColSize"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int colSize(
            int index);
    
    /**
     * <p>
     * The data type of column.
     * </p>
     * <p>
     * Getter method for the COM property "ColType"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int colType(
            int index);
    
    /**
     * <p>
     * The name of the Recordset column specified by Index (zero-based).
     * </p>
     * <p>
     * Getter method for the COM property "ColName"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String colName(
            int index);
    
    /**
     * <p>
     * Gets the index (zero-based) of a Recordset column specified by column name.
     * </p>
     * <p>
     * Getter method for the COM property "ColIndex"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    int colIndex(
            java.lang.String name);
    
    // Properties:
}
