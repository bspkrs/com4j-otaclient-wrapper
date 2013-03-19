package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for moving requirements.
 */
@IID("{B496D843-987D-4498-B10D-EE9CD66045B6}")
public interface IReqFactory5 extends com.hp.alm.otaclient.IReqFactory4
{
    // Methods:
    /**
     * <p>
     * Moves the requirements to be child nodes of the specified parent.
     * </p>
     * 
     * @param reqIDs Mandatory java.lang.String parameter.
     * @param newPositions Mandatory java.lang.String parameter.
     * @param newParentId Mandatory int parameter.
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(38)
    void moveRequirements(
            java.lang.String reqIDs,
            java.lang.String newPositions,
            int newParentId);
    
    /**
     * <p>
     * For HP use. A filter must be passed, also at least one traceability matrix relation setting.
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @param relationSettings Mandatory com.hp.alm.otaclient.IList parameter.
     * @param statistics Mandatory Holder<com.hp.alm.otaclient.IList> parameter.
     * @param rows Mandatory Holder<com.hp.alm.otaclient.IList> parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(39)
    com.hp.alm.otaclient.IList calculateTraceabilityMatrix(
            java.lang.String filter,
            com.hp.alm.otaclient.IList relationSettings,
            Holder<com.hp.alm.otaclient.IList> statistics,
            Holder<com.hp.alm.otaclient.IList> rows);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param relationName Mandatory java.lang.String parameter.
     * @param logicalCondition Mandatory java.lang.String parameter.
     * @param existInIds Mandatory boolean parameter.
     * @param filter Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ITraceabilityMatrixRelationSettings
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(40)
    com.hp.alm.otaclient.ITraceabilityMatrixRelationSettings createTraceabilityMatrixRelationSettings(
            java.lang.String relationName,
            java.lang.String logicalCondition,
            boolean existInIds,
            java.lang.String filter);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param settings Mandatory com.hp.alm.otaclient.ITraceabilityMatrixRelationSettings parameter.
     * @param reqID Mandatory int parameter.
     * @param tableName Mandatory Holder<java.lang.String> parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(41)
    com.hp.alm.otaclient.IList getLinkedEntities(
            com.hp.alm.otaclient.ITraceabilityMatrixRelationSettings settings,
            int reqID,
            Holder<java.lang.String> tableName);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param reqIDs Mandatory java.lang.String parameter.
     * @param relationSettings Mandatory com.hp.alm.otaclient.IList parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(42)
    com.hp.alm.otaclient.IList getAllLinkedEntities(
            java.lang.String reqIDs,
            com.hp.alm.otaclient.IList relationSettings);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(43)
    java.lang.String downloadExportTraceabilityMatrixTemplateFile();
    
    /**
     * <p>
     * Returns the list of test configurations that cover the requirements that match the requirement filter.
     * </p>
     * 
     * @param reqFilter Mandatory java.lang.String parameter.
     * @param testIDs Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(44)
    com.hp.alm.otaclient.IList getCoverageTestConfigsByReqFilter(
            java.lang.String reqFilter,
            java.lang.String testIDs);
    
    // Properties:
}
