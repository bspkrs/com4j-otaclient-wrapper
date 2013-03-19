package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Manages the sub-floders and child entities included in one folder.
 */
@IID("{73598F2E-D89E-4144-B9B1-6A4C4D933276}")
public interface IBaseEntityFolder extends com.hp.alm.otaclient.ISysTreeNode
{
    // Methods:
    /**
     * <p>
     * The folder description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(23)
    java.lang.String description();
    
    /**
     * <p>
     * The folder description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(24)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * Gets unique parent ID.
     * </p>
     * <p>
     * Getter method for the COM property "FatherID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(25)
    int fatherID();
    
    /**
     * <p>
     * Gets the parent node.
     * </p>
     * <p>
     * Getter method for the COM property "FatherDisp"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject fatherDisp();
    
    /**
     * <p>
     * The index of this folder in its parent's list of subnodes.
     * </p>
     * <p>
     * Getter method for the COM property "ViewOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(27)
    int viewOrder();
    
    /**
     * <p>
     * The index of this folder in its parent's list of subnodes.
     * </p>
     * <p>
     * Setter method for the COM property "ViewOrder"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @VTID(28)
    void viewOrder(
            int pVal);
    
    /**
     * <p>
     * The list of child nodes.
     * </p>
     * <p>
     * Getter method for the COM property "SubNodes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(29)
    com.hp.alm.otaclient.IList subNodes();
    
    @VTID(29)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object subNodes(
            int index);
    
    /**
     * <p>
     * Adds a new child node.
     * </p>
     * 
     * @param nodeName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addNodeDisp(
            java.lang.String nodeName);
    
    /**
     * <p>
     * Deletes a folder node.
     * </p>
     * 
     * @param node Mandatory java.lang.Object parameter.
     * @param deleteSubEntity Optional parameter. Default value is false
     */
    
    @VTID(31)
    void removeNodeEx(
            @MarshalAs(NativeType.VARIANT) java.lang.Object node,
            @Optional @DefaultValue("0") boolean deleteSubEntity);
    
    /**
     * <p>
     * Moves folder node under new father.
     * </p>
     * 
     * @param father Mandatory java.lang.Object parameter.
     */
    
    @VTID(32)
    void move(
            @MarshalAs(NativeType.VARIANT) java.lang.Object father);
    
    /**
     * <p>
     * Gets the TransactionFactory for the folder.
     * </p>
     * <p>
     * Getter method for the COM property "EntityFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entityFactory();
    
    /**
     * <p>
     * This folder has at least one attachment.
     * </p>
     * <p>
     * Getter method for the COM property "HasAttachment"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(34)
    boolean hasAttachment();
    
    /**
     * <p>
     * The folder's AttachmentFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "Attachments"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachments();
    
    /**
     * <p>
     * Gets a list of contained business entities according to specified pattern.
     * </p>
     * 
     * @param pattern Mandatory java.lang.String parameter.
     * @param matchCase Optional parameter. Default value is false
     * @param filter Optional parameter. Default value is ""
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @VTID(36)
    com.hp.alm.otaclient.IList findEntity(
            java.lang.String pattern,
            @Optional @DefaultValue("0") boolean matchCase,
            @Optional @DefaultValue("") java.lang.String filter);
    
    /**
     * <p>
     * Gets the entity factory for the folder according to the input type.
     * </p>
     * <p>
     * Getter method for the COM property "EntityFactoryEx"
     * </p>
     * 
     * @param factoryType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(37)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entityFactoryEx(
            int factoryType);
    
    // Properties:
}
