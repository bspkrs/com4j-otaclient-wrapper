package com.hp.alm.otaclient;

import com4j.*;

/**
 * BP Models.
 */
@IID("{C92D0327-82F6-4B7C-8D6A-2B28FC8A8B4C}")
public interface IBPModel extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The BPModel name.
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
     * The BPModel name.
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
     * The ID of the BPModel's parent folder.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    int parentId();
    
    /**
     * <p>
     * The ID of the BPModel's parent folder.
     * </p>
     * <p>
     * Setter method for the COM property "ParentId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void parentId(
            int pVal);
    
    /**
     * <p>
     * The description of the BPModel.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String description();
    
    /**
     * <p>
     * The description of the BPModel.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The BPModelPathFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelPathFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelPathFactory();
    
    /**
     * <p>
     * The BPModelElementFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "BPModelElementFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpModelElementFactory();
    
    /**
     * <p>
     * The ID of the root representative requirement.
     * </p>
     * <p>
     * Getter method for the COM property "RepReqRootFolderId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String repReqRootFolderId();
    
    /**
     * <p>
     * For HP use. Triggers the post process of model import.
     * </p>
     * 
     * @param updateFlag Mandatory boolean parameter.
     * @param parentId Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(33)
    boolean importPostProcess(
            boolean updateFlag,
            int parentId);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param updateFlag Mandatory boolean parameter.
     * @param parentId Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(34)
    boolean handleRepresentativeRequirements(
            boolean updateFlag,
            int parentId);
    
    // Properties:
}
