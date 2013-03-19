package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing business components.
 */
@IID("{4BA5615F-21D7-49B3-94C8-12A29485E6F7}")
public interface IComponentFactory3 extends com.hp.alm.otaclient.IComponentFactory2
{
    // Methods:
    /**
     * <p>
     * Creates summary graph.
     * </p>
     * 
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
    
    @DISPID(77)
    //= 0x4d. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectSummaryGraph(
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
     * Creates graph that shows the number of component status changes over time.
     * </p>
     * 
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
    
    @DISPID(78)
    //= 0x4e. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectTrendGraph(
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
     * Creates trend graph.
     * </p>
     * 
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
    
    @DISPID(79)
    //= 0x4f. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectProgressGraph(
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
