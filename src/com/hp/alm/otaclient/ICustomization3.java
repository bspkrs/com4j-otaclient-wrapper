package com.hp.alm.otaclient;

import com4j.*;

/**
 * Customization services, such as adding users to user groups, maintaining user-defined fields, configuring user access privileges.
 */
@IID("{D42ED49E-B4CD-4434-88E4-CB6A0521EF3A}")
public interface ICustomization3 extends com.hp.alm.otaclient.ICustomization2
{
    // Methods:
    /**
     * <p>
     * Returns the CustomizationTypes object.
     * </p>
     * <p>
     * Getter method for the COM property "Types"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject types();
    
    /**
     * <p>
     * Returns the names of the data tables that have a user label defined as comma-separated pairs of table names and user labels.
     * </p>
     * <p>
     * Getter method for the COM property "EntityDataTables"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String entityDataTables();
    
    /**
     * <p>
     * Returns the list of the customizable entities' table names.
     * </p>
     * <p>
     * Getter method for the COM property "CustomizableEntitiesTables"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(25)
    com.hp.alm.otaclient.IList customizableEntitiesTables();
    
    @VTID(25)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object customizableEntitiesTables(
            int index);
    
    /**
     * <p>
     * Returns the CustomizationRBT object.
     * </p>
     * <p>
     * Getter method for the COM property "RBT"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rbt();
    
    /**
     * <p>
     * Returns the CustomizationWorkflow object.
     * </p>
     * <p>
     * Getter method for the COM property "Workflow"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject workflow();
    
    // Properties:
}
