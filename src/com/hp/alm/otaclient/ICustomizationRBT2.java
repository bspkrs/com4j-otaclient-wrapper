package com.hp.alm.otaclient;

import com4j.*;

/**
 * Customization of the Risk-based Quality Management mechanism default values.
 */
@IID("{8E64DE7A-F1C5-4EBF-925F-99441FE856FB}")
public interface ICustomizationRBT2 extends com.hp.alm.otaclient.ICustomizationRBT
{
    // Methods:
    /**
     * <p>
     * The list of Functional Complexity questions.
     * </p>
     * <p>
     * Getter method for the COM property "FCQuestions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(60)
    //= 0x3c. The runtime will prefer the VTID if present
    @VTID(33)
    com.hp.alm.otaclient.IList fcQuestions();
    
    @VTID(33)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fcQuestions(
            int index);
    
    /**
     * <p>
     * Returns the Functional Complexity criterion that has the specified ID.
     * </p>
     * <p>
     * Getter method for the COM property "FCQuestionByID"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(61)
    //= 0x3d. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fcQuestionByID(
            int id);
    
    /**
     * <p>
     * Creates a new Functional Complexity criterion.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(62)
    //= 0x3e. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addFCQuestion();
    
    /**
     * <p>
     * Deletes the specified Functional Complexity criterion.
     * </p>
     * 
     * @param id Mandatory int parameter.
     */
    
    @DISPID(63)
    //= 0x3f. The runtime will prefer the VTID if present
    @VTID(36)
    void deleteFCQuestion(
            int id);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Functional Complexity level.
     * </p>
     * <p>
     * Getter method for the COM property "FCLevelRiskLowerThreshold"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(64)
    //= 0x40. The runtime will prefer the VTID if present
    @VTID(37)
    int fcLevelRiskLowerThreshold(
            int fcLevel);
    
    /**
     * <p>
     * The lower threshold of Risk assessment for each Functional Complexity level.
     * </p>
     * <p>
     * Setter method for the COM property "FCLevelRiskLowerThreshold"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @param pLowerThreshold Mandatory int parameter.
     */
    
    @DISPID(64)
    //= 0x40. The runtime will prefer the VTID if present
    @VTID(38)
    void fcLevelRiskLowerThreshold(
            int fcLevel,
            int pLowerThreshold);
    
    /**
     * <p>
     * Translate Functional Complexity from TDAPI_RBT_FC_LEVELS to its name in the database.
     * </p>
     * 
     * @param fcLevelEnum Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(65)
    //= 0x41. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String translateFCLevel(
            int fcLevelEnum);
    
    /**
     * <p>
     * Calculate the Functional Complexity level from the sum of all the values' weights.
     * </p>
     * 
     * @param answersWeight Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(66)
    //= 0x42. The runtime will prefer the VTID if present
    @VTID(40)
    int calcFCLevelByAnswersWeight(
            int answersWeight);
    
    /**
     * <p>
     * Risk calculation matrix.
     * </p>
     * <p>
     * Getter method for the COM property "RiskCalculationMatrix"
     * </p>
     * 
     * @param biLevel Mandatory int parameter.
     * @param fpLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(67)
    //= 0x43. The runtime will prefer the VTID if present
    @VTID(41)
    int riskCalculationMatrix(
            int biLevel,
            int fpLevel);
    
    /**
     * <p>
     * Risk calculation matrix.
     * </p>
     * <p>
     * Setter method for the COM property "RiskCalculationMatrix"
     * </p>
     * 
     * @param biLevel Mandatory int parameter.
     * @param fpLevel Mandatory int parameter.
     * @param pRiskLevel Mandatory int parameter.
     */
    
    @DISPID(67)
    //= 0x43. The runtime will prefer the VTID if present
    @VTID(42)
    void riskCalculationMatrix(
            int biLevel,
            int fpLevel,
            int pRiskLevel);
    
    /**
     * <p>
     * Translate Failure Probability from its name in the database to TDAPI_RBT_FP_LEVELS.
     * </p>
     * 
     * @param fpLevel Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(68)
    //= 0x44. The runtime will prefer the VTID if present
    @VTID(43)
    int translateFPLevelDBNameToEnum(
            java.lang.String fpLevel);
    
    /**
     * <p>
     * Translate Business Criticality from its name in the database to TDAPI_RBT_BI_LEVELS.
     * </p>
     * 
     * @param biLevel Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(69)
    //= 0x45. The runtime will prefer the VTID if present
    @VTID(44)
    int translateBILevelDBNameToEnum(
            java.lang.String biLevel);
    
    /**
     * <p>
     * Hours needed to test a requirement with the given Functional Complexity.
     * </p>
     * <p>
     * Getter method for the COM property "TestingEffortForFCLevel"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(70)
    //= 0x46. The runtime will prefer the VTID if present
    @VTID(45)
    int testingEffortForFCLevel(
            int fcLevel);
    
    /**
     * <p>
     * Hours needed to test a requirement with the given Functional Complexity.
     * </p>
     * <p>
     * Setter method for the COM property "TestingEffortForFCLevel"
     * </p>
     * 
     * @param fcLevel Mandatory int parameter.
     * @param pHours Mandatory int parameter.
     */
    
    @DISPID(70)
    //= 0x46. The runtime will prefer the VTID if present
    @VTID(46)
    void testingEffortForFCLevel(
            int fcLevel,
            int pHours);
    
    // Properties:
}
