package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single Business Process Test.
 */
@IID("{590E515E-D527-4436-B04C-40942DBFFB5F}")
public interface IBusinessProcess extends com.hp.alm.otaclient.ITest
{
    // Methods:
    /**
     * <p>
     * Deprecated. Use factories to load BusinessProcess object and all of its dependencies. Loads the BusinessProcess object and all of its
     * dependencies into memory.
     * </p>
     */
    
    @DISPID(100)
    //= 0x64. The runtime will prefer the VTID if present
    @VTID(48)
    void load();
    
    /**
     * <p>
     * Deprecated. Use factories to save the BusinessProcess object and all of its dependencies. Saves the BusinessProcess object and all of
     * its dependencies.
     * </p>
     */
    
    @DISPID(101)
    //= 0x65. The runtime will prefer the VTID if present
    @VTID(49)
    void save();
    
    /**
     * <p>
     * Deprecated. Use TestParameterFactory of ISupportTestParameters. The list of run time parameters for the test.
     * </p>
     * <p>
     * Getter method for the COM property "RTParameters"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(102)
    //= 0x66. The runtime will prefer the VTID if present
    @VTID(50)
    com.hp.alm.otaclient.IList rtParameters();
    
    @VTID(50)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object rtParameters(
            int index);
    
    /**
     * <p>
     * Deprecated. Use TestParameterFactory of ISupportTestParameters. Adds a runtime parameter to the test.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(103)
    //= 0x67. The runtime will prefer the VTID if present
    @VTID(51)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addRTParam();
    
    /**
     * <p>
     * Deprecated. Use TestParameterFactory of ISupportTestParameters. Delete the given RTParam from the test.
     * </p>
     * 
     * @param pRTParam Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(104)
    //= 0x68. The runtime will prefer the VTID if present
    @VTID(52)
    void deleteRTParam(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pRTParam);
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4. The list of BPComponents that belong to the test.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponents"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(105)
    //= 0x69. The runtime will prefer the VTID if present
    @VTID(53)
    com.hp.alm.otaclient.IList bpComponents();
    
    @VTID(53)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object bpComponents(
            int index);
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4. Adds the specified Component to the test.
     * </p>
     * 
     * @param pComponent Mandatory com4j.Com4jObject parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(106)
    //= 0x6a. The runtime will prefer the VTID if present
    @VTID(54)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addBPComponent(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pComponent);
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4. Delete the specified BPComponent from the test.
     * </p>
     * 
     * @param pBPComponent Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(107)
    //= 0x6b. The runtime will prefer the VTID if present
    @VTID(55)
    void deleteBPComponent(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pBPComponent);
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4 (Group is BPComponent). Adds an empty group of components to the test.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(108)
    //= 0x6c. The runtime will prefer the VTID if present
    @VTID(56)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addGroup();
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4 (Group is BPComponent). Delete the specified BPGroup from the test.
     * </p>
     * 
     * @param pBPGroup Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(109)
    //= 0x6d. The runtime will prefer the VTID if present
    @VTID(57)
    void deleteGroup(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pBPGroup);
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4 (Group is BPComponent). Gets a BPGroup from the test by its ID.
     * </p>
     * <p>
     * Getter method for the COM property "GroupByID"
     * </p>
     * 
     * @param nGroupID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(110)
    //= 0x6e. The runtime will prefer the VTID if present
    @VTID(58)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject groupByID(
            int nGroupID);
    
    /**
     * <p>
     * Download the snapshots attached to the components of the test to the clients cache.
     * </p>
     */
    
    @DISPID(111)
    //= 0x6f. The runtime will prefer the VTID if present
    @VTID(59)
    void downloadPictures();
    
    /**
     * <p>
     * Reports the status of DownloadPictures.
     * </p>
     * 
     * @param total Mandatory Holder<Integer> parameter.
     * @param current Mandatory Holder<Integer> parameter.
     */
    
    @DISPID(112)
    //= 0x70. The runtime will prefer the VTID if present
    @VTID(60)
    void downloadPicturesProgress(
            Holder<Integer> total,
            Holder<Integer> current);
    
    /**
     * <p>
     * Cancels the download of the test component's pictures.
     * </p>
     */
    
    @DISPID(113)
    //= 0x71. The runtime will prefer the VTID if present
    @VTID(61)
    void cancelDownloadPictures();
    
    /**
     * <p>
     * Not implemented.
     * </p>
     * <p>
     * Getter method for the COM property "HtmlScript"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(114)
    //= 0x72. The runtime will prefer the VTID if present
    @VTID(62)
    java.lang.String htmlScript();
    
    /**
     * <p>
     * The test's history object.
     * </p>
     * <p>
     * Getter method for the COM property "BPTHistory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(115)
    //= 0x73. The runtime will prefer the VTID if present
    @VTID(63)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bptHistory();
    
    /**
     * <p>
     * Deprecated. Use BPComponentFactory of IBusinessProcess4. Gets a BPComponent from the test by its ID.
     * </p>
     * <p>
     * Getter method for the COM property "BPComponentByID"
     * </p>
     * 
     * @param nCompID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(116)
    //= 0x74. The runtime will prefer the VTID if present
    @VTID(64)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpComponentByID(
            int nCompID);
    
    // Properties:
}
