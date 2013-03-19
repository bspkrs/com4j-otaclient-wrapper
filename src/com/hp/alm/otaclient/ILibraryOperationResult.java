package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a verification operation result for a library operation (like import, sync, create baseline, etc).
 */
@IID("{84F0815E-B133-4F16-BDEB-952BA7C6E41F}")
public interface ILibraryOperationResult extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns a text output of verification.
     * </p>
     * <p>
     * Getter method for the COM property "ResultString"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String resultString();
    
    /**
     * <p>
     * Returns comma separated list of files, created by verification process. Now it is single file - result of Broken Links verification.
     * </p>
     * <p>
     * Getter method for the COM property "FilesList"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String filesList();
    
    /**
     * <p>
     * Returns the second compared element's ID.
     * </p>
     * <p>
     * Getter method for the COM property "IsPassed"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean isPassed();
    
    // Properties:
}
