package com.hp.alm.otaclient;

import com4j.*;

/**
 * The Test subject tree manager.
 */
@IID("{E60B4439-691C-433D-B6D9-793044915A01}")
public interface ITreeManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The root node specified by the node name.
     * </p>
     * <p>
     * Getter method for the COM property "TreeRoot"
     * </p>
     * 
     * @param rootName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject treeRoot(
            java.lang.String rootName);
    
    /**
     * <p>
     * Gets the node path, slash separated.
     * </p>
     * <p>
     * Getter method for the COM property "NodePath"
     * </p>
     * 
     * @param nodeID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String nodePath(
            int nodeID);
    
    /**
     * <p>
     * Gets the node at the specified tree path.
     * </p>
     * <p>
     * Getter method for the COM property "NodeByPath"
     * </p>
     * 
     * @param path Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject nodeByPath(
            java.lang.String path);
    
    /**
     * <p>
     * Gets the object having the specified node ID.
     * </p>
     * <p>
     * Getter method for the COM property "NodeById"
     * </p>
     * 
     * @param nodeID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject nodeById(
            int nodeID);
    
    /**
     * <p>
     * Gets list of available trees in the specified range.
     * </p>
     * <p>
     * Getter method for the COM property "RootList"
     * </p>
     * 
     * @param val Optional parameter. Default value is 0
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList rootList(
            @Optional @DefaultValue("0") short val);
    
    // Properties:
}
