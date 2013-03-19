package com.hp.alm.otaclient;

import com4j.*;

/**
 * Create IBSTRMap
 */
@IID("{6AE5FFFC-DE72-4282-87BA-9A9DE21D589C}")
public interface ITDConnection_CreateMap extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Create an IBSTRMap, If you create it you must release it. In C#: System.Runtime.InteropServices.Marshal.ReleaseComObject(map);
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(3)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createBSTRMap();
    
    // Properties:
}
