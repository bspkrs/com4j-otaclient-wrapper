package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{57B6C56A-FD2E-48BB-8B6D-25B86211AB41}")
public interface ICustomizationReqType3 extends com.hp.alm.otaclient.ICustomizationReqType2
{
    // Methods:
    /**
     * <p>
     * Rich text document template of the requirement type.
     * </p>
     * <p>
     * Getter method for the COM property "RichTextTemplate"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String richTextTemplate();
    
    /**
     * <p>
     * Rich text document template of the requirement type.
     * </p>
     * <p>
     * Setter method for the COM property "RichTextTemplate"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(26)
    void richTextTemplate(
            java.lang.String pVal);
    
    // Properties:
}
