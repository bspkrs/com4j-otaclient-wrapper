package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. _ISupportGetChildrenLists Interface.
 */
@IID("{571138B3-FBBE-4B57-97F5-B61E325AEFBA}")
public interface _ISupportGetChildrenLists extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use. Returns children factory lists from the given parents
     * </p>
     * 
     * @param filter Mandatory com.hp.alm.otaclient.ITDFilter parameter.
     * @param parents Mandatory com.hp.alm.otaclient.IList parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(3)
    com.hp.alm.otaclient.IList getChildrenLists(
            com.hp.alm.otaclient.ITDFilter filter,
            com.hp.alm.otaclient.IList parents);
    
    // Properties:
}
