package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a bpm represetable entity of bpm linkable entity between two requirements.
 */
@IID("{DE68A215-CB7C-4F72-A423-F81B4A74D0B5}")
public interface IBPMRepresentable extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The bpm link factory of the object represented that enables viewing the bpm links.
     * </p>
     * <p>
     * Getter method for the COM property "BPMLinkFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpmLinkFactory();
    
    /**
     * <p>
     * Checks if the current represented object has at least one associated bpm link.
     * </p>
     * <p>
     * Getter method for the COM property "HasBPMLinkage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(8)
    boolean hasBPMLinkage();
    
    /**
     * <p>
     * Returns the list of all tests that cover the current representative entity and match the filter.
     * </p>
     * 
     * @param includeIndirectLinkage Mandatory boolean parameter.
     * @param includeChildren Mandatory boolean parameter.
     * @param filter Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList getLinkedTests(
            boolean includeIndirectLinkage,
            boolean includeChildren,
            java.lang.String filter);
    
    // Properties:
}
