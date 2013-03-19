package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services to manage Dashboard Pages.
 */
@IID("{1001E71F-5744-4624-8000-633698EB940D}")
public interface IDashboardPageFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Returns those dashboard page objects from the specified ID list that include private analysis items.
     * </p>
     * 
     * @param pIdsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    com.hp.alm.otaclient.IList getPagesWithPrivateItems(
            com.hp.alm.otaclient.IList pIdsList);
    
    // Properties:
}
