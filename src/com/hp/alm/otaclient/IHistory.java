package com.hp.alm.otaclient;

import com4j.*;

/**
 * Supports retrieval of a list of history records for objects such as Test, Bug, Step, and others.
 */
@IID("{15FBB8D4-7034-413E-A8F0-1E03B7FA4F0B}")
public interface IHistory extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets filtered list of history data records.
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList newList(
            java.lang.String filter);
    
    /**
     * <p>
     * The filter object for the history item.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject filter();
    
    /**
     * <p>
     * Clears the history records selected by the filter.
     * </p>
     * 
     * @param filter Optional parameter. Default value is ""
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void clearHistory(
            @Optional @DefaultValue("") java.lang.String filter);
    
    // Properties:
}
