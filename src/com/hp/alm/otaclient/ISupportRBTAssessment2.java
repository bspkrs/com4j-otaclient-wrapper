package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents Risk-based Quality Management assessment capabilities for the Req coclass.
 */
@IID("{11D45F95-7187-4311-B23D-EB36DDD19178}")
public interface ISupportRBTAssessment2 extends com.hp.alm.otaclient.ISupportRBTAssessment
{
    // Methods:
    /**
     * <p>
     * The chosen value to this Functional Complexity criterion for this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "FCChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(25)
    int fcChosenAnswerForQuestion(
            int questionID);
    
    /**
     * <p>
     * The chosen value to this Functional Complexity criterion for this requirement.
     * </p>
     * <p>
     * Setter method for the COM property "FCChosenAnswerForQuestion"
     * </p>
     * 
     * @param questionID Mandatory int parameter.
     * @param pAnswerID Mandatory int parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    void fcChosenAnswerForQuestion(
            int questionID,
            int pAnswerID);
    
    /**
     * <p>
     * Assess the Functional Complexity risk level for this requirement, according to the values provided.
     * </p>
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    void assessFCLevel();
    
    /**
     * <p>
     * Functional Complexity risk level for this requirement, from the last time we called AssessBILevel.
     * </p>
     * <p>
     * Getter method for the COM property "AssessedFCLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String assessedFCLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Functional Complexity level?
     * </p>
     * <p>
     * Getter method for the COM property "UseCustomFCLevel"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    boolean useCustomFCLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Functional Complexity level?
     * </p>
     * <p>
     * Setter method for the COM property "UseCustomFCLevel"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    void useCustomFCLevel(
            boolean pVal);
    
    /**
     * <p>
     * Custom Functional Complexity level, overrides the assessed level.
     * </p>
     * <p>
     * Getter method for the COM property "CustomFCLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String customFCLevel();
    
    /**
     * <p>
     * Custom Functional Complexity level, overrides the assessed level.
     * </p>
     * <p>
     * Setter method for the COM property "CustomFCLevel"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    void customFCLevel(
            java.lang.String pVal);
    
    /**
     * <p>
     * Effective Functional Complexitylevel.
     * </p>
     * <p>
     * Getter method for the COM property "EffectiveFCLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    java.lang.String effectiveFCLevel();
    
    /**
     * <p>
     * Calculated Risk level for this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "CalculatedRiskLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    java.lang.String calculatedRiskLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Risk level?
     * </p>
     * <p>
     * Getter method for the COM property "UseCustomRiskLevel"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(35)
    boolean useCustomRiskLevel();
    
    /**
     * <p>
     * Does this requirement have a custom Risk level?
     * </p>
     * <p>
     * Setter method for the COM property "UseCustomRiskLevel"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(36)
    void useCustomRiskLevel(
            boolean pVal);
    
    /**
     * <p>
     * Custom Risk level, overrides the assessed level.
     * </p>
     * <p>
     * Getter method for the COM property "CustomRiskLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(37)
    java.lang.String customRiskLevel();
    
    /**
     * <p>
     * Custom Risk level, overrides the assessed level.
     * </p>
     * <p>
     * Setter method for the COM property "CustomRiskLevel"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(38)
    void customRiskLevel(
            java.lang.String pVal);
    
    /**
     * <p>
     * Effective Risk level.
     * </p>
     * <p>
     * Getter method for the COM property "EffectiveRiskLevel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String effectiveRiskLevel();
    
    // Properties:
}
