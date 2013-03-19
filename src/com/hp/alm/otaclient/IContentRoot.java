package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Content Root.
 */
@IID("{6BD35052-8A57-45DE-A8F0-6D5BDCEE3CB2}")
public interface IContentRoot extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * Content root's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * Content root's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Entity Id.
     * </p>
     * <p>
     * Getter method for the COM property "RootEntityId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    int rootEntityId();
    
    /**
     * <p>
     * The Entity Id.
     * </p>
     * <p>
     * Setter method for the COM property "RootEntityId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void rootEntityId(
            int pVal);
    
    /**
     * <p>
     * The Entity Type.
     * </p>
     * <p>
     * Getter method for the COM property "RootEntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String rootEntityType();
    
    /**
     * <p>
     * The Entity Type.
     * </p>
     * <p>
     * Setter method for the COM property "RootEntityType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void rootEntityType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The parent content definition.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    // Properties:
}
