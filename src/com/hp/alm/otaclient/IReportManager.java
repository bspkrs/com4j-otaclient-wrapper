package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. IReportManager Interface.
 */
@IID("{15E3AB5F-7F8F-4945-AF67-59FF14B30838}")
public interface IReportManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Downloads a report file
     * </p>
     * 
     * @param reportFileName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String downloadReport(
            java.lang.String reportFileName);
    
    /**
     * <p>
     * Invokes a task that generates a full report data file on the server.
     * </p>
     * 
     * @param analysisItemId Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int startGenerateReport(
            int analysisItemId);
    
    /**
     * <p>
     * Invokes a task that generates a report preview data file on the server.
     * </p>
     * 
     * @param analysisItemId Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int startGenerateReportPreview(
            int analysisItemId);
    
    /**
     * <p>
     * Invokes a task that generates a full report data file on the server by sending a full configuration XML to the server.
     * </p>
     * 
     * @param reportConfigXml Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int startGenerateVirtualReport(
            java.lang.String reportConfigXml);
    
    /**
     * <p>
     * Invokes a task that generates a report preview data file on the server by sending a full configuration XML to the server.
     * </p>
     * 
     * @param reportConfigXml Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    int startGenerateVirtualReportPreview(
            java.lang.String reportConfigXml);
    
    /**
     * <p>
     * Downloads the project template file and returns the download path.
     * </p>
     * 
     * @param tmpltID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String downloadReportProjectTemplateFile(
            int tmpltID);
    
    /**
     * <p>
     * Downloads the a custom template file and returns the download path.
     * </p>
     * 
     * @param tmpltID Mandatory int parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String downloadReportUserTemplateFile(
            int tmpltID);
    
    /**
     * <p>
     * Uploads a template file for the specified project template.
     * </p>
     * 
     * @param tmpltID Mandatory int parameter.
     * @param localFilePath Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(14)
    void uploadReportProjectTemplateFile(
            int tmpltID,
            java.lang.String localFilePath);
    
    /**
     * <p>
     * Creates a custom template
     * </p>
     * 
     * @param fileName Mandatory java.lang.String parameter.
     * @param pFields Mandatory com.hp.alm.otaclient.IList parameter.
     * @param tmplType Mandatory java.lang.String parameter.
     * @param owningReportID Mandatory int parameter.
     * @param localFilePath Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createReportUserTemplate(
            java.lang.String fileName,
            com.hp.alm.otaclient.IList pFields,
            java.lang.String tmplType,
            int owningReportID,
            java.lang.String localFilePath);
    
    /**
     * <p>
     * Downloads the Template Creator file and returns the download path.
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String downloadTemplateCreator();
    
    // Properties:
}
