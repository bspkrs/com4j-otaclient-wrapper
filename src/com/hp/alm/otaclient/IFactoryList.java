package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to create and maintains lists within entity factories. Use any factory object to create any number of list instances for objects
 * in the factory.
 */
@IID("{68FE31A3-6242-4AA4-9BBE-D0715F810DB3}")
public interface IFactoryList extends com.hp.alm.otaclient.IList
{
    // Methods:
    /**
     * <p>
     * Gets a list of fields available through this factory.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(14)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Reads saved list filter and data for all listed objects, overwriting values in memory.
     * </p>
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    void refresh();
    
    /**
     * <p>
     * Posts changed data for all items in list.
     * </p>
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(16)
    void post();
    
    /**
     * <p>
     * The similarity ratio for the specified item.
     * </p>
     * <p>
     * Getter method for the COM property "Ratio"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(17)
    int ratio(
            int index);
    
    /**
     * <p>
     * Gets the index of the passed object.
     * </p>
     * 
     * @param item Mandatory java.lang.Object parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(18)
    int indexOfItem(
            @MarshalAs(NativeType.VARIANT) java.lang.Object item);
    
    // Properties:
}
