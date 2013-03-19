package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing test sets.
 */
@IID("{6199FE11-C44D-4712-99DF-4F5EF3F80A29}")
public interface ITestSetFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Creates graph showing the number of requirements reported according to the defect tracking information specified.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param xAxisField Optional parameter. Default value is ""
     * @param groupByField Optional parameter. Default value is ""
     * @param sumOfField Optional parameter. Default value is ""
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildSummaryGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String xAxisField,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath);
    
    /**
     * <p>
     * Creates graph showing number of tests in all test sets executed over a period of time.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param groupByField Optional parameter. Default value is ""
     * @param sumOfField Optional parameter. Default value is ""
     * @param majorSkip Optional parameter. Default value is 0
     * @param minorSkip Optional parameter. Default value is 1
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildProgressGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("0") int majorSkip,
            @Optional @DefaultValue("1") int minorSkip,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object frDate,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath);
    
    /**
     * <p>
     * Creates graph showing the number of status changes over a time period.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param groupByField Optional parameter. Default value is ""
     * @param sumOfField Optional parameter. Default value is ""
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildTrendGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object frDate,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath);
    
    /**
     * <p>
     * Creates Performance Graph.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param groupByField Optional parameter. Default value is ""
     * @param sumOfField Optional parameter. Default value is ""
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildPerfGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object frDate,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath);
    
    /**
     * <p>
     * Creates progress graph for specified test set.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param groupByField Optional parameter. Default value is ""
     * @param sumOfField Optional parameter. Default value is ""
     * @param byHistory Optional parameter. Default value is false
     * @param majorSkip Optional parameter. Default value is 0
     * @param minorSkip Optional parameter. Default value is 1
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildProgressGraphEx(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("-1") boolean byHistory,
            @Optional @DefaultValue("0") int majorSkip,
            @Optional @DefaultValue("1") int minorSkip,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object frDate,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath);
    
    // Properties:
}
