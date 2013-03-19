package com.hp.alm.otaclient;

import com4j.*;

/**
 * Defines behavior after completion of a test set.
 */
@IID("{3120287D-98B1-4D49-9BC5-3324555D8D04}")
public interface IOnExecEventSchedulerRestartParams extends com.hp.alm.otaclient.IOnExecEventSchedulerActionParams
{
    // Methods:
    /**
     * <p>
     * The number of retries if a test fails.
     * </p>
     * <p>
     * Setter method for the COM property "NumberOfRetries"
     * </p>
     * 
     * @param val Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void numberOfRetries(
            int val);
    
    /**
     * <p>
     * The number of retries if a test fails.
     * </p>
     * <p>
     * Getter method for the COM property "NumberOfRetries"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    int numberOfRetries();
    
    /**
     * <p>
     * The test ID of the test to run before each rerun.
     * </p>
     * <p>
     * Setter method for the COM property "CleanupTest"
     * </p>
     * 
     * @param vVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void cleanupTest(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vVal);
    
    /**
     * <p>
     * The test ID of the test to run before each rerun.
     * </p>
     * <p>
     * Getter method for the COM property "CleanupTest"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object cleanupTest();
    
    // Properties:
}
