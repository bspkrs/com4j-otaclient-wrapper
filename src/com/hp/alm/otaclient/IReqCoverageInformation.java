package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing requirement coverage information.
 */
@IID("{860CDC34-7616-4A2B-9005-9FBEF00FEF68}")
public interface IReqCoverageInformation extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use. Returns the amount of covering enitities according to their status.
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @param coverageByCycles Mandatory com.hp.alm.otaclient.IList parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @VTID(3)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object getCoverageEntitiesSummary(
            java.lang.String filter,
            com.hp.alm.otaclient.IList coverageByCycles);
    
    /**
     * <p>
     * Sets cycle context for the ReqCoverageFactory to be used in NewList.
     * </p>
     * 
     * @param coverageByCycles Mandatory com.hp.alm.otaclient.IList parameter.
     */
    
    @VTID(4)
    void setCyclesContext(
            com.hp.alm.otaclient.IList coverageByCycles);
    
    /**
     * <p>
     * Resets cycle context.
     * </p>
     */
    
    @VTID(5)
    void resetCyclesContext();
    
    // Properties:
}
