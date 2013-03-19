package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Requirement Type.
 */
@IID("{F6B62ACC-B8F1-45EF-9387-3C9FC69B529D}")
public interface IReqType extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationType ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * The CustomizationType name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * The bitmap stream representing this type.
     * </p>
     * <p>
     * Getter method for the COM property "Icon"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IStream
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IStream icon();
    
    /**
     * <p>
     * The editing control CLSID for COM or the fully qualified assembly name for .NET.
     * </p>
     * <p>
     * Getter method for the COM property "EditingControl"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String editingControl();
    
    /**
     * <p>
     * Indicates if this requirement type supports direct coverage by tests or test instances.
     * </p>
     * <p>
     * Getter method for the COM property "HasDirectCoverage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean hasDirectCoverage();
    
    /**
     * <p>
     * The type of risk analysis that is applicable to this requirement.
     * </p>
     * <p>
     * Getter method for the COM property "RiskAnalysisType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    int riskAnalysisType();
    
    /**
     * <p>
     * For HP use. The recommended prefix for entities of this type.
     * </p>
     * <p>
     * Getter method for the COM property "Prefix"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String prefix();
    
    // Properties:
}
