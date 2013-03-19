package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IExcelReportManager Interface.
 */
@IID("{F7895C0C-CF5A-487A-A586-A1EBBC33099F}")
public interface IExcelReportManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Get an object for execution of a report query.
     * </p>
     * 
     * @param analysisItemId Mandatory int parameter.
     * @param sheetName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getReportQueryExecutor(
            int analysisItemId,
            java.lang.String sheetName);
    
    /**
     * <p>
     * Get an object for execution of a test query.
     * </p>
     * 
     * @param sql Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getTestQueryExecutor(
            java.lang.String sql);
    
    // Properties:
}
