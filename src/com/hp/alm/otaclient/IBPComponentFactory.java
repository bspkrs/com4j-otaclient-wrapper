package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for Business Process Test.
 */
@IID("{9B239F54-62CE-4685-93D1-5A3D33086BEF}")
public interface IBPComponentFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Moves a list of BP Components under the specified parent in the specified order, validate and fix bpParams references validation
     * after the move. To place the BP Component last, send TDAPI_POS_ORDER.TDPOSITION_LAST as the starting order.
     * bpCompAfterNewLocationI????&
     * </p>
     * 
     * @param vBPComponentIds Mandatory java.lang.Object parameter.
     * @param startingOrder Mandatory int parameter.
     * @param newParentId Mandatory int parameter.
     * @param newParentType Mandatory java.lang.String parameter.
     * @param bpCompAfterNewLocationId Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void moveList(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vBPComponentIds,
            int startingOrder,
            int newParentId,
            java.lang.String newParentType,
            java.lang.String bpCompAfterNewLocationId);
    
    /**
     * <p>
     * Checks if the moving bp components given before bpCompAfterNewLocationId is valid (no bpParam references will be lost). if moving to
     * the end of the script put '0' in bpCompAfterNewLocationId
     * </p>
     * 
     * @param movedBPComponentIds Mandatory java.lang.String parameter.
     * @param bpCompAfterNewLocationId Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    boolean isValidMoveList(
            java.lang.String movedBPComponentIds,
            java.lang.String bpCompAfterNewLocationId);
    
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
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
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
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    void overrideOwnerBaselineId(
            int rhs);
    
    // Properties:
}
