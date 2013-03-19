package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single file or Internet address attached to a field object.
 */
@IID("{613E9BF2-7888-438F-979F-D05DAB87B9C8}")
public interface IAttachment extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The attachment type. Either File or URL.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    int type();
    
    /**
     * <p>
     * The attachment type. Either File or URL.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    void type(
            int pVal);
    
    /**
     * <p>
     * The attachment name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @param viewFormat Optional parameter. Default value is 0
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(22)
    java.lang.String name(
            @Optional @DefaultValue("0") int viewFormat);
    
    /**
     * <p>
     * The attachment description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String description();
    
    /**
     * <p>
     * The attachment description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(24)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * If the attachment is a file, an array of bytes. If a reference to file, the path or URL.
     * </p>
     * <p>
     * Getter method for the COM property "Data"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object data();
    
    /**
     * <p>
     * If a file, the file location. If a virtual file, the location for the attachment before it is uploaded to the server. If a URL, the
     * link address.
     * </p>
     * <p>
     * Getter method for the COM property "FileName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String fileName();
    
    /**
     * <p>
     * If a file, the file location. If a virtual file, the location for the attachment before it is uploaded to the server. If a URL, the
     * link address.
     * </p>
     * <p>
     * Setter method for the COM property "FileName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(27)
    void fileName(
            java.lang.String pVal);
    
    /**
     * <p>
     * Downloads an attachment file to a client machine.
     * </p>
     * 
     * @param synchronize Mandatory boolean parameter.
     * @param rootPath Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    void load(
            boolean synchronize,
            Holder<java.lang.String> rootPath);
    
    /**
     * <p>
     * Uploads a file to the server.
     * </p>
     * 
     * @param synchronize Mandatory boolean parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void save(
            boolean synchronize);
    
    /**
     * <p>
     * Deprecated. The ExtendedStorage object of this attachment. Applies only to file attachments.
     * </p>
     * <p>
     * Getter method for the COM property "AttachmentStorage"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject attachmentStorage();
    
    /**
     * <p>
     * The link or the attachment file name on the server machine.
     * </p>
     * <p>
     * Getter method for the COM property "DirectLink"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String directLink();
    
    /**
     * <p>
     * The path to the attachment on the server machine.
     * </p>
     * <p>
     * Getter method for the COM property "ServerFileName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String serverFileName();
    
    /**
     * <p>
     * The attachment file size in bytes.
     * </p>
     * <p>
     * Getter method for the COM property "FileSize"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(33)
    int fileSize();
    
    /**
     * <p>
     * The last modified time.
     * </p>
     * <p>
     * Getter method for the COM property "LastModified"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(34)
    java.util.Date lastModified();
    
    /**
     * <p>
     * Renames the attachment on the server. The attachment must be uploaded before calling this method.
     * </p>
     * 
     * @param newName Mandatory java.lang.String parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(35)
    void rename(
            java.lang.String newName);
    
    // Properties:
}
