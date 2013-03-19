package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test step in a test run.
 */
@IID("{992BABA3-6360-4BD1-A337-B75F67BDB417}")
public interface IStep extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The run step name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * The run step name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The run step status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String status();
    
    /**
     * <p>
     * The run step status.
     * </p>
     * <p>
     * Setter method for the COM property "Status"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void status(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. Sets the virtual run step creation mode.
     * </p>
     * <p>
     * Setter method for the COM property "CreationMode"
     * </p>
     * 
     * @param rhs Mandatory short parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void creationMode(
            short rhs);
    
    /**
     * <p>
     * The test ID of the test from which this step run originates.
     * </p>
     * <p>
     * Getter method for the COM property "TestSource"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    int testSource();
    
    /**
     * <p>
     * The test ID of the test from which this step run originates.
     * </p>
     * <p>
     * Getter method for the COM property "DesignStepSource"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    int designStepSource();
    
    // Properties:
}
