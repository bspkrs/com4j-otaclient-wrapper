package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents Risk-based Quality Management analysis capabilities for the Req coclass.
 */
@IID("{C4BFEF87-D2BB-487F-B149-65B892644DFB}")
public interface ISupportRBTAnalysisParent extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Do analysis, create analysis results, but do not save testing levels in children yet.
     * </p>
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void analyzeButDontSave();
    
    /**
     * <p>
     * Do analysis, create analysis results and save testing levels for all child Req objects.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void analyzeAndSave();
    
    /**
     * <p>
     * Use current policy matrix and re-apply it on the aggregated counts matrix to calculate total analyzed requirements duration.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void applyPolicyOnResultMatix();
    
    /**
     * <p>
     * Risk testing level matrix.
     * </p>
     * <p>
     * Getter method for the COM property "TestingPolicyMatrix"
     * </p>
     * 
     * @param riskLevel Mandatory int parameter.
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(10)
    int testingPolicyMatrix(
            int riskLevel,
            int fcLevel);
    
    /**
     * <p>
     * Risk testing level matrix.
     * </p>
     * <p>
     * Setter method for the COM property "TestingPolicyMatrix"
     * </p>
     * 
     * @param riskLevel Mandatory int parameter.
     * @param fcLevel Mandatory int parameter.
     * @param pTestingLevel Mandatory int parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(11)
    void testingPolicyMatrix(
            int riskLevel,
            int fcLevel,
            int pTestingLevel);
    
    /**
     * <p>
     * Testing level percentage (of the full testing level).
     * </p>
     * <p>
     * Getter method for the COM property "TestingLevelPercentage"
     * </p>
     * 
     * @param testingLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(12)
    int testingLevelPercentage(
            int testingLevel);
    
    /**
     * <p>
     * Testing level percentage (of the full testing level).
     * </p>
     * <p>
     * Setter method for the COM property "TestingLevelPercentage"
     * </p>
     * 
     * @param testingLevel Mandatory int parameter.
     * @param pPercentage Mandatory int parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(13)
    void testingLevelPercentage(
            int testingLevel,
            int pPercentage);
    
    /**
     * <p>
     * Obsolete. Returns E_NOTIMPL.
     * </p>
     * <p>
     * Getter method for the COM property "FPLevelTestingEffortInHours"
     * </p>
     * 
     * @param fpLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(14)
    int fpLevelTestingEffortInHours(
            int fpLevel);
    
    /**
     * <p>
     * Obsolete. Returns E_NOTIMPL.
     * </p>
     * <p>
     * Setter method for the COM property "FPLevelTestingEffortInHours"
     * </p>
     * 
     * @param fpLevel Mandatory int parameter.
     * @param pHours Mandatory int parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(15)
    void fpLevelTestingEffortInHours(
            int fpLevel,
            int pHours);
    
    /**
     * <p>
     * Available time for this Risk-based Quality Management Analysis.
     * </p>
     * <p>
     * Getter method for the COM property "AvailableTimeInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(16)
    int availableTimeInHours();
    
    /**
     * <p>
     * Available time for this Risk-based Quality Management Analysis.
     * </p>
     * <p>
     * Setter method for the COM property "AvailableTimeInHours"
     * </p>
     * 
     * @param pHours Mandatory int parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(17)
    void availableTimeInHours(
            int pHours);
    
    /**
     * <p>
     * The filter used for the Analysis.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String analysisFilter();
    
    /**
     * <p>
     * The filter used for the Analysis.
     * </p>
     * <p>
     * Setter method for the COM property "AnalysisFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(19)
    void analysisFilter(
            java.lang.String pVal);
    
    /**
     * <p>
     * Calculated time needed to test a requirement in the given Risk and Functional Complexity, according to the current policy.
     * </p>
     * <p>
     * Getter method for the COM property "TestingEffortInHoursFromPolicyMatrix"
     * </p>
     * 
     * @param riskLevel Mandatory int parameter.
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(20)
    int testingEffortInHoursFromPolicyMatrix(
            int riskLevel,
            int fcLevel);
    
    /**
     * <p>
     * Checks whether the parent requirement has valid Risk-based Quality Management analysis result data.
     * </p>
     * <p>
     * Getter method for the COM property "IsAnalyzed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(21)
    boolean isAnalyzed();
    
    /**
     * <p>
     * Time it would take to test the requirements with CustomTestingLevel with this policy set in the related Risk-based Quality Management
     * Analysis setup.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultCustomizedDurationInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(22)
    int analysisResultCustomizedDurationInHours();
    
    /**
     * <p>
     * Time it would take to test the requirements without CustomTestingLevel. That is, with the regular analyzed requirements, with this
     * policy set in the related Risk-based Quality Management Analysis setup.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultAnalyzedDurationInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(23)
    int analysisResultAnalyzedDurationInHours();
    
    /**
     * <p>
     * The Date/Time of the last analysis done on this parent requirement.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultLastAnalysisDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(24)
    java.util.Date analysisResultLastAnalysisDate();
    
    /**
     * <p>
     * Time it would take RnD to handle this requirement, as simple aggregative addition of RND efforts set in children that were visited in
     * last analysis.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultAggregatedRNDEffortsInHours"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(25)
    int analysisResultAggregatedRNDEffortsInHours();
    
    /**
     * <p>
     * Count of all child requirements ignored in last analysis.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultCountIgnoredRequirements"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(26)
    int analysisResultCountIgnoredRequirements();
    
    /**
     * <p>
     * Count of all child requirements visited in last analysis that their Testing Efforts were customized (not set by analysis).
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultCountCustomizedRequirements"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(27)
    int analysisResultCountCustomizedRequirements();
    
    /**
     * <p>
     * Count of all child requirements visited in last analysis that could not be analyzed due to missing Assessment or incomplete custom
     * effort.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultCountUnanalyzableRequirements"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(28)
    int analysisResultCountUnanalyzableRequirements();
    
    /**
     * <p>
     * For each possible risk (pair of Risk and FC levels) - return the total Count of child requirements that were visited in last analysis
     * and that are assessed to be in this Risk (Pair), and their Efforts were not customized.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisResultCountNonCustomizedRequirements"
     * </p>
     * 
     * @param riskLevel Mandatory int parameter.
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(29)
    int analysisResultCountNonCustomizedRequirements(
            int riskLevel,
            int fcLevel);
    
    /**
     * <p>
     * Copy the policy from customization.
     * </p>
     */
    
    @DISPID(50)
    //= 0x32. The runtime will prefer the VTID if present
    @VTID(30)
    void resetPolicyToDefaults();
    
    // Properties:
}
