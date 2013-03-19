package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing relations between ALM entities.
 */
@IID("{72E5FDF1-F007-476B-811B-523D48A78F02}")
public interface ISupportAssetRelations3 extends com.hp.alm.otaclient.ISupportAssetRelations2
{
    // Methods:
    /**
     * <p>
     * Returns the size of the asset and its related assets.
     * </p>
     * 
     * @param condition Mandatory java.lang.String parameter.
     * @param filterMask Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    int getEntityStorageSize(
            java.lang.String condition,
            int filterMask);
    
    // Properties:
}
