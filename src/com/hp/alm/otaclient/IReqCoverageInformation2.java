package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing requirement coverage information.
 */
@IID("{16075B49-4CDD-4E6A-B60C-5D2D13BCCE90}")
public interface IReqCoverageInformation2 extends com.hp.alm.otaclient.IReqCoverageInformation
{
    // Methods:
    /**
     * <p>
     * For HP use. Returns the amount of covering enitities according to their status.
     * </p>
     * 
     * @param reqFilter Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @VTID(6)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object getCoverageEntitiesSummaryByCoverageFilter(
            java.lang.String reqFilter);
    
    // Properties:
}
