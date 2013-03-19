package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a user-defined list associated with a field.
 */
@IID("{1E1C07CA-7339-4741-A41D-DEC5A065B1F1}")
public interface ICustomizationList extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The root CustomizationListNode of the current list.
     * </p>
     * <p>
     * Getter method for the COM property "RootNode"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rootNode();
    
    /**
     * <p>
     * The name of the list.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * Finds a CustomizationListNode of the current list by the node name or ID.
     * </p>
     * 
     * @param val Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject find(
            @MarshalAs(NativeType.VARIANT) java.lang.Object val);
    
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
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
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
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    void deleted(
            boolean pVal);
    
    // Properties:
}
