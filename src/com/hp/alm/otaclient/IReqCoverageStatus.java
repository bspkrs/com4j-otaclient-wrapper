package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Requirement Coverage Status.
 */
@IID("{650BCE02-3C9A-4C22-ABCF-C2872EED73EB}")
public interface IReqCoverageStatus extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The list of possible coverage statuses.
     * </p>
     * <p>
     * Getter method for the COM property "PossibleStatuses"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList possibleStatuses();
    
    @VTID(7)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object possibleStatuses(
            int index);
    
    /**
     * <p>
     * The number of child nodes with the specified status.
     * </p>
     * <p>
     * Getter method for the COM property "SummaryStatus"
     * </p>
     * 
     * @param status Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int summaryStatus(
            java.lang.String status);
    
    /**
     * <p>
     * The total number of child nodes covered by the status.
     * </p>
     * <p>
     * Getter method for the COM property "TotalSummaryNodes"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int totalSummaryNodes();
    
    // Properties:
}
