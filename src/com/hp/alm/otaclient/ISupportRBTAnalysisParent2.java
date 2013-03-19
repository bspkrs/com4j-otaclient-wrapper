package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents Risk-based Quality Management analysis capabilities for the Req coclass.
 */
@IID("{4733F5F9-E34B-45FD-B2BF-9B53144150D0}")
public interface ISupportRBTAnalysisParent2 extends com.hp.alm.otaclient.ISupportRBTAnalysisParent
{
    // Methods:
    /**
     * <p>
     * Hours needed to test a requirement with the given Functional Complexity.
     * </p>
     * <p>
     * Getter method for the COM property "TestingEffortForFCLevel"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(51)
    //= 0x33. The runtime will prefer the VTID if present
    @VTID(31)
    int testingEffortForFCLevel(
            int fcLevel);
    
    /**
     * <p>
     * Hours needed to test a requirement with the given Functional Complexity.
     * </p>
     * <p>
     * Setter method for the COM property "TestingEffortForFCLevel"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @param pHours Mandatory int parameter.
     */
    
    @DISPID(51)
    //= 0x33. The runtime will prefer the VTID if present
    @VTID(32)
    void testingEffortForFCLevel(
            int fcLevel,
            int pHours);
    
    // Properties:
}
