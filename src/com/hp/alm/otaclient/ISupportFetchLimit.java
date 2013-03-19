package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for creation of a filtered list of field objects without SQL.
 */
@IID("{71189926-F2D4-4E8C-8C2F-5163470195E4}")
public interface ISupportFetchLimit extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Maximum number of results to return from server.
     * </p>
     * <p>
     * Getter method for the COM property "FetchLimit"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int fetchLimit();
    
    /**
     * <p>
     * Maximum number of results to return from server.
     * </p>
     * <p>
     * Setter method for the COM property "FetchLimit"
     * </p>
     * 
     * @param pFetchLimit Mandatory int parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void fetchLimit(
            int pFetchLimit);
    
    // Properties:
}
