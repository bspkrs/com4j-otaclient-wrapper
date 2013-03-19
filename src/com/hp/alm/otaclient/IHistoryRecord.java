package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single history change.
 */
@IID("{BCAE2958-39FA-4742-93B4-16D204CF67AB}")
public interface IHistoryRecord extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The name of the changed field.
     * </p>
     * <p>
     * Getter method for the COM property "FieldName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String fieldName();
    
    /**
     * <p>
     * The change date according to database server.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.util.Date changeDate();
    
    /**
     * <p>
     * The name of the user who made the change.
     * </p>
     * <p>
     * Getter method for the COM property "Changer"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String changer();
    
    /**
     * <p>
     * The value after the change.
     * </p>
     * <p>
     * Getter method for the COM property "NewValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object newValue();
    
    /**
     * <p>
     * Not implemented.
     * </p>
     * <p>
     * Getter method for the COM property "ItemKey"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object itemKey();
    
    // Properties:
}
