package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ICustomizationFields Internal functionality.
 */
@IID("{EF6A4FF8-CA39-4537-8127-08DD1E0DF8F5}")
public interface ISelfServicePasswordReset extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Send email that contain SSPR_LINK (URL + Cipher (user name + GUID) ) for change password window.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     */
    
    @VTID(3)
    void ssprSendMail(
            java.lang.String userName);
    
    /**
     * <p>
     * Send the new password, SSPR_CIPHER, name (the user name that user entered in change password window, if it is impersonate this meby
     * different from the real user name), to the server.
     * </p>
     * 
     * @param password Mandatory java.lang.String parameter.
     * @param ssprCipher Mandatory java.lang.String parameter.
     * @param name Mandatory java.lang.String parameter.
     */
    
    @VTID(4)
    void ssprChangePassword(
            java.lang.String password,
            java.lang.String ssprCipher,
            java.lang.String name);
    
    /**
     * <p>
     * Returns whether Self-Service Password Reset is enabled.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(5)
    boolean isSSPREnabled();
    
    // Properties:
}
