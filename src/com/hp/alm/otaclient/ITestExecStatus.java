package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the execution status of the test currently running.
 */
@IID("{C1ED849E-CB41-45A9-A256-9A0D3CFDB350}")
public interface ITestExecStatus extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The test ID.
     * </p>
     * <p>
     * Getter method for the COM property "TestId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int testId();
    
    /**
     * <p>
     * The test execution message displayed in the Execution Controller grid.
     * </p>
     * <p>
     * Getter method for the COM property "Message"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String message();
    
    /**
     * <p>
     * The test execution status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String status();
    
    /**
     * <p>
     * The ID of the test instance for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "TSTestId"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object tsTestId();
    
    /**
     * <p>
     * The number of this instance of the design test in the test set.
     * </p>
     * <p>
     * Getter method for the COM property "TestInstance"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    int testInstance();
    
    // Properties:
}
