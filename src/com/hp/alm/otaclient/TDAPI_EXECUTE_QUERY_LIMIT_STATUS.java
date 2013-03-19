package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * The status returned by ICommand2.ExecuteQuery if synchronous, or ICommand2.IsActionFinished when asynchronous.
 * </p>
 */
public enum TDAPI_EXECUTE_QUERY_LIMIT_STATUS
{
    /**
     * <p>
     * All records that match the query were returned.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_EXECUTE_QUERY_LIMIT_OK_NOTRUNCATION_STATUS, // 0
    /**
     * <p>
     * The result set was truncated at the limit specified in the ExecuteQuery command.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_EXECUTE_QUERY_LIMIT_OK_TRUNCATED_BY_REQUEST_STATUS, // 1
    /**
     * <p>
     * The result set was truncated at the limit specified by the site configuration param REPORT_QUERY_RECORDS_LIMIT.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_EXECUTE_QUERY_LIMIT_OK_TRUNCATED_BY_SITEADMIN_STATUS, // 2
}
