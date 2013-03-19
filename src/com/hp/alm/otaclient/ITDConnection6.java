package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{5C346795-9EC4-49D2-ADCC-960E4210BBF0}")
public interface ITDConnection6 extends com.hp.alm.otaclient.ITDConnection5
{
    // Methods:
    /**
     * <p>
     * Sets credentials for authentication on server.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @param password Mandatory java.lang.String parameter.
     */
    
    @DISPID(198)
    //= 0xc6. The runtime will prefer the VTID if present
    @VTID(203)
    void setServerCredentials(
            java.lang.String userName,
            java.lang.String password);
    
    /**
     * <p>
     * Sets credentials for authentication on proxy.
     * </p>
     * 
     * @param proxyHost Mandatory java.lang.String parameter.
     * @param port Mandatory int parameter.
     * @param userName Mandatory java.lang.String parameter.
     * @param password Mandatory java.lang.String parameter.
     */
    
    @DISPID(199)
    //= 0xc7. The runtime will prefer the VTID if present
    @VTID(204)
    void setProxyCredentials(
            java.lang.String proxyHost,
            int port,
            java.lang.String userName,
            java.lang.String password);
    
    /**
     * <p>
     * The DesignStepFactory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "DesignStepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(200)
    //= 0xc8. The runtime will prefer the VTID if present
    @VTID(205)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject designStepFactory();
    
    /**
     * <p>
     * For HP use. Lightweight SSO LDAP authentication token for current user.
     * </p>
     * <p>
     * Getter method for the COM property "LDAPToken"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(201)
    //= 0xc9. The runtime will prefer the VTID if present
    @VTID(206)
    java.lang.String ldapToken();
    
    // Properties:
}
