package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a graph built through a method.
 */
@IID("{ECCB1143-8914-497A-ACA0-8789CA64C2D6}")
public interface IGraph extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the name of the specified column. Column numbers are zero-based.
     * </p>
     * <p>
     * Getter method for the COM property "ColName"
     * </p>
     * 
     * @param col Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String colName(
            int col);
    
    /**
     * <p>
     * Gets the row name of the specified row. Row numbers are zero-based.
     * </p>
     * <p>
     * Getter method for the COM property "RowName"
     * </p>
     * 
     * @param row Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String rowName(
            int row);
    
    /**
     * <p>
     * For HP use. The column type.
     * </p>
     * <p>
     * Getter method for the COM property "ColType"
     * </p>
     * 
     * @param col Mandatory int parameter.
     * @return Returns a value of type short
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    short colType(
            int col);
    
    /**
     * <p>
     * The data in the specified cell. Column and Row numbers are zero-based.
     * </p>
     * <p>
     * Getter method for the COM property "Data"
     * </p>
     * 
     * @param col Mandatory int parameter.
     * @param row Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int data(
            int col,
            int row);
    
    /**
     * <p>
     * The number of columns.
     * </p>
     * <p>
     * Getter method for the COM property "ColCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    int colCount();
    
    /**
     * <p>
     * The number of rows.
     * </p>
     * <p>
     * Getter method for the COM property "RowCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    int rowCount();
    
    /**
     * <p>
     * Drills down to graph data.
     * </p>
     * 
     * @param pAreas Mandatory java.lang.Object parameter.
     * @param mAreas Mandatory java.lang.Object parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    com.hp.alm.otaclient.IList drillDown(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pAreas,
            @MarshalAs(NativeType.VARIANT) java.lang.Object mAreas);
    
    /**
     * <p>
     * The maximum value in the graph.
     * </p>
     * <p>
     * Getter method for the COM property "MaxValue"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    int maxValue();
    
    /**
     * <p>
     * The total number of items represented in the graph.
     * </p>
     * <p>
     * Getter method for the COM property "GraphTotal"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    int graphTotal();
    
    /**
     * <p>
     * The sum of the values in the specified graph data row. The row number is zero-based.
     * </p>
     * <p>
     * Getter method for the COM property "RowTotal"
     * </p>
     * 
     * @param row Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(16)
    int rowTotal(
            int row);
    
    /**
     * <p>
     * The sum of the values in the specified graph data column. The column number is zero-based.
     * </p>
     * <p>
     * Getter method for the COM property "ColTotal"
     * </p>
     * 
     * @param col Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(17)
    int colTotal(
            int col);
    
    /**
     * <p>
     * Gets detailed information about a graph area consisting of four sets of coordinates.
     * </p>
     * 
     * @param areas Mandatory java.lang.Object parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(18)
    com.hp.alm.otaclient.IList multiDrillDown(
            @MarshalAs(NativeType.VARIANT) java.lang.Object areas);
    
    /**
     * <p>
     * The start date for the graph.
     * </p>
     * <p>
     * Getter method for the COM property "StartDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(19)
    java.util.Date startDate();
    
    /**
     * <p>
     * Returns a list of warnings returned for this graph by the server.
     * </p>
     * <p>
     * Getter method for the COM property "Warnings"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    com.hp.alm.otaclient.IList warnings();
    
    @VTID(20)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object warnings(
            int index);
    
    /**
     * <p>
     * Cross project graph data drill-down.
     * </p>
     * 
     * @param areas Mandatory java.lang.Object parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    com.hp.alm.otaclient.IList crossDrillDown(
            @MarshalAs(NativeType.VARIANT) java.lang.Object areas);
    
    // Properties:
}
