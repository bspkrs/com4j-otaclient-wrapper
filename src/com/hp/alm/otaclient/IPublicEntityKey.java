package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a PublicEntityKey.
 */
@IID("{FF0696B3-0C9F-4ECA-B1FD-B74829F6DBE1}")
public interface IPublicEntityKey extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * Get PublicEntityKey Owner ID.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    int ownerId();
    
    /**
     * <p>
     * Get PublicEntityKey Owner Type.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String ownerType();
    
    /**
     * <p>
     * Get PublicEntityKey UserName
     * </p>
     * <p>
     * Getter method for the COM property "UserName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String userName();
    
    /**
     * <p>
     * Get PublicEntityKey Key
     * </p>
     * <p>
     * Getter method for the COM property "Key"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String key();
    
    /**
     * <p>
     * Get PublicEntityKey ResourceType
     * </p>
     * <p>
     * Getter method for the COM property "ResourceType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String resourceType();
    
    /**
     * <p>
     * Get PublicEntityKey ResourceType
     * </p>
     * <p>
     * Setter method for the COM property "ResourceType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    void resourceType(
            java.lang.String pVal);
    
    // Properties:
}
