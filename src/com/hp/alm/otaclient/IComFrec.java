package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IComFrec Interface.
 */
@IID("{D2FA8791-3A81-4D03-95CA-74EF6E059C4F}")
public interface IComFrec extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Method Open.
     * </p>
     * 
     * @param newData Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void open(
            java.lang.String newData);
    
    /**
     * <p>
     * Writes the Record. The Attribute list is ready for new input.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void writeRecord();
    
    /**
     * <p>
     * Reads the next Record.
     * </p>
     * <p>
     * Getter method for the COM property "ReadRecord"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean readRecord();
    
    /**
     * <p>
     * Property RecordString.
     * </p>
     * <p>
     * Getter method for the COM property "RecordString"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String recordString();
    
    /**
     * <p>
     * Property Buffer.
     * </p>
     * <p>
     * Getter method for the COM property "Buffer"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String buffer();
    
    /**
     * <p>
     * Property Value.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @param atributeName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String value(
            java.lang.String atributeName);
    
    /**
     * <p>
     * Property Value.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param atributeName Mandatory java.lang.String parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    void value(
            java.lang.String atributeName,
            java.lang.String pVal);
    
    /**
     * <p>
     * Method AddItem.
     * </p>
     * 
     * @param attrName Mandatory java.lang.String parameter.
     * @param value Mandatory java.lang.String parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    void addItem(
            java.lang.String attrName,
            java.lang.String value);
    
    /**
     * <p>
     * Property ValuePos , get set the value at specified position in the list.
     * </p>
     * <p>
     * Getter method for the COM property "ValuePos"
     * </p>
     * 
     * @param pos Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    java.lang.String valuePos(
            int pos);
    
    /**
     * <p>
     * Property ValuePos , get set the value at specified position in the list.
     * </p>
     * <p>
     * Setter method for the COM property "ValuePos"
     * </p>
     * 
     * @param pos Mandatory int parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    void valuePos(
            int pos,
            java.lang.String pVal);
    
    /**
     * <p>
     * Property IsAttribute.
     * </p>
     * <p>
     * Getter method for the COM property "IsAttribute"
     * </p>
     * 
     * @param attributeName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    boolean isAttribute(
            java.lang.String attributeName);
    
    /**
     * <p>
     * Property NumberOfAttributes.
     * </p>
     * <p>
     * Getter method for the COM property "NumberOfAttributes"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    int numberOfAttributes();
    
    /**
     * <p>
     * Property AttributeName.
     * </p>
     * <p>
     * Getter method for the COM property "AttributeName"
     * </p>
     * 
     * @param position Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String attributeName(
            int position);
    
    /**
     * <p>
     * Property AttributeName.
     * </p>
     * <p>
     * Setter method for the COM property "AttributeName"
     * </p>
     * 
     * @param position Mandatory int parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    void attributeName(
            int position,
            java.lang.String pVal);
    
    /**
     * <p>
     * Gets the position of a specified attribute.
     * </p>
     * <p>
     * Getter method for the COM property "AttributePosition"
     * </p>
     * 
     * @param attributeName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    int attributePosition(
            java.lang.String attributeName);
    
    /**
     * <p>
     * Method RemoveItem - be aware Remove Item changes the positions of the items - the index starts with 0.
     * </p>
     * 
     * @param attributeName Mandatory java.lang.String parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(22)
    void removeItem(
            java.lang.String attributeName);
    
    /**
     * <p>
     * Method RemoveItemPos.
     * </p>
     * 
     * @param itemPos Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    void removeItemPos(
            int itemPos);
    
    /**
     * <p>
     * Removes all items from the list.
     * </p>
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    void clearItemList();
    
    // Properties:
}
