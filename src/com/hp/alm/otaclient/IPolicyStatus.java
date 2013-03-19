package com.hp.alm.otaclient;

import com4j.*;

/**
 * The Policy Enforcement Status information of the connected project.
 */
@IID("{A72C217D-A1A6-46EC-8259-9BC3A7FFC4FA}")
public interface IPolicyStatus extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The project's domain name.
     * </p>
     * <p>
     * Getter method for the COM property "DomainName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String domainName();
    
    /**
     * <p>
     * The project's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * Indicates whether there is a request to block propagation to the project.
     * </p>
     * <p>
     * Getter method for the COM property "BlockPolicyUpdate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(9)
    boolean blockPolicyUpdate();
    
    /**
     * <p>
     * Indicates whether there is a request to block propagation to the project.
     * </p>
     * <p>
     * Setter method for the COM property "BlockPolicyUpdate"
     * </p>
     * 
     * @param pbIsBlocked Mandatory boolean parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    void blockPolicyUpdate(
            boolean pbIsBlocked);
    
    /**
     * <p>
     * The policy enforcement block comment.
     * </p>
     * <p>
     * Getter method for the COM property "PolicyUpdateBlockComment"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String policyUpdateBlockComment();
    
    /**
     * <p>
     * The policy enforcement block comment.
     * </p>
     * <p>
     * Setter method for the COM property "PolicyUpdateBlockComment"
     * </p>
     * 
     * @param psComment Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void policyUpdateBlockComment(
            java.lang.String psComment);
    
    /**
     * <p>
     * Checks whether the connected project is a template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    boolean isTemplate();
    
    /**
     * <p>
     * Checks whether the connected project is up-to-date with its linked template.
     * </p>
     * <p>
     * Getter method for the COM property "IsUpToDate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    boolean isUpToDate();
    
    /**
     * <p>
     * The date-time of the last template propagation performed on the project.
     * </p>
     * <p>
     * Getter method for the COM property "LastPropagationTime"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(15)
    java.util.Date lastPropagationTime();
    
    /**
     * <p>
     * The XML document containing the data of the last propagation performed on the project.
     * </p>
     * <p>
     * Getter method for the COM property "LastPropagationReport"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String lastPropagationReport();
    
    /**
     * <p>
     * Checks whether the project is verified against its linked template.
     * </p>
     * <p>
     * Getter method for the COM property "VerificationStatus"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(17)
    int verificationStatus();
    
    /**
     * <p>
     * The date-time of the last template verification performed on the project.
     * </p>
     * <p>
     * Getter method for the COM property "LastVerificationTime"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(18)
    java.util.Date lastVerificationTime();
    
    /**
     * <p>
     * The XML document containing the data of the last verification performed on the project.
     * </p>
     * <p>
     * Getter method for the COM property "LastVerificationReport"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String lastVerificationReport();
    
    /**
     * <p>
     * The list of project administrators.
     * </p>
     * <p>
     * Getter method for the COM property "Administrators"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    com.hp.alm.otaclient.IList administrators();
    
    @VTID(20)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object administrators(
            int index);
    
    /**
     * <p>
     * The Policy Enforcement Status object containing details of the project's linked template.
     * </p>
     * <p>
     * Getter method for the COM property "LinkedTemplate"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject linkedTemplate();
    
    // Properties:
}
