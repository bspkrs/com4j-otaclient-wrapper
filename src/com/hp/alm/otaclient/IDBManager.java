package com.hp.alm.otaclient;

import com4j.*;

/**
 * Obsolete. IDBManager Interface.
 */
@IID("{437A2A3C-00EB-4B53-89C8-BBC5DED2D52C}")
public interface IDBManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Creates the database on the specified domain.
     * </p>
     * 
     * @param dbType Mandatory int parameter.
     * @param dbName Mandatory java.lang.String parameter.
     * @param connectionString Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void createDatabase(
            int dbType,
            java.lang.String dbName,
            java.lang.String connectionString);
    
    /**
     * <p>
     * Removes the database from the domain.
     * </p>
     * 
     * @param dbName Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeDatabase(
            java.lang.String dbName);
    
    /**
     * <p>
     * property AdminUserName.
     * </p>
     * <p>
     * Getter method for the COM property "AdminUserName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String adminUserName();
    
    /**
     * <p>
     * property AdminUserName.
     * </p>
     * <p>
     * Setter method for the COM property "AdminUserName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void adminUserName(
            java.lang.String pVal);
    
    /**
     * <p>
     * property Domain.
     * </p>
     * <p>
     * Getter method for the COM property "Domain"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String domain();
    
    /**
     * <p>
     * property Domain.
     * </p>
     * <p>
     * Setter method for the COM property "Domain"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void domain(
            java.lang.String pVal);
    
    /**
     * <p>
     * property AdminUserPassword.
     * </p>
     * <p>
     * Getter method for the COM property "AdminUserPassword"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String adminUserPassword();
    
    /**
     * <p>
     * property AdminUserPassword.
     * </p>
     * <p>
     * Setter method for the COM property "AdminUserPassword"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void adminUserPassword(
            java.lang.String pVal);
    
    // Properties:
}
