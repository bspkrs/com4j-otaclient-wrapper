package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ITDChat Interface.
 */
@IID("{D323F3D1-837E-4C0F-9ACB-7CBCDDA557DC}")
public interface ITDChat extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Connects to chat.
     * </p>
     * 
     * @param chatRoom Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String connect(
            java.lang.String chatRoom);
    
    /**
     * <p>
     * Disconnects from chat.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void disconnect();
    
    /**
     * <p>
     * Sends message to chat and receive new messages.
     * </p>
     * 
     * @param chatMessage Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String putMessage(
            java.lang.String chatMessage);
    
    /**
     * <p>
     * Receives new chat messages.
     * </p>
     * <p>
     * Getter method for the COM property "ChatData"
     * </p>
     * 
     * @param getAllMesseges Mandatory boolean parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String chatData(
            boolean getAllMesseges);
    
    /**
     * <p>
     * Changes chat room.
     * </p>
     * 
     * @param newChatRoom Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void changeChat(
            java.lang.String newChatRoom);
    
    // Properties:
}
