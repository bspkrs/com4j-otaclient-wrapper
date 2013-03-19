package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for supporting rich content.
 */
@IID("{22D88BD0-A366-11DE-BA99-884956D89593}")
public interface ISupportRichContent extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Downloads rich content files.
     * </p>
     * 
     * @param rcEntityType Mandatory java.lang.String parameter.
     * @param rcEntityID Mandatory java.lang.String parameter.
     * @param rcVersionID Mandatory java.lang.String parameter.
     * @param rcBaselineID Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void loadRichContent(
            java.lang.String rcEntityType,
            java.lang.String rcEntityID,
            java.lang.String rcVersionID,
            java.lang.String rcBaselineID);
    
    /**
     * <p>
     * Uploads rich content files.
     * </p>
     * 
     * @param rcEntityType Mandatory java.lang.String parameter.
     * @param rcEntityID Mandatory java.lang.String parameter.
     * @param rcImagesNames Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void saveRichContent(
            java.lang.String rcEntityType,
            java.lang.String rcEntityID,
            java.lang.String rcImagesNames);
    
    /**
     * <p>
     * Generate HTML document of the rich content data.
     * </p>
     * 
     * @param rcEntityType Mandatory java.lang.String parameter.
     * @param rcEntityID Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String generateRichContentHTMLDocument(
            java.lang.String rcEntityType,
            java.lang.String rcEntityID);
    
    // Properties:
}
