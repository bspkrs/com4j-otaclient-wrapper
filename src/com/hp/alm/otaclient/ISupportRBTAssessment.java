package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents Risk-based Quality Management assessment capabilities for the Req coclass.
 */
@IID("{7D7FDD57-E6B0-4CD5-BB97-0D2DFFD2DD70}")
public interface ISupportRBTAssessment extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The chosen value to this Business Criticality criterion for this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "BIChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int biChosenAnswerForQuestion(
            int questionID);
    
    /**
     * <p>
     * The chosen value to this Business Criticality criterion for this requirement.
     * </p>
     * <p>
     * Setter method for the COM property "BIChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @param pAnswerID Mandatory int parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void biChosenAnswerForQuestion(
            int questionID,
            int pAnswerID);
    
    /**
     * <p>
     * Assess the Business Criticality risk level for this requirement, according to the values provided.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void assessBILevel();
    
    /**
     * <p>
     * Business Criticality risk level for this requirement, from the last time we called AssessBILevel.
     * </p>
     * <p>
     * Getter method for the COM property "AssessedBILevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String assessedBILevel();
    
    /**
     * <p>
     * Does this requirement have a custom Business Criticality level?
     * </p>
     * <p>
     * Getter method for the COM property "UseCustomBILevel"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    boolean useCustomBILevel();
    
    /**
     * <p>
     * Does this requirement have a custom Business Criticality level?
     * </p>
     * <p>
     * Setter method for the COM property "UseCustomBILevel"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void useCustomBILevel(
            boolean pVal);
    
    /**
     * <p>
     * Custom Business Criticality level, overrides the assessed level.
     * </p>
     * <p>
     * Getter method for the COM property "CustomBILevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String customBILevel();
    
    /**
     * <p>
     * Custom Business Criticality level, overrides the assessed level.
     * </p>
     * <p>
     * Setter method for the COM property "CustomBILevel"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void customBILevel(
            java.lang.String pVal);
    
    /**
     * <p>
     * Effective Business Criticality level.
     * </p>
     * <p>
     * Getter method for the COM property "EffectiveBILevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String effectiveBILevel();
    
    /**
     * <p>
     * The chosen value to this Failure Probability criterion for this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "FPChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(16)
    int fpChosenAnswerForQuestion(
            int questionID);
    
    /**
     * <p>
     * The chosen value to this Failure Probability criterion for this requirement.
     * </p>
     * <p>
     * Setter method for the COM property "FPChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @param pAnswerID Mandatory int parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(17)
    void fpChosenAnswerForQuestion(
            int questionID,
            int pAnswerID);
    
    /**
     * <p>
     * Assess the Failure Probability risk level for this requirement, according to the values provided.
     * </p>
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(18)
    void assessFPLevel();
    
    /**
     * <p>
     * Failure Probability risk level for this requirement, from the last time we called AssessFPLevel.
     * </p>
     * <p>
     * Getter method for the COM property "AssessedFPLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String assessedFPLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Failure Probability level?
     * </p>
     * <p>
     * Getter method for the COM property "UseCustomFPLevel"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    boolean useCustomFPLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Failure Probability level?
     * </p>
     * <p>
     * Setter method for the COM property "UseCustomFPLevel"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void useCustomFPLevel(
            boolean pVal);
    
    /**
     * <p>
     * Custom Failure Probability level, overrides the assessed level.
     * </p>
     * <p>
     * Getter method for the COM property "CustomFPLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String customFPLevel();
    
    /**
     * <p>
     * Custom Failure Probability level, overrides the assessed level.
     * </p>
     * <p>
     * Setter method for the COM property "CustomFPLevel"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void customFPLevel(
            java.lang.String pVal);
    
    /**
     * <p>
     * Effective Failure Probability level.
     * </p>
     * <p>
     * Getter method for the COM property "EffectiveFPLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String effectiveFPLevel();
    
    // Properties:
}
