package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single Business Process Test.
 */
@IID("{48723D56-A331-45AB-935B-A235AE54CFD1}")
public interface IBusinessProcess3 extends com.hp.alm.otaclient.IBusinessProcess2
{
    // Methods:
    /**
     * <p>
     * Adds an alert to all tests that contain components that represent the same screen as any of the components in which a change is
     * detected.
     * </p>
     */
    
    @DISPID(126)
    //= 0x7e. The runtime will prefer the VTID if present
    @VTID(74)
    void alertTestsOnChangeDetected();
    
    /**
     * <p>
     * Deletes any change detection alert that is active for the Business Process.
     * </p>
     */
    
    @DISPID(127)
    //= 0x7f. The runtime will prefer the VTID if present
    @VTID(75)
    void deleteChangeDetectionAlert();
    
    /**
     * <p>
     * For HP use. Get the IComponent that represents the component of this Flow.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(128)
    //= 0x80. The runtime will prefer the VTID if present
    @VTID(76)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getShadowComponent();
    
    /**
     * <p>
     * For HP use. Unloads the BusinessProcess object dependencies from memory.
     * </p>
     */
    
    @DISPID(129)
    //= 0x81. The runtime will prefer the VTID if present
    @VTID(77)
    void unload();
    
    // Properties:
}
