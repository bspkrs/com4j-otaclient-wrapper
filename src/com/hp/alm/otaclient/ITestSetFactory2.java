package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing test sets multi project reporting.
 */
@IID("{CE2D2089-4D9F-4740-985C-13114342AB98}")
public interface ITestSetFactory2 extends com.hp.alm.otaclient.ITestSetFactory
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
     * @param selectedProjects Optional parameter. Default value is ""
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectSummaryGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String xAxisField,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("") java.lang.String selectedProjects,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
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
     * @param selectedProjects Optional parameter. Default value is ""
     * @param maxCols Optional parameter. Default value is 0
     * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
     * @param frDate Optional parameter. Default value is com4j.Variant.getMissing()
     * @param forceRefresh Optional parameter. Default value is false
     * @param showFullPath Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectTrendGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("") java.lang.String selectedProjects,
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
     * @param selectedProjects Optional parameter. Default value is ""
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
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectProgressGraph(
            int testSetID,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("") java.lang.String selectedProjects,
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
