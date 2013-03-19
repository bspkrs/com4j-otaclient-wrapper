package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents users' settings in various user-defined categories.
 */
@IID("{55110A8D-110B-460C-9D28-F8B4BCF3DFF0}")
public interface ISettings extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Sets the category to be used in subsequent actions by the client.
     * </p>
     * 
     * @param category Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void open(
            java.lang.String category);
    
    /**
     * <p>
     * The value of the specified item in the active category.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String value(
            java.lang.String name);
    
    /**
     * <p>
     * The value of the specified item in the active category.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void value(
            java.lang.String name,
            java.lang.String pVal);
    
    /**
     * <p>
     * Closes and updates the category.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void close();
    
    /**
     * <p>
     * Deletes the current settings folder.
     * </p>
     * 
     * @param category Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    void deleteCategory(
            java.lang.String category);
    
    /**
     * <p>
     * Deletes the specified item.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void deleteValue(
            java.lang.String name);
    
    /**
     * <p>
     * Returns the list of names of the setting's items.
     * </p>
     * <p>
     * Getter method for the COM property "EnumItems"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    com.hp.alm.otaclient.IList enumItems();
    
    @VTID(13)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object enumItems(
            int index);
    
    /**
     * <p>
     * Posts the category to the server.
     * </p>
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    void post();
    
    /**
     * <p>
     * Reads saved values, overwriting values in memory.
     * </p>
     * 
     * @param category Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    void refresh(
            java.lang.String category);
    
    // Properties:
}
