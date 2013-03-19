package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents User Assets files manipulation API.
 */
@IID("{282EB1E6-B4DC-4ABD-80C0-43DD9EAC6B1E}")
public interface IUserAssetStorage extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Removes User Asset files from QC Repository
     * </p>
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void clean();
    
    /**
     * <p>
     * Uploads User Asset file/folder to QC Repository
     * </p>
     * 
     * @param userAssetLocalPath Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void uploadUserAsset(
            java.lang.String userAssetLocalPath);
    
    /**
     * <p>
     * Downloads User Asset file/folder from QC Repository
     * </p>
     * 
     * @param userAssetLocalPath Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void downloadUserAsset(
            java.lang.String userAssetLocalPath);
    
    // Properties:
}
