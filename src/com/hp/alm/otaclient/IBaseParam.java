package com.hp.alm.otaclient;

import com4j.*;

/**
 * A business component parameter or runtime parameter.
 */
@IID("{DC091A33-E1E8-4A17-8C55-529C09B0670B}")
public interface IBaseParam extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The component parameter's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * The component parameter's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(21)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The parameter's default value.
     * </p>
     * <p>
     * Getter method for the COM property "Value"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(22)
    java.lang.String value();
    
    /**
     * <p>
     * The parameter's default value.
     * </p>
     * <p>
     * Setter method for the COM property "Value"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(23)
    void value(
            java.lang.String pVal);
    
    /**
     * <p>
     * The parameter description.
     * </p>
     * <p>
     * Getter method for the COM property "Desc"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(24)
    java.lang.String desc();
    
    /**
     * <p>
     * The parameter description.
     * </p>
     * <p>
     * Setter method for the COM property "Desc"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(25)
    void desc(
            java.lang.String pVal);
    
    /**
     * <p>
     * The parameter type. For example Date, String, number, etc.
     * </p>
     * <p>
     * Getter method for the COM property "ValueType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(26)
    java.lang.String valueType();
    
    /**
     * <p>
     * The parameter type. For example Date, String, number, etc.
     * </p>
     * <p>
     * Setter method for the COM property "ValueType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @VTID(27)
    void valueType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The position of the parameter in the set of parameters of the same component.
     * </p>
     * <p>
     * Getter method for the COM property "Order"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @VTID(28)
    int order();
    
    /**
     * <p>
     * The position of the parameter in the set of parameters of the same component.
     * </p>
     * <p>
     * Setter method for the COM property "Order"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @VTID(29)
    void order(
            int pVal);
    
    // Properties:
}
