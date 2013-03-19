package com.hp.alm.otaclient;

import com4j.*;

/**
 * Properties for object fields.
 */
@IID("{F5DEB618-2CF4-44A1-81A1-00922B9C4F5B}")
public interface IFieldProperty2 extends com.hp.alm.otaclient.IFieldProperty
{
    // Methods:
    /**
     * <p>
     * Checks if items of this type can form groups with others of the same type.
     * </p>
     * <p>
     * Getter method for the COM property "IsCanGroup"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(35)
    boolean isCanGroup();
    
    /**
     * <p>
     * Checks if the content of the field is searched by the Search method.
     * </p>
     * <p>
     * Getter method for the COM property "IsSearchable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(36)
    boolean isSearchable();
    
    /**
     * <p>
     * Checks if the field can store multiple values.
     * </p>
     * <p>
     * Getter method for the COM property "IsMultiValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(37)
    boolean isMultiValue();
    
    // Properties:
}
