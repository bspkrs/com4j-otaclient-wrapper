package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for creation of CIT extension related factories.
 */
@IID("{AAEF1B4C-4B50-4502-BE8E-11AD9A78B9E7}")
public interface ICITFactoryService extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param ownerType Mandatory int parameter.
     * @param ownerKey Mandatory java.lang.Object parameter.
     * @param isVirtualFather Mandatory boolean parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(3)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createApplicationEntityFactory(
            int ownerType,
            @MarshalAs(NativeType.VARIANT) java.lang.Object ownerKey,
            boolean isVirtualFather);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param ownerType Mandatory int parameter.
     * @param ownerKey Mandatory java.lang.Object parameter.
     * @param isVirtualFather Mandatory boolean parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(4)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createApplicationImpactFactory(
            int ownerType,
            @MarshalAs(NativeType.VARIANT) java.lang.Object ownerKey,
            boolean isVirtualFather);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param ownerType Mandatory int parameter.
     * @param ownerKey Mandatory java.lang.Object parameter.
     * @param isVirtualFather Mandatory boolean parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(5)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createChangeEntityFactory(
            int ownerType,
            @MarshalAs(NativeType.VARIANT) java.lang.Object ownerKey,
            boolean isVirtualFather);
    
    // Properties:
}
