package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents Risk-based Quality Management analysis capabilities for the Req coclass. This class provides services for handling the child
 * requirements affected by the analysis.
 */
@IID("{16E049C8-05E8-4D98-B9F4-CED6BCC763FD}")
public interface ISupportRBTAnalysisChild extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The testing level determined by the last analysis, from 'RBT Testing Levels' in LISTS.
     * </p>
     * <p>
     * Getter method for the COM property "AnalyzedTestingLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String analyzedTestingLevel();
    
    /**
     * <p>
     * The testing effort determined by the last analysis.
     * </p>
     * <p>
     * Getter method for the COM property "AnalyzedTestingEffortInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int analyzedTestingEffortInHours();
    
    /**
     * <p>
     * Does this requirement have a custom Testing Level and Testing Effort?
     * </p>
     * <p>
     * Getter method for the COM property "UseCustomTLAndTE"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(9)
    boolean useCustomTLAndTE();
    
    /**
     * <p>
     * Does this requirement have a custom Testing Level and Testing Effort?
     * </p>
     * <p>
     * Setter method for the COM property "UseCustomTLAndTE"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(10)
    void useCustomTLAndTE(
            boolean pVal);
    
    /**
     * <p>
     * The custom testing level supplied, from 'RBT Testing Levels' in LISTS.
     * </p>
     * <p>
     * Getter method for the COM property "CustomTestingLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String customTestingLevel();
    
    /**
     * <p>
     * The custom testing level supplied, from 'RBT Testing Levels' in LISTS.
     * </p>
     * <p>
     * Setter method for the COM property "CustomTestingLevel"
     * </p>
     * 
     * @param pTestingLevel Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(12)
    void customTestingLevel(
            java.lang.String pTestingLevel);
    
    /**
     * <p>
     * The custom testing effort.
     * </p>
     * <p>
     * Getter method for the COM property "CustomTestingEffortInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(13)
    int customTestingEffortInHours();
    
    /**
     * <p>
     * The custom testing effort.
     * </p>
     * <p>
     * Setter method for the COM property "CustomTestingEffortInHours"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(14)
    void customTestingEffortInHours(
            int pVal);
    
    /**
     * <p>
     * The R&D effort.
     * </p>
     * <p>
     * Getter method for the COM property "RnDEstimatedEffortInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(15)
    int rnDEstimatedEffortInHours();
    
    /**
     * <p>
     * The R&D effort.
     * </p>
     * <p>
     * Setter method for the COM property "RnDEstimatedEffortInHours"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(16)
    void rnDEstimatedEffortInHours(
            int pVal);
    
    /**
     * <p>
     * Should this requirement be excluded in Risk-based Quality Management analysis?
     * </p>
     * <p>
     * Getter method for the COM property "IgnoreInAnalysis"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(17)
    boolean ignoreInAnalysis();
    
    /**
     * <p>
     * Should this requirement be excluded in Risk-based Quality Management analysis?
     * </p>
     * <p>
     * Setter method for the COM property "IgnoreInAnalysis"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(18)
    void ignoreInAnalysis(
            boolean pVal);
    
    /**
     * <p>
     * The parent requirement for the current Risk-based Quality Management Analysis.
     * </p>
     * <p>
     * Getter method for the COM property "ParentRequirementForRBTAnalysis"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(50)
    //= 0x32. The runtime will prefer the VTID if present
    @VTID(19)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parentRequirementForRBTAnalysis();
    
    // Properties:
}
