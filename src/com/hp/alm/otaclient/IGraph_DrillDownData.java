package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use.
 */
@IID("{FF2B9B49-F613-42F6-B80A-1583FAAAD17F}")
public interface IGraph_DrillDownData extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Request for drill down data. Pass entity type and a list of IDs and get a list of entities (as in NewList request)
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @param idList Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(3)
    com.hp.alm.otaclient.IList drillDownData(
            java.lang.String entityType,
            java.lang.String idList);
    
    // Properties:
}
