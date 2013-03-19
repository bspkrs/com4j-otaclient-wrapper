package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a traceability matrix relation result.
 */
@IID("{C15B982E-5D50-4622-A27B-EA8504FD15E9}")
public interface ITraceabilityMatrixRelationResult extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns a copy of the name of the relation.
     * </p>
     * <p>
     * Getter method for the COM property "RelationName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String relationName();
    
    /**
     * <p>
     * Returns the calculated value.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int value();
    
    // Properties:
}
