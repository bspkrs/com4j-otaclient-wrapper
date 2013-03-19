package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Baseline.
 */
@IID("{EAC92EF2-C2A6-414E-9BEE-5525A9F64DC5}")
public interface IBaseline extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The baseline's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * The baseline's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The baseline's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String description();
    
    /**
     * <p>
     * The baseline's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The baseline's parent library.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * The user name of the baseline creator or importer.
     * </p>
     * <p>
     * Getter method for the COM property "CreatorUser"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String creatorUser();
    
    /**
     * <p>
     * The Date on which the baseline was created.
     * </p>
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    java.util.Date creationDate();
    
    /**
     * <p>
     * The Baseline capturing state. A value of enum TDAPI_BASELINE_CAPTURING_STATE).
     * </p>
     * <p>
     * Getter method for the COM property "CaptureState"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(30)
    int captureState();
    
    /**
     * <p>
     * Captures a baseline. Error if baseline state is not BASELINE_CAPTURING_STATE_NONE or BASELINE_CAPTURING_STATE_FAIL.
     * </p>
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(31)
    void capture();
    
    /**
     * <p>
     * Captures a baseline. Error if baseline state is not BASELINE_CAPTURING_STATE_NONE or BASELINE_CAPTURING_STATE_FAIL.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(32)
    int captureAsync();
    
    /**
     * <p>
     * The baseline roots factory of this baseline.
     * </p>
     * <p>
     * Getter method for the COM property "BaselineRootFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject baselineRootFactory();
    
    // Properties:
}
