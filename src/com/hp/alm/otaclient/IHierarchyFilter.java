package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for creation of a filtered list of field objects without SQL.
 */
@IID("{BE140C38-7D92-4C50-8C1C-A4E43C0FC329}")
public interface IHierarchyFilter extends com.hp.alm.otaclient.ITDFilter2
{
    // Methods:
    /**
     * <p>
     * Indicates whether to include parent objects in list.
     * </p>
     * <p>
     * Getter method for the COM property "KeepHierarchical"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(31)
    boolean keepHierarchical();
    
    /**
     * <p>
     * Indicates whether to include parent objects in list.
     * </p>
     * <p>
     * Setter method for the COM property "KeepHierarchical"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(32)
    void keepHierarchical(
            boolean pVal);
    
    // Properties:
}
