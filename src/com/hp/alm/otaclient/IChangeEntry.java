package com.hp.alm.otaclient;

import com4j.*;

/**
 * Obsolete. Do not use this interface.
 */
@IID("{0977F04D-0A7C-403D-A07B-1C2780362C46}")
public interface IChangeEntry extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Getter method for the COM property "FileName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String fileName();
    
    /**
     * <p>
     * Getter method for the COM property "FilePath"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String filePath();
    
    /**
     * <p>
     * Getter method for the COM property "StartVersion"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String startVersion();
    
    /**
     * <p>
     * Getter method for the COM property "WorkingVersion"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String workingVersion();
    
    /**
     * <p>
     * Setter method for the COM property "WorkingVersion"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void workingVersion(
            java.lang.String pVal);
    
    /**
     * <p>
     * Getter method for the COM property "EndVersion"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String endVersion();
    
    /**
     * <p>
     * Setter method for the COM property "EndVersion"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    void endVersion(
            java.lang.String pVal);
    
    /**
     * <p>
     * Getter method for the COM property "CreatedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String createdBy();
    
    /**
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    java.util.Date creationDate();
    
    // Properties:
}
