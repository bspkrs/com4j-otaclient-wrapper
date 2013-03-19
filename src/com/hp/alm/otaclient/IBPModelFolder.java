package com.hp.alm.otaclient;

import com4j.*;

/**
 * Business Process Model Folder.
 */
@IID("{EF5B4A06-00BC-4F76-8EA6-0C41AFF20A27}")
public interface IBPModelFolder extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The BPModel folder's name
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The BPModel folder's name
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The BPModelFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelFactory();
    
    /**
     * <p>
     * The BPModelFolderFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelFolderFactory();
    
    /**
     * <p>
     * The BPModel folder's parent release folder, or null if root
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    // Properties:
}
