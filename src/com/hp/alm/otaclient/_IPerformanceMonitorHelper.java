package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Performance Monitor Related Methods.
 */
@IID("{E2965FEF-80CF-4D55-9E3F-9D51A1CBFD88}")
public interface _IPerformanceMonitorHelper extends Com4jObject
{
    // Methods:
    /**
     * @param pPerformanceMonitor Mandatory com4j.Com4jObject parameter.
     */
    
    @VTID(3)
    void setPerformanceMonitor(
            com4j.Com4jObject pPerformanceMonitor);
    
    /**
     * @param requestData Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(4)
    java.lang.String updateClientPerformanceData(
            java.lang.String requestData);
    
    // Properties:
}
