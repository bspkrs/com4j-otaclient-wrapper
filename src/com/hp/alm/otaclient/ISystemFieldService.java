package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for managing system fields.
 */
@IID("{B721DBBD-D7C2-4765-A4B9-164AD6604BD3}")
public interface ISystemFieldService extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Field property according field name and property name.
     * </p>
     * <p>
     * Getter method for the COM property "FieldProperty"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param propName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String fieldProperty(
            java.lang.String fieldName,
            java.lang.String propName);
    
    /**
     * <p>
     * Tree root connected to the field according field name.
     * </p>
     * <p>
     * Getter method for the COM property "FieldRoot"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fieldRoot(
            java.lang.String fieldName);
    
    /**
     * <p>
     * List of fields according to given filter.
     * </p>
     * <p>
     * Getter method for the COM property "FieldList"
     * </p>
     * 
     * @param filter Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String fieldList(
            java.lang.String filter);
    
    // Properties:
}
