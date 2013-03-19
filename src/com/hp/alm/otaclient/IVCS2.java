package com.hp.alm.otaclient;

import com4j.*;

/**
 * A Version Control System connection for Test objects.
 */
@IID("{A54D914D-3CCB-49FC-B07B-0B496FBF0CC3}")
public interface IVCS2 extends com.hp.alm.otaclient.IVCS
{
    // Methods:
    /**
     * <p>
     * Overrides the last version and performs a check-in. The version number is not promoted.
     * </p>
     * 
     * @param comment Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(27)
    void checkInAndOverrideLastVersion(
            java.lang.String comment);
    
    /**
     * <p>
     * Returns a list of references to IVersionedEntity.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(28)
    com.hp.alm.otaclient.IList versionsEx2();
    
    @VTID(28)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object versionsEx2(
            int index);
    
    /**
     * <p>
     * Returns the XML that details for each version in which baselines it participates.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String versionsRelationsToBaselines();
    
    // Properties:
}
