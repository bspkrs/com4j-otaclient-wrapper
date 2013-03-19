package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a requirement that is covered by another entity.
 */
@IID("{F061ABB7-A65F-4146-8621-5A8B04C87B8D}")
public interface ICoverableReq extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Get Requirement Coverage Factory.
     * </p>
     * <p>
     * Getter method for the COM property "RequirementCoverageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject requirementCoverageFactory();
    
    /**
     * <p>
     * Adds the test instance to the list of test instances that cover the current requirement.
     * </p>
     * 
     * @param testInstanceID Mandatory int parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void addTestInstanceToCoverage(
            int testInstanceID);
    
    /**
     * <p>
     * Adds the test to the list of tests that cover the current requirement.
     * </p>
     * 
     * @param testId Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void addTestToCoverage(
            int testId);
    
    /**
     * <p>
     * Adds the test instances from the specified test set that match the input filter to the list of test instances that cover the current
     * requirement.
     * </p>
     * 
     * @param testSetID Mandatory int parameter.
     * @param testInstanceFilter Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void addTestsFromTestSetToCoverage(
            int testSetID,
            java.lang.String testInstanceFilter);
    
    /**
     * <p>
     * Adds the tests from the specified subject that match the input filter to the list of tests that cover the current requirement.
     * </p>
     * 
     * @param subjectID Mandatory int parameter.
     * @param testFilter Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void addSubjectToCoverage(
            int subjectID,
            java.lang.String testFilter);
    
    // Properties:
}
