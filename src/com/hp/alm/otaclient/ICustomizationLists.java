package com.hp.alm.otaclient;

import com4j.*;

/**
 * A collection of all CustomizationList objects in the project.
 */
@IID("{4EA26B82-65DC-4315-AD7F-D963A1C4EB2F}")
public interface ICustomizationLists extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Adds a new CustomizationList object.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addList(
            java.lang.String name);
    
    /**
     * <p>
     * Removes a CustomizationList object.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeList(
            java.lang.String name);
    
    /**
     * <p>
     * Gets the CustomizationList specified by name or ID.
     * </p>
     * <p>
     * Getter method for the COM property "List"
     * </p>
     * 
     * @param param Mandatory java.lang.Object parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject list(
            @MarshalAs(NativeType.VARIANT) java.lang.Object param);
    
    /**
     * <p>
     * The number of lists in the CustomizationLists object.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int count();
    
    /**
     * <p>
     * Gets the CustomizationList specified by its index number.
     * </p>
     * <p>
     * Getter method for the COM property "ListByCount"
     * </p>
     * 
     * @param count Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject listByCount(
            int count);
    
    /**
     * <p>
     * Checks if the specified customization list exists.
     * </p>
     * <p>
     * Getter method for the COM property "IsListExist"
     * </p>
     * 
     * @param listName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    boolean isListExist(
            java.lang.String listName);
    
    // Properties:
}
