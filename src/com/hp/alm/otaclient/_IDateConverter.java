package com.hp.alm.otaclient;

import com4j.*;

/**
 * TDFilter Internal functionality
 */
@IID("{9FABF206-BEAE-43DF-99D6-15C89564F8EA}")
public interface _IDateConverter extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Converts date format from visual to logical.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param visualDate Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(3)
    java.lang.String convertVisualToLogicalDate(
            java.lang.String fieldName,
            java.lang.String visualDate);
    
    /**
     * <p>
     * Converts date format from logical to visual.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @param logicalDate Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(4)
    java.lang.String convertLogicalToVisualDate(
            java.lang.String fieldName,
            java.lang.String logicalDate);
    
    // Properties:
}
