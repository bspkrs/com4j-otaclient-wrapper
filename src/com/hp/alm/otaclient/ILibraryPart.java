package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Library Part.
 */
@IID("{E746272C-4CB9-4691-AF22-F857580DAA44}")
public interface ILibraryPart extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The library part name.
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
     * The library part name.
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
     * The library part EntityType, for example, TestFolder.
     * </p>
     * <p>
     * Getter method for the COM property "EntityType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String entityType();
    
    /**
     * <p>
     * The library part EntityType, for example, TestFolder.
     * </p>
     * <p>
     * Setter method for the COM property "EntityType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void entityType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The library part EntityKey.
     * </p>
     * <p>
     * Getter method for the COM property "EntityKey"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String entityKey();
    
    /**
     * <p>
     * The library part EntityKey.
     * </p>
     * <p>
     * Setter method for the COM property "EntityKey"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void entityKey(
            java.lang.String pVal);
    
    /**
     * <p>
     * The library part Export Filter.
     * </p>
     * <p>
     * Getter method for the COM property "EntityExpFilter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String entityExpFilter();
    
    /**
     * <p>
     * The library part Export Filter.
     * </p>
     * <p>
     * Setter method for the COM property "EntityExpFilter"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void entityExpFilter(
            java.lang.String pVal);
    
    // Properties:
}
