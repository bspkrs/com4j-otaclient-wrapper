package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Items to include in mail.
 * </p>
 */
public enum TDMAIL_FLAGS implements ComEnum
{
    /**
     * <p>
     * Send the entity's attachments.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDMAIL_ATTACHMENT(1),
    /**
     * <p>
     * Include the entity's history.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDMAIL_HISTORY(2),
    /**
     * <p>
     * Send mail as plain test.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDMAIL_TEXT(4),
    /**
     * <p>
     * Include design steps.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    TDMAIL_DES_STEP(8),
    /**
     * <p>
     * Include test coverage. Applies only to requirements.
     * </p>
     * <p>
     * The value of this constant is 16
     * </p>
     */
    TDMAIL_COVER_TEST(16),
    /**
     * <p>
     * Single Mail.(Obsolete. Retained for backward compatibility).
     * </p>
     * <p>
     * The value of this constant is 32
     * </p>
     */
    TDMAIL_SINGLEMAIL(32),
    /**
     * <p>
     * Use the Comment argument of the Mail method as the message body. Used by UI when sending custom e-mail.
     * </p>
     * <p>
     * The value of this constant is 64
     * </p>
     */
    TDMAIL_COMMENT_AS_BODY(64),
    /**
     * <p>
     * Include traced requirements.
     * </p>
     * <p>
     * The value of this constant is 128
     * </p>
     */
    TDMAIL_TRACE_REQ(128),
    /**
     * <p>
     * Include snapshot for component.
     * </p>
     * <p>
     * The value of this constant is 256
     * </p>
     */
    TDMAIL_SNAPSHOT(256),
    /**
     * <p>
     * Include activities of Model.
     * </p>
     * <p>
     * The value of this constant is 512
     * </p>
     */
    TDMAIL_ACTIVITIES(512),
    /**
     * <p>
     * Include paths of Model.
     * </p>
     * <p>
     * The value of this constant is 1024
     * </p>
     */
    TDMAIL_PATHS(1024),
    /**
     * <p>
     * Include linkgae of Model.
     * </p>
     * <p>
     * The value of this constant is 2048
     * </p>
     */
    TDMAIL_LINKAGE(2048),
    /**
     * <p>
     * Include run steps.
     * </p>
     * <p>
     * The value of this constant is 4096
     * </p>
     */
    TDMAIL_RUN_STEP(4096),
    /**
     * <p>
     * Include runs.
     * </p>
     * <p>
     * The value of this constant is 8192
     * </p>
     */
    TDMAIL_RUNS(8192), ;
    
    private final int value;
    
    TDMAIL_FLAGS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
