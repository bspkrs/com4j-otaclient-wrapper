package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IExcelReportQuery Interface.
 */
@IID("{9CE1D9AD-3CCE-4FE2-B750-350947B0ED77}")
public interface IExcelReportQuery extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Set parameter value.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param value Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void setParamValue(
            java.lang.String name,
            java.lang.String value);
    
    /**
     * <p>
     * Executes the query. Returns the limit status (limit not reached or the kind of limit that was reached).
     * </p>
     * 
     * @param limit Mandatory int parameter.
     * @param pintTruncationStatus Mandatory Holder<Integer> parameter.
     * @param synchronous Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject execute(
            int limit,
            Holder<Integer> pintTruncationStatus,
            @Optional @DefaultValue("0") boolean synchronous);
    
    /**
     * <p>
     * Cancels ongoing asynchronous execution.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void cancel();
    
    // Properties:
}
