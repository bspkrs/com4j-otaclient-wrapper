package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationField objects in the project.
 */
@IID("{6388B1FB-C735-4D24-B1E4-97221B302461}")
public interface ICustomizationFields extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The customization field object for the specified database table and field.
     * </p>
     * <p>
     * Getter method for the COM property "Field"
     * </p>
     * 
     * @param tableName Mandatory java.lang.String parameter.
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject field(
            java.lang.String tableName,
            java.lang.String fieldName);
    
    /**
     * <p>
     * A list of all fields in the specified table.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @param tableName Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList fields(
            @Optional @DefaultValue("") java.lang.String tableName);
    
    /**
     * <p>
     * Finds the first free, inactive field in the specified table, signs the field as active, and returns the CustomizationFields object
     * representing the field.
     * </p>
     * 
     * @param tableName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addActiveField(
            java.lang.String tableName);
    
    /**
     * <p>
     * Checks if the specified database field exists.
     * </p>
     * <p>
     * Getter method for the COM property "FieldExists"
     * </p>
     * 
     * @param tableName Mandatory java.lang.String parameter.
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    boolean fieldExists(
            java.lang.String tableName,
            java.lang.String fieldName);
    
    /**
     * <p>
     * Creates a new memo field in a table.
     * </p>
     * 
     * @param tableName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addActiveMemoField(
            java.lang.String tableName);
    
    // Properties:
}
