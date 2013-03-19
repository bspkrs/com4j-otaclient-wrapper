package com.hp.alm.otaclient;

import com4j.*;

/**
 * Provides basic object basic factory services, such as adding and removing factory child objects and creating lists of child objects.
 */
@IID("{3E46BE58-4943-48AA-BA08-38EEBA837A04}")
public interface IBaseFactory2 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The GroupingManager for this factory.
     * </p>
     * <p>
     * Getter method for the COM property "GroupingManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject groupingManager();
    
    /**
     * <p>
     * Check whether the factory supports grouping.
     * </p>
     * <p>
     * Getter method for the COM property "GroupingSupported"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean groupingSupported();
    
    // Properties:
}
