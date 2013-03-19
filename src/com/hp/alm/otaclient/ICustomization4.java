package com.hp.alm.otaclient;

import com4j.*;

/**
 * Customization services, such as adding users to user groups, maintaining user-defined fields, configuring user access privileges.
 */
@IID("{536BFB95-44A6-4EA2-887D-B7AF28E45A57}")
public interface ICustomization4 extends com.hp.alm.otaclient.ICustomization3
{
    // Methods:
    /**
     * <p>
     * Returns the ICustomizationEntityAttributes object.
     * </p>
     * <p>
     * Getter method for the COM property "EntityAttributes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICustomizationEntityAttributes
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(28)
    com.hp.alm.otaclient.ICustomizationEntityAttributes entityAttributes();
    
    /**
     * <p>
     * For HP use. Returns the ICustomizationRelations object.
     * </p>
     * <p>
     * Getter method for the COM property "Relations"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICustomizationRelations
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(29)
    com.hp.alm.otaclient.ICustomizationRelations relations();
    
    /**
     * <p>
     * For HP use. Returns the ICustomizationKPITypes object.
     * </p>
     * <p>
     * Getter method for the COM property "KPITypes"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiTypes();
    
    /**
     * <p>
     * Returns names of the entities' tables that support multivalue.
     * </p>
     * <p>
     * Getter method for the COM property "SupportsMultivalueEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(31)
    com.hp.alm.otaclient.IList supportsMultivalueEntitiesTables();
    
    @VTID(31)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object supportsMultivalueEntitiesTables(
            int index);
    
    /**
     * <p>
     * For HP use. Returns names of the entities' tables that support QPM KPI TYPE creation.
     * </p>
     * <p>
     * Getter method for the COM property "SupportsQPMKPITypesEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(32)
    com.hp.alm.otaclient.IList supportsQPMKPITypesEntitiesTables();
    
    @VTID(32)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object supportsQPMKPITypesEntitiesTables(
            int index);
    
    /**
     * <p>
     * Returns names of the entities' tables that support history.
     * </p>
     * <p>
     * Getter method for the COM property "SupportsHistoryEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(33)
    com.hp.alm.otaclient.IList supportsHistoryEntitiesTables();
    
    @VTID(33)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object supportsHistoryEntitiesTables(
            int index);
    
    /**
     * <p>
     * Returns names of the entities' tables that support workflow.
     * </p>
     * <p>
     * Getter method for the COM property "SupportWorkflowEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(34)
    com.hp.alm.otaclient.IList supportWorkflowEntitiesTables();
    
    @VTID(34)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object supportWorkflowEntitiesTables(
            int index);
    
    /**
     * <p>
     * For HP use. Returns the ICustomizationReportProjectTemplates object.
     * </p>
     * <p>
     * Getter method for the COM property "ReportProjectTemplates"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reportProjectTemplates();
    
    /**
     * <p>
     * For HP use. Returns the ICustomizationEntitiesMetadata object.
     * </p>
     * <p>
     * Getter method for the COM property "EntitiesMetadata"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(36)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entitiesMetadata();
    
    /**
     * <p>
     * For HP use. Returns the currently logged in user.
     * </p>
     * <p>
     * Getter method for the COM property "LoggedInUser"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ICustomizationUser
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(37)
    com.hp.alm.otaclient.ICustomizationUser loggedInUser();
    
    /**
     * <p>
     * Returns names of the entities' tables that support data hiding filter.
     * </p>
     * <p>
     * Getter method for the COM property "SupportsDataHidingFilterEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(38)
    com.hp.alm.otaclient.IList supportsDataHidingFilterEntitiesTables();
    
    @VTID(38)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object supportsDataHidingFilterEntitiesTables(
            int index);
    
    /**
     * <p>
     * For HP use. Returns the loaded customization's master version
     * </p>
     * <p>
     * Getter method for the COM property "Version"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String version();
    
    /**
     * <p>
     * For HP use. Returns the customization master version
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(40)
    java.lang.String retrieveServerVersion();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * 
     * @param bMajorChange Mandatory boolean parameter.
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(41)
    void commit2(
            boolean bMajorChange);
    
    // Properties:
}
