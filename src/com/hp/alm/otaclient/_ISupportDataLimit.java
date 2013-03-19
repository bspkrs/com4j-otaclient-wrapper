package com.hp.alm.otaclient;

import com4j.*;

/**
 * Allows control of the amount of entities that will be retuned in a single NewList call
 */
@IID("{D8C9DEFB-5EF8-4535-A375-1F240A7715A5}")
public interface _ISupportDataLimit extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Maximum number of entities to return from server.
     * </p>
     * <p>
     * Getter method for the COM property "DataLimit"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(3)
    int dataLimit();
    
    /**
     * <p>
     * Maximum number of entities to return from server.
     * </p>
     * <p>
     * Setter method for the COM property "DataLimit"
     * </p>
     * 
     * @param pDataLimit Mandatory int parameter.
     */
    
    @VTID(4)
    void dataLimit(
            int pDataLimit);
    
    // Properties:
}
