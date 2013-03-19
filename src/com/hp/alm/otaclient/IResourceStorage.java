package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage resource storage.
 */
@IID("{137CC633-E0CF-4DED-B738-12D5B39C42CB}")
public interface IResourceStorage extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Uploads the specified resource to the server.
     * </p>
     * 
     * @param resourcePath Mandatory java.lang.String parameter.
     * @param synchronize Mandatory boolean parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void uploadResource(
            java.lang.String resourcePath,
            boolean synchronize);
    
    /**
     * <p>
     * Downloads the specified resource to the client.
     * </p>
     * 
     * @param resourcePath Mandatory java.lang.String parameter.
     * @param synchronize Mandatory boolean parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String downloadResource(
            java.lang.String resourcePath,
            boolean synchronize);
    
    /**
     * <p>
     * Remove the resource files from the server repository and the client cache.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void clean();
    
    // Properties:
}
