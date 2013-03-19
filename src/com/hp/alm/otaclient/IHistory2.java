package com.hp.alm.otaclient;

import com4j.*;

/**
 * Obsolete.
 */
@IID("{84F1A917-9318-46B2-8C36-00C184EE00C2}")
public interface IHistory2 extends com.hp.alm.otaclient.IHistory
{
    // Methods:
    /**
     * <p>
     * -- obsolete, not used and not working in Maya -- Returns a list of the history data records that belong to the specified version and
     * match the filter.
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @param versionNumber Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList newListEx(
            java.lang.String filter,
            java.lang.String versionNumber);
    
    // Properties:
}
