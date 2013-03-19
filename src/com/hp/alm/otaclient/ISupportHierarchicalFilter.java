package com.hp.alm.otaclient;

import com4j.*;

/**
 * Support for the hierarchical filter.
 */
@IID("{1E41E461-210B-43DC-B9DE-6E1CF81C5B52}")
public interface ISupportHierarchicalFilter extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns a list of children of the specified parent that match the filter.
     * </p>
     * 
     * @param fatherID Mandatory int parameter.
     * @param filter Optional parameter. Default value is 0
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList getFilteredChildren(
            int fatherID,
            @Optional @DefaultValue("0") com.hp.alm.otaclient.ITDFilter filter);
    
    // Properties:
}
