package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{21EABA3E-8FF5-46A1-B4C2-14998C9DA677}")
public interface ITDConnection4 extends com.hp.alm.otaclient.ITDConnection3
{
    // Methods:
    /**
     * <p>
     * Obsolete. Do not call this method.
     * </p>
     * 
     * @param isPublic Mandatory boolean parameter.
     * @param module Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(107)
    //= 0x6b. The runtime will prefer the VTID if present
    @VTID(116)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getFavoriteFolderFactory(
            boolean isPublic,
            java.lang.String module);
    
    /**
     * <p>
     * Obsolete. Do not call this method.
     * </p>
     * 
     * @param isPublic Mandatory boolean parameter.
     * @param module Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(108)
    //= 0x6c. The runtime will prefer the VTID if present
    @VTID(117)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getFavoriteFactory(
            boolean isPublic,
            java.lang.String module);
    
    /**
     * <p>
     * Obsolete. Do not call this method.
     * </p>
     * 
     * @param isPublic Mandatory boolean parameter.
     * @param module Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(109)
    //= 0x6d. The runtime will prefer the VTID if present
    @VTID(118)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getRootsFavoriteFolderFactory(
            boolean isPublic,
            java.lang.String module);
    
    /**
     * <p>
     * Obsolete. Do not call this method.
     * </p>
     * 
     * @param isPublic Mandatory boolean parameter.
     * @param module Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(110)
    //= 0x6e. The runtime will prefer the VTID if present
    @VTID(119)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getRootsFavoriteFactory(
            boolean isPublic,
            java.lang.String module);
    
    /**
     * <p>
     * For HP use. The factory that manages library folders.
     * </p>
     * <p>
     * Getter method for the COM property "LibraryFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(111)
    //= 0x6f. The runtime will prefer the VTID if present
    @VTID(120)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages libraries.
     * </p>
     * <p>
     * Getter method for the COM property "LibraryFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(112)
    //= 0x70. The runtime will prefer the VTID if present
    @VTID(121)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages baselines.
     * </p>
     * <p>
     * Getter method for the COM property "BaselineFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(113)
    //= 0x71. The runtime will prefer the VTID if present
    @VTID(122)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject baselineFactory();
    
    /**
     * <p>
     * The Policy Enforcement Status object of the connected project.
     * </p>
     * <p>
     * Getter method for the COM property "PolicyStatus"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(114)
    //= 0x72. The runtime will prefer the VTID if present
    @VTID(123)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject policyStatus();
    
    /**
     * <p>
     * The Template Manager object of the connected project.
     * </p>
     * <p>
     * Getter method for the COM property "TemplateManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(115)
    //= 0x73. The runtime will prefer the VTID if present
    @VTID(124)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject templateManager();
    
    /**
     * <p>
     * For HP use. Gets the factory that manages analysis item folders.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisItemFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(118)
    //= 0x76. The runtime will prefer the VTID if present
    @VTID(125)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject analysisItemFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages analysis items.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(119)
    //= 0x77. The runtime will prefer the VTID if present
    @VTID(126)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject analysisItemFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages the root analysis item folders.
     * </p>
     * <p>
     * Getter method for the COM property "RootsAnalysisItemFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(120)
    //= 0x78. The runtime will prefer the VTID if present
    @VTID(127)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rootsAnalysisItemFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages the root analysis items.
     * </p>
     * <p>
     * Getter method for the COM property "RootsAnalysisItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(121)
    //= 0x79. The runtime will prefer the VTID if present
    @VTID(128)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rootsAnalysisItemFactory();
    
    /**
     * <p>
     * The QC resource factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "QCResourceFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(122)
    //= 0x7a. The runtime will prefer the VTID if present
    @VTID(129)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject qcResourceFactory();
    
    /**
     * <p>
     * The QC resource folder factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "QCResourceFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(123)
    //= 0x7b. The runtime will prefer the VTID if present
    @VTID(130)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject qcResourceFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages dashboard folders.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(124)
    //= 0x7c. The runtime will prefer the VTID if present
    @VTID(131)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages dashboard pages.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardPageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(125)
    //= 0x7d. The runtime will prefer the VTID if present
    @VTID(132)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardPageFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages the root dashboard folders.
     * </p>
     * <p>
     * Getter method for the COM property "RootsDashboardFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(126)
    //= 0x7e. The runtime will prefer the VTID if present
    @VTID(133)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rootsDashboardFolderFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages the root dashboard pages.
     * </p>
     * <p>
     * Getter method for the COM property "RootsDashboardPageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(127)
    //= 0x7f. The runtime will prefer the VTID if present
    @VTID(134)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject rootsDashboardPageFactory();
    
    /**
     * <p>
     * For HP use. The Comparison Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComparisonFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(128)
    //= 0x80. The runtime will prefer the VTID if present
    @VTID(135)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject comparisonFactory();
    
    /**
     * <p>
     * For HP use. The ComparisonNode Factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ComparisonNodeFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(129)
    //= 0x81. The runtime will prefer the VTID if present
    @VTID(136)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject comparisonNodeFactory();
    
    /**
     * <p>
     * The AssetsRelationFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "AssetRelationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(130)
    //= 0x82. The runtime will prefer the VTID if present
    @VTID(137)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject assetRelationFactory();
    
    /**
     * <p>
     * The UserAssetFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "UserAssetFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(131)
    //= 0x83. The runtime will prefer the VTID if present
    @VTID(138)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject userAssetFactory();
    
    /**
     * <p>
     * The AssetRepositoryItemFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "AssetRepositoryItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(132)
    //= 0x84. The runtime will prefer the VTID if present
    @VTID(139)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject assetRepositoryItemFactory();
    
    /**
     * <p>
     * For HP use. Returns an instance of CrossProjectAPI for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "CrossProjectAPI"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(133)
    //= 0x85. The runtime will prefer the VTID if present
    @VTID(140)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject crossProjectAPI();
    
    /**
     * <p>
     * For HP use. The TaskFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TaskFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(134)
    //= 0x86. The runtime will prefer the VTID if present
    @VTID(141)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject taskFactory();
    
    /**
     * <p>
     * For HP use. The TaskLogFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "TaskLogFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(135)
    //= 0x87. The runtime will prefer the VTID if present
    @VTID(142)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject taskLogFactory();
    
    /**
     * <p>
     * Takes a simple text message and sends it as an HTML Mail using the Quality Center format.
     * </p>
     * 
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendFrom Optional parameter. Default value is ""
     * @param subject Optional parameter. Default value is ""
     * @param message Optional parameter. Default value is ""
     * @param attachArray Optional parameter. Default value is com4j.Variant.getMissing()
     */
    
