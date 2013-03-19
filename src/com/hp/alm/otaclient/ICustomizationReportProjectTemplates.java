package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ICustomizationReportProjectTemplates Interface.
 */
@IID("{818C46C4-330C-4B5B-8C57-3FEE96C4DF83}")
public interface ICustomizationReportProjectTemplates extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Adds the report projects template with the specified name and category.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param category Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addReportProjectTemplate(
            java.lang.String name,
            java.lang.String category);
    
    /**
     * <p>
     * Removes the report projects template with the specified name and category.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param category Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeReportProjectTemplate(
            java.lang.String name,
            java.lang.String category);
    
    /**
     * <p>
     * Returns the report project template with the specified name and category.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param category Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getReportProjectTemplate(
            java.lang.String name,
            java.lang.String category);
    
    /**
     * <p>
     * Gets all report project templates.
     * </p>
     * <p>
     * Getter method for the COM property "ReportProjectTemplates"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList reportProjectTemplates();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object reportProjectTemplates(
            int index);
    
    /**
     * <p>
     * Queries for a template with a given name and category.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param category Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean isReportProjectTemplateExist(
            java.lang.String name,
            java.lang.String category);
    
    // Properties:
}
