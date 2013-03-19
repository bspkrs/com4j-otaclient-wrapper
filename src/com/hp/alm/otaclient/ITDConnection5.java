package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{4F9F090A-6178-4C58-A9FE-33D0476D7729}")
public interface ITDConnection5 extends com.hp.alm.otaclient.ITDConnection4
{
    // Methods:
    /**
     * <p>
     * For HP use. QC's applicative session.
     * </p>
     * <p>
     * Getter method for the COM property "ApplicativeSessionCookie"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(143)
    //= 0x8f. The runtime will prefer the VTID if present
    @VTID(150)
    java.lang.String applicativeSessionCookie();
    
    /**
     * <p>
     * The BPModelPathFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelPathFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(144)
    //= 0x90. The runtime will prefer the VTID if present
    @VTID(151)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelPathFactory();
    
    /**
     * <p>
     * The BPModelFolderFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(145)
    //= 0x91. The runtime will prefer the VTID if present
    @VTID(152)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelFolderFactory();
    
    /**
     * <p>
     * The BPModelFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(146)
    //= 0x92. The runtime will prefer the VTID if present
    @VTID(153)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelFactory();
    
    /**
     * <p>
     * The BPModelElementFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelElementFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(147)
    //= 0x93. The runtime will prefer the VTID if present
    @VTID(154)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelElementFactory();
    
    /**
     * <p>
     * Deletes the specified runs.
     * </p>
     * 
     * @param testSetFilter Mandatory java.lang.String parameter.
     * @param runFilter Mandatory java.lang.String parameter.
     * @param keepLast Mandatory int parameter.
     * @param dateUnit Mandatory java.lang.Object parameter.
     * @param unitCount Mandatory int parameter.
     * @param stepsOnly Mandatory boolean parameter.
     */
    
    @DISPID(148)
    //= 0x94. The runtime will prefer the VTID if present
    @VTID(155)
    void purgeRuns2(
            java.lang.String testSetFilter,
            java.lang.String runFilter,
            int keepLast,
            @MarshalAs(NativeType.VARIANT) java.lang.Object dateUnit,
            int unitCount,
            boolean stepsOnly);
    
