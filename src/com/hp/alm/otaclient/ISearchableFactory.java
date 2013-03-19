package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to support text searches in properties of objects managed by a factory.
 */
@IID("{03986C41-712B-4A6F-8C65-B50CBF7FC640}")
public interface ISearchableFactory extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Creates a new SearchOptions object.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1001)
    //= 0x3e9. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createSearchOptions();
    
    /**
     * <p>
     * Gets a list of objects matching the search query.
     * </p>
     * 
     * @param query Mandatory java.lang.String parameter.
     * @param pSearchOptions Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1002)
    //= 0x3ea. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList search(
            java.lang.String query,
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pSearchOptions);
    
    /**
     * <p>
     * Checks if the Search method can be called by this factory.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1003)
    //= 0x3eb. The runtime will prefer the VTID if present
    @VTID(9)
    boolean isSearchable();
    
    // Properties:
}
