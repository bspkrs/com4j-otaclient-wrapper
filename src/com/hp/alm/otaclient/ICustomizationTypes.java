package com.hp.alm.otaclient;

import com4j.*;

/**
 * A collection of Customization types of a specific entity. For example, the types of the requirement entity.
 */
@IID("{30873CCD-888B-4383-AECD-6C4D9EFF553F}")
public interface ICustomizationTypes extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Adds a new CustomizationType to the specified entity.
     * </p>
     * 
     * @param entityType Mandatory int parameter.
     * @param name Mandatory java.lang.String parameter.
     * @param createAsTypeId Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addCustomizationType(
            int entityType,
            java.lang.String name,
            int createAsTypeId);
    
    /**
     * <p>
     * Removes the CustomizationType with the specified ID from the specified entity.
     * </p>
     * 
     * @param entityType Mandatory int parameter.
     * @param customizationTypeId Mandatory int parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeCustomizationType(
            int entityType,
            int customizationTypeId);
    
    /**
     * <p>
     * Gets the list of all CustomizationTypes for the specified entity.
     * </p>
     * 
     * @param entityType Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList getEntityCustomizationTypes(
            int entityType);
    
    /**
     * <p>
     * Gets the CustomizationType with the specified ID.
     * </p>
     * 
     * @param entityType Mandatory int parameter.
     * @param customizationTypeId Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getEntityCustomizationType(
            int entityType,
            int customizationTypeId);
    
    /**
     * <p>
     * Returns the list of all CustomizationSubtypes for the specified entity.
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList getEntityCustomizationSubtypes(
            java.lang.String entityType);
    
    /**
     * <p>
     * Returns the CustomizationSubtype with the specified ID.
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @param customizationSubtypeId Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getEntityCustomizationSubtype(
            java.lang.String entityType,
            java.lang.String customizationSubtypeId);
    
    /**
     * <p>
     * Returns the CustomizationSubtype Of The Default Subtype
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getDefaultSubtype(
            java.lang.String entityType);
    
    // Properties:
}
