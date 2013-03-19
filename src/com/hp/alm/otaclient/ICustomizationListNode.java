package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a node in a list.
 */
@IID("{18C04A97-2141-4852-8E02-0E79D3CAEAD3}")
public interface ICustomizationListNode extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Adds a new sub-node to the current node.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addChild(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node);
    
    /**
     * <p>
     * Removes the specified sub-node from the current node.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeChild(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node);
    
    /**
     * <p>
     * Gets the specified sub-node.
     * </p>
     * <p>
     * Getter method for the COM property "Child"
     * </p>
     * 
     * @param nodeName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject child(
            java.lang.String nodeName);
    
    /**
     * <p>
     * The list of CustomizationListNode objects that are sub-nodes of the current node.
     * </p>
     * <p>
     * Getter method for the COM property "Children"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList children();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object children(
            int index);
    
    /**
     * <p>
     * The current node name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String name();
    
    /**
     * <p>
     * The current node name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. The current node ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    int id();
    
    /**
     * <p>
     * For HP use. The current node ID.
     * </p>
     * <p>
     * Setter method for the COM property "ID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    void id(
            int pVal);
    
    /**
     * <p>
     * Gets the CustomizationListNode object representing the current node's parent node, or sets a new father, thereby moving the node.
     * </p>
     * <p>
     * Getter method for the COM property "Father"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject father();
    
    /**
     * <p>
     * Gets the CustomizationListNode object representing the current node's parent node, or sets a new father, thereby moving the node.
     * </p>
     * <p>
     * Setter method for the COM property "Father"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    void father(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * Checks if sub-nodes can be added to the current node.
     * </p>
     * <p>
     * Getter method for the COM property "CanAddChild"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    boolean canAddChild();
    
    /**
     * <p>
     * Checks if the current node is read-only.
     * </p>
     * <p>
     * Getter method for the COM property "ReadOnly"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    boolean readOnly();
    
    /**
     * <p>
     * The CustomizationList object that contains the current node.
     * </p>
     * <p>
     * Getter method for the COM property "List"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject list();
    
    /**
     * <p>
     * The number of sub-nodes under the node.
     * </p>
     * <p>
     * Getter method for the COM property "ChildrenCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    int childrenCount();
    
    /**
     * <p>
     * Indicates if the node was modified since it was loaded from the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the node was modified since it was loaded from the server.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * If true, the node is marked for deletion, but the deletion is not yet committed.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(23)
    boolean deleted();
    
    /**
     * <p>
     * If true, the node is marked for deletion, but the deletion is not yet committed.
     * </p>
     * <p>
     * Setter method for the COM property "Deleted"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(24)
    void deleted(
            boolean pVal);
    
    /**
     * <p>
     * The order number of the node within its siblings.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(25)
    int order();
    
    /**
     * <p>
     * The order number of the node within its siblings.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(26)
    void order(
            int pVal);
    
    // Properties:
}
