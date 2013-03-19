package com.hp.alm.otaclient;

import com4j.*;

/**
 * Mail support for entities.
 */
@IID("{8F9CBE86-441D-40FD-9ECE-24BFADF8931D}")
public interface IMailableEntity extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Mails the item.
     * </p>
     * 
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendCc Optional parameter. Default value is ""
     * @param option Optional parameter. Default value is 0
     * @param subject Optional parameter. Default value is ""
     * @param comment Optional parameter. Default value is ""
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void mail(
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String comment);
    
    /**
     * <p>
     * Mails the IMailableEntity field item.
     * </p>
     * 
     * @param sendTo Mandatory java.lang.String parameter.
     * @param sendCc Optional parameter. Default value is ""
     * @param sendBcc Optional parameter. Default value is ""
     * @param option Optional parameter. Default value is 0
     * @param subject Optional parameter. Default value is ""
     * @param priority Optional parameter. Default value is 3
     * @param comment Optional parameter. Default value is ""
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void mailEx(
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("") java.lang.String sendBcc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("3") com.hp.alm.otaclient.TDAPI_MAIL_PRIORITIES priority,
            @Optional @DefaultValue("") java.lang.String comment);
    
    // Properties:
}
