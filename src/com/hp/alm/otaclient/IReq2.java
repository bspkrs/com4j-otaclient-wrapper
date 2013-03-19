package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a requirement for which testing must be performed.
 */
@IID("{35692E1B-C235-426A-A77B-CD0D159C4F2E}")
public interface IReq2 extends com.hp.alm.otaclient.IReq
{
    // Methods:
    /**
     * <p>
     * The requirement link factory that manages the traceability links of the current requirement to its associated requirements in the
     * specified direction.
     * </p>
     * <p>
     * Getter method for the COM property "ReqTraceFactory"
     * </p>
     * 
     * @param traceDirection Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(54)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject reqTraceFactory(
            int traceDirection);
    
    /**
     * <p>
     * Checks if the current requirement has at least one associated requirement in the specified direction.
     * </p>
     * <p>
     * Getter method for the COM property "HasReqTraceability"
     * </p>
     * 
     * @param traceDirection Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(55)
    boolean hasReqTraceability(
            int traceDirection);
    
    /**
     * <p>
     * Gets the interface for getting the requirement types.
     * </p>
     * <p>
     * Getter method for the COM property "RequirementType"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(56)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject requirementType();
    
    /**
     * <p>
     * The requirement's type ID.
     * </p>
     * <p>
     * Getter method for the COM property "TypeId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(57)
    java.lang.String typeId();
    
    /**
     * <p>
     * The requirement's type ID.
     * </p>
     * <p>
     * Setter method for the COM property "TypeId"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(40)
    //= 0x28. The runtime will prefer the VTID if present
    @VTID(58)
    void typeId(
            java.lang.String pVal);
    
    /**
     * <p>
     * Returns the bitmap stream for the requirement's type.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IStream
     */
    
    @DISPID(41)
    //= 0x29. The runtime will prefer the VTID if present
    @VTID(59)
    com.hp.alm.otaclient.IStream get_Icon();
    
    /**
     * <p>
     * The Requirement's parent ID.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(42)
    //= 0x2a. The runtime will prefer the VTID if present
    @VTID(60)
    int parentId();
    
    /**
     * <p>
     * The Requirement's parent ID.
     * </p>
     * <p>
     * Setter method for the COM property "ParentId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(42)
    //= 0x2a. The runtime will prefer the VTID if present
    @VTID(61)
    void parentId(
            int pVal);
    
    /**
     * <p>
     * Assigns the target cycle of the requirement as the target cycle of all child requirements, recursively down the folder tree.
     * </p>
     */
    
    @DISPID(43)
    //= 0x2b. The runtime will prefer the VTID if present
    @VTID(62)
    void populateTargetCycleToChildren();
    
    /**
     * <p>
     * Assigns the target release of the requirement as the target release of all child requirements, recursively down the folder tree.
     * </p>
     */
    
    @DISPID(44)
    //= 0x2c. The runtime will prefer the VTID if present
    @VTID(63)
    void populateTargetReleaseToChildren();
    
    /**
     * <p>
     * Checks if the object has rich content.
     * </p>
     * <p>
     * Getter method for the COM property "HasRichContent"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(45)
    //= 0x2d. The runtime will prefer the VTID if present
    @VTID(64)
    boolean hasRichContent();
    
    /**
     * <p>
     * Returns the list of tests that cover the current requirement and, optionally, cover those of its children that match the requirement
     * filter.
     * </p>
     * 
     * @param reqFilter Mandatory java.lang.String parameter.
     * @param recursive Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(46)
    //= 0x2e. The runtime will prefer the VTID if present
    @VTID(65)
    com.hp.alm.otaclient.IList getCoverageTestsByReqFilter(
            java.lang.String reqFilter,
            @Optional @DefaultValue("0") boolean recursive);
    
    // Properties:
}
