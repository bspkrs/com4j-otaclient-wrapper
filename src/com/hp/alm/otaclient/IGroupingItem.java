package com.hp.alm.otaclient;

import com4j.*;

/**
 * A set of objects having the same value in a specific field.
 */
@IID("{31FDA98D-C50C-416D-BB4F-9D5294896175}")
public interface IGroupingItem extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The name of the field by which the objects are grouped.
     * </p>
     * <p>
     * Getter method for the COM property "FieldName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String fieldName();
    
    /**
     * <p>
     * Items belonging to the group have this value in the field.
     * </p>
     * <p>
     * Getter method for the COM property "FieldValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String fieldValue();
    
    /**
     * <p>
     * The number of objects in the group.
     * </p>
     * <p>
     * Getter method for the COM property "ItemCount"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int itemCount();
    
    /**
     * <p>
     * The list of references to the members of the group.
     * </p>
     * <p>
     * Getter method for the COM property "ItemList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList itemList();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object itemList(
            int index);
    
    /**
     * <p>
     * The list of sub-groups of this group.
     * </p>
     * <p>
     * Getter method for the COM property "GroupList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList groupList();
    
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object groupList(
            int index);
    
    // Properties:
}
