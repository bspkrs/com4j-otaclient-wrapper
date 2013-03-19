package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents report user custom template.
 */
@IID("{A2ABF067-6ECA-4C19-9961-8654719A85F7}")
public interface IReportToReportProjectTemplateLink extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The ID of the project template element referenced by this link.
     * </p>
     * <p>
     * Getter method for the COM property "TemplateID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    int templateID();
    
    /**
     * <p>
     * The ID of the project template element referenced by this link.
     * </p>
     * <p>
     * Setter method for the COM property "TemplateID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void templateID(
            int pVal);
    
    /**
     * <p>
     * The ID of the report (analysis item) referenced by this link.
     * </p>
     * <p>
     * Getter method for the COM property "ReportID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    int reportID();
    
    /**
     * <p>
     * The ID of the report (analysis item) referenced by this link.
     * </p>
     * <p>
     * Setter method for the COM property "ReportID"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void reportID(
            int pVal);
    
    // Properties:
}