    /**
     * <p>
     * The DeletedAssetInfoFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "DeletedAssetInfoFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(149)
    //= 0x95. The runtime will prefer the VTID if present
    @VTID(156)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject deletedAssetInfoFactory();
    
    /**
     * <p>
     * The project list of linked projects to this project.
     * </p>
     * 
     * @param domainName Mandatory java.lang.String parameter.
     * @param projectName Mandatory java.lang.String parameter.
     * @param linkType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(150)
    //= 0x96. The runtime will prefer the VTID if present
    @VTID(157)
    com.hp.alm.otaclient.IList getLinkedProjects(
            java.lang.String domainName,
            java.lang.String projectName,
            java.lang.String linkType);
    
    /**
     * <p>
     * For HP use. Lightweight SSO authentication token for current user.
     * </p>
     * <p>
     * Getter method for the COM property "AuthenticationToken"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(151)
    //= 0x97. The runtime will prefer the VTID if present
    @VTID(158)
    java.lang.String authenticationToken();
    
    /**
     * <p>
     * For HP use. QC current session token.
     * </p>
     * <p>
     * Getter method for the COM property "SessionToken"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(152)
    //= 0x98. The runtime will prefer the VTID if present
    @VTID(159)
    java.lang.String sessionToken();
    
    /**
     * <p>
     * For HP use. Get KPIDefinitionFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "KPIDefinitionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(153)
    //= 0x99. The runtime will prefer the VTID if present
    @VTID(160)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiDefinitionFactory();
    
    /**
     * <p>
     * For HP use. Get KPIFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "KPIFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(154)
    //= 0x9a. The runtime will prefer the VTID if present
    @VTID(161)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiFactory();
    
    /**
     * <p>
     * For HP use. Get MilestoneFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(155)
    //= 0x9b. The runtime will prefer the VTID if present
    @VTID(162)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject milestoneFactory();
    
    /**
     * <p>
     * The TestCriterionFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TestCriterionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(156)
    //= 0x9c. The runtime will prefer the VTID if present
    @VTID(163)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testCriterionFactory();
    
    /**
     * <p>
     * The RunCriterionFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "RunCriterionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(157)
    //= 0x9d. The runtime will prefer the VTID if present
    @VTID(164)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runCriterionFactory();
    
    /**
     * <p>
     * The TestConfigFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TestConfigFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(158)
    //= 0x9e. The runtime will prefer the VTID if present
    @VTID(165)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testConfigFactory();
    
    /**
     * <p>
     * For HP use. Get ThresholdValueFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ThresholdValueFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(159)
    //= 0x9f. The runtime will prefer the VTID if present
    @VTID(166)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject thresholdValueFactory();
    
    /**
     * <p>
     * Gets metadata on different project types.
     * </p>
     * <p>
     * Getter method for the COM property "LoginMetadata"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(160)
    //= 0xa0. The runtime will prefer the VTID if present
    @VTID(167)
    java.lang.String loginMetadata();
    
    /**
     * <p>
     * The BPComponentFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponentFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(161)
    //= 0xa1. The runtime will prefer the VTID if present
    @VTID(168)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpComponentFactory();
    
    /**
     * <p>
     * The BPIterationFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPIterationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(162)
    //= 0xa2. The runtime will prefer the VTID if present
    @VTID(169)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpIterationFactory();
    
    /**
     * <p>
     * The ComponentParamFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(163)
    //= 0xa3. The runtime will prefer the VTID if present
    @VTID(170)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentParamFactory();
    
    /**
     * <p>
     * Get BPParamFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(164)
    //= 0xa4. The runtime will prefer the VTID if present
    @VTID(171)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpParamFactory();
    
    /**
     * <p>
     * Get BPIterationParamFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BPIterationParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(165)
    //= 0xa5. The runtime will prefer the VTID if present
    @VTID(172)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpIterationParamFactory();
    
    /**
     * <p>
     * For HP use. Get ScopeItemFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(167)
    //= 0xa7. The runtime will prefer the VTID if present
    @VTID(173)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject scopeItemFactory();
    
    /**
     * <p>
     * For HP use. Report Manager.
     * </p>
     * <p>
     * Getter method for the COM property "ReportManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(169)
    //= 0xa9. The runtime will prefer the VTID if present
    @VTID(174)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reportManager();
    
    /**
     * <p>
     * Get PublicEntityKeyFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "PublicEntityKeyFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(170)
    //= 0xaa. The runtime will prefer the VTID if present
    @VTID(175)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject publicEntityKeyFactory();
    
    /**
     * <p>
     * For HP use. The EventLogFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "EventLogFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(171)
    //= 0xab. The runtime will prefer the VTID if present
    @VTID(176)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject eventLogFactory();
    
    /**
     * <p>
     * For HP use. The bpm link factory for this connection
     * </p>
     * <p>
     * Getter method for the COM property "BPMLinkFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(172)
    //= 0xac. The runtime will prefer the VTID if present
    @VTID(177)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpmLinkFactory();
    
    /**
     * <p>
     * The content definition for this connection
     * </p>
     * <p>
     * Getter method for the COM property "ContentDefinitionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(173)
    //= 0xad. The runtime will prefer the VTID if present
    @VTID(178)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject contentDefinitionFactory();
    
    /**
     * <p>
     * For HP use. Get MilestoneScopeItemFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "MilestoneScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(174)
    //= 0xae. The runtime will prefer the VTID if present
    @VTID(179)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject milestoneScopeItemFactory();
    
    /**
     * <p>
     * For HP use. Get KPIMilestoneScopeItemFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "KPIMilestoneScopeItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(175)
    //= 0xaf. The runtime will prefer the VTID if present
    @VTID(180)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiMilestoneScopeItemFactory();
    
    /**
     * <p>
     * For HP use. Generic one string parameter call
     * </p>
     * 
     * @param requestName Mandatory java.lang.String parameter.
     * @param input Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(176)
    //= 0xb0. The runtime will prefer the VTID if present
    @VTID(181)
    java.lang.String genericOneParamCall(
            java.lang.String requestName,
            java.lang.String input);
    
    /**
     * <p>
     * Returns the factory that manages favorite folders.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(177)
    //= 0xb1. The runtime will prefer the VTID if present
    @VTID(182)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getCommonFavoriteFolderFactory();
    
    /**
     * <p>
     * Returns the factory that manages favorites.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(178)
    //= 0xb2. The runtime will prefer the VTID if present
    @VTID(183)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getCommonFavoriteFactory();
    
    /**
     * <p>
     * The RunIterationFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "RunIterationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(179)
    //= 0xb3. The runtime will prefer the VTID if present
    @VTID(184)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runIterationFactory();
    
    /**
     * <p>
     * For HP use. Get AttachmentFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "AttachmentFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(180)
    //= 0xb4. The runtime will prefer the VTID if present
    @VTID(185)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachmentFactory();
    
    /**
     * <p>
     * For HP use. Confirms that the user is authorized to use Quality Center using LWSSO token. If authorized, the user is logged in and
     * can connect to projects.
     * </p>
     * 
     * @param token Mandatory java.lang.String parameter.
     */
    
    @DISPID(181)
    //= 0xb5. The runtime will prefer the VTID if present
    @VTID(186)
    void loginWithAuthenticationToken(
            java.lang.String token);
    
