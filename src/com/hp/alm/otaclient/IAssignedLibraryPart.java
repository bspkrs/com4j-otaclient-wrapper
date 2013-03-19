package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents an assigned Library Part.
 */
@IID("{BE138F24-989B-4E7B-9BE0-2484DC81F255}")
public interface IAssignedLibraryPart extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The library part Entity Key to which this part is assigned to.
     * </p>
     * <p>
     * Getter method for the COM property "AssignedEntityId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String assignedEntityId();
    
    /**
     * <p>
     * The library part Entity Key to which this part is assigned to.
     * </p>
     * <p>
     * Setter method for the COM property "AssignedEntityId"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(8)
    void assignedEntityId(
            java.lang.String pVal);
    
    // Properties:
}
