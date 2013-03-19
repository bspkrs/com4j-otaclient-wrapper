package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IReqSummaryStatus Interface.
 */
@IID("{CCD9F62A-3899-4233-9C2C-A25BFF1AF041}")
public interface IReqSummaryStatus extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * A list of possible requirement statuses.
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
     * @param statusName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int summaryStatus(
            java.lang.String statusName);
    
    /**
     * <p>
     * The total number of child nodes covered by the requirement status.
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
    
    /**
     * <p>
     * The requirement ID.
     * </p>
     * <p>
     * Getter method for the COM property "ReqID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int reqID();
    
    // Properties:
}
