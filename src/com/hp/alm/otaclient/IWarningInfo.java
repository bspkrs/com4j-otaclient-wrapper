package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Assists in passing warning information to and from QC modules.
 */
@IID("{551A15F5-289D-4C25-AAFA-75CB0171668E}")
public interface IWarningInfo extends Com4jObject
{
    // Methods:
    /**
     * @param warningCode Mandatory int parameter.
     * @param warningDescription Mandatory java.lang.String parameter.
     * @param pCaller Mandatory com4j.Com4jObject parameter.
     */
    
    @VTID(3)
    void setWarning(
            int warningCode,
            java.lang.String warningDescription,
            com4j.Com4jObject pCaller);
    
    /**
     * @param warningFrec Mandatory java.lang.String parameter.
     * @param pCaller Mandatory com4j.Com4jObject parameter.
     */
    
    @VTID(4)
    void setWarningFromFrec(
            java.lang.String warningFrec,
            com4j.Com4jObject pCaller);
    
    /**
     * @return Returns a value of type boolean
     */
    
    @VTID(5)
    boolean warningExists();
    
    /**
     * @param pWarningCode Mandatory Holder<Integer> parameter.
     * @param pWarningDescription Mandatory Holder<java.lang.String> parameter.
     */
    
    @VTID(6)
    void getWarning(
            Holder<Integer> pWarningCode,
            Holder<java.lang.String> pWarningDescription);
    
    /**
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(7)
    com4j.Com4jObject getCaller();
    
    /**
   */
    
    @VTID(8)
    void clearWarning();
    
    // Properties:
}
