package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to perform customization tasks, such as adding users to user groups, defining user-defined fields, and defining user access
 * privileges.
 */
@IID("{9D4F53EF-41A2-4059-8AB3-13BBCA8333E8}")
public interface ICustomization extends com.hp.alm.otaclient.IObjectLockingSupport
{
    // Methods:
    /**
     * <p>
     * Loads all customization data from the server into the client cache. This includes actions, fields, lists, modules, permissions,
     * users, and user groups.
     * </p>
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void load();
    
    /**
     * <p>
     * Posts all customization data changes to the project database.
     * </p>
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void commit();
    
    /**
     * <p>
     * The CustomizationFields object.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fields();
    
    /**
     * <p>
     * The CustomizationLists object.
     * </p>
     * <p>
     * Getter method for the COM property "Lists"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject lists();
    
    /**
     * <p>
     * The CustomizationPermissions object.
     * </p>
     * <p>
     * Getter method for the COM property "Permissions"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject permissions();
    
    /**
     * <p>
     * The CustomizationUsers object.
     * </p>
     * <p>
     * Getter method for the COM property "Users"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject users();
    
    /**
     * <p>
     * The CustomizationUsersGroups object.
     * </p>
     * <p>
     * Getter method for the COM property "UsersGroups"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject usersGroups();
    
    /**
     * <p>
     * The CustomizationActions object.
     * </p>
     * <p>
     * Getter method for the COM property "Actions"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject actions();
    
    /**
     * <p>
     * The CustomizationModules object.
     * </p>
     * <p>
     * Getter method for the COM property "Modules"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject modules();
    
    /**
     * <p>
     * The CustomizationMailConditions object.
     * </p>
     * <p>
     * Getter method for the COM property "MailConditions"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(19)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject mailConditions();
    
    /**
     * <p>
     * Checks if the program can use the maximum allowable user-defined fields (99 user-defined fields and 3 memo fields).
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedUDFSupport"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    int extendedUDFSupport();
    
    // Properties:
}
