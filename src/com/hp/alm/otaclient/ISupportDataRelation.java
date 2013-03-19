package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for linking a Test or TestConfiguration with its parameter data.
 */
@IID("{D57BDFC2-4F60-4415-A865-9F0CA2171B61}")
public interface ISupportDataRelation extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Creates a new asset relation and sets it to be the data source relation for this entity.
     * </p>
     * 
     * @param resourceId Mandatory int parameter.
     * @param mapping Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createDataRelation(
            int resourceId,
            java.lang.String mapping);
    
    /**
     * <p>
     * Returns the data resource asset relation directly associated with this object.
     * </p>
     * 
     * @param ownerType Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getDataRelation(
            java.lang.String ownerType);
    
    /**
     * <p>
     * Returns the active data resource asset relation whether or not it is associated directly with this object.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getActiveDataRelation();
    
    // Properties:
}