    @DISPID(136)
    //= 0x88. The runtime will prefer the VTID if present
    @VTID(143)
    void sendFramedMail(
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendFrom,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String message,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object attachArray);
    
    /**
     * <p>
     * For HP use. The License Manager object.
     * </p>
     * <p>
     * Getter method for the COM property "LicenseManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(137)
    //= 0x89. The runtime will prefer the VTID if present
    @VTID(144)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject licenseManager();
    
    /**
     * <p>
     * For HP use. The dashboard page item factory.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardPageItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(138)
    //= 0x8a. The runtime will prefer the VTID if present
    @VTID(145)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardPageItemFactory();
    
    /**
     * <p>
     * The list of project descriptors under all domains that the current logged in user is allowed to connect to.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(139)
    //= 0x8b. The runtime will prefer the VTID if present
    @VTID(146)
    com.hp.alm.otaclient.IList getAllVisibleProjectDescriptors();
    
    @VTID(146)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object getAllVisibleProjectDescriptors(
            int index);
    
    /**
     * <p>
     * Refreshes the connection state: updates the Connected, LoggedIn, and ProjectConnected properties.
     * </p>
     */
    
    @DISPID(140)
    //= 0x8c. The runtime will prefer the VTID if present
    @VTID(147)
    void refreshConnectionState();
    
    /**
     * <p>
     * For HP use. Excel Report Manager.
     * </p>
     * <p>
     * Getter method for the COM property "ExcelReportManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(141)
    //= 0x8d. The runtime will prefer the VTID if present
    @VTID(148)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject excelReportManager();
    
    /**
     * <p>
     * For HP use. Sets the Client type version.
     * </p>
     * <p>
     * Setter method for the COM property "ClientVersion"
     * </p>
     * 
     * @param newVal Mandatory java.lang.String parameter.
     * @param rhs Optional parameter. Default value is ""
     */
    
    @DISPID(142)
    //= 0x8e. The runtime will prefer the VTID if present
    @VTID(149)
    void clientVersion(
            java.lang.String newVal,
            @Optional @DefaultValue("") java.lang.String rhs);
    
    // Properties:
}
