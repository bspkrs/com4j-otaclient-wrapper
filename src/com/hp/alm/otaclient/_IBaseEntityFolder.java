package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. _IBaseEntityFolder Interface.
 */
@IID("{93E2B82D-3DB2-4D46-97D5-BCFCAB106BDF}")
public interface _IBaseEntityFolder extends Com4jObject
{
    // Methods:
    /**
     * @param childName Mandatory java.lang.String parameter.
     * @param recursive Mandatory boolean parameter.
     * @param pNode Mandatory Holder<com.hp.alm.otaclient.IBaseEntityFolder> parameter.
     * @param pIndex Mandatory Holder<Integer> parameter.
     */
    
    @VTID(3)
    void _FindChildNode_(
            java.lang.String childName,
            boolean recursive,
            Holder<com.hp.alm.otaclient.IBaseEntityFolder> pNode,
            Holder<Integer> pIndex);
    
    /**
     * @return Returns a value of type boolean
     */
    
    @VTID(4)
    boolean _IsInitialized_();
    
    /**
     * @param nodeData Mandatory java.lang.String parameter.
     */
    
    @VTID(5)
    void _SetNodeData_(
            java.lang.String nodeData);
    
    /**
     * @param node Mandatory com4j.Com4jObject parameter.
     * @param order Mandatory boolean parameter.
     */
    
    @VTID(6)
    void _MoveChild_(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject node,
            boolean order);
    
    // Properties:
}
