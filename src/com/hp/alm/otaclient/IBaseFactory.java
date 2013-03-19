package com.hp.alm.otaclient;

import com4j.*;

/**
 * Provides basic object basic factory services, such as adding and removing factory child objects and creating lists of child objects.
 */
@IID("{F13E4E0F-2BF2-41A2-97B1-06AD03204518}")
public interface IBaseFactory extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets an object managed by the factory by its key.
     * </p>
     * <p>
     * Getter method for the COM property "Item"
     * </p>
     * 
     * @param itemKey Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject item(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemKey);
    
    /**
     * <p>
     * Creates a list of objects according to the specified filter.
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList newList(
            java.lang.String filter);
    
    /**
     * <p>
     * The list of all available fields for the entity managed by the factory.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Creates a new item object.
     * </p>
     * 
     * @param itemData Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addItem(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemData);
    
    /**
     * <p>
     * Removes item from the database. Removal takes place immediately, without a Post.
     * </p>
     * 
     * @param itemKey Mandatory java.lang.Object parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    void removeItem(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemKey);
    
    /**
     * <p>
     * The TDFilter object for the factory.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject filter();
    
    /**
     * <p>
     * The History object for this entity.
     * </p>
     * <p>
     * Getter method for the COM property "History"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject history();
    
    /**
     * <p>
     * The Fetch level for a field.
     * </p>
     * <p>
     * Getter method for the COM property "FetchLevel"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type short
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    short fetchLevel(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The Fetch level for a field.
     * </p>
     * <p>
     * Setter method for the COM property "FetchLevel"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param pVal Mandatory short parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    void fetchLevel(
            java.lang.String fieldName,
            short pVal);
    
    // Properties:
}
