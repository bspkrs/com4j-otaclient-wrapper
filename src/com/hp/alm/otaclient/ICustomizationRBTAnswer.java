package com.hp.alm.otaclient;

import com4j.*;

/**
 * A possible value for a Business Criticality, Failure Probablity, or Functional Complexity criterion, used to assess a risk.
 */
@IID("{75D8B306-2274-4D9B-9DF4-491A7D2A9B9A}")
public interface ICustomizationRBTAnswer extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationRBTAnswer unique ID.
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
     * The value's text.
     * </p>
     * <p>
     * Getter method for the COM property "AnswerText"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String answerText();
    
    /**
     * <p>
     * The value's text.
     * </p>
     * <p>
     * Setter method for the COM property "AnswerText"
     * </p>
     * 
     * @param pAnswerText Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void answerText(
            java.lang.String pAnswerText);
    
    /**
     * <p>
     * The value's weight.
     * </p>
     * <p>
     * Getter method for the COM property "AnswerWeight"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    int answerWeight();
    
    /**
     * <p>
     * The value's weight.
     * </p>
     * <p>
     * Setter method for the COM property "AnswerWeight"
     * </p>
     * 
     * @param pAnswerWeight Mandatory int parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void answerWeight(
            int pAnswerWeight);
    
    // Properties:
}
