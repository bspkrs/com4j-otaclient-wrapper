package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to create and maintain lists. Use any factory object to create any number of list instances for objects in the factory.
 */
@IID("{F73CCC7B-05FA-4FD7-8FAA-B53DFFFE22DC}")
public interface IList extends Com4jObject, Iterable<Com4jObject>
{
    // Methods:
    /**
     * <p>
     * The number of items in the list.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int count();
    
    /**
     * <p>
     * Adds a new item to the current list object.
     * </p>
     * 
     * @param vNew Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void add(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vNew);
    
    /**
     * <p>
     * Removes the specified item from the current list object.
     * </p>
     * 
     * @param index Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void remove(
            int index);
    
    /**
     * <p>
     * Gets an item by index. The index is one-based.
     * </p>
     * <p>
     * Getter method for the COM property "Item"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(10)
    @DefaultMethod
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object item(
            int index);
    
    /**
     * <p>
     * Gets an IEnumVARIANT enumerator. For information on the IEnumVARIANT, see Microsoft documentation.
     * </p>
     * <p>
     * Getter method for the COM property "_NewEnum"
     * </p>
     */
    
    @DISPID(-4)
    //= 0xfffffffc. The runtime will prefer the VTID if present
    @VTID(11)
    java.util.Iterator<Com4jObject> iterator();
    
    /**
     * <p>
     * Inserts a new item at the specified position.
     * </p>
     * 
     * @param pos Mandatory int parameter.
     * @param vNew Mandatory java.lang.Object parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void insert(
            int pos,
            @MarshalAs(NativeType.VARIANT) java.lang.Object vNew);
    
    /**
     * <p>
     * Swaps the two list items specified by their positions.
     * </p>
     * 
     * @param pos1 Mandatory int parameter.
     * @param pos2 Mandatory int parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    void swap(
            int pos1,
            int pos2);
    
    // Properties:
}
