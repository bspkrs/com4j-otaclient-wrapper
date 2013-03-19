package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test set folder.
 */
@IID("{867A77D3-3116-49A9-B8D1-FDDAF9115ABE}")
public interface ITestLabFolder extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The TestLabFolderFactory for direct child test folders.
     * </p>
     * <p>
     * Getter method for the COM property "TestLabFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testLabFolderFactory();
    
    /**
     * <p>
     * The TestSetFactory object for direct child tests.
     * </p>
     * <p>
     * Getter method for the COM property "TestSetFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testSetFactory();
    
    /**
     * <p>
     * The cycle to which the folder is assigned.
     * </p>
     * <p>
     * Setter method for the COM property "TargetCycle"
     * </p>
     * 
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    void targetCycle(
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The cycle to which the folder is assigned.
     * </p>
     * <p>
     * Getter method for the COM property "TargetCycle"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object targetCycle();
    
    // Properties:
}
