package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a database command.
 */
@IID("{35DE061D-B934-4DEB-9F53-6A376EB034DF}")
public interface ICommand extends com.hp.alm.otaclient.IParam
{
    // Methods:
    /**
     * <p>
     * The text of the command.
     * </p>
     * <p>
     * Getter method for the COM property "CommandText"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(16)
    @DefaultMethod
    java.lang.String commandText();
    
    /**
     * <p>
     * The text of the command.
     * </p>
     * <p>
     * Setter method for the COM property "CommandText"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(17)
    @DefaultMethod
    void commandText(
            java.lang.String pVal);
    
    /**
     * <p>
     * Executes the command in the CommandText property.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject execute();
    
    /**
     * <p>
     * A comma-separated list of index fields for a SELECT command.
     * </p>
     * <p>
     * Getter method for the COM property "IndexFields"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String indexFields();
    
    /**
     * <p>
     * A comma-separated list of index fields for a SELECT command.
     * </p>
     * <p>
     * Setter method for the COM property "IndexFields"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(20)
    void indexFields(
            java.lang.String pVal);
    
    /**
     * <p>
     * The number of table rows that were affected by the command.
     * </p>
     * <p>
     * Getter method for the COM property "AffectedRows"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    int affectedRows();
    
    // Properties:
}
