package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IRequestReporter Interface.
 */
@IID("{B72575EC-2E8A-41AF-8986-CBF022A240E1}")
public interface IRequestReporter extends Com4jObject
{
    // Methods:
    /**
     * @param loginSessionId Mandatory int parameter.
     * @param projectSessionId Mandatory int parameter.
     * @param requestId Mandatory java.lang.String parameter.
     * @param requestType Mandatory java.lang.String parameter.
     */
    
    @VTID(3)
    void onSendingRequestToServer(
            int loginSessionId,
            int projectSessionId,
            java.lang.String requestId,
            java.lang.String requestType);
    
    /**
     * @param loginSessionId Mandatory int parameter.
     * @param projectSessionId Mandatory int parameter.
     * @param requestId Mandatory java.lang.String parameter.
     * @param requestType Mandatory java.lang.String parameter.
     */
    
    @VTID(4)
    void onReceivedResponseFromServer(
            int loginSessionId,
            int projectSessionId,
            java.lang.String requestId,
            java.lang.String requestType);
    
    /**
     * @param requestId Mandatory java.lang.String parameter.
     * @param performanceInfo Mandatory java.lang.String parameter.
     */
    
    @VTID(5)
    void updateRequestPerformanceInfo(
            java.lang.String requestId,
            java.lang.String performanceInfo);
    
    // Properties:
}
