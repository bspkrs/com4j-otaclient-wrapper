package com.hp.alm.otaclient.events;

import com4j.*;

/**
 * For HP use. _DIProgressEvents.
 */
@IID("{F4E85688-FCD7-11D4-9D8A-0001029DEAF5}")
public abstract class _DIProgressEvents
{
    // Methods:
    /**
     * @param current Mandatory int parameter.
     * @param total Mandatory int parameter.
     * @param message Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    public void onProgress(
            int current,
            int total,
            java.lang.String message)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @param errorCode Mandatory int parameter.
     */
    
    @DISPID(2)
    public void onDataAvailable(
            int errorCode)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @param time Mandatory int parameter.
     * @param message Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    public void onServerProgress(
            int time,
            java.lang.String message)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @param message Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    public void onMessage(
            java.lang.String message)
    {
        throw new UnsupportedOperationException();
    }
    
    // Properties:
}
