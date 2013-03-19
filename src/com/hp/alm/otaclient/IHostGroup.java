package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing a group of host servers.
 */
@IID("{B3468A97-FD4C-4A05-9E49-1FD0ED7FD9E2}")
public interface IHostGroup extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Gets the host group name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * Adds a host to the group.
     * </p>
     * 
     * @param val Mandatory java.lang.Object parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    void addHost(
            @MarshalAs(NativeType.VARIANT) java.lang.Object val);
    
    /**
     * <p>
     * Removes the specified host from the group.
     * </p>
     * 
     * @param val Mandatory java.lang.Object parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void removeHost(
            @MarshalAs(NativeType.VARIANT) java.lang.Object val);
    
    /**
     * <p>
     * Gets a list of all hosts in the group.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    com.hp.alm.otaclient.IList newList();
    
    @VTID(26)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object newList(
            int index);
    
    // Properties:
}
