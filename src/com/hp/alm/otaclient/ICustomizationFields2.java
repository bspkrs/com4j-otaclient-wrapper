package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationField objects in the project.
 */
@IID("{A4EF5B4F-8A93-421C-892E-56D37768D945}")
public interface ICustomizationFields2 extends com.hp.alm.otaclient.ICustomizationFields
{
    // Methods:
    /**
     * <p>
     * Return Fields Digest.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String getFieldsDigestPublic();
    
    // Properties:
}
