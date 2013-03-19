package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Test set folder Internal functionality.
 */
@IID("{19F5C80C-DB4A-48B0-9EE8-AE0AE3090D89}")
public interface ITestSetFolderInternal extends Com4jObject
{
    // Methods:
    /**
     * @param pAll Mandatory Holder<Integer> parameter.
     * @param pNotExecuted Mandatory Holder<Integer> parameter.
     */
    
    @VTID(3)
    void getInstancesInformation(
            Holder<Integer> pAll,
            Holder<Integer> pNotExecuted);
    
    // Properties:
}
