package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an association between a Bug and another entity.
 */
@IID("{79CFC0C1-7BB6-48CE-BC47-8074DDBCA542}")
public interface ILink extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The source entity object of the link.
     * </p>
     * <p>
     * Getter method for the COM property "SourceEntity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject sourceEntity();
    
    /**
     * <p>
     * The target entity object of the link.
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
     * The target entity object of the link.
     * </p>
     * <p>
     * Setter method for the COM property "TargetEntity"
     * </p>
     * 
     * @param pVal Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    void targetEntity(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pVal);
    
    /**
     * <p>
     * The entity that initiated the link.
     * </p>
     * <p>
     * Getter method for the COM property "LinkedByEntity"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject linkedByEntity();
    
    /**
     * <p>
     * The user who created the link.
     * </p>
     * <p>
     * Getter method for the COM property "CreatedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String createdBy();
    
    /**
     * <p>
     * The user who created the link.
     * </p>
     * <p>
     * Setter method for the COM property "CreatedBy"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(25)
    void createdBy(
            java.lang.String pVal);
    
    /**
     * <p>
     * The link creation date.
     * </p>
     * <p>
     * Getter method for the COM property "CreationDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    java.util.Date creationDate();
    
    /**
     * <p>
     * The link creation date.
     * </p>
     * <p>
     * Setter method for the COM property "CreationDate"
     * </p>
     * 
     * @param pVal Mandatory java.util.Date parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(27)
    void creationDate(
            java.util.Date pVal);
    
    /**
     * <p>
     * The link type.
     * </p>
     * <p>
     * Getter method for the COM property "LinkType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String linkType();
    
    /**
     * <p>
     * The link type.
     * </p>
     * <p>
     * Setter method for the COM property "LinkType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(29)
    void linkType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The link summary comment.
     * </p>
     * <p>
     * Getter method for the COM property "Comment"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String comment();
    
    /**
     * <p>
     * The link summary comment.
     * </p>
     * <p>
     * Setter method for the COM property "Comment"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(31)
    void comment(
            java.lang.String pVal);
    
    // Properties:
}
