package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a planning test.
 */
@IID("{4777BC00-DDBD-4DBD-ACE6-BEAE379E2051}")
public interface ITest extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The full file system path for the test.
     * </p>
     * <p>
     * Getter method for the COM property "FullPath"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String fullPath();
    
    /**
     * <p>
     * The test type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String type();
    
    /**
     * <p>
     * The test type.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    void type(
            java.lang.String pVal);
    
    /**
     * <p>
     * The test name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String name();
    
    /**
     * <p>
     * The test name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The design steps factory for the current test.
     * </p>
     * <p>
     * Getter method for the COM property "DesignStepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject designStepFactory();
    
    /**
     * <p>
     * The number of design steps in the test.
     * </p>
     * <p>
     * Getter method for the COM property "DesStepsNum"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    int desStepsNum();
    
    /**
     * <p>
     * Adds the specified requirement to the list of requirements covered by this test.
     * </p>
     * 
     * @param req Mandatory java.lang.Object parameter.
     * @param order Mandatory int parameter.
     * @param recursive Mandatory boolean parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    int coverRequirement(
            @MarshalAs(NativeType.VARIANT) java.lang.Object req,
            int order,
            boolean recursive);
    
    /**
     * <p>
     * Removes a requirement from the list of requirements this test covers.
     * </p>
     * 
     * @param req Mandatory java.lang.Object parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    void removeCoverage(
            @MarshalAs(NativeType.VARIANT) java.lang.Object req);
    
    /**
     * <p>
     * Gets the list of all requirements covered by this test.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    com.hp.alm.otaclient.IList getCoverList();
    
    @VTID(33)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object getCoverList(
            int index);
    
    /**
     * <p>
     * The Extended Storage object for the current test.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extendedStorage();
    
    /**
     * <p>
     * The test execution status.
     * </p>
     * <p>
     * Getter method for the COM property "ExecStatus"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String execStatus();
    
    /**
     * <p>
     * Checks if the test covers at least one requirement.
     * </p>
     * <p>
     * Getter method for the COM property "HasCoverage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(36)
    boolean hasCoverage();
    
    /**
     * <p>
     * The last Run object for this test.
     * </p>
     * <p>
     * Getter method for the COM property "LastRun"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject lastRun();
    
    /**
     * <p>
     * The test execution date and time.
     * </p>
     * <p>
     * Getter method for the COM property "ExecDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(38)
    java.util.Date execDate();
    
    /**
     * <p>
     * Indicates if this test is a template test.
     * </p>
     * <p>
     * Getter method for the COM property "TemplateTest"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(39)
    boolean templateTest();
    
    /**
     * <p>
     * Indicates if this test is a template test.
     * </p>
     * <p>
     * Setter method for the COM property "TemplateTest"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(40)
    void templateTest(
            boolean pVal);
    
    /**
     * <p>
     * Deprecated. Use TestParameterFactory of ISupportTestParameters. The current test parameters.
     * </p>
     * <p>
     * Getter method for the COM property "Params"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(41)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject params();
    
    /**
     * <p>
     * Checks if the test has at least one parameter.
     * </p>
     * <p>
     * Getter method for the COM property "HasParam"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(42)
    boolean hasParam();
    
    /**
     * <p>
     * The VCS version control object for this test.
     * </p>
     * <p>
     * Getter method for the COM property "VCS"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(43)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject vcs();
    
    /**
     * <p>
     * The checkout path for the test.
     * </p>
     * <p>
     * Getter method for the COM property "CheckoutPathIfExist"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(44)
    java.lang.String checkoutPathIfExist();
    
    /**
     * <p>
     * For HP use. Indicates whether to ignore hidden user group data when retrieving tests from the server.
     * </p>
     * <p>
     * Getter method for the COM property "IgnoreDataHiding"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(45)
    boolean ignoreDataHiding();
    
    /**
     * <p>
     * For HP use. Indicates whether to ignore hidden user group data when retrieving tests from the server.
     * </p>
     * <p>
     * Setter method for the COM property "IgnoreDataHiding"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(46)
    void ignoreDataHiding(
            boolean pVal);
    
    /**
     * <p>
     * For HP future use.
     * </p>
     * <p>
     * Getter method for the COM property "FullPathEx"
     * </p>
     * 
     * @param isOrgFullPath Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(47)
    java.lang.String fullPathEx(
            int isOrgFullPath);
    
    // Properties:
}
