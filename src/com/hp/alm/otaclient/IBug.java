package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a defect.
 */
@IID("{2AF970F7-6CCC-4DFB-AA78-08F689481F94}")
public interface IBug extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The defect status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String status();
    
    /**
     * <p>
     * The defect status.
     * </p>
     * <p>
     * Setter method for the COM property "Status"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void status(
            java.lang.String pVal);
    
    /**
     * <p>
     * The testing project to which the defect belongs.
     * </p>
     * <p>
     * Getter method for the COM property "Project"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String project();
    
    /**
     * <p>
     * The testing project to which the defect belongs.
     * </p>
     * <p>
     * Setter method for the COM property "Project"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void project(
            java.lang.String pVal);
    
    /**
     * <p>
     * A short description of the defect.
     * </p>
     * <p>
     * Getter method for the COM property "Summary"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String summary();
    
    /**
     * <p>
     * A short description of the defect.
     * </p>
     * <p>
     * Setter method for the COM property "Summary"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void summary(
            java.lang.String pVal);
    
    /**
     * <p>
     * The defect priority.
     * </p>
     * <p>
     * Getter method for the COM property "Priority"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String priority();
    
    /**
     * <p>
     * The defect priority.
     * </p>
     * <p>
     * Setter method for the COM property "Priority"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    void priority(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the user who detected the defect.
     * </p>
     * <p>
     * Getter method for the COM property "DetectedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String detectedBy();
    
    /**
     * <p>
     * The name of the user who detected the defect.
     * </p>
     * <p>
     * Setter method for the COM property "DetectedBy"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(33)
    void detectedBy(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the user to whom the defect is assigned.
     * </p>
     * <p>
     * Getter method for the COM property "AssignedTo"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(34)
    java.lang.String assignedTo();
    
    /**
     * <p>
     * The name of the user to whom the defect is assigned.
     * </p>
     * <p>
     * Setter method for the COM property "AssignedTo"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(35)
    void assignedTo(
            java.lang.String pVal);
    
    /**
     * <p>
     * Searches the defect summaries for similarities to this defect.
     * </p>
     * 
     * @param similarityRatio Optional parameter. Default value is 10
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(36)
    com.hp.alm.otaclient.IList findSimilarBugs(
            @Optional @DefaultValue("10") int similarityRatio);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "HasChange"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(37)
    boolean hasChange();
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "ChangeLinks"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(38)
    com.hp.alm.otaclient.IList changeLinks();
    
    @VTID(38)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object changeLinks(
            int index);
    
    // Properties:
}
