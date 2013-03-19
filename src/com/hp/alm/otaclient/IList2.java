package com.hp.alm.otaclient;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.MarshalAs;
import com4j.NativeType;
import com4j.VTID;
import com4j.stdole.IEnumVARIANT;

/**
 * Adds to the IList interface missing basic functionality.
 */
@IID("{68AE0EF9-676C-46B3-B190-ACB1BA06A61A}")
public interface IList2 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Sets an item by index. The index is one-based and must be within the element range.
     * </p>
     * <p>
     * Setter method for the COM property "Item"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @param rhs Mandatory java.lang.Object parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    void item(
            int index,
            @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);
    
    /**
     * <p>
     * Removes all the items from the list.
     * </p>
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void clear();
    
    /**
     * <p>
     * Gets the index of the passed object.
     * </p>
     * 
     * @param item Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    int indexOfItem(
            @MarshalAs(NativeType.VARIANT) java.lang.Object item);
    
    /**
     * <p>
     * Replaces the current contents with the contents of the given source enumeration. Items are copied in chunks of 100 pieces each.
     * </p>
     * 
     * @param source Mandatory IEnumVARIANT parameter.
     * @param count Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void copyFrom(
            IEnumVARIANT source,
            int count);
    
    // Properties:
}
