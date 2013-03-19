package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to support mailing factory items.
 */
@IID("{BF873A99-2FB9-43DB-9559-F9F0872F7534}")
public interface IBaseFieldExMail extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Mails the IBaseFieldExMail field item.
     * </p>
     * 
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendCc Optional parameter. Default value is ""
     * @param option Optional parameter. Default value is 0
     * @param subject Optional parameter. Default value is ""
     * @param comment Optional parameter. Default value is ""
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    void mail(
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String comment);
    
    // Properties:
}
