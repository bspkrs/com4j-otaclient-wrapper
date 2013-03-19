package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{D5630429-4097-45C3-B581-2A01C6999DDD}")
public interface ITDConnection3 extends com.hp.alm.otaclient.ITDConnection2
{
    // Methods:
    /**
     * <p>
     * For HP use. GetNonce.
     * </p>
     * 
     * @param clientType Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(88)
    //= 0x58. The runtime will prefer the VTID if present
    @VTID(97)
    java.lang.String getNonce(
            int clientType);
    
    /**
     * <p>
     * For HP use. Validate.
     * </p>
     * 
     * @param clientType Mandatory int parameter.
     * @param validationCode Mandatory java.lang.String parameter.
     */
    
    @DISPID(89)
    //= 0x59. The runtime will prefer the VTID if present
    @VTID(98)
    void validate(
            int clientType,
            java.lang.String validationCode);
    
    /**
     * <p>
     * For HP use. Returns List of Extensions, according to the mode.
     * </p>
     * 
     * @param mode Mandatory int parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(90)
    //= 0x5a. The runtime will prefer the VTID if present
    @VTID(99)
    com.hp.alm.otaclient.IList getExtensions(
            int mode);
    
    /**
     * <p>
     * For HP use. Returns extension factory specified by its entitiy CLSID.
     * </p>
     * <p>
     * Getter method for the COM property "ExtensionFactory"
     * </p>
     * 
     * @param lpclsid Mandatory GUID parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(91)
    //= 0x5b. The runtime will prefer the VTID if present
    @VTID(100)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extensionFactory(
            GUID lpclsid);
    
    /**
     * <p>
     * For HP use. Get the factory according to the CLSID.
     * </p>
     * <p>
     * Getter method for the COM property "ExtensionsManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(92)
    //= 0x5c. The runtime will prefer the VTID if present
    @VTID(101)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extensionsManager();
    
    /**
     * <p>
     * The factory that manages releases.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(93)
    //= 0x5d. The runtime will prefer the VTID if present
    @VTID(102)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseFactory();
    
    /**
     * <p>
     * The factory that manages cycles.
     * </p>
     * <p>
     * Getter method for the COM property "CycleFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(94)
    //= 0x5e. The runtime will prefer the VTID if present
    @VTID(103)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject cycleFactory();
    
    /**
     * <p>
     * The factory that manages release folders.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(95)
    //= 0x5f. The runtime will prefer the VTID if present
    @VTID(104)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseFolderFactory();
    
    /**
     * <p>
     * The service factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ServiceFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(96)
    //= 0x60. The runtime will prefer the VTID if present
    @VTID(105)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject serviceFactory();
    
    /**
     * <p>
     * The service folder factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ServiceFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(97)
    //= 0x61. The runtime will prefer the VTID if present
    @VTID(106)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject serviceFolderFactory();
    
    /**
     * <p>
     * The service group factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ServiceGroupFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(98)
    //= 0x62. The runtime will prefer the VTID if present
    @VTID(107)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject serviceGroupFactory();
    
    /**
     * <p>
     * The service change factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ServiceChangeFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(99)
    //= 0x63. The runtime will prefer the VTID if present
    @VTID(108)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject serviceChangeFactory();
    
    /**
     * <p>
     * The application entity tree and related application entity folders factory for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ApplicationEntityTreeManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(100)
    //= 0x64. The runtime will prefer the VTID if present
    @VTID(109)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject applicationEntityTreeManager();
    
    /**
     * <p>
     * The application entity factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ApplicationEntityFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(101)
    //= 0x65. The runtime will prefer the VTID if present
    @VTID(110)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject applicationEntityFactory();
    
    /**
     * <p>
     * Returns the names of the site's parameters.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(102)
    //= 0x66. The runtime will prefer the VTID if present
    @VTID(111)
    com.hp.alm.otaclient.IList getTDParamsNames();
    
    @VTID(111)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object getTDParamsNames(
            int index);
    
    /**
     * <p>
     * The factory change folders.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeEntityTreeManager"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(103)
    //= 0x67. The runtime will prefer the VTID if present
    @VTID(112)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject changeEntityTreeManager();
    
    /**
     * <p>
     * The change entity factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeEntityFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(104)
    //= 0x68. The runtime will prefer the VTID if present
    @VTID(113)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject changeEntityFactory();
    
    /**
     * <p>
     * The application configuration factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "ApplicationConfigurationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(105)
    //= 0x69. The runtime will prefer the VTID if present
    @VTID(114)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject applicationConfigurationFactory();
    
    /**
     * <p>
     * For HP use. The blueprint entity factory object for this connection.
     * </p>
     * <p>
     * Getter method for the COM property "BlueprintFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(106)
    //= 0x6a. The runtime will prefer the VTID if present
    @VTID(115)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject blueprintFactory();
    
    // Properties:
}
