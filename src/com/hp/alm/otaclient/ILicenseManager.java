package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Performs license related actions.
 */
@IID("{B7362C73-02EC-4AA1-8B15-46490ED301BC}")
public interface ILicenseManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use. Allocates a license type according to the LicenseType parameter.
     * </p>
     * 
     * @param licenseType Mandatory int parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void getLicense(
            int licenseType);
    
    /**
     * <p>
     * Allocates multiple licenses types according to the LicensesType parameter.
     * </p>
     * 
     * @param licenseType Mandatory int parameter.
     * @param pVal Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void getLicenses(
            int licenseType,
            Holder<java.lang.String> pVal);
    
    /**
     * <p>
     * The license status for the specified client type.
     * </p>
     * 
     * @param clientType Mandatory int parameter.
     * @param inUse Mandatory Holder<Integer> parameter.
     * @param max Mandatory Holder<Integer> parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void getLicenseStatus(
            int clientType,
            Holder<Integer> inUse,
            Holder<Integer> max);
    
    /**
     * <p>
     * The QC edition of this connection.
     * </p>
     * <p>
     * Getter method for the COM property "Edition"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int edition();
    
    /**
     * <p>
     * Gets the list of features which cannot be used in the current QC edition.
     * </p>
     * <p>
     * Getter method for the COM property "DeniedFeatures"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList deniedFeatures();
    
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object deniedFeatures(
            int index);
    
    /**
     * <p>
     * Checks whether the given feature is enabled.
     * </p>
     * 
     * @param strFeatureName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    boolean isFeatureEnabled(
            java.lang.String strFeatureName);
    
    // Properties:
}
