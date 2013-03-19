package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a subject folder in a Quality Center subject tree.
 */
@IID("{84098378-E720-4D95-82DE-164A4104B52D}")
public interface ISubjectNode2 extends com.hp.alm.otaclient.ISubjectNode
{
    // Methods:
    /**
     * <p>
     * The filter on the test objects in the tree.
     * </p>
     * <p>
     * Getter method for the COM property "TestFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(33)
    java.lang.String testFilter();
    
    /**
     * <p>
     * The filter on the test objects in the tree.
     * </p>
     * <p>
     * Setter method for the COM property "TestFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    void testFilter(
            java.lang.String pVal);
    
    // Properties:
}
