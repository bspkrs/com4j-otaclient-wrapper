package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Cross-Project service API.
 */
@IID("{9EF01CB3-549B-4F0B-9AD9-634916324844}")
public interface ICrossProjectAPI extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Return a list of lists. Each list contains the intersection of fields of a specific entity in the specified projects. Each entity in
     * the specified list of entities has it's own list of fields.
     * </p>
     * 
     * @param pProjectIds Mandatory com.hp.alm.otaclient.IList parameter.
     * @param pEntityTypes Mandatory com.hp.alm.otaclient.IList parameter.
     * @param entityFieldComparisonStrategy Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList getEntitiesFieldIntersection(
            com.hp.alm.otaclient.IList pProjectIds,
            com.hp.alm.otaclient.IList pEntityTypes,
            int entityFieldComparisonStrategy);
    
    // Properties:
}
