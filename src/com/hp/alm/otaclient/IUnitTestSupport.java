package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IUnitTestSupport Interface.
 */
@IID("{24B17582-D52C-4074-8BD6-D7DD82705D15}")
public interface IUnitTestSupport extends Com4jObject
{
    // Methods:
    /**
     * @param newVal Mandatory int parameter.
     */
    
    @VTID(3)
    void unitTestEnviromentOption(
            int newVal);
    
    /**
     * @param newVal Mandatory java.lang.String parameter.
     */
    
    @VTID(4)
    void unitTestProfile(
            java.lang.String newVal);
    
    // Properties:
}
