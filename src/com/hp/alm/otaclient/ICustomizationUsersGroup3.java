package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{78B759EA-C483-4AFD-961A-AEFCB3B2EB3D}")
public interface ICustomizationUsersGroup3 extends com.hp.alm.otaclient.ICustomizationUsersGroup2
{
    // Methods:
    /**
     * <p>
     * The user group name used as the source group when creating a new group.
     * </p>
     * <p>
     * Getter method for the COM property "SourceGroupName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String sourceGroupName();
    
    /**
     * <p>
     * The user group name used as the source group when creating a new group.
     * </p>
     * <p>
     * Setter method for the COM property "SourceGroupName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(23)
    void sourceGroupName(
            java.lang.String pVal);
    
    // Properties:
}
