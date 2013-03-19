package com.hp.alm.otaclient;

import com4j.*;

/**
 * A Business Criticality or failure probability criterion, used to assess a risk.
 */
@IID("{D641AF43-F4B6-4F9C-AC81-413557DC576C}")
public interface ICustomizationRBTQuestion extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationRBTQuestion unique ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * The IList of CustomizationRBTAnswer objects of all possible values for this criterion, ordered by weight.
     * </p>
     * <p>
     * Getter method for the COM property "Answers"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    com.hp.alm.otaclient.IList answers();
    
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object answers(
            int index);
    
    /**
     * <p>
     * Returns the specified value.
     * </p>
     * <p>
     * Getter method for the COM property "AnswerByID"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject answerByID(
            int id);
    
    /**
     * <p>
     * Adds a new possible value. Returns the new value as a CustomizationRBTAnswer object.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addAnswer();
    
    /**
     * <p>
     * Deletes a possible value specified by ID.
     * </p>
     * 
     * @param id Mandatory int parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    void deleteAnswer(
            int id);
    
    /**
     * <p>
     * The criterion's text.
     * </p>
     * <p>
     * Getter method for the COM property "QuestionText"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String questionText();
    
    /**
     * <p>
     * The criterion's text.
     * </p>
     * <p>
     * Setter method for the COM property "QuestionText"
     * </p>
     * 
     * @param pQuestionText Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(13)
    void questionText(
            java.lang.String pQuestionText);
    
    /**
     * <p>
     * The criterion's description.
     * </p>
     * <p>
     * Getter method for the COM property "QuestionDescription"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String questionDescription();
    
    /**
     * <p>
     * The criterion's description.
     * </p>
     * <p>
     * Setter method for the COM property "QuestionDescription"
     * </p>
     * 
     * @param pQuestionDescription Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(15)
    void questionDescription(
            java.lang.String pQuestionDescription);
    
    /**
     * <p>
     * The (non unique) criterion's order of display in UI.
     * </p>
     * <p>
     * Getter method for the COM property "QuestionOrder"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(16)
    int questionOrder();
    
    /**
     * <p>
     * The (non unique) criterion's order of display in UI.
     * </p>
     * <p>
     * Setter method for the COM property "QuestionOrder"
     * </p>
     * 
     * @param pnQuestionOrder Mandatory int parameter.
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(17)
    void questionOrder(
            int pnQuestionOrder);
    
    // Properties:
}
