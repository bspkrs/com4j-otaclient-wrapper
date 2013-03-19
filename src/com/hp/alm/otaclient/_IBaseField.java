package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. _IBaseField Interface.
 */
@IID("{DCD217D3-9BE9-4BED-B386-1A105D84E1F0}")
public interface _IBaseField extends Com4jObject
{
    // Methods:
    /**
     * @param vector Mandatory int parameter.
     * @param index Mandatory int parameter.
     */
    
    @VTID(3)
    void _SetNeighborhood_(
            int vector,
            int index);
    
    /**
     * @param pObject Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(4)
    @ReturnValue(index = 0)
    java.lang.String _BeforePost_(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pObject);
    
    /**
     * @param data Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(5)
    java.lang.String _DoPost_(
            java.lang.String data);
    
    /**
     * @param key Mandatory java.lang.String parameter.
     * @param pObject Mandatory com4j.Com4jObject parameter.
     */
    
    @VTID(6)
    void _AfterPost_(
            java.lang.String key,
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pObject);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param val Mandatory boolean parameter.
     */
    
    @VTID(7)
    void _SetRequired_(
            java.lang.String fieldName,
            boolean val);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(8)
    boolean _GetRequired_(
            java.lang.String fieldName);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     */
    
    @VTID(9)
    void _RestoreRequired_(
            java.lang.String fieldName);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param val Mandatory com4j.Com4jObject parameter.
     */
    
    @VTID(10)
    void _SetRoot_(
            java.lang.String fieldName,
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject val);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject _GetRoot_(
            java.lang.String fieldName);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     */
    
    @VTID(12)
    void _RestoreRoot_(
            java.lang.String fieldName);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     */
    
    @VTID(13)
    void _put_Field(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(14)
    boolean _VerifyPutField(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param oldFieldValue Optional parameter. Default value is com4j.Variant.getMissing()
     * @return Returns a value of type boolean
     */
    
    @VTID(15)
    boolean _IsFieldModified(
            java.lang.String fieldName,
            @Optional java.lang.Object oldFieldValue);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     */
    
    @VTID(16)
    void _UndoField(
            java.lang.String fieldName);
    
    /**
     * @param fieldName Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(17)
    boolean _VerifyPutFieldWithErrorOnFail(
            java.lang.String fieldName,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    /**
     * @param pBaseField Mandatory com.hp.alm.otaclient.IBaseField parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(18)
    java.lang.String _GetEntityOwner(
            com.hp.alm.otaclient.IBaseField pBaseField);
    
    /**
     * @param pBaseField Mandatory com.hp.alm.otaclient.IBaseField parameter.
     * @param tableName Mandatory java.lang.String parameter.
     */
    
    @VTID(19)
    void _VerifyRemoveItem(
            com.hp.alm.otaclient.IBaseField pBaseField,
            java.lang.String tableName);
    
    // Properties:
}
