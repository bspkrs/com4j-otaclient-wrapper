package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Adds some missing functionality to a subject folder.
 */
@IID("{97C351C8-CB1A-44C3-BC54-54D6FFB2AD6C}")
public interface _ISubjectNode3 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Undoes changes to field values that have not been posted.
     * </p>
     */
    
    @VTID(3)
    void undo();
    
    /**
     * <p>
     * Checks if the item has been modified since last refresh or post operation. If true, the field properties on the server side are not
     * up to date.
     * </p>
     * <p>
     * Getter method for the COM property "Modified"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(4)
    boolean modified();
    
    /**
     * <p>
     * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
     * </p>
     * <p>
     * Getter method for the COM property "AutoUnlock"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(5)
    boolean autoUnlock();
    
    /**
     * <p>
     * Indicates whether to make the item changeable to other users automatically after a Refresh or Post.
     * </p>
     * <p>
     * Setter method for the COM property "AutoUnlock"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @VTID(6)
    void autoUnlock(
            boolean pVal);
    
    /**
     * <p>
     * Writes all changed values to database.
     * </p>
     * 
     * @param undoOnFailure Optional parameter. Default value is false
     */
    
    @VTID(7)
    void post(
            @Optional @DefaultValue("-1") boolean undoOnFailure);
    
    /**
     * <p>
     * Indicates whether the given field is modified, optionally returning the original field value.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param oldFieldValue Optional parameter. Default value is com4j.Variant.getMissing()
     * @return Returns a value of type boolean
     */
    
    @VTID(8)
    boolean isFieldModified(
            java.lang.String fieldName,
            @Optional java.lang.Object oldFieldValue);
    
    /**
     * <p>
     * Undoes the changes made to the given field.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     */
    
    @VTID(9)
    void undoField(
            java.lang.String fieldName);
    
    /**
     * <p>
     * Verifies if the given value can be put in the given field. The checks are local, i.e. no round trips are made.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(10)
    boolean verifyPutFieldWithErrorOnFail(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    /**
     * <p>
     * Adds a new child node with the given data.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param description Mandatory java.lang.String parameter.
     * @param viewOrder Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.ISysTreeNode
     */
    
    @VTID(11)
    com.hp.alm.otaclient.ISysTreeNode addNode(
            java.lang.String name,
            java.lang.String description,
            int viewOrder);
    
    /**
     * <p>
     * Finds node children matching the name exactly according to specified search pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(12)
    com.hp.alm.otaclient.IList findChildrenExact(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    // Properties:
}
