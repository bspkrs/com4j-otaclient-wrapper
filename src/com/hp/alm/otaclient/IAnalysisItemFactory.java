package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services to manage analysis items.
 */
@IID("{E93A887B-8FBC-400E-8BD0-ECC2B064D7A5}")
public interface IAnalysisItemFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Returns the list of those AnalysisItem objects from the list that appear on dashboard pages.
     * </p>
     * 
     * @param pIdsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param inPublicPagesOnly Mandatory boolean parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    com.hp.alm.otaclient.IList getItemsIncludedInPages(
            com.hp.alm.otaclient.IList pIdsList,
            boolean inPublicPagesOnly);
    
    // Properties:
}
