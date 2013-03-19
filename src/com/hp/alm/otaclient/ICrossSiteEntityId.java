package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a cross domain/project entity ID.
 */
@IID("{DCCDAFCD-99C0-45E1-BBCB-B83B724901C9}")
public interface ICrossSiteEntityId extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The Entity's domain ID.
     * </p>
     * <p>
     * Getter method for the COM property "DomainId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(7)
    int domainId();
    
    /**
     * <p>
     * The Entity's project ID.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(8)
    int projectId();
    
    /**
     * <p>
     * The Entity's ID.
     * </p>
     * <p>
     * Getter method for the COM property "EntityID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(9)
    int entityID();
    
    /**
     * <p>
     * The Entity's type.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String entityType();
    
    // Properties:
}
