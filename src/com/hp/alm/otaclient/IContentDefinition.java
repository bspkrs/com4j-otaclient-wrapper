package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Content Definition.
 */
@IID("{D8D6DCC5-4408-43D8-8B90-4506E1ED018D}")
public interface IContentDefinition extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * Get Parent ID.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    int parentId();
    
    /**
     * <p>
     * Get Parent Type.
     * </p>
     * <p>
     * Getter method for the COM property "ParentType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String parentType();
    
    /**
     * <p>
     * Get Name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String name();
    
    /**
     * <p>
     * Get Name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(23)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Content parts factory of this definition.
     * </p>
     * <p>
     * Getter method for the COM property "ContentPartFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject contentPartFactory();
    
    /**
     * <p>
     * The Content root factory of this definition.
     * </p>
     * <p>
     * Getter method for the COM property "ContentRootFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject contentRootFactory();
    
    /**
     * <p>
     * The AutoCompleteType.
     * </p>
     * <p>
     * Getter method for the COM property "AutoCompleteType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(26)
    int autoCompleteType();
    
    /**
     * <p>
     * The AutoCompleteType.
     * </p>
     * <p>
     * Setter method for the COM property "AutoCompleteType"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(27)
    void autoCompleteType(
            int pVal);
    
    // Properties:
}
