package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ISupportTotalCount Interface.
 */
@IID("{69E1AE5F-9786-4AB3-B391-0ADCCB09DF8B}")
public interface ISupportTotalCount extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Total result count, when fetch limit is used in filter.
     * </p>
     * <p>
     * Getter method for the COM property "TotalCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(3)
    int totalCount();
    
    // Properties:
}
