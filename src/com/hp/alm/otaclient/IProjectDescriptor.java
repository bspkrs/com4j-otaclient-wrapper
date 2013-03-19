package com.hp.alm.otaclient;

import com4j.*;

/**
 * Information about a project.
 */
@IID("{F75A5EA6-BB0D-419F-9B39-EF024E835AFC}")
public interface IProjectDescriptor extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns the project's Unique ID number.
     * </p>
     * <p>
     * Getter method for the COM property "UId"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String uId();
    
    /**
     * <p>
     * Returns the project's domain name.
     * </p>
     * <p>
     * Getter method for the COM property "DomainName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String domainName();
    
    /**
     * <p>
     * Returns the project's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String name();
    
    /**
     * <p>
     * Returns the project's type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String type();
    
    /**
     * <p>
     * Returns true when the project is a template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean isTemplate();
    
    // Properties:
}
