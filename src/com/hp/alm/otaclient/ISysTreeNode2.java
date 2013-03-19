package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a tree node.
 */
@IID("{9A7EB65C-DA52-4CA3-BE0F-010499A82A36}")
public interface ISysTreeNode2 extends com.hp.alm.otaclient.ISysTreeNode
{
    // Methods:
    /**
     * <p>
     * The node's type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    int type();
    
    // Properties:
}
