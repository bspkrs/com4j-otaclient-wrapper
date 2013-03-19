package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a database command.
 */
@IID("{F3D168E0-A5FD-4083-ADDF-1E64EE968E59}")
public interface ICommand2 extends com.hp.alm.otaclient.ICommand
{
    // Methods:
    /**
     * <p>
     * Executes the query in the CommandText property and returns the limit status. The status is either limit not reached or the kind of
     * limit that was reached.
     * </p>
     * 
     * @param limit Mandatory int parameter.
     * @param pintTruncationStatus Mandatory Holder<Integer> parameter.
     * @param synchronous Optional parameter. Default value is false
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject executeQuery(
            int limit,
            Holder<Integer> pintTruncationStatus,
            @Optional @DefaultValue("0") boolean synchronous);
    
    /**
     * <p>
     * Cancels execution of the ExecuteQuery command.
     * </p>
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(23)
    void cancel();
    
    // Properties:
}
