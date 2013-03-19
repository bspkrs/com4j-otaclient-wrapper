package com.hp.alm.otaclient.events;

import com4j.*;

/**
 * For HP use. Progress events exposed by IAsyncResultStorage. Allow to track async results operations
 */
@IID("{1304BAA4-5772-4EF2-A7F8-09D97ADEC306}")
public abstract class _DIAsyncResultProgress
{
    // Methods:
    /**
     * @param eType Mandatory com.hp.alm.otaclient.OPERATION_TYPE parameter.
     * @param current Mandatory int parameter.
     * @param context Mandatory java.lang.Object parameter.
     */
    
    @DISPID(1)
    public void onProgress(
            com.hp.alm.otaclient.OPERATION_TYPE eType,
            int current,
            java.lang.Object context)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @param eType Mandatory com.hp.alm.otaclient.OPERATION_TYPE parameter.
     * @param context Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    public void onOperationComplete(
            com.hp.alm.otaclient.OPERATION_TYPE eType,
            java.lang.Object context)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @param eType Mandatory com.hp.alm.otaclient.OPERATION_TYPE parameter.
     * @param pError Mandatory com.hp.alm.otaclient.IErrorInfo parameter.
     * @param context Mandatory java.lang.Object parameter.
     */
    
    @DISPID(3)
    public void onOperationFailed(
            com.hp.alm.otaclient.OPERATION_TYPE eType,
            com.hp.alm.otaclient.IErrorInfo pError,
            java.lang.Object context)
    {
        throw new UnsupportedOperationException();
    }
    
    // Properties:
}
