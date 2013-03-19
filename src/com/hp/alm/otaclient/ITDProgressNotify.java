package com.hp.alm.otaclient;

import com4j.*;

@IID("{B3391F80-3861-11D3-AFAB-00600855298D}")
public interface ITDProgressNotify extends Com4jObject
{
    // Methods:
    /**
     * @param current Mandatory int parameter.
     * @param total Mandatory int parameter.
     * @param message Mandatory java.lang.String parameter.
     */
    
    @VTID(3)
    void onProgress(
            int current,
            int total,
            java.lang.String message);
    
    /**
     * @param errorCode Mandatory int parameter.
     */
    
    @VTID(4)
    void onDataAvailable(
            int errorCode);
    
    /**
     * @param time Mandatory int parameter.
     * @param message Mandatory java.lang.String parameter.
     */
    
    @VTID(5)
    void onServerProgress(
            int time,
            java.lang.String message);
    
    /**
     * @param message Mandatory java.lang.String parameter.
     */
    
    @VTID(6)
    void onMessage(
            java.lang.String message);
    
    // Properties:
}
