package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. _ITreeNode Interface.
 */
@IID("{81113FC0-ECB4-43E5-AEF6-BFEEC9560CB4}")
public interface _ITreeNode extends Com4jObject
{
    // Methods:
    /**
     * @return Returns a value of type int
     */
    
    @VTID(3)
    int _GetFatherID_();
    
    /**
     * @param childName Mandatory java.lang.String parameter.
     * @param recusive Mandatory boolean parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @VTID(4)
    com.hp.alm.otaclient.ISysTreeNode _FindChildNode_(
            java.lang.String childName,
            boolean recusive);
    
    /**
     * @return Returns a value of type boolean
     */
    
    @VTID(5)
    boolean _IsInitialized_();
    
    /**
     * @param nodeData Mandatory java.lang.String parameter.
     */
    
    @VTID(6)
    void _SetNodeData_(
            java.lang.String nodeData);
    
    /**
     * @param node Mandatory com4j.Com4jObject parameter.
     * @param order Mandatory boolean parameter.
     */
    
    @VTID(7)
    void _MoveChild(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject node,
            boolean order);
    
    // Properties:
}
