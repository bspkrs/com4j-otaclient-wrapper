package com.hp.alm.otaclient;

import com4j.*;

/**
 * The association between a requirement and another entity that covers it.
 */
@IID("{BCF7E6D7-4281-40FA-923B-32DFA90715D7}")
public interface ICoverageEntity extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The Req object being covered.
     * </p>
     * <p>
     * Getter method for the COM property "RequirementEntity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject requirementEntity();
    
    /**
     * <p>
     * The entity object that covers the requirement.
     * </p>
     * <p>
     * Getter method for the COM property "TargetEntity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject targetEntity();
    
    /**
     * <p>
     * The type of coverage. For example, Test or TSTest.
     * </p>
     * <p>
     * Getter method for the COM property "CoverageType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String coverageType();
    
    /**
     * <p>
     * The execution result status of the TargetEntity.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String status();
    
    /**
     * <p>
     * The name of the TargetEntity.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    // Properties:
}