    /**
     * <p>
     * For HP use. Getting the edition of the QC server.
     * </p>
     * <p>
     * Getter method for the COM property "Edition"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(182)
    //= 0xb6. The runtime will prefer the VTID if present
    @VTID(187)
    int edition();
    
    /**
     * <p>
     * For HP use. Getting the denied features of the QC server.
     * </p>
     * <p>
     * Getter method for the COM property "DeniedFeatures"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(183)
    //= 0xb7. The runtime will prefer the VTID if present
    @VTID(188)
    java.lang.String deniedFeatures();
    
    /**
     * <p>
     * For HP use. Returns a ReportUserTemplateFactory
     * </p>
     * <p>
     * Getter method for the COM property "ReportUserTemplateFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(184)
    //= 0xb8. The runtime will prefer the VTID if present
    @VTID(189)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reportUserTemplateFactory();
    
    /**
     * <p>
     * For HP use. Confirms that the user is authorized to use Quality Center. If authorized, the user is logged in and can connect to
     * projects. Return the list of project descriptors under all domains that the current logged in user is allowed to connect to.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param password Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(185)
    //= 0xb9. The runtime will prefer the VTID if present
    @VTID(190)
    com.hp.alm.otaclient.IList loginEx(
            java.lang.String userName,
            java.lang.String password);
    
    /**
     * <p>
     * For HP use. Returns the brand of the QC server.
     * </p>
     * <p>
     * Getter method for the COM property "Brand"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(186)
    //= 0xba. The runtime will prefer the VTID if present
    @VTID(191)
    java.lang.String brand();
    
    /**
     * <p>
     * For HP use. Returns the brand display name of the QC server.
     * </p>
     * <p>
     * Getter method for the COM property "BrandDisplayName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(187)
    //= 0xbb. The runtime will prefer the VTID if present
    @VTID(192)
    java.lang.String brandDisplayName();
    
    /**
     * <p>
     * For HP use. Get server address - try to get DNS name if DNS name can't be reach then return IP address
     * </p>
     * <p>
     * Getter method for the COM property "ServerAddress"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(188)
    //= 0xbc. The runtime will prefer the VTID if present
    @VTID(193)
    java.lang.String serverAddress();
    
    /**
     * <p>
     * For HP use. Returns the current connected project descriptor.
     * </p>
     * <p>
     * Getter method for the COM property "ConnectedProjectDescriptor"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IProjectDescriptor
     */
    
    @DISPID(189)
    //= 0xbd. The runtime will prefer the VTID if present
    @VTID(194)
    com.hp.alm.otaclient.IProjectDescriptor connectedProjectDescriptor();
    
    /**
     * <p>
     * For HP use. Returns a ReportToReportProjectTemplateLinkFactory
     * </p>
     * <p>
     * Getter method for the COM property "ReportToReportProjectTemplateLinkFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(190)
    //= 0xbe. The runtime will prefer the VTID if present
    @VTID(195)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reportToReportProjectTemplateLinkFactory();
    
    /**
     * <p>
     * The CoverageFactory for the connection.
     * </p>
     * <p>
     * Getter method for the COM property "CoverageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(191)
    //= 0xbf. The runtime will prefer the VTID if present
    @VTID(196)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject coverageFactory();
    
    /**
     * <p>
     * The ComponentStepFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentStepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(192)
    //= 0xc0. The runtime will prefer the VTID if present
    @VTID(197)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentStepFactory();
    
    /**
     * <p>
     * The login session ID.
     * </p>
     * <p>
     * Getter method for the COM property "LoginSessionId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(193)
    //= 0xc1. The runtime will prefer the VTID if present
    @VTID(198)
    int loginSessionId();
    
    /**
     * <p>
     * The project session ID.
     * </p>
     * <p>
     * Getter method for the COM property "ProjectSessionId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(194)
    //= 0xc2. The runtime will prefer the VTID if present
    @VTID(199)
    int projectSessionId();
    
    /**
     * <p>
     * For HP use. Reconnects a client that was disconnected by server.
     * </p>
     * 
     * @param password Mandatory java.lang.String parameter.
     */
    
    @DISPID(195)
    //= 0xc3. The runtime will prefer the VTID if present
    @VTID(200)
    void reconnect(
            java.lang.String password);
    
    /**
     * <p>
     * For HP use. Disconnect locally. Use this method in order to disconnect a client without sending a disconnect request to the server
     * </p>
     */
    
    @DISPID(196)
    //= 0xc4. The runtime will prefer the VTID if present
    @VTID(201)
    void disconnectLocally();
    
    /**
     * <p>
     * The Step Factory for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "StepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(197)
    //= 0xc5. The runtime will prefer the VTID if present
    @VTID(202)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject stepFactory();
    
    // Properties:
}
