package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing requirements multi project reporting.
 */
@IID("{3F14A1AC-5E49-4996-81B4-17E7AE2D5D61}")
public interface IReqFactory4 extends com.hp.alm.otaclient.IReqFactory3
{
    // Methods:
    /**
     * <p>
     * Builds Req summary graph. Extends BuildSummaryGraph with ability to display Null parent folders.
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
     * @param showNullParents Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectSummaryGraph(
            @Optional @DefaultValue("") java.lang.String xAxisField,
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("") java.lang.String selectedProjects,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath,
            @Optional @DefaultValue("0") boolean showNullParents);
    
    /**
     * <p>
     * Builds Requirement progress graph. Extends BuildProgressGraph with ability to display Null parent folders.
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
     * @param showNullParents Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(36)
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
            @Optional @DefaultValue("0") boolean showFullPath,
            @Optional @DefaultValue("0") boolean showNullParents);
    
    /**
     * <p>
     * Creates graph that shows the number of defect status changes over time.
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
     * @param showNullParents Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildMultiProjectTrendGraph(
            @Optional @DefaultValue("") java.lang.String groupByField,
            @Optional @DefaultValue("") java.lang.String sumOfField,
            @Optional @DefaultValue("") java.lang.String selectedProjects,
            @Optional @DefaultValue("0") int maxCols,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object frDate,
            @Optional @DefaultValue("0") boolean forceRefresh,
            @Optional @DefaultValue("0") boolean showFullPath,
            @Optional @DefaultValue("0") boolean showNullParents);
    
    // Properties:
}
