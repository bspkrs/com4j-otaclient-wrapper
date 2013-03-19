package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for Business Process Test.
 */
@IID("{F8E900DD-2F87-4B1F-9D4A-E77F445E8D25}")
public interface IBPIterationFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * For HP use. Used to override the owner's version id for stateless factories.
     * </p>
     * <p>
     * Setter method for the COM property "OverrideOwnerVersionId"
     * </p>
     * 
     * @param rhs Mandatory int parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void overrideOwnerVersionId(
            int rhs);
    
    /**
     * <p>
     * For HP use. Used to override the owner's baseline id for stateless factories.
     * </p>
     * <p>
     * Setter method for the COM property "OverrideOwnerBaselineId"
     * </p>
     * 
     * @param rhs Mandatory int parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void overrideOwnerBaselineId(
            int rhs);
    
    // Properties:
}
