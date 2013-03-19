package com.hp.alm.otaclient;

import com4j.*;

/**
 * A list of values with a collective name.
 */
@IID("{4A819529-30FB-472C-8DCD-990A8268F956}")
public interface INamedListValue extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns the name of the value list.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name();
    
    /**
     * <p>
     * Returns the list of values.
     * </p>
     * <p>
     * Getter method for the COM property "Values"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList values();
    
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object values(
            int index);
    
    // Properties:
}
