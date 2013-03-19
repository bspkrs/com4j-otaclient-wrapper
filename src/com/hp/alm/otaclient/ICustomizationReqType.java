package com.hp.alm.otaclient;

import com4j.*;

/**
 * A Customization type of the requirement entity.
 */
@IID("{05518018-2339-4E08-87BE-D14C69527B7A}")
public interface ICustomizationReqType extends com.hp.alm.otaclient.ICustomizationType
{
    // Methods:
    /**
     * <p>
     * Indicates if this requirement type supports direct coverage by tests or test instances.
     * </p>
     * <p>
     * Getter method for the COM property "HasDirectCoverage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(20)
    boolean hasDirectCoverage();
    
    /**
     * <p>
     * Indicates if this requirement type supports direct coverage by tests or test instances.
     * </p>
     * <p>
     * Setter method for the COM property "HasDirectCoverage"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(21)
    void hasDirectCoverage(
            boolean pVal);
    
    /**
     * <p>
     * The Type of the Risk Analysis that is applicable to this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "RiskAnalysisType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(22)
    int riskAnalysisType();
    
    /**
     * <p>
     * The Type of the Risk Analysis that is applicable to this requirement.
     * </p>
     * <p>
     * Setter method for the COM property "RiskAnalysisType"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(23)
    void riskAnalysisType(
            int pVal);
    
    // Properties:
}
