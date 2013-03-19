package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Storage locations.
 * </p>
 */
public enum TDAPI_DIRECTORY implements ComEnum
{
    /**
     * <p>
     * The main project directory.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_PROGECT_DIRECTORY(0),
    /**
     * <p>
     * The main project directory.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_PROJECT_DIRECTORY(0),
    /**
     * <p>
     * The General Bin directory.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_BIN_DIRECTORY(1),
    /**
     * <p>
     * The test repository directory.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_TEST_DIRECTORY(2),
    /**
     * <p>
     * The Attachment Repository.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDOLE_ATTACH_DIRECTORY(3),
    /**
     * <p>
     * The User Directories List.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDOLE_USER_DIRECTORIES(4),
    /**
     * <p>
     * The shared path of the directories.
     * </p>
     * <p>
     * The value of this constant is 128
     * </p>
     */
    TDOLE_SHARED_DIRECTORY(128),
    /**
     * <p>
     * The checkout repository directory.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    TDOLE_CHECKOUT_DIRECTORY(8),
    /**
     * <p>
     * The checkout repository directory.
     * </p>
     * <p>
     * The value of this constant is 16
     * </p>
     */
    TDOLE_VIEW_DIRECTORY(16),
    /**
     * <p>
     * The vcsDb repository directory.
     * </p>
     * <p>
     * The value of this constant is 32
     * </p>
     */
    TDOLE_VCSDB_DIRECTORY(32),
    /**
     * <p>
     * The TD root repository directory.
     * </p>
     * <p>
     * The value of this constant is 64
     * </p>
     */
    TDOLE_SITE_REPOS_DIRECTORY(64),
    /**
     * <p>
     * The resource repository directory.
     * </p>
     * <p>
     * The value of this constant is 256
     * </p>
     */
    TDOLE_RESOURCE_DIRECTORY(256), ;
    
    private final int value;
    
    TDAPI_DIRECTORY(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
