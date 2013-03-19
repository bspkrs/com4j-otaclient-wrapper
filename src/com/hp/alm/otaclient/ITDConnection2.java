package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{4E3DA2DC-070F-4E73-BE64-2E91A8CA7DF8}")
public interface ITDConnection2 extends com.hp.alm.otaclient.ITDConnection
{
    // Methods:
    /**
     * <p>
     * An IProductInfo reference pointing to the current build information.
     * </p>
     * <p>
     * Getter method for the COM property "ProductInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(75)
    //= 0x4b. The runtime will prefer the VTID if present
    @VTID(84)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject productInfo();
    
    /**
     * <p>
     * The GraphBuilder object for the connection.
     * </p>
     * <p>
     * Getter method for the COM property "GraphBuilder"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(76)
    //= 0x4c. The runtime will prefer the VTID if present
    @VTID(85)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject graphBuilder();
    
    /**
     * <p>
     * The global AuditRecord factory, not associated with a specific entity.
     * </p>
     * <p>
     * Getter method for the COM property "AuditRecordFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(77)
    //= 0x4d. The runtime will prefer the VTID if present
    @VTID(86)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject auditRecordFactory();
    
    /**
     * <p>
     * The global AuditProperty factory, not associated with a specific entity.
     * </p>
     * <p>
     * Getter method for the COM property "AuditPropertyFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(78)
    //= 0x4e. The runtime will prefer the VTID if present
    @VTID(87)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject auditPropertyFactory();
    
    /**
     * <p>
     * The factory that manages test instances in test sets.
     * </p>
     * <p>
     * Getter method for the COM property "TSTestFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(79)
    //= 0x4f. The runtime will prefer the VTID if present
    @VTID(88)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject tsTestFactory();
    
    /**
     * <p>
     * Checks if the search function is enabled for the project.
     * </p>
     * <p>
     * Getter method for the COM property "IsSearchSupported"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(80)
    //= 0x50. The runtime will prefer the VTID if present
    @VTID(89)
    boolean isSearchSupported();
    
    /**
     * <p>
     * Confirms that the user is authorized to use Quality Center. If authorized, the user is logged in and can connect to projects.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param password Mandatory java.lang.String parameter.
     */
    
    @DISPID(81)
    //= 0x51. The runtime will prefer the VTID if present
    @VTID(90)
    void login(
            java.lang.String userName,
            java.lang.String password);
    
    /**
     * <p>
     * Connects the logged-in user to the specified project in the domain.
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @param projectName Mandatory java.lang.String parameter.
     */
    
    @DISPID(82)
    //= 0x52. The runtime will prefer the VTID if present
    @VTID(91)
    void connect(
            java.lang.String domainName,
            java.lang.String projectName);
    
    /**
     * <p>
     * Disconnects the user from the currently connected project.
     * </p>
     */
    
    @DISPID(83)
    //= 0x53. The runtime will prefer the VTID if present
    @VTID(92)
    void disconnect();
    
    /**
     * <p>
     * Terminates the user's session on this TDConnection.
     * </p>
     */
    
    @DISPID(84)
    //= 0x54. The runtime will prefer the VTID if present
    @VTID(93)
    void logout();
    
    /**
     * <p>
     * Checks if the user is currently logged in on this TDConnection.
     * </p>
     * <p>
     * Getter method for the COM property "LoggedIn"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(85)
    //= 0x55. The runtime will prefer the VTID if present
    @VTID(94)
    boolean loggedIn();
    
    /**
     * <p>
     * The list of domain names that the current logged in user is permitted to view.
     * </p>
     * <p>
     * Getter method for the COM property "VisibleDomains"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(86)
    //= 0x56. The runtime will prefer the VTID if present
    @VTID(95)
    com.hp.alm.otaclient.IList visibleDomains();
    
    @VTID(95)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object visibleDomains(
            int index);
    
    /**
     * <p>
     * The list of projects in the specified domain that the current logged in user is allowed to connect to.
     * </p>
     * <p>
     * Getter method for the COM property "VisibleProjects"
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(87)
    //= 0x57. The runtime will prefer the VTID if present
    @VTID(96)
    com.hp.alm.otaclient.IList visibleProjects(
            java.lang.String domainName);
    
    // Properties:
}
