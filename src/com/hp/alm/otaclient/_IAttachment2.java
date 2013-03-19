package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Missing attachment functionality.
 */
@IID("{E9E4C5D3-17CF-481F-ABA5-1A64372879F4}")
public interface _IAttachment2 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Post a virtual attachment asynchronously.
     * </p>
     * 
     * @param async Mandatory boolean parameter.
     */
    
    @VTID(3)
    void postVirtual(
            boolean async);
    
    /**
     * <p>
     * Converts the given value of the CR_REFERENCE field the way IAttachment.Name property does.
     * </p>
     * 
     * @param filePath Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(4)
    java.lang.String convert_CR_REFERENCE_FieldValueToName(
            java.lang.String filePath);
    
    /**
     * <p>
     * Converts the given value of the CR_REFERENCE field the way IAttachment.FileName property does.
     * </p>
     * 
     * @param filePath Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(5)
    java.lang.String convert_CR_REFERENCE_FieldValueToFileName(
            java.lang.String filePath);
    
    /**
     * <p>
     * Converts the given value of the CR_REF_TYPE field the way IAttachment.Type property does.
     * </p>
     * 
     * @param typeId Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @VTID(6)
    int convert_CR_REF_TYPE_FieldValue(
            java.lang.String typeId);
    
    /**
     * <p>
     * Copies the attachment file to a test resource.
     * </p>
     * 
     * @param lResourceID Mandatory int parameter.
     * @param resourceFileName Mandatory java.lang.String parameter.
     */
    
    @VTID(7)
    void copyToResource(
            int lResourceID,
            java.lang.String resourceFileName);
    
    // Properties:
}
