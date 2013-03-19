package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IImport Interface.
 */
@IID("{3A6DFEA9-5E15-4E8F-B480-2B025730F7BD}")
public interface IImport extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * method GetColumnNames.
     * </p>
     * 
     * @param bstrResourceeName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(index = 0)
    java.lang.String getColumnNames(
            java.lang.String bstrResourceeName);
    
    /**
     * <p>
     * method ImportData.
     * </p>
     * 
     * @param bstrColumnNames Mandatory java.lang.String parameter.
     * @param bstrpData Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void importData(
            java.lang.String bstrColumnNames,
            Holder<java.lang.String> bstrpData);
    
    // Properties:
}
