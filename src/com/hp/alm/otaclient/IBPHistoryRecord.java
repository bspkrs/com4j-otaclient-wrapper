package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for handling changes in Business Process records.
 */
@IID("{E1582AF7-780E-4D93-9771-E196205F96C7}")
public interface IBPHistoryRecord extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The description of the record.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String description();
    
    /**
     * <p>
     * The time stamp according to the database server clock.
     * </p>
     * <p>
     * Getter method for the COM property "Time"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String time();
    
    /**
     * <p>
     * The user name of the user who changed the record.
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
     * Returns the record in XML format.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String toXmlString();
    
    // Properties:
}
