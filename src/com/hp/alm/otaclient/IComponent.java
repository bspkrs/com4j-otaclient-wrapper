package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a business component.
 */
@IID("{E8BFF66F-A020-4909-B9E3-1591182D27D7}")
public interface IComponent extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The component parameter factory.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentParamFactory();
    
    /**
     * <p>
     * The Component's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The Component's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The list of associated BusinessProcess objects.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(26)
    com.hp.alm.otaclient.IList businessProcesses();
    
    @VTID(26)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object businessProcesses(
            int index);
    
    /**
     * <p>
     * For backward compatibility with versions prior to 9.0.
     * </p>
     * <p>
     * Getter method for the COM property "IsIteratable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(27)
    boolean isIteratable();
    
    /**
     * <p>
     * For backward compatibility with versions prior to 9.0.
     * </p>
     * <p>
     * Setter method for the COM property "IsIteratable"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(28)
    void isIteratable(
            boolean pVal);
    
    /**
     * <p>
     * Checks if the component has been marked deleted by a user but is still in use in a test.
     * </p>
     * <p>
     * Getter method for the COM property "IsObsolete"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(29)
    boolean isObsolete();
    
    /**
     * <p>
     * The component's folder.
     * </p>
     * <p>
     * Getter method for the COM property "Folder"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject folder();
    
    /**
     * <p>
     * Checks if the component is associated with a test script.
     * </p>
     * <p>
     * Getter method for the COM property "HasScript"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(31)
    boolean hasScript();
    
    /**
     * <p>
     * Indicates if the component has a snapshot.
     * </p>
     * <p>
     * Getter method for the COM property "HasPicture"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(32)
    boolean hasPicture();
    
    /**
     * <p>
     * Indicates if the component has a snapshot.
     * </p>
     * <p>
     * Setter method for the COM property "HasPicture"
     * </p>
     * 
     * @param pvbVal Mandatory boolean parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(33)
    void hasPicture(
            boolean pvbVal);
    
    /**
     * <p>
     * The ExtendedStorage object for this component.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @param nEntityType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extendedStorage(
            int nEntityType);
    
    /**
     * <p>
     * The test script type.
     * </p>
     * <p>
     * Getter method for the COM property "ScriptType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String scriptType();
    
    /**
     * <p>
     * The test script type.
     * </p>
     * <p>
     * Setter method for the COM property "ScriptType"
     * </p>
     * 
     * @param pbsVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(36)
    void scriptType(
            java.lang.String pbsVal);
    
    /**
     * <p>
     * Deletes the snapshot.
     * </p>
     * 
     * @param bsData Mandatory java.lang.String parameter.
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(37)
    void deletePicture(
            java.lang.String bsData);
    
    /**
     * <p>
     * The ComponentStepFactory for this component.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentStepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(38)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentStepFactory();
    
    /**
     * <p>
     * For backward compatibility with versions prior to 9.0. Wrap component's step in HTML format.
     * </p>
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(39)
    void setStepsData();
    
    /**
     * <p>
     * The Component's linked application area ID.
     * </p>
     * <p>
     * Getter method for the COM property "ApplicationAreaID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(40)
    int applicationAreaID();
    
    /**
     * <p>
     * The Component's linked application area ID.
     * </p>
     * <p>
     * Setter method for the COM property "ApplicationAreaID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(41)
    void applicationAreaID(
            int pVal);
    
    // Properties:
}
