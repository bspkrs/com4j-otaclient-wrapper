package com.hp.alm.otaclient;

import com4j.*;

/**
 * Configuration information used to build a graph.
 */
@IID("{96615E7A-A7C4-4B6F-A00A-418B92070F83}")
public interface IGraphDefinition extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The module specified when the graph definition was created.
     * </p>
     * <p>
     * Getter method for the COM property "Module"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int module();
    
    /**
     * <p>
     * The graph type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int type();
    
    /**
     * <p>
     * The value of the specified property.
     * </p>
     * <p>
     * Getter method for the COM property "Property"
     * </p>
     * 
     * @param prop Mandatory int parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object property(
            int prop);
    
    /**
     * <p>
     * The value of the specified property.
     * </p>
     * <p>
     * Setter method for the COM property "Property"
     * </p>
     * 
     * @param prop Mandatory int parameter.
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void property(
            int prop,
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The filter sets the criteria for which data are included in the graph.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject filter();
    
    /**
     * <p>
     * The filter sets the criteria for which data are included in the graph.
     * </p>
     * <p>
     * Setter method for the COM property "Filter"
     * </p>
     * 
     * @param pFilter Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void filter(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pFilter);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String text();
    
    // Properties:
}
