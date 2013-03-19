package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a subject folder in a Quality Center subject tree.
 */
@IID("{0F500A37-F2F1-4079-9BE7-48C1DA715E27}")
public interface ISubjectNode extends com.hp.alm.otaclient.ISysTreeNode
{
    // Methods:
    /**
     * <p>
     * The TestFactory object for the subject folder.
     * </p>
     * <p>
     * Getter method for the COM property "TestFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testFactory();
    
    /**
     * <p>
     * Removes the specified node from the subject tree.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     * @param deleteTests Optional parameter. Default value is false
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    void removeSubjectNode(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node,
            @Optional @DefaultValue("0") boolean deleteTests);
    
    /**
     * <p>
     * A description of the subject node.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String description();
    
    /**
     * <p>
     * A description of the subject node.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The AttachmentFactory for the subject folder.
     * </p>
     * <p>
     * Getter method for the COM property "Attachments"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachments();
    
    /**
     * <p>
     * Finds tests within the current subject folder whose name matches the specified text pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    com.hp.alm.otaclient.IList findTests(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    /**
     * <p>
     * The position of the node in the tree as presented in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "ViewOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    int viewOrder();
    
    /**
     * <p>
     * The position of the node in the tree as presented in the user interface.
     * </p>
     * <p>
     * Setter method for the COM property "ViewOrder"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    void viewOrder(
            int pVal);
    
    /**
     * <p>
     * Checks if the SubjectNode has at least one attachment.
     * </p>
     * <p>
     * Getter method for the COM property "HasAttachment"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(31)
    boolean hasAttachment();
    
    /**
     * <p>
     * Moves the current tree mode to be under the specified parent.
     * </p>
     * 
     * @param parent Mandatory java.lang.Object parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(32)
    void move(
            @MarshalAs(NativeType.VARIANT) java.lang.Object parent);
    
    // Properties:
}
