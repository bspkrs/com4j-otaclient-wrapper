package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a comparison result for a single element.
 */
@IID("{C3022DB1-251B-4F4F-A176-8A4A3811CF66}")
public interface IComparisonResult extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns a copy of the Type of the compared element.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String type();
    
    /**
     * <p>
     * Returns the first compared element's ID.
     * </p>
     * <p>
     * Getter method for the COM property "Id1"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String id1();
    
    /**
     * <p>
     * Returns the second compared element's ID.
     * </p>
     * <p>
     * Getter method for the COM property "Id2"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String id2();
    
    /**
     * <p>
     * Returns a copy of The list of the modified fields.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Returns a copy of the Owner Type of the compared element. For example, if type param is CROS_REF (Attachment), then OwnerType may be
     * REQ, TEST, DES_STEP, etc.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String ownerType();
    
    /**
     * <p>
     * Returns the first compared element's owner ID. This value exists iff Owner Type exists.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerKey1"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String ownerKey1();
    
    /**
     * <p>
     * Returns the second compared element's owner ID. This value exists iff Owner Type exists.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerKey2"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String ownerKey2();
    
    // Properties:
}
