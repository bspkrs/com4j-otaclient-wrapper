package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Comparison.
 */
@IID("{CDFF6E1D-5B22-44E4-8877-510D4FB0A1BD}")
public interface IComparison extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The comparison's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * The comparison's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user name of the comparison's creator or importer.
     * </p>
     * <p>
     * Getter method for the COM property "CreatorUser"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String creatorUser();
    
    /**
     * <p>
     * The Date at which the comparison was created at.
     * </p>
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.util.Date creationDate();
    
    /**
     * <p>
     * The left entity which was compared. This property returns null until the compare method is called.
     * </p>
     * <p>
     * Getter method for the COM property "LeftEntityId"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ILibraryInfo
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    com.hp.alm.otaclient.ILibraryInfo leftEntityId();
    
    /**
     * <p>
     * The right entity which was compared. This property returns null until the compare method is called.
     * </p>
     * <p>
     * Getter method for the COM property "RightEntityId"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ILibraryInfo
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    com.hp.alm.otaclient.ILibraryInfo rightEntityId();
    
    /**
     * <p>
     * The left root of the comparison. This property returns null until the compare method returns.
     * </p>
     * <p>
     * Getter method for the COM property "LeftRoot"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IComparisonNode
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(29)
    com.hp.alm.otaclient.IComparisonNode leftRoot();
    
    /**
     * <p>
     * The right root of the comparison. This property returns null until the compare method returns.
     * </p>
     * <p>
     * Getter method for the COM property "RightRoot"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IComparisonNode
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    com.hp.alm.otaclient.IComparisonNode rightRoot();
    
    /**
     * <p>
     * The state of the comparison process.
     * </p>
     * <p>
     * Getter method for the COM property "State"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(31)
    int state();
    
    /**
     * <p>
     * Compare between two Libraries. Always from current ((l/r)cComparedBaselineId == -1) of one library - to a specific
     * (r/l)ComparedBaselineId of the other Library.
     * </p>
     * 
     * @param lv Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param lComparedBaselineId Mandatory int parameter.
     * @param rv Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param rComparedBaselineId Mandatory int parameter.
     * @param comparisonSettingsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param pLeftRoot Mandatory Holder<com.hp.alm.otaclient.IComparisonNode> parameter.
     * @param pRightRoot Mandatory Holder<com.hp.alm.otaclient.IComparisonNode> parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(32)
    void compareLibraries(
            com.hp.alm.otaclient.ILibraryInfo lv,
            int lComparedBaselineId,
            com.hp.alm.otaclient.ILibraryInfo rv,
            int rComparedBaselineId,
            com.hp.alm.otaclient.IList comparisonSettingsList,
            Holder<com.hp.alm.otaclient.IComparisonNode> pLeftRoot,
            Holder<com.hp.alm.otaclient.IComparisonNode> pRightRoot);
    
    /**
     * <p>
     * Compare between two Baselines.
     * </p>
     * 
     * @param oldBaselineId Mandatory int parameter.
     * @param newBaselineId Mandatory int parameter.
     * @param comparisonSettingsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param pLeftRoot Mandatory Holder<com.hp.alm.otaclient.IComparisonNode> parameter.
     * @param pRightRoot Mandatory Holder<com.hp.alm.otaclient.IComparisonNode> parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(33)
    void compareBaselines(
            int oldBaselineId,
            int newBaselineId,
            com.hp.alm.otaclient.IList comparisonSettingsList,
            Holder<com.hp.alm.otaclient.IComparisonNode> pLeftRoot,
            Holder<com.hp.alm.otaclient.IComparisonNode> pRightRoot);
    
    /**
     * <p>
     * Get a single new Comparison Settings object for a specific given type.
     * </p>
     * 
     * @param pType Mandatory java.lang.String parameter.
     * @param fieldsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param attachmentsNeeded Mandatory boolean parameter.
     * @param richContentNeeded Mandatory boolean parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IComparisonSettings
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(34)
    com.hp.alm.otaclient.IComparisonSettings getComparisonSettings(
            java.lang.String pType,
            com.hp.alm.otaclient.IList fieldsList,
            boolean attachmentsNeeded,
            boolean richContentNeeded);
    
    /**
     * <p>
     * Compares two entities of the same type that are mapped through libraries using a given set of comparison setting.
     * </p>
     * 
     * @param importerInfo Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param importerBaseLineId Mandatory int parameter.
     * @param exportableInfo Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param exportableBaselineId Mandatory int parameter.
     * @param comparisonSettingsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param importedEntityId Mandatory int parameter.
     * @param exportableEntityId Mandatory int parameter.
     * @param compareEntityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(35)
    com.hp.alm.otaclient.IList compareEntities(
            com.hp.alm.otaclient.ILibraryInfo importerInfo,
            int importerBaseLineId,
            com.hp.alm.otaclient.ILibraryInfo exportableInfo,
            int exportableBaselineId,
            com.hp.alm.otaclient.IList comparisonSettingsList,
            int importedEntityId,
            int exportableEntityId,
            java.lang.String compareEntityType);
    
    /**
     * <p>
     * Compares two versions of entity using a given set of comparison settings.
     * </p>
     * 
     * @param entityID Mandatory int parameter.
     * @param firstVersionId Mandatory int parameter.
     * @param secondVersionId Mandatory int parameter.
     * @param comparisonSettingsList Mandatory com.hp.alm.otaclient.IList parameter.
     * @param compareEntityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(36)
    com.hp.alm.otaclient.IList compareVersionedEntities(
            int entityID,
            int firstVersionId,
            int secondVersionId,
            com.hp.alm.otaclient.IList comparisonSettingsList,
            java.lang.String compareEntityType);
    
    /**
     * <p>
     * Returns the count of a given comparison change type (Added/Moved/Modified/Removed) for a given entity folder type (e.g. REQ /
     * ALL_LISTS / COMPONENT_FOLDER) for a given tree (Left/Right).
     * </p>
     * 
     * @param isLeft Mandatory boolean parameter.
     * @param folderEntityType Mandatory java.lang.String parameter.
     * @param comparisonChangeType Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(37)
    int getComparisonStatistics(
            boolean isLeft,
            java.lang.String folderEntityType,
            int comparisonChangeType);
    
    // Properties:
}
