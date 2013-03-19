package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Manages the extension tree and its related extension folders.
 */
@IID("{0225839A-79F8-4493-872C-004FFDDF0CA1}")
public interface IBaseHierarchyTreeManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The extension tree root node.
     * </p>
     * <p>
     * Getter method for the COM property "Root"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject root();
    
    /**
     * <p>
     * Gets the extension tree node from the specified tree path.
     * </p>
     * <p>
     * Getter method for the COM property "NodeByPath"
     * </p>
     * 
     * @param path Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject nodeByPath(
            java.lang.String path);
    
    /**
     * <p>
     * Gets the extension tree node object corresponding to the specified node ID.
     * </p>
     * <p>
     * Getter method for the COM property "NodeById"
     * </p>
     * 
     * @param nodeID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject nodeById(
            int nodeID);
    
    /**
     * <p>
     * Gets an unattached folder.
     * </p>
     * <p>
     * Getter method for the COM property "Unattached"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject unattached();
    
    // Properties:
}
