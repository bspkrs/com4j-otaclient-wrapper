package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents an item in a Dashboard Page.
 */
@IID("{42CB624E-00B7-4803-A465-6FBC156A976B}")
public interface IDashboardPageItem extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The page's ID.
     * </p>
     * <p>
     * Getter method for the COM property "PageId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(20)
    int pageId();
    
    /**
     * <p>
     * The ID of the analysis item to be displayed in this location.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisItemId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(21)
    int analysisItemId();
    
    /**
     * <p>
     * The ID of the analysis item to be displayed in this location.
     * </p>
     * <p>
     * Setter method for the COM property "AnalysisItemId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    void analysisItemId(
            int pVal);
    
    /**
     * <p>
     * The row number of the top of the item on the page.
     * </p>
     * <p>
     * Getter method for the COM property "Row"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    int row();
    
    /**
     * <p>
     * The row number of the top of the item on the page.
     * </p>
     * <p>
     * Setter method for the COM property "Row"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(24)
    void row(
            int pVal);
    
    /**
     * <p>
     * The column of the left edge of the item on the page.
     * </p>
     * <p>
     * Getter method for the COM property "Column"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(25)
    int column();
    
    /**
     * <p>
     * The column of the left edge of the item on the page.
     * </p>
     * <p>
     * Setter method for the COM property "Column"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(26)
    void column(
            int pVal);
    
    /**
     * <p>
     * The height of the item in number of cells.
     * </p>
     * <p>
     * Getter method for the COM property "Height"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(27)
    int height();
    
    /**
     * <p>
     * The height of the item in number of cells.
     * </p>
     * <p>
     * Setter method for the COM property "Height"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    void height(
            int pVal);
    
    /**
     * <p>
     * The width of the item in number of cells.
     * </p>
     * <p>
     * Getter method for the COM property "Width"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(29)
    int width();
    
    /**
     * <p>
     * The width of the item in number of cells.
     * </p>
     * <p>
     * Setter method for the COM property "Width"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    void width(
            int pVal);
    
    // Properties:
}
