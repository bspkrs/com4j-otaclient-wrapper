package com.hp.alm.otaclient;

import com4j.*;

@IID("{0C733A30-2A1C-11CE-ADE5-00AA0044773D}")
public interface ISequentialStream extends Com4jObject
{
    // Methods:
    /**
     * @param pv Mandatory Holder<Byte> parameter.
     * @param cb Mandatory int parameter.
     * @param pcbRead Mandatory Holder<Integer> parameter.
     */
    
    @VTID(3)
    void remoteRead(
            Holder<Byte> pv,
            int cb,
            Holder<Integer> pcbRead);
    
    /**
     * @param pv Mandatory Holder<Byte> parameter.
     * @param cb Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @VTID(4)
    int remoteWrite(
            Holder<Byte> pv,
            int cb);
    
    // Properties:
}
