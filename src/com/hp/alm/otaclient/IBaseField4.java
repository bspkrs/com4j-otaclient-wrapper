package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a basic data field or entity, such as an attachment.
 */
@IID("{D28589CA-60E8-4420-8AC9-91C125A50EF3}")
public interface IBaseField4 extends com.hp.alm.otaclient.IObjectLockingSupport2
{
    // Methods:
    /**
     * <p>
     * The field's type.
     * </p>
     * <p>
     * Getter method for the COM property "TypeName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String typeName();
    
    // Properties:
}
