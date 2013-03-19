package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage attachments of the current field object.
 */
@IID("{C691D4B4-3924-4488-B554-A7E08842C625}")
public interface IAttachmentFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Deprecated. Use the entity-level Attachments property for downloading and uploading attachment files.
     * </p>
     * <p>
     * Getter method for the COM property "AttachmentStorage"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachmentStorage();
    
    /**
     * <p>
     * Gets the owner type and key for the AttachmentFactory object.
     * </p>
     * 
     * @param ownerType Mandatory Holder<java.lang.String> parameter.
     * @param ownerKey Mandatory java.lang.Object parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void factoryProperties(
            Holder<java.lang.String> ownerType,
            java.lang.Object ownerKey);
    
    // Properties:
}
