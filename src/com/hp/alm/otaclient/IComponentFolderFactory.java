package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the organization of business components.
 */
@IID("{D6F05DAE-7F99-4FE0-9432-D48CAC4BA16E}")
public interface IComponentFolderFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Gets the business components root folder.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject root();
    
    /**
     * <p>
     * Gets the path of the specified folder.
     * </p>
     * 
     * @param folderId Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    java.lang.String folderPath(
            int folderId);
    
    /**
     * <p>
     * Gets a ComponentFolder by its path.
     * </p>
     * 
     * @param path Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject folderByPath(
            java.lang.String path);
    
    /**
     * <p>
     * Obsolete. Do not invoke. method UnattachedComponents.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    com.hp.alm.otaclient.IList unattachedComponents();
    
    @VTID(19)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object unattachedComponents(
            int index);
    
    /**
     * <p>
     * Gets the Templates folder (Quick Test only).
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject templates();
    
    /**
     * <p>
     * Gets the Obsolete Components folder.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject obsolete();
    
    // Properties:
}
