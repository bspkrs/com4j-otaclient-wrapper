package com.hp.alm.otaclient;

import com4j.*;

/**
 * A user-defined display setting that is saved for reuse.
 */
@IID("{ECE59B8E-4FCB-4864-B9BF-C28EB628CFDB}")
public interface IFavorite extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The favorite's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * The favorite's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ID of the favorites folder containing this item.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    int parentId();
    
    /**
     * <p>
     * The ID of the favorites folder containing this item.
     * </p>
     * <p>
     * Setter method for the COM property "ParentId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void parentId(
            int pVal);
    
    /**
     * <p>
     * Checks whether this favorite is public.
     * </p>
     * <p>
     * Getter method for the COM property "Public"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    boolean _public();
    
    /**
     * <p>
     * The user-interface module to which the setting applies.
     * </p>
     * <p>
     * Getter method for the COM property "Module"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(25)
    java.lang.String module();
    
    /**
     * <p>
     * The favorite's filter in XML.
     * </p>
     * <p>
     * Getter method for the COM property "FilterData"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String filterData();
    
    /**
     * <p>
     * The favorite's filter in XML.
     * </p>
     * <p>
     * Setter method for the COM property "FilterData"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    void filterData(
            java.lang.String pVal);
    
    /**
     * <p>
     * The display attributes in XML.
     * </p>
     * <p>
     * Getter method for the COM property "LayoutData"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String layoutData();
    
    /**
     * <p>
     * The display attributes in XML.
     * </p>
     * <p>
     * Setter method for the COM property "LayoutData"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(29)
    void layoutData(
            java.lang.String pVal);
    
    // Properties:
}
