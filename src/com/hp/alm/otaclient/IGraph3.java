package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a graph built through a method.
 */
@IID("{16D6E6A8-E711-40AE-9B22-9471B1DC6F8C}")
public interface IGraph3 extends com.hp.alm.otaclient.IGraph2
{
    // Methods:
    /**
     * <p>
     * Cross project graph data drill-down.
     * </p>
     * 
     * @param areas Mandatory java.lang.Object parameter.
     * @param parameterMap Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    com.hp.alm.otaclient.IList crossDrillDownEx(
            @MarshalAs(NativeType.VARIANT) java.lang.Object areas,
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject parameterMap);
    
    // Properties:
}
