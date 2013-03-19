package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an entity that covers a requirement.
 */
@IID("{C5DF6450-F927-425A-A293-3A5CF0EBE56D}")
public interface ICoverable extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CoverageFactory for the entity.
     * </p>
     * <p>
     * Getter method for the COM property "CoverageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject coverageFactory();
    
    /**
     * <p>
     * Adds the specified requirement to the list of requirements covered by this entity. Optionally, also adds child requirements.
     * </p>
     * 
     * @param req Mandatory java.lang.Object parameter.
     * @param requirementFilter Mandatory java.lang.String parameter.
     * @param recursive Mandatory boolean parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void coverRequirementEx(
            @MarshalAs(NativeType.VARIANT) java.lang.Object req,
            java.lang.String requirementFilter,
            boolean recursive);
    
    // Properties:
}
