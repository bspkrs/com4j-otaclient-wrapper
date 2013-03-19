package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Location of files to delete.
 * </p>
 */
public enum EXTENDED_STORAGE_DELETE
{
    /**
     * <p>
     * Do not delete files.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    NO_DELETE, // 0
    /**
     * <p>
     * Delete files from client file system, but not from the server repository.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    DELETE_CLIENT, // 1
    /**
     * <p>
     * Delete files from the server repository, but not from the local client.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    DELETE_SERVER, // 2
    /**
     * <p>
     * Delete files from the server repository and the local client.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    DELETE_BOTH, // 3
}
