package com.hp.alm.otaclient;

import com4j.*;

/**
 * Manages the user-defined follow-ups.
 */
@IID("{6EE10992-2569-4838-86DA-DAE1E1240E79}")
public interface IFollowUpManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Sets an alert for follow-up for the current object.
     * </p>
     * 
     * @param followUpDate Mandatory java.util.Date parameter.
     * @param description Mandatory java.lang.String parameter.
     */
    
    @VTID(4)
    void setFollowUp(
            java.util.Date followUpDate,
            java.lang.String description);
    
    /**
     * <p>
     * Removes the current entity's follow-up.
     * </p>
     */
    
    @VTID(5)
    void cancelFollowUp();
    
    /**
     * <p>
     * Checks if the object has at least one follow-up associated with it.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(6)
    boolean hasFollowUp();
    
    /**
     * <p>
     * Checks if the date of the unsent follow-up is earlier than the current database server date.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(7)
    boolean isFollowUpOverdue();
    
    // Properties:
}
