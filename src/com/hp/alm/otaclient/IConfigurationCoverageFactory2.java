package com.hp.alm.otaclient;

import com4j.*;

/**
 * More services for managing coverage by test configurations.
 */
@IID("{53872ECC-00E3-4D78-84C1-DD8F39BC2BD9}")
public interface IConfigurationCoverageFactory2 extends com.hp.alm.otaclient.IConfigurationCoverageFactory
{
    // Methods:
    /**
     * <p>
     * For HP use. Sets full coverage for requirement context to be used in NewList. must supply the root req Id and its abs path
     * </p>
     * 
     * @param rootReqForFullCoverageID Mandatory int parameter.
     * @param rootReqForFullCoveragePath Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    void setFullCoverageOfRequirmentContext(
            int rootReqForFullCoverageID,
            java.lang.String rootReqForFullCoveragePath);
    
    /**
     * <p>
     * For HP use. Resets full coverage for requirement context.
     * </p>
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    void resetFullCoverageOfRequirmentContext();
    
    // Properties:
}
