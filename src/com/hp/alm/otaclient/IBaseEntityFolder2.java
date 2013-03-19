package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. extends IBaseEntityFolder since Maya SP1
 */
@IID("{872D0FE9-2155-40CE-BA6F-2312425EE646}")
public interface IBaseEntityFolder2 extends com.hp.alm.otaclient.IBaseEntityFolder
{
    // Methods:
    /**
     * <p>
     * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
     * </p>
     * <p>
     * Getter method for the COM property "Modified"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(38)
    boolean modified();
    
    /**
     * <p>
     * Indicates whether the given field is modified, optionally returning the original field value.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param oldFieldValue Optional parameter. Default value is com4j.Variant.getMissing()
     * @return Returns a value of type boolean
     */
    
    @VTID(39)
    boolean isFieldModified(
            java.lang.String fieldName,
            @Optional java.lang.Object oldFieldValue);
    
    /**
     * <p>
     * Checks if this value can be assigned to the field. The checks are local, i.e. no round trips are made.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(40)
    boolean verifyPutFieldWithErrorOnFail(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    // Properties:
}
