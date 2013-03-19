package com.hp.alm.otaclient;

import com4j.*;

/**
 * Manages the tests and test sets included in one test set folder.
 */
@IID("{18B58E14-B956-40A3-A37F-B8EF1136F238}")
public interface ITestSetFolder2 extends com.hp.alm.otaclient.ITestSetFolder
{
    // Methods:
    /**
     * <p>
     * Gets the list of test instances in all test sets in given folder and its subfolders that match the specified pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(37)
    com.hp.alm.otaclient.IList findTestInstances(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    // Properties:
}
