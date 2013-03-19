package com.hp.alm.otaclient;

import com4j.*;

/**
 * Mail support for factories.
 */
@IID("{A0B5A87F-7807-4422-83B5-773CE5D609EF}")
public interface IMailableFactory extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Mails the list of items. 'Items' is a list of ID numbers.
     * </p>
     * 
     * @param items Mandatory java.lang.Object parameter.
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
            @MarshalAs(NativeType.VARIANT) java.lang.Object items,
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("") java.lang.String comment);
    
    /**
     * <p>
     * Mails the list of IBase Factory Items. 'Items' is a list of ID numbers.
     * </p>
     * 
     * @param items Mandatory java.lang.Object parameter.
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
            @MarshalAs(NativeType.VARIANT) java.lang.Object items,
            java.lang.String sendTo,
            @Optional @DefaultValue("") java.lang.String sendCc,
            @Optional @DefaultValue("") java.lang.String sendBcc,
            @Optional @DefaultValue("0") int option,
            @Optional @DefaultValue("") java.lang.String subject,
            @Optional @DefaultValue("3") com.hp.alm.otaclient.TDAPI_MAIL_PRIORITIES priority,
            @Optional @DefaultValue("") java.lang.String comment);
    
    // Properties:
}
