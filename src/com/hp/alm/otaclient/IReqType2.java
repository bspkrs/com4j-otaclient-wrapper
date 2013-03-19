package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Requirement Type.
 */
@IID("{054507E4-9F4F-4269-999B-837AD4F6DF31}")
public interface IReqType2 extends com.hp.alm.otaclient.IReqType
{
    // Methods:
    /**
     * <p>
     * The rich text document template for this requirement type
     * </p>
     * <p>
     * Getter method for the COM property "RichTextTemplate"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String richTextTemplate();
    
    // Properties:
}
