package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Interface providing factory services to extensions.
 */
@IID("{6332415A-E7DB-4287-95E5-5BD206F6AA8A}")
public interface IFactoryService extends Com4jObject
{
    // Methods:
    /**
     * @param ownerType Mandatory int parameter.
     * @param ownerKey Mandatory java.lang.Object parameter.
     * @param isVirtualFather Mandatory boolean parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createReqCoverageFactory(
            int ownerType,
            @MarshalAs(NativeType.VARIANT) java.lang.Object ownerKey,
            boolean isVirtualFather);
    
    // Properties:
}
