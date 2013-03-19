package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a comparison node which is immutable.
 */
@IID("{9538CA0B-94E0-4784-B021-25D9138A34CB}")
public interface IComparisonNode extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Identifies the node as a part of the left compared entity.
     * </p>
     * <p>
     * Getter method for the COM property "IsLeftValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    boolean isLeftValue();
    
    /**
     * <p>
     * Identifies the node a ghost.
     * </p>
     * <p>
     * Getter method for the COM property "IsGhost"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(24)
    boolean isGhost();
    
    /**
     * <p>
     * Gets the change type.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    int changeType();
    
    /**
     * <p>
     * Gets the change type.
     * </p>
     * <p>
     * Getter method for the COM property "Path"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String path();
    
    /**
     * <p>
     * The entity.
     * </p>
     * <p>
     * Getter method for the COM property "EntityID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(27)
    int entityID();
    
    /**
     * <p>
     * The entity.
     * </p>
     * <p>
     * Getter method for the COM property "EntityName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String entityName();
    
    /**
     * <p>
     * The entity.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String entityType();
    
    /**
     * <p>
     * Get children.
     * </p>
     * <p>
     * Getter method for the COM property "Children"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(30)
    com.hp.alm.otaclient.IList children();
    
    @VTID(30)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object children(
            int index);
    
    /**
     * <p>
     * Get next change from server.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IComparisonNode
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(31)
    com.hp.alm.otaclient.IComparisonNode nextChange();
    
    /**
     * <p>
     * Get previous change from server.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IComparisonNode
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(32)
    com.hp.alm.otaclient.IComparisonNode prevChange();
    
    /**
     * <p>
     * The entity.
     * </p>
     * <p>
     * Getter method for the COM property "Entity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entity();
    
    // Properties:
}
