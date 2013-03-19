package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for performing policy enforcement (Cross Project Customization) operations.
 */
@IID("{BA6B81E9-5244-476B-AE23-FBA6980356F9}")
public interface ITemplateManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The list of projects linked to this template.
     * </p>
     * <p>
     * Getter method for the COM property "LinkedProjects"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList linkedProjects();
    
    @VTID(7)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object linkedProjects(
            int index);
    
    /**
     * <p>
     * Verifies the template's customization against a linked project (perform conflicts analysis).
     * </p>
     * <p>
     * Getter method for the COM property "AnalyzePolicy"
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @param projectName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int analyzePolicy(
            java.lang.String domainName,
            java.lang.String projectName);
    
    /**
     * <p>
     * Propagates (applies) the template's customization to a linked project.
     * </p>
     * <p>
     * Getter method for the COM property "EnforcePolicy"
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @param projectName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int enforcePolicy(
            java.lang.String domainName,
            java.lang.String projectName);
    
    // Properties:
}
