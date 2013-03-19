package com.hp.alm.otaclient;

import com4j.*;

/**
 * Obsolete. IChange Interface.
 */
@IID("{74B94507-8A42-4D11-B5BD-943B76C9A982}")
public interface IChange extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String description();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "Comments"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String comments();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Setter method for the COM property "Comments"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    void comments(
            java.lang.String pVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "CreatedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String createdBy();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.util.Date creationDate();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "ClosingDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    java.util.Date closingDate();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Setter method for the COM property "ClosingDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    void closingDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "VOB_Labels"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String voB_Labels();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Setter method for the COM property "VOB_Labels"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    void voB_Labels(
            java.lang.String pVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeEntryFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject changeEntryFactory();
    
    /**
     * <p>
     * Obsolete.Inserts bug ID.
     * </p>
     * 
     * @param newVal Mandatory int parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    void addBugLink(
            int newVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * 
     * @param newVal Mandatory int parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(35)
    void removeBugLink(
            int newVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(36)
    com.hp.alm.otaclient.IList getBugLinks();
    
    @VTID(36)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object getBugLinks(
            int index);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "AutoGetLinks"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(37)
    boolean autoGetLinks();
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Setter method for the COM property "AutoGetLinks"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(38)
    void autoGetLinks(
            boolean pVal);
    
    /**
     * <p>
     * Obsolete.
     * </p>
     * <p>
     * Getter method for the COM property "Links"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String links();
    
    // Properties:
}
