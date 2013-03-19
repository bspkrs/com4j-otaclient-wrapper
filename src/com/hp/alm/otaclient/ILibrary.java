package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Library.
 */
@IID("{A9777EFF-7D62-4865-ADF6-1F1464A25E39}")
public interface ILibrary extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The Library Type (Created, Imported, TBD).
     * </p>
     * <p>
     * Getter method for the COM property "LibType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    int libType();
    
    /**
     * <p>
     * The library's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String name();
    
    /**
     * <p>
     * The library's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The library's parent library folder.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    /**
     * <p>
     * The user name of the library creator or importer.
     * </p>
     * <p>
     * Getter method for the COM property "CreatorUser"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String creatorUser();
    
    /**
     * <p>
     * The user name of the library creator or importer.
     * </p>
     * <p>
     * Setter method for the COM property "CreatorUser"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    void creatorUser(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Date on which the library was created.
     * </p>
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    java.util.Date creationDate();
    
    /**
     * <p>
     * The library parts factory of this library.
     * </p>
     * <p>
     * Getter method for the COM property "LibraryPartFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryPartFactory();
    
    /**
     * <p>
     * For HP use. The factory that manages baselines of this Library.
     * </p>
     * <p>
     * Getter method for the COM property "BaselineFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(32)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject baselineFactory();
    
    /**
     * <p>
     * For HP use. Synchronizes another library baseline into the current library. Both libraries type may be either exportable or imported.
     * </p>
     * 
     * @param srcLibrary Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param srcBaselineId Mandatory int parameter.
     * @param comparisonId Mandatory int parameter.
     * @param fieldsToSync Mandatory com.hp.alm.otaclient.IList parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(33)
    int beginSync(
            com.hp.alm.otaclient.ILibraryInfo srcLibrary,
            int srcBaselineId,
            int comparisonId,
            com.hp.alm.otaclient.IList fieldsToSync);
    
    /**
     * <p>
     * For HP use. Returns the LibraryInfo of this library. The returned baseline data is meaningless (it is here only because it is a part
     * of the LibraryInfo data).
     * </p>
     * <p>
     * Getter method for the COM property "LibraryInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryInfo();
    
    /**
     * <p>
     * For HP use. Performs verification before baseline creation.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.ILibraryOperationResult
     */
    
    @DISPID(33)
    //= 0x21. The runtime will prefer the VTID if present
    @VTID(35)
    com.hp.alm.otaclient.ILibraryOperationResult createBaselineVerification();
    
    /**
     * <p>
     * For HP use. Performs verification before libraries synchronization.
     * </p>
     * 
     * @param srcLibrary Mandatory com.hp.alm.otaclient.ILibraryInfo parameter.
     * @param srcBaselineId Mandatory int parameter.
     * @param comparisonId Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ILibraryOperationResult
     */
    
    @DISPID(34)
    //= 0x22. The runtime will prefer the VTID if present
    @VTID(36)
    com.hp.alm.otaclient.ILibraryOperationResult syncLibrariesVerification(
            com.hp.alm.otaclient.ILibraryInfo srcLibrary,
            int srcBaselineId,
            int comparisonId);
    
    /**
     * <p>
     * The asynchronous task ID of this library.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(37)
    int getLibraryTaskId();
    
    /**
     * <p>
     * The Content parts factory of this library.
     * </p>
     * <p>
     * Getter method for the COM property "ContentPartFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(38)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject contentPartFactory();
    
    // Properties:
}
