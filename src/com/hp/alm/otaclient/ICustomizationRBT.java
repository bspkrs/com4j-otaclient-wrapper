package com.hp.alm.otaclient;

import com4j.*;

/**
 * Customization of the Risk-based Quality Management mechanism default values.
 */
@IID("{ACAEB7E2-FD86-4A8C-957E-A934FB730219}")
public interface ICustomizationRBT extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The list of Business Criticality questions.
     * </p>
     * <p>
     * Getter method for the COM property "BIQuestions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList biQuestions();
    
    @VTID(7)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object biQuestions(
            int index);
    
    /**
     * <p>
     * Returns the Business Criticality criterion that has the specified ID.
     * </p>
     * <p>
     * Getter method for the COM property "BIQuestionByID"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject biQuestionByID(
            int id);
    
    /**
     * <p>
     * Creates a new Business Criticality criterion.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addBIQuestion();
    
    /**
     * <p>
     * Deletes the specified Business Criticality criterion.
     * </p>
     * 
     * @param id Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void deleteBIQuestion(
            int id);
    
    /**
     * <p>
     * The list of Failure Probability questions.
     * </p>
     * <p>
     * Getter method for the COM property "FPQuestions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList fpQuestions();
    
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fpQuestions(
            int index);
    
    /**
     * <p>
     * Returns the Failure Probability criterion that has the specified ID.
     * </p>
     * <p>
     * Getter method for the COM property "FPQuestionByID"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fpQuestionByID(
            int id);
    
    /**
     * <p>
     * Creates a new Failure Probability criterion.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addFPQuestion();
    
    /**
     * <p>
     * Deletes the specified Failure Probability criterion.
     * </p>
     * 
     * @param id Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(14)
    void deleteFPQuestion(
            int id);
    
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
    @VTID(15)
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
    @VTID(16)
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
    @VTID(17)
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
    @VTID(18)
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
    @VTID(19)
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
    @VTID(20)
    void fpLevelTestingEffortInHours(
            int fpLevel,
            int pHours);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Business Criticality level.
     * </p>
     * <p>
     * Getter method for the COM property "BILevelRiskLowerThreshold"
     * </p>
     * 
     * @param biLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(21)
    int biLevelRiskLowerThreshold(
            int biLevel);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Business Criticality level.
     * </p>
     * <p>
     * Setter method for the COM property "BILevelRiskLowerThreshold"
     * </p>
     * 
     * @param biLevel Mandatory int parameter.
     * @param pLowerThreshold Mandatory int parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(22)
    void biLevelRiskLowerThreshold(
            int biLevel,
            int pLowerThreshold);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Failure Probability level.
     * </p>
     * <p>
     * Getter method for the COM property "FPLevelRiskLowerThreshold"
     * </p>
     * 
     * @param fpLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(23)
    int fpLevelRiskLowerThreshold(
            int fpLevel);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Failure Probability level.
     * </p>
     * <p>
     * Setter method for the COM property "FPLevelRiskLowerThreshold"
     * </p>
     * 
     * @param fpLevel Mandatory int parameter.
     * @param pLowerThreshold Mandatory int parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(24)
    void fpLevelRiskLowerThreshold(
            int fpLevel,
            int pLowerThreshold);
    
    /**
     * <p>
     * The time unit display string for calculations results.
     * </p>
     * <p>
     * Getter method for the COM property "DisplayedTimeUnits"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String displayedTimeUnits();
    
    /**
     * <p>
     * The time unit display string for calculations results.
     * </p>
     * <p>
     * Setter method for the COM property "DisplayedTimeUnits"
     * </p>
     * 
     * @param pDisplayedTimeUnits Mandatory java.lang.String parameter.
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(26)
    void displayedTimeUnits(
            java.lang.String pDisplayedTimeUnits);
    
    /**
     * <p>
     * Indicates if the Risk-based Quality Management Customization has been modified since the last synchronization with the database.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(27)
    boolean updated();
    
    /**
     * <p>
     * Translate Failure Probability from TDAPI_RBT_FP_LEVELS to its name in the database.
     * </p>
     * 
     * @param fpLevelEnum Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String translateFPLevel(
            int fpLevelEnum);
    
    /**
     * <p>
     * Translate Business Criticality from TDAPI_RBT_BI_LEVELS to its name in the database.
     * </p>
     * 
     * @param biLevelEnum Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String translateBILevel(
            int biLevelEnum);
    
    /**
     * <p>
     * Translate TL from TDAPI_RBT_TESTING_LEVELS to it's name in the database.
     * </p>
     * 
     * @param testingLevelEnum Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(42)
    //= 0x2a. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String translateTestingLevel(
            int testingLevelEnum);
    
    /**
     * <p>
     * Calculate the Business Criticality level from the sum of all the values' weights.
     * </p>
     * 
     * @param answersWeight Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(50)
    //= 0x32. The runtime will prefer the VTID if present
    @VTID(31)
    int calcBILevelByAnswersWeight(
            int answersWeight);
    
    /**
     * <p>
     * Calculates the Failure Probability level from the sum of all the values' weights.
     * </p>
     * 
     * @param answersWeight Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(51)
    //= 0x33. The runtime will prefer the VTID if present
    @VTID(32)
    int calcFPLevelByAnswersWeight(
            int answersWeight);
    
    // Properties:
}
