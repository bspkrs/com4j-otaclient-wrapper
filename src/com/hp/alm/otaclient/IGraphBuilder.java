package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for creating graphs.
 */
@IID("{8F96D0C2-FFFE-4C6F-984E-CE022A50EA0E}")
public interface IGraphBuilder extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Create an IGraphDefinition object.
     * </p>
     * 
     * @param module Mandatory int parameter.
     * @param graphType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createGraphDefinition(
            int module,
            int graphType);
    
    /**
     * <p>
     * Build the graph.
     * </p>
     * 
     * @param pGraphDef Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildGraph(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pGraphDef);
    
    /**
     * <p>
     * Build several graphs.
     * </p>
     * 
     * @param graphDefs Mandatory java.lang.Object parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList buildMultipleGraphs(
            @MarshalAs(NativeType.VARIANT) java.lang.Object graphDefs);
    
    // Properties:
}
