package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a graph built through a method.
 */
@IID("{79CC748A-20E0-416D-9E31-6298B5CAA730}")
public interface IGraph2 extends com.hp.alm.otaclient.IGraph
{
    // Methods:
    /**
     * <p>
     * Get additional metadata to graph.
     * </p>
     * <p>
     * Getter method for the COM property "MetadataAttribute"
     * </p>
     * 
     * @param attrName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String metadataAttribute(
            java.lang.String attrName);
    
    // Properties:
}
