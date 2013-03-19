package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The collection of QPM KPI Types.
 */
@IID("{F1D3B9EB-CBE1-47F1-BDD4-D1D3D70CBC05}")
public interface ICustomizationKPITypes extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the ICustomizationKPIType specified by the name
     * </p>
     * <p>
     * Getter method for the COM property "KPIType"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiType(
            java.lang.String name);
    
    /**
     * <p>
     * Gets the ICustomizationKPIType with the specified ID.
     * </p>
     * <p>
     * Getter method for the COM property "KPITypeByID"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject kpiTypeByID(
            int id);
    
    /**
     * <p>
     * Gets the list of ICustomizationKPIType objects.
     * </p>
     * <p>
     * Getter method for the COM property "KPITypes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList kpiTypes();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object kpiTypes(
            int index);
    
    /**
     * <p>
     * Creates a new CustomizationKPIType.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param measureType Mandatory java.lang.String parameter.
     * @param entityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addKPIType(
            java.lang.String name,
            java.lang.String measureType,
            java.lang.String entityType);
    
    /**
     * <p>
     * Deletes the specified CustomizationKPIType.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void removeKPIType(
            java.lang.String name);
    
    // Properties:
}
