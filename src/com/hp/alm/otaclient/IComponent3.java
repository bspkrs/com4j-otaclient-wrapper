package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single Business Process Component.
 */
@IID("{454757B7-A789-4E21-B6B4-B07FBFB5E894}")
public interface IComponent3 extends com.hp.alm.otaclient.IComponent2
{
    // Methods:
    /**
     * <p>
     * For HP use. Returns the IBusinessProcess that represents the flow aspect of this component.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(44)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getFlow();
    
    /**
     * <p>
     * Saves the component snapshot. The snapshot file name must be 'Picture.png'.
     * </p>
     * 
     * @param snapshotSourcePath Mandatory java.lang.String parameter.
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(45)
    void uploadSnapshot(
            java.lang.String snapshotSourcePath);
    
    // Properties:
}
