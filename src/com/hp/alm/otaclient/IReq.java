package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a requirement for which testing must be performed.
 */
@IID("{4592C936-2524-4D05-9978-95901EDE0A54}")
public interface IReq extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The Requirement name as seen in the tree.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The Requirement name as seen in the tree.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The comment associated with this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "Comment"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String comment();
    
    /**
     * <p>
     * The comment associated with this requirement.
     * </p>
     * <p>
     * Setter method for the COM property "Comment"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void comment(
            java.lang.String pVal);
    
    /**
     * <p>
     * The product name for which the requirement is set.
     * </p>
     * <p>
     * Getter method for the COM property "Product"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String product();
    
    /**
     * <p>
     * The product name for which the requirement is set.
     * </p>
     * <p>
     * Setter method for the COM property "Product"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void product(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the requirement type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String type();
    
    /**
     * <p>
     * The name of the requirement type.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    void type(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the requirement author.
     * </p>
     * <p>
     * Getter method for the COM property "Author"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String author();
    
    /**
     * <p>
     * The name of the requirement author.
     * </p>
     * <p>
     * Setter method for the COM property "Author"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(33)
    void author(
            java.lang.String pVal);
    
    /**
     * <p>
     * The number of direct children.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(34)
    int count();
    
    /**
     * <p>
     * The requirement priority.
     * </p>
     * <p>
     * Getter method for the COM property "Priority"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String priority();
    
    /**
     * <p>
     * The requirement priority.
     * </p>
     * <p>
     * Setter method for the COM property "Priority"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(36)
    void priority(
            java.lang.String pVal);
    
    /**
     * <p>
     * The status of the tests that cover this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(37)
    java.lang.String status();
    
    /**
     * <p>
     * The review status.
     * </p>
     * <p>
     * Getter method for the COM property "Reviewed"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(38)
    java.lang.String reviewed();
    
    /**
     * <p>
     * The review status.
     * </p>
     * <p>
     * Setter method for the COM property "Reviewed"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(39)
    void reviewed(
            java.lang.String pVal);
    
    /**
     * <p>
     * Assigns a test to cover this requirement.
     * </p>
     * 
     * @param testId Mandatory int parameter.
     * @param order Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(40)
    int addCoverage(
            int testId,
            int order);
    
    /**
     * <p>
     * Assigns all the tests in the specified subject folder to cover this current requirement.
     * </p>
     * 
     * @param subjectID Mandatory int parameter.
     * @param order Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(41)
    int addCoverageEx(
            int subjectID,
            int order);
    
    /**
     * <p>
     * Removes a test from the list of tests that cover this requirement.
     * </p>
     * 
     * @param vTest Mandatory java.lang.Object parameter.
     * @param recursive Optional parameter. Default value is false
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(42)
    void removeCoverage(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vTest,
            @Optional @DefaultValue("0") boolean recursive);
    
    /**
     * <p>
     * Gets a list of the tests that cover this requirement.
     * </p>
     * 
     * @param recursive Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(43)
    com.hp.alm.otaclient.IList getCoverList(
            @Optional @DefaultValue("0") boolean recursive);
    
    /**
     * <p>
     * The paragraph number or numeration of the requirement.
     * </p>
     * <p>
     * Getter method for the COM property "Paragraph"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(44)
    java.lang.String paragraph();
    
    /**
     * <p>
     * The path of the node containing this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "Path"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(45)
    java.lang.String path();
    
    /**
     * <p>
     * The requirement is covered by at least one test.
     * </p>
     * <p>
     * Getter method for the COM property "HasCoverage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(46)
    boolean hasCoverage();
    
    /**
     * <p>
     * Moves a requirement to being a child of a specified father in the requirements tree.
     * </p>
     * 
     * @param newFatherId Mandatory int parameter.
     * @param newOrder Mandatory int parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(47)
    void move(
            int newFatherId,
            int newOrder);
    
    /**
     * <p>
     * No longer in use.
     * </p>
     * <p>
     * Getter method for the COM property "IsFolder"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(48)
    boolean isFolder();
    
    /**
     * <p>
     * No longer in use.
     * </p>
     * <p>
     * Setter method for the COM property "IsFolder"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(49)
    void isFolder(
            boolean pVal);
    
    /**
     * <p>
     * For HP use. The ReqSummaryStatus object.
     * </p>
     * <p>
     * Getter method for the COM property "ReqSummaryStatus"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(50)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reqSummaryStatus();
    
    /**
     * <p>
     * For HP use. The requirement coverage.
     * </p>
     * <p>
     * Getter method for the COM property "ReqCoverageStatus"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(51)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reqCoverageStatus();
    
    /**
     * <p>
     * Adds the tests from the specified subject that match the input filter to the list of tests that cover the current requirement.
     * </p>
     * 
     * @param subjectID Mandatory int parameter.
     * @param order Mandatory int parameter.
     * @param testFilter Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(52)
    int addCoverageByFilter(
            int subjectID,
            int order,
            java.lang.String testFilter);
    
    /**
     * <p>
     * Gets the list of all tests that cover the current requirement and match the filter.
     * </p>
     * 
     * @param testFilter Mandatory java.lang.String parameter.
     * @param recursive Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(53)
    com.hp.alm.otaclient.IList getCoverListByFilter(
            java.lang.String testFilter,
            @Optional @DefaultValue("0") boolean recursive);
    
    // Properties:
}
