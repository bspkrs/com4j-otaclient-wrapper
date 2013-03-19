package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Quality Planning function, convert Entity to Test.
 */
@IID("{1194CDE0-F996-41BE-AE10-EDFFD7587B47}")
public interface IConvertToTestSet extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Converts an Entity to a TestSet.
     * </p>
     * 
     * @param tsFolderFatherId Mandatory int parameter.
     * @param tsFolderName Mandatory java.lang.String parameter.
     * @param testFilter Mandatory java.lang.String parameter.
     * @param groupBy Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    int convertEntityToTestSet(
            int tsFolderFatherId,
            java.lang.String tsFolderName,
            java.lang.String testFilter,
            java.lang.String groupBy);
    
    // Properties:
}
