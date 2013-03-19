package com.hp.alm.otaclient;

import com4j.*;

/**
 * Manages the tests and test sets included in one test set folder.
 */
@IID("{E9E2BCFE-CAAC-492D-A210-C2E49A68C78F}")
public interface ITestSetFolder extends com.hp.alm.otaclient.ISysTreeNode
{
    // Methods:
    /**
     * <p>
     * The test set folder description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(23)
    java.lang.String description();
    
    /**
     * <p>
     * The test set folder description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(24)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The unique parent ID.
     * </p>
     * <p>
     * Getter method for the COM property "FatherID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(25)
    int fatherID();
    
    /**
     * <p>
     * The parent node.
     * </p>
     * <p>
     * Getter method for the COM property "FatherDisp"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fatherDisp();
    
    /**
     * <p>
     * The index of this folder in its parent's list of sub-nodes.
     * </p>
     * <p>
     * Getter method for the COM property "ViewOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(27)
    int viewOrder();
    
    /**
     * <p>
     * The index of this folder in its parent's list of sub-nodes.
     * </p>
     * <p>
     * Setter method for the COM property "ViewOrder"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @VTID(28)
    void viewOrder(
            int pVal);
    
    /**
     * <p>
     * The list of child nodes.
     * </p>
     * <p>
     * Getter method for the COM property "SubNodes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(29)
    com.hp.alm.otaclient.IList subNodes();
    
    @VTID(29)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object subNodes(
            int index);
    
    /**
     * <p>
     * Adds a new child node.
     * </p>
     * 
     * @param nodeName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addNodeDisp(
            java.lang.String nodeName);
    
    /**
     * <p>
     * Deletes a test set folder node.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     * @param deleteTestSets Optional parameter. Default value is false
     */
    
    @VTID(31)
    void removeNodeEx(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node,
            @Optional @DefaultValue("0") boolean deleteTestSets);
    
    /**
     * <p>
     * Moves folder node under new father.
     * </p>
     * 
     * @param father Mandatory java.lang.Object parameter.
     */
    
    @VTID(32)
    void move(
            @MarshalAs(NativeType.VARIANT) java.lang.Object father);
    
    /**
     * <p>
     * Gets the TestSetFactory for the folder.
     * </p>
     * <p>
     * Getter method for the COM property "TestSetFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testSetFactory();
    
    /**
     * <p>
     * Checks if this folder has at least one attachment.
     * </p>
     * <p>
     * Getter method for the COM property "HasAttachment"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(34)
    boolean hasAttachment();
    
    /**
     * <p>
     * The folder's AttachmentFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "Attachments"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachments();
    
    /**
     * <p>
     * Gets the list of test sets contained in the folder that match the specified pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(36)
    com.hp.alm.otaclient.IList findTestSets(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    // Properties:
}
