package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a system folder, which is a tree node in the TreeManager object.
 */
@IID("{8538CCBA-0B3E-481F-BB2B-14F0553CA146}")
public interface ISysTreeNode extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The node name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    java.lang.String name();
    
    /**
     * <p>
     * The node name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(8)
    @DefaultMethod
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * Adds a new child node.
     * </p>
     * 
     * @param nodeName Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.ISysTreeNode addNode(
            java.lang.String nodeName);
    
    /**
     * <p>
     * Gets a list of the node's immediate children.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList newList();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object newList(
            int index);
    
    /**
     * <p>
     * The node ID number.
     * </p>
     * <p>
     * Getter method for the COM property "NodeID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    int nodeID();
    
    /**
     * <p>
     * Gets the node attribute.
     * </p>
     * <p>
     * Getter method for the COM property "Attribute"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    int attribute();
    
    /**
     * <p>
     * Finds a child node by node name.
     * </p>
     * 
     * @param childName Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    com.hp.alm.otaclient.ISysTreeNode findChildNode(
            java.lang.String childName);
    
    /**
     * <p>
     * Deletes the specified node.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    void removeNode(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node);
    
    /**
     * <p>
     * The current folder's parent folder.
     * </p>
     * <p>
     * Getter method for the COM property "Father"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    com.hp.alm.otaclient.ISysTreeNode father();
    
    /**
     * <p>
     * Gets a sub-folder of the current folder.
     * </p>
     * <p>
     * Getter method for the COM property "Child"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    com.hp.alm.otaclient.ISysTreeNode child(
            int index);
    
    /**
     * <p>
     * The number of child nodes.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    int count();
    
    /**
     * <p>
     * The sub-tree depth type.
     * </p>
     * <p>
     * Getter method for the COM property "DepthType"
     * </p>
     * 
     * @return Returns a value of type short
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    short depthType();
    
    /**
     * <p>
     * Finds node children according to specified search pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    com.hp.alm.otaclient.IList findChildren(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    /**
     * <p>
     * The folder tree path starting from the tree root.
     * </p>
     * <p>
     * Getter method for the COM property "Path"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String path();
    
    /**
     * <p>
     * Posts all changed values to the database.
     * </p>
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(21)
    void post();
    
    /**
     * <p>
     * Reads the saved node data, overwriting values in memory.
     * </p>
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(22)
    void refresh();
    
    // Properties:
}
