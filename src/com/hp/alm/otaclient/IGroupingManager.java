package com.hp.alm.otaclient;

import com4j.*;

/**
 * Provides services for grouping.
 */
@IID("{33CCFC63-CE02-47AB-9A11-BB2E0C324723}")
public interface IGroupingManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Not implemented
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject filter();
    
    /**
     * <p>
     * Not implemented
     * </p>
     * <p>
     * Setter method for the COM property "Filter"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void filter(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * The grouping criteria.
     * </p>
     * <p>
     * Getter method for the COM property "Group"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    int group(
            java.lang.String name);
    
    /**
     * <p>
     * The grouping criteria.
     * </p>
     * <p>
     * Setter method for the COM property "Group"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void group(
            java.lang.String name,
            int pVal);
    
    /**
     * <p>
     * The list of top-level GroupItem objects.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList groupList();
    
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object groupList(
            int index);
    
    /**
     * <p>
     * The list of references to the members of the group.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    com.hp.alm.otaclient.IList itemList();
    
    @VTID(12)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object itemList(
            int index);
    
    /**
     * <p>
     * Fetches the GroupList according to the Filter and Group values, overwriting the list in memory.
     * </p>
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    void refresh();
    
    /**
     * <p>
     * Deletes the data from the GroupItem list in memory.
     * </p>
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    void clear();
    
    /**
     * <p>
     * Checks if the GroupingManager contains any data. True if there is no data.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    boolean isClear();
    
    /**
     * <p>
     * The text representation of the grouping criteria.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String text();
    
    /**
     * <p>
     * The text representation of the grouping criteria.
     * </p>
     * <p>
     * Setter method for the COM property "Text"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    void text(
            java.lang.String pVal);
    
    // Properties:
}
