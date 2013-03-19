package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents traceability matrix settings for a single relation type.
 */
@IID("{7F08C29E-BD5F-434F-89ED-CB6A6489EC28}")
public interface ITraceabilityMatrixRelationSettings extends Com4jObject
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
     * Returns a copy of the logical condition over the relation.
     * </p>
     * <p>
     * Getter method for the COM property "LogicalCondition"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String logicalCondition();
    
    /**
     * <p>
     * Indicates whether the relation should exist.
     * </p>
     * <p>
     * Getter method for the COM property "ExistInIds"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean existInIds();
    
    /**
     * <p>
     * Returns a copy of the filter over the linked entities.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String filter();
    
    /**
     * <p>
     * Set the value of the specified property in the additional data, by property name and property value.
     * </p>
     * 
     * @param prop Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void setAdditionalDataPropertyByName(
            java.lang.String prop,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    /**
     * <p>
     * Returns a copy of the additional data as an frec.
     * </p>
     * <p>
     * Getter method for the COM property "AdditionalDataAsFrec"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String additionalDataAsFrec();
    
    // Properties:
}
