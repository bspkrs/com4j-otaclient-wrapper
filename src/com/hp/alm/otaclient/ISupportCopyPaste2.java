package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for supporting copy and paste.
 */
@IID("{057DAE0E-5171-4D8F-99B0-2BFC9F660443}")
public interface ISupportCopyPaste2 extends com.hp.alm.otaclient.ISupportCopyPaste
{
    // Methods:
    /**
     * <p>
     * Obsolete. Checks if the paste target is in the same project from which the material was copied.
     * </p>
     * <p>
     * Getter method for the COM property "PasteToCurrentProject"
     * </p>
     * 
     * @param clipboardData Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @VTID(5)
    boolean pasteToCurrentProject(
            java.lang.String clipboardData);
    
    // Properties:
}
