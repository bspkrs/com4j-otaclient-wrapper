package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{DB67E08D-7FA7-4DAC-87BB-2A55CBFFE008}")
public interface ITDConnection extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Checks if the Open Test Architecture API server connection is initialized.
     * </p>
     * <p>
     * Getter method for the COM property "Connected"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean connected();
    
    /**
     * <p>
     * Checks if the TDConnection is connected to a project.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectConnected"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean projectConnected();
    
    /**
     * <p>
     * The name of the connected Open Test Architecture API server.
     * </p>
     * <p>
     * Getter method for the COM property "ServerName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String serverName();
    
    /**
     * <p>
     * The name of the connected project.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String projectName();
    
    /**
     * <p>
     * The path of the tests directory of the connected project.
     * </p>
     * <p>
     * Getter method for the COM property "TestRepository"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String testRepository();
    
    /**
     * <p>
     * The user connected to the project.
     * </p>
     * <p>
     * Getter method for the COM property "UserName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String userName();
    
    /**
     * <p>
     * The Test Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TestFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testFactory();
    
    /**
     * <p>
     * The Bug Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BugFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bugFactory();
    
    /**
     * <p>
     * The Test Set Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TestSetFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testSetFactory();
    
    /**
     * <p>
     * The names of the user groups of the currently connected project.
     * </p>
     * <p>
     * Getter method for the COM property "UserGroupsList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(16)
    com.hp.alm.otaclient.IList userGroupsList();
    
    @VTID(16)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object userGroupsList(
            int index);
    
    /**
     * <p>
     * The Hosts Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "HostFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject hostFactory();
    
    /**
     * <p>
     * The Version Control System (VCS) object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "VCS"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject vcs();
    
    /**
     * <p>
     * For HP use. Initializes the Open Test Architecture API server connection for specified domain.
     * </p>
     * 
     * @param serverName Mandatory java.lang.String parameter.
     * @param domainName Optional parameter. Default value is ""
     * @param domainPswd Optional parameter. Default value is ""
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(19)
    void initConnection(
            java.lang.String serverName,
            @Optional @DefaultValue("") java.lang.String domainName,
            @Optional @DefaultValue("") java.lang.String domainPswd);
    
    /**
     * <p>
     * Releases the COM pointer created when the connection is initialized.
     * </p>
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    void releaseConnection();
    
    /**
     * <p>
     * Connects to the specified project.
     * </p>
     * 
     * @param projectName Mandatory java.lang.String parameter.
     * @param userName Mandatory java.lang.String parameter.
     * @param password Optional parameter. Default value is ""
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    void connectProject(
            java.lang.String projectName,
            java.lang.String userName,
            @Optional @DefaultValue("") java.lang.String password);
    
    /**
     * <p>
     * Disconnects from the project.
     * </p>
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    void disconnectProject();
    
    /**
     * <p>
     * The projects that are available in the domain to which Quality Center is connected.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectsList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    com.hp.alm.otaclient.IList projectsList();
    
    @VTID(23)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object projectsList(
            int index);
    
    /**
     * <p>
     * The Command object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "Command"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject command();
    
    /**
     * <p>
     * The TreeManager object for the system tree.
     * </p>
     * <p>
     * Getter method for the COM property "TreeManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject treeManager();
    
    /**
     * <p>
     * The ReqFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ReqFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reqFactory();
    
    /**
     * <p>
     * The ActionPermission object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ActionPermission"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject actionPermission();
    
    /**
     * <p>
     * For HP use. Allocates a license type according to the LicenseType parameter.
     * </p>
     * 
     * @param licenseType Mandatory int parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(28)
    void getLicense(
            int licenseType);
    
    /**
     * <p>
     * Sends Mail.
     * </p>
     * 
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendFrom Optional parameter. Default value is ""
     * @param subject Optional parameter. Default value is ""
     * @param message Optional parameter. Default value is ""
     * @param attachArray Optional parameter. Default value is com4j.Variant.getMissing()
     * @param bsFormat Optional parameter. Default value is ""
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(29)
    void sendMail(
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendFrom,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String message,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object attachArray,
            @Optional @DefaultValue("") java.lang.String bsFormat);
    
    /**
     * <p>
     * The database type.
     * </p>
     * <p>
     * Getter method for the COM property "DBType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String dbType();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "DBManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dbManager();
    
    /**
     * <p>
     * The Customization object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "Customization"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(32)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject customization();
    
    /**
     * <p>
     * A list of fields for the table specified in the DataType argument.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @param dataType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(33)
    com.hp.alm.otaclient.IList fields(
            java.lang.String dataType);
    
    /**
     * <p>
     * The Settings object for all users in this connection.
     * </p>
     * <p>
     * Getter method for the COM property "CommonSettings"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject commonSettings();
    
    /**
     * <p>
     * The Settings object for the logged-on user.
     * </p>
     * <p>
     * Getter method for the COM property "UserSettings"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject userSettings();
    
    /**
     * <p>
     * The HostGroupFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "HostGroupFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(36)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject hostGroupFactory();
    
    /**
     * <p>
     * Changes the password for the currently logged in user.
     * </p>
     * 
     * @param oldPassword Mandatory java.lang.String parameter.
     * @param newPassword Mandatory java.lang.String parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(37)
    void changePassword(
            java.lang.String oldPassword,
            java.lang.String newPassword);
    
    /**
     * <p>
     * The names of the users of the currently connected project.
     * </p>
     * <p>
     * Getter method for the COM property "UsersList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(38)
    com.hp.alm.otaclient.IList usersList();
    
    @VTID(38)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object usersList(
            int index);
    
    /**
     * <p>
     * For HP use. The password for the logged in user.
     * </p>
     * <p>
     * Getter method for the COM property "Password"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String password();
    
    /**
     * <p>
     * Disabled by default security settings. Use the entity-level extended storage property.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(40)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extendedStorage();
    
    /**
     * <p>
     * The path of the server side repository directory for the database repository type.
     * </p>
     * <p>
     * Getter method for the COM property "DirectoryPath"
     * </p>
     * 
     * @param nType Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(41)
    java.lang.String directoryPath(
            int nType);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(42)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject changeFactory();
    
    /**
     * <p>
     * The TDMailConditions object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "MailConditions"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(43)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject mailConditions();
    
    /**
     * <p>
     * The time and date of the application server.
     * </p>
     * <p>
     * Getter method for the COM property "ServerTime"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(44)
    java.util.Date serverTime();
    
    /**
     * <p>
     * For future use. An ITDSettings reference.
     * </p>
     * <p>
     * Getter method for the COM property "TDSettings"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(45)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject tdSettings();
    
    /**
     * <p>
     * Deletes the specified runs.
     * </p>
     * 
     * @param testSetFilter Mandatory java.lang.String parameter.
     * @param keepLast Mandatory int parameter.
     * @param dateUnit Mandatory java.lang.Object parameter.
     * @param unitCount Mandatory int parameter.
     * @param stepsOnly Mandatory boolean parameter.
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(46)
    void purgeRuns(
            java.lang.String testSetFilter,
            int keepLast,
            @MarshalAs(NativeType.VARIANT) java.lang.Object dateUnit,
            int unitCount,
            boolean stepsOnly);
    
    /**
     * <p>
     * The ProjectProperties object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectProperties"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(47)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject projectProperties();
    
    /**
     * <p>
     * The license status for the specified client type.
     * </p>
     * 
     * @param clientType Mandatory int parameter.
     * @param inUse Mandatory Holder<Integer> parameter.
     * @param max Mandatory Holder<Integer> parameter.
     */
    
    @DISPID(42)
    //= 0x2a. The runtime will prefer the VTID if present
    @VTID(48)
    void getLicenseStatus(
            int clientType,
            Holder<Integer> inUse,
            Holder<Integer> max);
    
    /**
     * <p>
     * The current domain.
     * </p>
     * <p>
     * Getter method for the COM property "DomainName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(43)
    //= 0x2b. The runtime will prefer the VTID if present
    @VTID(49)
    java.lang.String domainName();
    
    /**
     * <p>
     * The TextParser object.
     * </p>
     * <p>
     * Getter method for the COM property "TextParam"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(44)
    //= 0x2c. The runtime will prefer the VTID if present
    @VTID(50)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject textParam();
    
    /**
     * <p>
     * Gets the value of the parameter whose name is specified by Request.
     * </p>
     * <p>
     * Getter method for the COM property "TDParams"
     * </p>
     * 
     * @param request Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(45)
    //= 0x2d. The runtime will prefer the VTID if present
    @VTID(51)
    java.lang.String tdParams(
            java.lang.String request);
    
    /**
     * <p>
     * Indicates if a progress bar is displayed.
     * </p>
     * <p>
     * Getter method for the COM property "UsingProgress"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(46)
    //= 0x2e. The runtime will prefer the VTID if present
    @VTID(52)
    boolean usingProgress();
    
    /**
     * <p>
     * Indicates if a progress bar is displayed.
     * </p>
     * <p>
     * Setter method for the COM property "UsingProgress"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(46)
    //= 0x2e. The runtime will prefer the VTID if present
    @VTID(53)
    void usingProgress(
            boolean pVal);
    
    /**
     * <p>
     * The path of the checkout repository.
     * </p>
     * <p>
     * Getter method for the COM property "CheckoutRepository"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(47)
    //= 0x2f. The runtime will prefer the VTID if present
    @VTID(54)
    java.lang.String checkoutRepository();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "ViewsRepository"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(48)
    //= 0x30. The runtime will prefer the VTID if present
    @VTID(55)
    java.lang.String viewsRepository();
    
    /**
     * <p>
     * The path of the VCS database of the connected project.
     * </p>
     * <p>
     * Getter method for the COM property "VcsDbRepository"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(49)
    //= 0x31. The runtime will prefer the VTID if present
    @VTID(56)
    java.lang.String vcsDbRepository();
    
    /**
     * <p>
     * The RunFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "RunFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(50)
    //= 0x32. The runtime will prefer the VTID if present
    @VTID(57)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runFactory();
    
    /**
     * <p>
     * Checks if the specified module is visible to the connected user. This property is used for Quality Center UI programming and has no
     * function in third-party applications.
     * </p>
     * <p>
     * Getter method for the COM property "ModuleVisible"
     * </p>
     * 
     * @param moduleID Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(51)
    //= 0x33. The runtime will prefer the VTID if present
    @VTID(58)
    boolean moduleVisible(
            int moduleID);
    
    /**
     * <p>
     * Initializes the connection.
     * </p>
     * 
     * @param serverName Mandatory java.lang.String parameter.
     */
    
    @DISPID(52)
    //= 0x34. The runtime will prefer the VTID if present
    @VTID(59)
    void initConnectionEx(
            java.lang.String serverName);
    
    /**
     * <p>
     * The projects available within the specified domain.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectsListEx"
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(53)
    //= 0x35. The runtime will prefer the VTID if present
    @VTID(60)
    com.hp.alm.otaclient.IList projectsListEx(
            java.lang.String domainName);
    
    /**
     * <p>
     * Connects to the specified project in the specified domain.
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @param projectName Mandatory java.lang.String parameter.
     * @param userName Mandatory java.lang.String parameter.
     * @param password Optional parameter. Default value is ""
     */
    
    @DISPID(54)
    //= 0x36. The runtime will prefer the VTID if present
    @VTID(61)
    void connectProjectEx(
            java.lang.String domainName,
            java.lang.String projectName,
            java.lang.String userName,
            @Optional @DefaultValue("") java.lang.String password);
    
    /**
     * <p>
     * The domain names for this site.
     * </p>
     * <p>
     * Getter method for the COM property "DomainsList"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(55)
    //= 0x37. The runtime will prefer the VTID if present
    @VTID(62)
    com.hp.alm.otaclient.IList domainsList();
    
    @VTID(62)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object domainsList(
            int index);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param password Mandatory java.lang.String parameter.
     * @param copyDesStep Mandatory java.lang.String parameter.
     */
    
    @DISPID(56)
    //= 0x38. The runtime will prefer the VTID if present
    @VTID(63)
    void connectToVCSAs(
            java.lang.String userName,
            java.lang.String password,
            java.lang.String copyDesStep);
    
    /**
     * <p>
     * Allocates multiple licenses types according to the LicensesType parameter.
     * </p>
     * 
     * @param licensesType Mandatory int parameter.
     * @param pVal Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(57)
    //= 0x39. The runtime will prefer the VTID if present
    @VTID(64)
    void getLicenses(
            int licensesType,
            Holder<java.lang.String> pVal);
    
    /**
     * <p>
     * For HP use. Property Analysis.
     * </p>
     * <p>
     * Getter method for the COM property "Analysis"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(58)
    //= 0x3a. The runtime will prefer the VTID if present
    @VTID(65)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject analysis();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "VMRepository"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(59)
    //= 0x3b. The runtime will prefer the VTID if present
    @VTID(66)
    java.lang.String vmRepository();
    
    /**
     * <p>
     * The name of the database.
     * </p>
     * <p>
     * Getter method for the COM property "DBName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(60)
    //= 0x3c. The runtime will prefer the VTID if present
    @VTID(67)
    java.lang.String dbName();
    
    /**
     * <p>
     * The RuleManager object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "Rules"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(61)
    //= 0x3d. The runtime will prefer the VTID if present
    @VTID(68)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rules();
    
    /**
     * <p>
     * The TestSetTreeManager object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TestSetTreeManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(62)
    //= 0x3e. The runtime will prefer the VTID if present
    @VTID(69)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testSetTreeManager();
    
    /**
     * <p>
     * The AlertManager object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "AlertManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(63)
    //= 0x3f. The runtime will prefer the VTID if present
    @VTID(70)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject alertManager();
    
    /**
     * <p>
     * For HP use. Allows repeat call to InitConnection,ReleaseConnection, ConnectProject and DisconnectProject.
     * </p>
     * <p>
     * Getter method for the COM property "AllowReconnect"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(64)
    //= 0x40. The runtime will prefer the VTID if present
    @VTID(71)
    boolean allowReconnect();
    
    /**
     * <p>
     * For HP use. Allows repeat call to InitConnection,ReleaseConnection, ConnectProject and DisconnectProject.
     * </p>
     * <p>
     * Setter method for the COM property "AllowReconnect"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(64)
    //= 0x40. The runtime will prefer the VTID if present
    @VTID(72)
    void allowReconnect(
            boolean pVal);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * 
     * @param password Mandatory java.lang.String parameter.
     */
    
    @DISPID(65)
    //= 0x41. The runtime will prefer the VTID if present
    @VTID(73)
    void synchronizeFollowUps(
            java.lang.String password);
    
    /**
     * <p>
     * For HP use. Prevents automatic disconnect by server on timeout.
     * </p>
     * <p>
     * Getter method for the COM property "KeepConnection"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(66)
    //= 0x42. The runtime will prefer the VTID if present
    @VTID(74)
    boolean keepConnection();
    
    /**
     * <p>
     * For HP use. Prevents automatic disconnect by server on timeout.
     * </p>
     * <p>
     * Setter method for the COM property "KeepConnection"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(66)
    //= 0x42. The runtime will prefer the VTID if present
    @VTID(75)
    void keepConnection(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if formatted memo and description fields are returned as plain text without HTML tags.
     * </p>
     * <p>
     * Getter method for the COM property "IgnoreHtmlFormat"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(67)
    //= 0x43. The runtime will prefer the VTID if present
    @VTID(76)
    boolean ignoreHtmlFormat();
    
    /**
     * <p>
     * Indicates if formatted memo and description fields are returned as plain text without HTML tags.
     * </p>
     * <p>
     * Setter method for the COM property "IgnoreHtmlFormat"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(67)
    //= 0x43. The runtime will prefer the VTID if present
    @VTID(77)
    void ignoreHtmlFormat(
            boolean pVal);
    
    /**
     * <p>
     * The report role of the connected user.
     * </p>
     * <p>
     * Getter method for the COM property "ReportRole"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(68)
    //= 0x44. The runtime will prefer the VTID if present
    @VTID(78)
    java.lang.String reportRole();
    
    /**
     * <p>
     * For HP use. Sets the Client type.
     * </p>
     * <p>
     * Setter method for the COM property "ClientType"
     * </p>
     * 
     * @param newVal Mandatory java.lang.String parameter.
     * @param rhs Optional parameter. Default value is ""
     */
    
    @DISPID(69)
    //= 0x45. The runtime will prefer the VTID if present
    @VTID(79)
    void clientType(
            java.lang.String newVal,
            @Optional @DefaultValue("") java.lang.String rhs);
    
    /**
     * <p>
     * For HP use. The Component Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(70)
    //= 0x46. The runtime will prefer the VTID if present
    @VTID(80)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentFactory();
    
    /**
     * <p>
     * The Component Folder Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(71)
    //= 0x47. The runtime will prefer the VTID if present
    @VTID(81)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentFolderFactory();
    
    /**
     * <p>
     * The major and minor versions of the OTA API.
     * </p>
     * 
     * @param pbsMajorVersion Mandatory Holder<java.lang.String> parameter.
     * @param pbsBuildNum Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(72)
    //= 0x48. The runtime will prefer the VTID if present
    @VTID(82)
    void getTDVersion(
            Holder<java.lang.String> pbsMajorVersion,
            Holder<java.lang.String> pbsBuildNum);
    
    /**
     * <p>
     * The URL of the connected server.
     * </p>
     * <p>
     * Getter method for the COM property "ServerURL"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(73)
    //= 0x49. The runtime will prefer the VTID if present
    @VTID(83)
    java.lang.String serverURL();
    
    // Properties:
}
