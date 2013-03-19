package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * General error codes.
 * </p>
 */
public enum TDAPI_ERRORCODES implements ComEnum
{
    /**
     * <p>
     * Quality Center server object not initialized.
     * </p>
     * <p>
     * The value of this constant is 1001
     * </p>
     */
    TDOLE_OBJNOTINITIALIZED(1001),
    /**
     * <p>
     * General error.
     * </p>
     * <p>
     * The value of this constant is 1002
     * </p>
     */
    TDOLE_GENERROR(1002),
    /**
     * <p>
     * The BDE configuration file not found.
     * </p>
     * <p>
     * The value of this constant is 1003
     * </p>
     */
    TDOLE_NOCONFIGFILE(1003),
    /**
     * <p>
     * Wrong user name or password.
     * </p>
     * <p>
     * The value of this constant is 1004
     * </p>
     */
    TDOLE_ILLEGALPASSWORD(1004),
    /**
     * <p>
     * Wrong Quality Center project name.
     * </p>
     * <p>
     * The value of this constant is 1005
     * </p>
     */
    TDOLE_ILLEGALDBNAME(1005),
    /**
     * <p>
     * The Quality Center project directory was not found.
     * </p>
     * <p>
     * The value of this constant is 1006
     * </p>
     */
    TDOLE_NODBDIR(1006),
    /**
     * <p>
     * The Test Repository was not found.
     * </p>
     * <p>
     * The value of this constant is 1007
     * </p>
     */
    TDOLE_NOTESTDIR(1007),
    /**
     * <p>
     * The maximum number of projects is open.
     * </p>
     * <p>
     * The value of this constant is 1008
     * </p>
     */
    TDOLE_DBLIMIT(1008),
    /**
     * <p>
     * Project version mismatch.
     * </p>
     * <p>
     * The value of this constant is 1009
     * </p>
     */
    TDOLE_DBVERMISMATCH(1009),
    /**
     * <p>
     * No BDE is installed.
     * </p>
     * <p>
     * The value of this constant is 1010
     * </p>
     */
    TDOLE_NO_IDAPI_DLL(1010),
    /**
     * <p>
     * No record matches the key value.
     * </p>
     * <p>
     * The value of this constant is 1011
     * </p>
     */
    TDOLE_RECNOTFOUND(1011),
    /**
     * <p>
     * The specified field does not exist.
     * </p>
     * <p>
     * The value of this constant is 1012
     * </p>
     */
    TDOLE_NOFIELD(1012),
    /**
     * <p>
     * The test is not an automated test.
     * </p>
     * <p>
     * The value of this constant is 1013
     * </p>
     */
    TDOLE_NOTAUTOTEST(1013),
    /**
     * <p>
     * The specified directory does not exist.
     * </p>
     * <p>
     * The value of this constant is 1014
     * </p>
     */
    TDOLE_NODIRECTORY(1014),
    /**
     * <p>
     * The end of the table has been reached.
     * </p>
     * <p>
     * The value of this constant is 1015
     * </p>
     */
    TDOLE_ATEOF(1015),
    /**
     * <p>
     * The beginning of the table has been reached.
     * </p>
     * <p>
     * The value of this constant is 1016
     * </p>
     */
    TDOLE_ATBOF(1016),
    /**
     * <p>
     * The specified attribute does not exist.
     * </p>
     * <p>
     * The value of this constant is 1017
     * </p>
     */
    TDOLE_INVALIDATTRNAME(1017),
    /**
     * <p>
     * The specified subject path does not exist.
     * </p>
     * <p>
     * The value of this constant is 1018
     * </p>
     */
    TDOLE_ILLEGALSUBJECTPATH(1018),
    /**
     * <p>
     * The specified test type is not an automatic test.
     * </p>
     * <p>
     * The value of this constant is 1019
     * </p>
     */
    TDOLE_MANUALTEST(1019),
    /**
     * <p>
     * The API has changed.
     * </p>
     * <p>
     * The value of this constant is 1020
     * </p>
     */
    TDOLE_CHANGED(1020),
    /**
     * <p>
     * The API is not connected to a project.
     * </p>
     * <p>
     * The value of this constant is 1021
     * </p>
     */
    TDOLE_DBNOTCONNECTED(1021),
    /**
     * <p>
     * The specified node ID is invalid.
     * </p>
     * <p>
     * The value of this constant is 1022
     * </p>
     */
    TDOLE_INVALIDNODEID(1022),
    /**
     * <p>
     * The specified node does not exist.
     * </p>
     * <p>
     * The value of this constant is 1023
     * </p>
     */
    TDOLE_NONODE(1023),
    /**
     * <p>
     * Cannot open Test table.
     * </p>
     * <p>
     * The value of this constant is 1024
     * </p>
     */
    TDOLE_CANNTOPENTESTTB(1024),
    /**
     * <p>
     * Cannot open Step table.
     * </p>
     * <p>
     * The value of this constant is 1025
     * </p>
     */
    TDOLE_CANNTOPENSTEPTB(1025),
    /**
     * <p>
     * Cannot open Run table.
     * </p>
     * <p>
     * The value of this constant is 1026
     * </p>
     */
    TDOLE_CANNTOPENRUNTB(1026),
    /**
     * <p>
     * Cannot open Testcycle table.
     * </p>
     * <p>
     * The value of this constant is 1027
     * </p>
     */
    TDOLE_CANNTOPENTESTCYCLTB(1027),
    /**
     * <p>
     * Cannot open Cycle table.
     * </p>
     * <p>
     * The value of this constant is 1028
     * </p>
     */
    TDOLE_CANNTOPENCYCLETB(1028),
    /**
     * <p>
     * Cannot open Dessteps table.
     * </p>
     * <p>
     * The value of this constant is 1029
     * </p>
     */
    TDOLE_CANNTOPENDESSTEPTB(1029),
    /**
     * <p>
     * Cannot open History table.
     * </p>
     * <p>
     * The value of this constant is 1030
     * </p>
     */
    TDOLE_CANNTOPENHISTTB(1030),
    /**
     * <p>
     * Cannot build the test plan tree.
     * </p>
     * <p>
     * The value of this constant is 1031
     * </p>
     */
    TDOLE_CANNTBUILDTREE(1031),
    /**
     * <p>
     * No associated tree root.
     * </p>
     * <p>
     * The value of this constant is 1032
     * </p>
     */
    TDOLE_NOASSOCIATEDROOT(1032),
    /**
     * <p>
     * VCS support is not installed on the Quality Center server side.
     * </p>
     * <p>
     * The value of this constant is 1033
     * </p>
     */
    TDOLE_VCS_NOVCS(1033),
    /**
     * <p>
     * The Quality Center project is not connected to the VCS database.
     * </p>
     * <p>
     * The value of this constant is 1034
     * </p>
     */
    TDOLE_VCS_NOTVCSDB(1034),
    /**
     * <p>
     * Cannot log into the VCS database.
     * </p>
     * <p>
     * The value of this constant is 1035
     * </p>
     */
    TDOLE_VCS_CANNOTLOGIN(1035),
    /**
     * <p>
     * The test is not in the VCS database.
     * </p>
     * <p>
     * The value of this constant is 1036
     * </p>
     */
    TDOLE_VCS_NOTINVCSDB(1036),
    /**
     * <p>
     * The test is locked by the current user.
     * </p>
     * <p>
     * The value of this constant is 1037
     * </p>
     */
    TDOLE_VCS_LOCKEDMETEST(1037),
    /**
     * <p>
     * The test is locked by another user.
     * </p>
     * <p>
     * The value of this constant is 1038
     * </p>
     */
    TDOLE_VCS_LOCKEDTEST(1038),
    /**
     * <p>
     * Not connected to the VCS database.
     * </p>
     * <p>
     * The value of this constant is 1039
     * </p>
     */
    TDOLE_VCS_NOTCONNECTED(1039),
    /**
     * <p>
     * The test is not checked out.
     * </p>
     * <p>
     * The value of this constant is 1040
     * </p>
     */
    TDOLE_VCS_NOTCHECKEDOUT(1040),
    /**
     * <p>
     * The test is not locked.
     * </p>
     * <p>
     * The value of this constant is 1041
     * </p>
     */
    TDOLE_VCS_NOTLOCKED(1041),
    /**
     * <p>
     * There is no version file defined for the test type.
     * </p>
     * <p>
     * The value of this constant is 1042
     * </p>
     */
    TDOLE_VCS_NOTDEFVERFILE(1042),
    /**
     * <p>
     * Failed to set the working version of the test.
     * </p>
     * <p>
     * The value of this constant is 1043
     * </p>
     */
    TDOLE_FAILED_TO_SET_CUR_VER(1043),
    /**
     * <p>
     * Failed to get the working version of the test.
     * </p>
     * <p>
     * The value of this constant is 1044
     * </p>
     */
    TDOLE_FAILED_TO_GET_CUR_VER(1044),
    /**
     * <p>
     * Check-in failure.
     * </p>
     * <p>
     * The value of this constant is 22222
     * </p>
     */
    FAILED_CHECKIN(22222),
    /**
     * <p>
     * Check-out failure.
     * </p>
     * <p>
     * The value of this constant is 22223
     * </p>
     */
    FAILED_CHECKOUT(22223),
    /**
     * <p>
     * User is not authorized to force undo.
     * </p>
     * <p>
     * The value of this constant is 22224
     * </p>
     */
    TDAPI_VC_NOT_AUTHORIZED_TO_UNDO(22224),
    /**
     * <p>
     * Cannot check in. Version number already exists.
     * </p>
     * <p>
     * The value of this constant is 11114
     * </p>
     */
    TDAPI_VCS_VERSION_ALREADY_EXIST_IN_HIST(11114),
    /**
     * <p>
     * Could not find domain from which library was created.
     * </p>
     * <p>
     * The value of this constant is 11115
     * </p>
     */
    TDAPI_SHARING_ILLEGAL_DOMAIN(11115),
    /**
     * <p>
     * Could not find project from which library was created.
     * </p>
     * <p>
     * The value of this constant is 11116
     * </p>
     */
    TDAPI_SHARING_ILLEGAL_PROJECT(11116),
    /**
     * <p>
     * Maximum path limit exceeded. Cannot add children to entity.
     * </p>
     * <p>
     * The value of this constant is 11117
     * </p>
     */
    TDAPI_MAXIMUM_PATH_LIMIT_EXCEEDED(11117),
    /**
     * <p>
     * Cannot modify read-only field.
     * </p>
     * <p>
     * The value of this constant is 11112
     * </p>
     */
    TDOLE_READ_ONLY_FIELD(11112),
    /**
     * <p>
     * No error encountered.
     * </p>
     * <p>
     * The value of this constant is 1045
     * </p>
     */
    TDOLE_MAIL_NO_ERROR(1045),
    /**
     * <p>
     * The mail DLL was not found.
     * </p>
     * <p>
     * The value of this constant is 1046
     * </p>
     */
    TDOLE_NO_MAIL_DLL(1046),
    /**
     * <p>
     * The wrong 'To:' address.
     * </p>
     * <p>
     * The value of this constant is 1047
     * </p>
     */
    TDOLE_MAIL_NO_TO_FIELD(1047),
    /**
     * <p>
     * The mail format is incorrect.
     * </p>
     * <p>
     * The value of this constant is 1048
     * </p>
     */
    TDOLE_MAIL_ERR_PARSING_PARAMS(1048),
    /**
     * <p>
     * General mail error.
     * </p>
     * <p>
     * The value of this constant is 1049
     * </p>
     */
    TDOLE_MAIL_GENERROR(1049),
    /**
     * <p>
     * The mailbox login is incorrect.
     * </p>
     * <p>
     * The value of this constant is 1050
     * </p>
     */
    TDOLE_MAIL_LOGIN_FAILURE(1050),
    /**
     * <p>
     * Failure sending mail.
     * </p>
     * <p>
     * The value of this constant is 1051
     * </p>
     */
    TDOLE_MAIL_ERR_SENDING(1051),
    /**
     * <p>
     * The 'From' parameter is invalid.
     * </p>
     * <p>
     * The value of this constant is 1052
     * </p>
     */
    TDOLE_MAIL_BAD_FROM_FIELD(1052),
    /**
     * <p>
     * The 'From' parameter is missing.
     * </p>
     * <p>
     * The value of this constant is 1053
     * </p>
     */
    TDOLE_WARNING_FROM_NOT_FOUND(1053),
    /**
     * <p>
     * One or more e-mail addresses are invalid.
     * </p>
     * <p>
     * The value of this constant is 1410
     * </p>
     */
    TDOLE_MAIL_WARNING_BAD_OR_EMPTY_USER_OR_USERGROUP(1410),
    /**
     * <p>
     * No absolute path.
     * </p>
     * <p>
     * The value of this constant is 1054
     * </p>
     */
    TDOLE_NOABSOLUTEPATH(1054),
    /**
     * <p>
     * The test exists.
     * </p>
     * <p>
     * The value of this constant is 1055
     * </p>
     */
    TDOLE_TEST_EXISTS(1055),
    /**
     * <p>
     * No license to access this module.
     * </p>
     * <p>
     * The value of this constant is 1056
     * </p>
     */
    TDOLE_LICENSE_DENIED(1056),
    /**
     * <p>
     * No license to access this module.
     * </p>
     * <p>
     * The value of this constant is 1057
     * </p>
     */
    TDOLE_LICENSE_OVERFLOW_ALERT(1057),
    /**
     * <p>
     * No license to access this module.
     * </p>
     * <p>
     * The value of this constant is 1058
     * </p>
     */
    TDOLE_LICENSE_NOT_INITILIZED(1058),
    /**
     * <p>
     * Failed to extract license status.
     * </p>
     * <p>
     * The value of this constant is 1059
     * </p>
     */
    TDOLE_LICENSE_GENERROR(1059),
    /**
     * <p>
     * License expired.
     * </p>
     * <p>
     * The value of this constant is 1060
     * </p>
     */
    TDOLE_LICENSE_KEY_EXPIRED(1060),
    /**
     * <p>
     * Invalid license.
     * </p>
     * <p>
     * The value of this constant is 1061
     * </p>
     */
    TDOLE_LICENSE_DOMAIN_NOT_FOUND(1061),
    /**
     * <p>
     * Invalid license.
     * </p>
     * <p>
     * The value of this constant is 1062
     * </p>
     */
    TDOLE_LICENSE_MUID_NOT_FOUND(1062),
    /**
     * <p>
     * The version already exists.
     * </p>
     * <p>
     * The value of this constant is 1063
     * </p>
     */
    TDOLE_VCS_VERSIONEXISTS(1063),
    /**
     * <p>
     * Required version does not exist in the version control.
     * </p>
     * <p>
     * The value of this constant is 1064
     * </p>
     */
    TDOLE_VCS_VERSIONNOTEXISTS(1064),
    /**
     * <p>
     * Invalid request format.
     * </p>
     * <p>
     * The value of this constant is 1065
     * </p>
     */
    TDOLE_BAD_REQUEST(1065),
    /**
     * <p>
     * Attachment stream is invalid.
     * </p>
     * <p>
     * The value of this constant is 1066
     * </p>
     */
    TDOLE_BAD_ATT_STREAM(1066),
    /**
     * <p>
     * Duplicate requirement coverage.
     * </p>
     * <p>
     * The value of this constant is 1068
     * </p>
     */
    TDOLE_RECCOVER_EXISTS(1068),
    /**
     * <p>
     * File system error.
     * </p>
     * <p>
     * The value of this constant is 1069
     * </p>
     */
    TDOLE_ERROR_FILESYSTEM(1069),
    /**
     * <p>
     * File system path is not valid.
     * </p>
     * <p>
     * The value of this constant is 1070
     * </p>
     */
    TDOLE_ERROR_PATH_NOT_FOUND(1070),
    /**
     * <p>
     * File system permission error.
     * </p>
     * <p>
     * The value of this constant is 1071
     * </p>
     */
    TDAPI_ERROR_PATH_PERMISSION(1071),
    /**
     * <p>
     * Entity subtype change error.
     * </p>
     * <p>
     * The value of this constant is 1072
     * </p>
     */
    TDOLE_ERROR_CANT_CHANGE_SUBTYPE(1072),
    /**
     * <p>
     * The project was disconnected by the administrator.
     * </p>
     * <p>
     * The value of this constant is 1077
     * </p>
     */
    TDAPI_DISCONNECTED_BY_ADMIN(1077),
    /**
     * <p>
     * Cannot connect to the project.
     * </p>
     * <p>
     * The value of this constant is 1078
     * </p>
     */
    TDAPI_FAILED_TO_RECONNECT(1078),
    /**
     * <p>
     * Duplicate SysTreeNode name.
     * </p>
     * <p>
     * The value of this constant is 1080
     * </p>
     */
    TDOLE_DUPLICATENODENAME(1080),
    /**
     * <p>
     * Cannot find entity by e-mail.
     * </p>
     * <p>
     * The value of this constant is 1081
     * </p>
     */
    TDOLE_MAIL_ERROR_BAD_ENTITY(1081),
    /**
     * <p>
     * Duplicate TestSet name.
     * </p>
     * <p>
     * The value of this constant is 1082
     * </p>
     */
    TDOLE_CYCLE_EXISTS(1082),
    /**
     * <p>
     * Duplicate entity.
     * </p>
     * <p>
     * The value of this constant is 1083
     * </p>
     */
    TDOLE_ENTITY_EXISTS(1083),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1100
     * </p>
     */
    TDOLE_BAD_FILTER_START(1100),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1101
     * </p>
     */
    TDOLE_BAD_FILTER_1(1101),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1102
     * </p>
     */
    TDOLE_BAD_FILTER_2(1102),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1103
     * </p>
     */
    TDOLE_BAD_FILTER_3(1103),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1104
     * </p>
     */
    TDOLE_BAD_FILTER_4(1104),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1105
     * </p>
     */
    TDOLE_BAD_FILTER_5(1105),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1106
     * </p>
     */
    TDOLE_BAD_FILTER_6(1106),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1107
     * </p>
     */
    TDOLE_BAD_FILTER_7(1107),
    /**
     * <p>
     * Invalid filter.
     * </p>
     * <p>
     * The value of this constant is 1110
     * </p>
     */
    TDOLE_BAD_FILTER_END(1110),
    /**
     * <p>
     * The test has been executed by another user.
     * </p>
     * <p>
     * The value of this constant is 1111
     * </p>
     */
    TDOLE_TESTS_ALREADY_RUN(1111),
    /**
     * <p>
     * Cannot create log file.
     * </p>
     * <p>
     * The value of this constant is 1112
     * </p>
     */
    TDOLE_E_CREATE_LOG_FILE(1112),
    /**
     * <p>
     * Cannot execute test.
     * </p>
     * <p>
     * The value of this constant is 1113
     * </p>
     */
    TDOLE_E_START_RUNS(1113),
    /**
     * <p>
     * Wrong user name.
     * </p>
     * <p>
     * The value of this constant is 1152
     * </p>
     */
    TDOLE_ILLEGALUSERNAME(1152),
    /**
     * <p>
     * Request has been cancelled.
     * </p>
     * <p>
     * The value of this constant is 1153
     * </p>
     */
    TDOLE_REQUEST_CANCELLED(1153),
    /**
     * <p>
     * Response has been tampered.
     * </p>
     * <p>
     * The value of this constant is 1154
     * </p>
     */
    TDOLE_RESPONSE_TAMPERED(1154),
    /**
     * <p>
     * Target or source entity does not exist.
     * </p>
     * <p>
     * The value of this constant is 1973
     * </p>
     */
    TDOLE_TARGET_OR_SOURCE_ENTITY_DOESNT_EXIST(1973),
    /**
     * <p>
     * Response has been tampered.
     * </p>
     * <p>
     * The value of this constant is 11113
     * </p>
     */
    TDOLE_ERR_SETTING_PARENT_ID_TO_DESCENDANT(11113),
    /**
     * <p>
     * No table exists by the specific name.
     * </p>
     * <p>
     * The value of this constant is 2000
     * </p>
     */
    TDOLE_DB_TABLE_NAME(2000),
    /**
     * <p>
     * Duplicate requirement name - requirement was created.
     * </p>
     * <p>
     * The value of this constant is 2055
     * </p>
     */
    TDOLE_REQ_EXISTS(2055),
    /**
     * <p>
     * Duplicate requirement name - requirement was not created.
     * </p>
     * <p>
     * The value of this constant is 2056
     * </p>
     */
    TDAPI_REQ_EXISTS_ABORT(2056),
    /**
     * <p>
     * Violation of requirements-tree hierarchy rules.
     * </p>
     * <p>
     * The value of this constant is 2060
     * </p>
     */
    TDAPI_REQ_VIOLATION_OF_TYPE_HIER_RULES(2060),
    /**
     * <p>
     * Number of core requirements in traceability matrix exceeds fuse.
     * </p>
     * <p>
     * The value of this constant is 2062
     * </p>
     */
    TDAPI_REQ_TRACEABILITY_MATRIX_FUSE_ERROR(2062),
    /**
     * <p>
     * Columns marked as searchable are not indexed in database.
     * </p>
     * <p>
     * The value of this constant is 2205
     * </p>
     */
    TDAPI_TEXT_SEARCH_INDEX_MISSING(2205),
    /**
     * <p>
     * Too many SQL statements.
     * </p>
     * <p>
     * The value of this constant is 2210
     * </p>
     */
    TDAPI_QUERY_VALIDATION_FAILED_TOO_MANY_STATEMENTS(2210),
    /**
     * <p>
     * Word from black list appears in SQL.
     * </p>
     * <p>
     * The value of this constant is 2211
     * </p>
     */
    TDAPI_QUERY_VALIDATION_FAILED_BLACK_LIST_EXISTS(2211),
    /**
     * <p>
     * Not a SELECT statement.
     * </p>
     * <p>
     * The value of this constant is 2212
     * </p>
     */
    TDAPI_QUERY_VALIDATION_FAILED_NOT_SELECT_STATEMENT(2212),
    /**
     * <p>
     * Duplicate TestSet folder name.
     * </p>
     * <p>
     * The value of this constant is 3055
     * </p>
     */
    TDOLE_TESTSET_FOLDER_EXISTS(3055),
    /**
     * <p>
     * Duplicate Test Configuration name.
     * </p>
     * <p>
     * The value of this constant is 8210
     * </p>
     */
    TDAPI_TEST_CONFIG_EXISTS(8210),
    /**
     * <p>
     * Component exists.
     * </p>
     * <p>
     * The value of this constant is 7001
     * </p>
     */
    TDOLE_COMPONENT_EXISTS(7001),
    /**
     * <p>
     * Component folder exists.
     * </p>
     * <p>
     * The value of this constant is 7002
     * </p>
     */
    TDOLE_COMPONENT_FOLDER_EXISTS(7002),
    /**
     * <p>
     * Component parameter exists.
     * </p>
     * <p>
     * The value of this constant is 7003
     * </p>
     */
    TDOLE_COMPONENT_PARAM_EXISTS(7003),
    /**
     * <p>
     * Error creating component.
     * </p>
     * <p>
     * The value of this constant is 7004
     * </p>
     */
    COMPONENT_E_CREATE(7004),
    /**
     * <p>
     * Error creating component folder.
     * </p>
     * <p>
     * The value of this constant is 7005
     * </p>
     */
    COMPONENTFOLDER_E_CREATE(7005),
    /**
     * <p>
     * Error creating component parameter.
     * </p>
     * <p>
     * The value of this constant is 7006
     * </p>
     */
    COMPONENTPARAM_E_CREATE(7006),
    /**
     * <p>
     * Non-project-specific business process test.
     * </p>
     * <p>
     * The value of this constant is 7007
     * </p>
     */
    TDOLE_E_NON_PROJECT_SPECIFIC_BPT(7007),
    /**
     * <p>
     * Error creating component.
     * </p>
     * <p>
     * The value of this constant is 7008
     * </p>
     */
    COMPONENTSTEP_E_CREATE(7008),
    /**
     * <p>
     * Business process test iterations mismatch.
     * </p>
     * <p>
     * The value of this constant is 7009
     * </p>
     */
    TDOLE_E_BPT_ITERATIONS_MISMATCH(7009),
    /**
     * <p>
     * Business process test component step validation failed.
     * </p>
     * <p>
     * The value of this constant is 7010
     * </p>
     */
    TDOLE_E_BPT_COMPONENT_STEP_VALIDATION_FAILED(7010),
    /**
     * <p>
     * Flow output parameter is not valid.
     * </p>
     * <p>
     * The value of this constant is 7011
     * </p>
     */
    TDOLE_E_FLOW_OUTPUT_PARAM_NOT_VALID(7011),
    /**
     * <p>
     * Import/Export resource does not exist.
     * </p>
     * <p>
     * The value of this constant is 7100
     * </p>
     */
    IMPEXP_RESOURCE_DOESNT_EXIST(7100),
    /**
     * <p>
     * Cannot remove type.
     * </p>
     * <p>
     * The value of this constant is 7200
     * </p>
     */
    TDOLE_E_REMOVE_TYPE_VALIDATION_FAILED(7200),
    /**
     * <p>
     * Failed to remove coverage from requirement type.
     * </p>
     * <p>
     * The value of this constant is 7201
     * </p>
     */
    TDOLE_FAIL_TO_REMOVE_TYPE_COVERAGE(7201),
    /**
     * <p>
     * Email change is not allowed.
     * </p>
     * <p>
     * The value of this constant is 7202
     * </p>
     */
    TDOLE_FAIL_TO_CHANGE_EMAIL(7202),
    /**
     * <p>
     * This user cannot be added to any project in this domain.
     * </p>
     * <p>
     * The value of this constant is 7203
     * </p>
     */
    TDAPI_CANNOT_ADD_USER_BY_DOMAIN(7203),
    /**
     * <p>
     * Failed to commit customization.
     * </p>
     * <p>
     * The value of this constant is 7204
     * </p>
     */
    TDOLE_FAIL_TO_COMMIT_CUSTOMIZATION(7204),
    /**
     * <p>
     * Release folder exists.
     * </p>
     * <p>
     * The value of this constant is 8004
     * </p>
     */
    TDOLE_RELEASE_FOLDER_EXISTS(8004),
    /**
     * <p>
     * Release exists.
     * </p>
     * <p>
     * The value of this constant is 8005
     * </p>
     */
    TDOLE_RELEASE_EXISTS(8005),
    /**
     * <p>
     * ReleaseCycle exists.
     * </p>
     * <p>
     * The value of this constant is 8006
     * </p>
     */
    TDOLE_RELEASECYCLE_EXISTS(8006),
    /**
     * <p>
     * Library folder exists.
     * </p>
     * <p>
     * The value of this constant is 8007
     * </p>
     */
    TDOLE_LIBRARY_FOLDER_EXISTS(8007),
    /**
     * <p>
     * Library exists.
     * </p>
     * <p>
     * The value of this constant is 8008
     * </p>
     */
    TDOLE_LIBRARY_EXISTS(8008),
    /**
     * <p>
     * Baseline exists.
     * </p>
     * <p>
     * The value of this constant is 8010
     * </p>
     */
    TDOLE_BASELINE_EXISTS(8010),
    /**
     * <p>
     * No permission to import library.
     * </p>
     * <p>
     * The value of this constant is 8009
     * </p>
     */
    TDOLE_LIBRARY_IMPORT_NO_PERMISSION(8009),
    /**
     * <p>
     * No permission to sync libraries.
     * </p>
     * <p>
     * The value of this constant is 8011
     * </p>
     */
    TDOLE_LIBRARY_SYNC_NO_PERMISSION(8011),
    /**
     * <p>
     * No permission to capture baseline.
     * </p>
     * <p>
     * The value of this constant is 8012
     * </p>
     */
    TDOLE_BASELINE_CAPTURE_NO_PERMISSION(8012),
    /**
     * <p>
     * ComparisonNode exists.
     * </p>
     * <p>
     * The value of this constant is 8013
     * </p>
     */
    TDAPI_COMPARISON_NODE_EXISTS(8013),
    /**
     * <p>
     * No permission to perform Compare.
     * </p>
     * <p>
     * The value of this constant is 8014
     * </p>
     */
    TDOLE_COMPARE_NO_PERMISSION(8014),
    /**
     * <p>
     * Favorite folder exists.
     * </p>
     * <p>
     * The value of this constant is 8101
     * </p>
     */
    TDOLE_FAVORITE_FOLDER_EXISTS(8101),
    /**
     * <p>
     * Favorite exists.
     * </p>
     * <p>
     * The value of this constant is 8102
     * </p>
     */
    TDOLE_FAVORITE_EXISTS(8102),
    /**
     * <p>
     * Favorite folder properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8103
     * </p>
     */
    TDOLE_PARENT_FAVORITE_FOLDER_PROPERTY_MISMATCH(8103),
    /**
     * <p>
     * BPM folder exists.
     * </p>
     * <p>
     * The value of this constant is 8209
     * </p>
     */
    TDOLE_BPM_FOLDER_EXISTS(8209),
    /**
     * <p>
     * Dashboard folder exists.
     * </p>
     * <p>
     * The value of this constant is 8301
     * </p>
     */
    TDOLE_DASHBOARD_FOLDER_EXISTS(8301),
    /**
     * <p>
     * Dashboard exists.
     * </p>
     * <p>
     * The value of this constant is 8302
     * </p>
     */
    TDOLE_DASHBOARD_PAGE_EXISTS(8302),
    /**
     * <p>
     * Dashboard folder properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8303
     * </p>
     */
    TDOLE_PARENT_DASHBOARD_FOLDER_PROPERTY_MISMATCH(8303),
    /**
     * <p>
     * Dashboard item in page exists.
     * </p>
     * <p>
     * The value of this constant is 8304
     * </p>
     */
    TDOLE_DASHBOARD_ITEM_IN_PAGE_EXISTS(8304),
    /**
     * <p>
     * Dashboard folder public status cannot be set.
     * </p>
     * <p>
     * The value of this constant is 8305
     * </p>
     */
    TDOLE_DASHBOARD_FOLDER_PUBLIC_STATE_MISMATCH(8305),
    /**
     * <p>
     * Dashboard page public status cannot be set.
     * </p>
     * <p>
     * The value of this constant is 8306
     * </p>
     */
    TDOLE_DASHBOARD_PAGE_PUBLIC_STATE_MISMATCH(8306),
    /**
     * <p>
     * Dashboard page properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8307
     * </p>
     */
    TDOLE_PARENT_DASHBOARD_PAGE_PROPERTY_MISMATCH(8307),
    /**
     * <p>
     * Parent property mismatch.
     * </p>
     * <p>
     * The value of this constant is 8308
     * </p>
     */
    TDOLE_PARENT_PROPERTY_MISMATCH(8308),
    /**
     * <p>
     * Duplicates created during Dashboard Copy Paste.
     * </p>
     * <p>
     * The value of this constant is 8309
     * </p>
     */
    TDOLE_COPY_PASTE_DASHBOARD_ELEMENT_EXISTS(8309),
    /**
     * <p>
     * Copied Dashboard Element does not exist.
     * </p>
     * <p>
     * The value of this constant is 8310
     * </p>
     */
    TDOLE_COPY_PASTE_SOURCE_DASHBOARD_ELEMENT_DOESNT_EXIST(8310),
    /**
     * <p>
     * Target Dashboard Element does not exist.
     * </p>
     * <p>
     * The value of this constant is 8311
     * </p>
     */
    TDOLE_COPY_PASTE_TARGET_DASHBOARD_ELEMENT_DOESNT_EXIST(8311),
    /**
     * <p>
     * Resource folder exists.
     * </p>
     * <p>
     * The value of this constant is 8201
     * </p>
     */
    TDOLE_RESOURCE_FOLDER_EXISTS(8201),
    /**
     * <p>
     * Resource exists.
     * </p>
     * <p>
     * The value of this constant is 8202
     * </p>
     */
    TDOLE_RESOURCE_EXISTS(8202),
    /**
     * <p>
     * Resource file exists.
     * </p>
     * <p>
     * The value of this constant is 8205
     * </p>
     */
    TDAPI_RESOURCE_FILE_EXISTS(8205),
    /**
     * <p>
     * Cannot upload file that does not exist on the file system.
     * </p>
     * <p>
     * The value of this constant is 8206
     * </p>
     */
    TDAPI_RESOURCE_FILE_DOES_NOT_EXIST(8206),
    /**
     * <p>
     * The owner entity does not exist.
     * </p>
     * <p>
     * The value of this constant is 8401
     * </p>
     */
    TDOLE_OWNER_INVALID(8401),
    /**
     * <p>
     * The owned by entity does not exist.
     * </p>
     * <p>
     * The value of this constant is 8402
     * </p>
     */
    TDOLE_OWNED_BY_INVALID(8402),
    /**
     * <p>
     * Analysis item folder exists.
     * </p>
     * <p>
     * The value of this constant is 8111
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_FOLDER_EXISTS(8111),
    /**
     * <p>
     * Analysis item exists.
     * </p>
     * <p>
     * The value of this constant is 8112
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_EXISTS(8112),
    /**
     * <p>
     * Analysis item folder properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8113
     * </p>
     */
    TDOLE_PARENT_ANALYSIS_ITEM_FOLDER_PROPERTY_MISMATCH(8113),
    /**
     * <p>
     * Analysis item type missing or invalid.
     * </p>
     * <p>
     * The value of this constant is 8114
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_TYPE(8114),
    /**
     * <p>
     * Analysis item folder public status cannot be set.
     * </p>
     * <p>
     * The value of this constant is 8115
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_FOLDER_PUBLIC_STATE_MISMATCH(8115),
    /**
     * <p>
     * Analysis item public status cannot be set.
     * </p>
     * <p>
     * The value of this constant is 8116
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_PUBLIC_STATE_MISMATCH(8116),
    /**
     * <p>
     * Analysis item properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8117
     * </p>
     */
    TDOLE_PARENT_ANALYSIS_ITEM_PROPERTY_MISMATCH(8117),
    /**
     * <p>
     * Owner properties mismatch.
     * </p>
     * <p>
     * The value of this constant is 8118
     * </p>
     */
    TDOLE_ANALYSIS_ITEM_INVALID_OWNER(8118),
    /**
     * <p>
     * Duplicate item is created during Copy/Paste operation.
     * </p>
     * <p>
     * The value of this constant is 8119
     * </p>
     */
    TDOLE_COPY_PASTE_ANALYSIS_ELEMENT_EXISTS(8119),
    /**
     * <p>
     * Copied Analysis Element either does not exist or is located in a private sub tree to which the logged in user has no access.
     * </p>
     * <p>
     * The value of this constant is 8120
     * </p>
     */
    TDOLE_COPY_PASTE_SOURCE_ANALYSIS_ELEMENT_DOESNT_EXIST(8120),
    /**
     * <p>
     * Target folder either does not exist or is located in a private sub tree to which the logged in user has not access.
     * </p>
     * <p>
     * The value of this constant is 8121
     * </p>
     */
    TDOLE_COPY_PASTE_TARGET_ANALYSIS_ELEMENT_DOESNT_EXIST(8121),
    /**
     * <p>
     * Result Frec is to big to be allocated on client machine.
     * </p>
     * <p>
     * The value of this constant is 8122
     * </p>
     */
    TDOLE_EXCEL_REPORT_RESULT_SET_TO_LARGE(8122),
    /**
     * <p>
     * Invalid threshold date.
     * </p>
     * <p>
     * The value of this constant is 8503
     * </p>
     */
    TDOLE_KPI_INCORRECT_THRESHOLD_VALUE_DATE(8503),
    /**
     * <p>
     * The Starting and Ending Threshold Values cannot be deleted.
     * </p>
     * <p>
     * The value of this constant is 8505
     * </p>
     */
    TDOLE_KPI_FAILED_TO_DELETE_THRESHOLD_VALUE(8505),
    /**
     * <p>
     * Deletion of KPIMilestoneScopeItem is not allowed.
     * </p>
     * <p>
     * The value of this constant is 8514
     * </p>
     */
    TDOLE_KPI_MILESTONE_SCOPEITEM_DELETE_NOT_ALLOWED(8514),
    /**
     * <p>
     * Creation of KPIMilestoneScopeItem is not allowed.
     * </p>
     * <p>
     * The value of this constant is 8515
     * </p>
     */
    TDOLE_KPI_MILESTONE_SCOPEITEM_CREATE_NOT_ALLOWED(8515),
    /**
     * <p>
     * Creation of Threshold Value with owner type KPIMilestoneScopeItem is not allowed. Call CopyThresholdValues first.
     * </p>
     * <p>
     * The value of this constant is 8517
     * </p>
     */
    TDOLE_THRESHOLD_VALUE_CREATE_FAIL(8517),
    /**
     * <p>
     * You cannot add more entities of this type to this parent.
     * </p>
     * <p>
     * The value of this constant is 9200
     * </p>
     */
    MAX_LIMIT_EXCEEDED(9200),
    /**
     * <p>
     * KPI Type not found.
     * </p>
     * <p>
     * The value of this constant is 9201
     * </p>
     */
    TDOLE_KPITYPE_E_NOT_FOUND(9201),
    /**
     * <p>
     * Duplicate KPI Type.
     * </p>
     * <p>
     * The value of this constant is 9202
     * </p>
     */
    TDOLE_KPITYPE_E_DUPLICATE(9202),
    /**
     * <p>
     * KPI Types Customization cannot be loaded.
     * </p>
     * <p>
     * The value of this constant is 9203
     * </p>
     */
    TDOLE_KPITYPE_E_CANNOT_LOAD(9203),
    /**
     * <p>
     * KPI Types Customization name cannot be empty.
     * </p>
     * <p>
     * The value of this constant is 9204
     * </p>
     */
    TDOLE_KPITYPE_EMPTY_NAME(9204),
    /**
     * <p>
     * KPI Types Customization tolerance cannot be negative.
     * </p>
     * <p>
     * The value of this constant is 9205
     * </p>
     */
    TDOLE_KPITYPE_NEGATIVE_DEFAULT_TOLERANCE(9205),
    /**
     * <p>
     * A KPI Type that is used by a KPI cannot be deleted.
     * </p>
     * <p>
     * The value of this constant is 9206
     * </p>
     */
    TDOLE_KPITYPE_E_IS_REFERENCED(9206),
    /**
     * <p>
     * A KPI Type that is linked to a template cannot be deleted or modified.
     * </p>
     * <p>
     * The value of this constant is 9207
     * </p>
     */
    TDOLE_KPITYPE_E_IS_TEMPLATE(9207),
    /**
     * <p>
     * Report Project Template not found.
     * </p>
     * <p>
     * The value of this constant is 12000
     * </p>
     */
    TDAPI_REPORT_PROJECT_TEMPLATE_NOT_FOUND(12000),
    /**
     * <p>
     * Report Project Template duplicate name.
     * </p>
     * <p>
     * The value of this constant is 12001
     * </p>
     */
    TDAPI_REPORT_PROJECT_TEMPLATE_DUPLICATE(12001),
    /**
     * <p>
     * Report Project Template illegal name.
     * </p>
     * <p>
     * The value of this constant is 12002
     * </p>
     */
    TDAPI_REPORT_PROJECT_TEMPLATE_ILLEGAL_NAME(12002),
    /**
     * <p>
     * Report Project Template load failure.
     * </p>
     * <p>
     * The value of this constant is 12003
     * </p>
     */
    TDAPI_REPORT_PROJECT_TEMPLATE_LOAD_FAILED(12003),
    /**
     * <p>
     * A Template that is linked to a template cannot be deleted or modified.
     * </p>
     * <p>
     * The value of this constant is 12004
     * </p>
     */
    TDAPI_REPORT_PROJECT_TEMPLATE_IS_TEMPLATE(12004),
    /**
     * <p>
     * The entity's start date cannot be earlier than today.
     * </p>
     * <p>
     * The value of this constant is 8507
     * </p>
     */
    ILLEGAL_DATE(8507),
    /**
     * <p>
     * Server locks removed.
     * </p>
     * <p>
     * The value of this constant is 10700
     * </p>
     */
    TDOLE_SERVER_LOCKS_REMOVED(10700),
    /**
     * <p>
     * Failed to unlock object.
     * </p>
     * <p>
     * The value of this constant is 10710
     * </p>
     */
    TDOLE_FAILED_LOCK_REMOVE(10710),
    /**
     * <p>
     * Object locked by another user.
     * </p>
     * <p>
     * The value of this constant is 10720
     * </p>
     */
    TDOLE_OBJECT_LOCKED(10720),
    /**
     * <p>
     * Wrong administrator password.
     * </p>
     * <p>
     * The value of this constant is 10730
     * </p>
     */
    TDOLE_WRONG_ADMIN_PWD(10730),
    /**
     * <p>
     * User is not connected as an administrator.
     * </p>
     * <p>
     * The value of this constant is 10740
     * </p>
     */
    TDOLE_ADMIN_NOT_CONNECTED(10740),
    /**
     * <p>
     * No object exists.
     * </p>
     * <p>
     * The value of this constant is 10750
     * </p>
     */
    TDAPI_OBJECT_NOT_EXISTS(10750),
    /**
     * <p>
     * You cannot delete all the test configurations. You must keep at least one configuration for the test.
     * </p>
     * <p>
     * The value of this constant is 9300
     * </p>
     */
    TEST_CONFIG_MIN_LIMIT_EXCEEDED(9300),
    /**
     * <p>
     * Failed to delete test set. Some of the instances are of configurations that do not exist. You may need to check in the tests before
     * you can delete the test set.
     * </p>
     * <p>
     * The value of this constant is 9301
     * </p>
     */
    TEST_CONFIG_DOES_NOT_EXISTS_CANNOT_DELETE_TEST_SET(9301),
    /**
     * <p>
     * Failed to delete instances. Some of the instances are of configurations that do not exist. You may need to check in the tests in
     * order to delete the instances.
     * </p>
     * <p>
     * The value of this constant is 9302
     * </p>
     */
    TEST_CONFIG_DOES_NOT_EXISTS_CANNOT_DELETE_INSTANCES(9302),
    /**
     * <p>
     * An unexpected error has occurred.
     * </p>
     * <p>
     * The value of this constant is 5000
     * </p>
     */
    TDOLE_UNEXPECTED(5000),
    /**
     * <p>
     * An Internal error has occurred.
     * </p>
     * <p>
     * The value of this constant is 5010
     * </p>
     */
    TDOLE_INTERNAL(5010),
    /**
     * <p>
     * Data is corrupted.
     * </p>
     * <p>
     * The value of this constant is 5020
     * </p>
     */
    TDOLE_DATA_CORRUPTION(5020),
    /**
     * <p>
     * Cannot update Step parameter value.
     * </p>
     * <p>
     * The value of this constant is 5021
     * </p>
     */
    TDOLE_CALL_ORDER(5021),
    /**
     * <p>
     * Invalid TD parameter.
     * </p>
     * <p>
     * The value of this constant is 5100
     * </p>
     */
    TDOLE_INVALID_PARAM(5100),
    /**
     * <p>
     * Invalid TD parameter type.
     * </p>
     * <p>
     * The value of this constant is 5101
     * </p>
     */
    TDOLE_INVALID_PARAM_TYPE(5101),
    /**
     * <p>
     * Invalid TD parameter range.
     * </p>
     * <p>
     * The value of this constant is 5102
     * </p>
     */
    TDOLE_INVALID_PARAM_RANGE(5102),
    /**
     * <p>
     * Invalid TD parameter number.
     * </p>
     * <p>
     * The value of this constant is 5103
     * </p>
     */
    TDOLE_INVALID_PARAM_NUM(5103),
    /**
     * <p>
     * Invalid TD parameter format.
     * </p>
     * <p>
     * The value of this constant is 5104
     * </p>
     */
    TDOLE_INVALID_PARAM_FORMAT(5104),
    /**
     * <p>
     * Invalid TD parameter list.
     * </p>
     * <p>
     * The value of this constant is 5105
     * </p>
     */
    TDOLE_INVALID_PARAM_ENUM(5105),
    /**
     * <p>
     * Customization objects not initialized.
     * </p>
     * <p>
     * The value of this constant is 5200
     * </p>
     */
    TDOLE_E_INITIALIZE(5200),
    /**
     * <p>
     * Invalid request.
     * </p>
     * <p>
     * The value of this constant is 5210
     * </p>
     */
    TDOLE_INVALID_REQUEST(5210),
    /**
     * <p>
     * Statistic object is not initialized.
     * </p>
     * <p>
     * The value of this constant is 5220
     * </p>
     */
    TDOLE_INVALID_INPROCESS(5220),
    /**
     * <p>
     * Invalid object has been passed.
     * </p>
     * <p>
     * The value of this constant is 6000
     * </p>
     */
    TDOLE_INVALID_OBJECT(6000),
    /**
     * <p>
     * No object exists.
     * </p>
     * <p>
     * The value of this constant is 6001
     * </p>
     */
    TDOLE_INVALID_OBJECT_KEY(6001),
    /**
     * <p>
     * Object was deleted by another user.
     * </p>
     * <p>
     * The value of this constant is 6002
     * </p>
     */
    TDOLE_OBJECT_DELETED(6002),
    /**
     * <p>
     * Object is not initialized.
     * </p>
     * <p>
     * The value of this constant is 6003
     * </p>
     */
    TDOLE_OBJECT_NOT_INITIALIZED(6003),
    /**
     * <p>
     * No post allowed for object that has a virtual parent.
     * </p>
     * <p>
     * The value of this constant is 6010
     * </p>
     */
    TDOLE_VIRTUAL_FATHER(6010),
    /**
     * <p>
     * Cannot get Run Factory for virtual TSTest.
     * </p>
     * <p>
     * The value of this constant is 6020
     * </p>
     */
    TDOLE_VIRTUAL(6020),
    /**
     * <p>
     * Object not virtual.
     * </p>
     * <p>
     * The value of this constant is 6030
     * </p>
     */
    TDOLE_NOT_VIRTUAL(6030),
    /**
     * <p>
     * Field exists in the virtual object only.
     * </p>
     * <p>
     * The value of this constant is 6032
     * </p>
     */
    TDOLE_FIELD_ONLY_FOR_VIRTUAL(6032),
    /**
     * <p>
     * The field is read-only.
     * </p>
     * <p>
     * The value of this constant is 6040
     * </p>
     */
    TDOLE_VIRTUAL_FIELD(6040),
    /**
     * <p>
     * There is no permission to proceed with this action.
     * </p>
     * <p>
     * The value of this constant is 6100
     * </p>
     */
    TDOLE_E_PERMISSION(6100),
    /**
     * <p>
     * Failed to cache object.
     * </p>
     * <p>
     * The value of this constant is 6700
     * </p>
     */
    TDOLE_E_CHACHE(6700),
    /**
     * <p>
     * The wrong number of parameters for the defined statement.
     * </p>
     * <p>
     * The value of this constant is 1200
     * </p>
     */
    PARAM_E_WRONG_NUM(1200),
    /**
     * <p>
     * The necessary parameter was not found.
     * </p>
     * <p>
     * The value of this constant is 1201
     * </p>
     */
    PARAM_E_NOT_FOUND(1201),
    /**
     * <p>
     * Invalid parameter value.
     * </p>
     * <p>
     * The value of this constant is 1202
     * </p>
     */
    PARAM_E_INVALID(1202),
    /**
     * <p>
     * The created list is empty.
     * </p>
     * <p>
     * The value of this constant is 1220
     * </p>
     */
    LIST_E_EMPTY(1220),
    /**
     * <p>
     * Bad list filter.
     * </p>
     * <p>
     * The value of this constant is 1221
     * </p>
     */
    LIST_E_FILTER(1221),
    /**
     * <p>
     * The specified column does not exist.
     * </p>
     * <p>
     * The value of this constant is 1240
     * </p>
     */
    COL_E_NOT_FOUND(1240),
    /**
     * <p>
     * The specified bug does not exist.
     * </p>
     * <p>
     * The value of this constant is 1260
     * </p>
     */
    BUG_E_NOT_FOUND(1260),
    /**
     * <p>
     * Failure to delete bug.
     * </p>
     * <p>
     * The value of this constant is 1261
     * </p>
     */
    BUG_E_DELETE(1261),
    /**
     * <p>
     * Failure to create log.
     * </p>
     * <p>
     * The value of this constant is 1262
     * </p>
     */
    BUG_E_CREATE(1262),
    /**
     * <p>
     * The specified test does not exist.
     * </p>
     * <p>
     * The value of this constant is 1280
     * </p>
     */
    TEST_E_NOT_FOUND(1280),
    /**
     * <p>
     * Failure to create a new test.
     * </p>
     * <p>
     * The value of this constant is 1281
     * </p>
     */
    TEST_E_CREATE(1281),
    /**
     * <p>
     * Failure to delete test.
     * </p>
     * <p>
     * The value of this constant is 1282
     * </p>
     */
    TEST_E_DELETE(1282),
    /**
     * <p>
     * Failed to delete requirement coverage by test.
     * </p>
     * <p>
     * The value of this constant is 1283
     * </p>
     */
    TEST_E_COV_DELETE(1283),
    /**
     * <p>
     * Invalid test path.
     * </p>
     * <p>
     * The value of this constant is 1284
     * </p>
     */
    TEST_E_REPOSITORY(1284),
    /**
     * <p>
     * Cannot change test type.
     * </p>
     * <p>
     * The value of this constant is 1285
     * </p>
     */
    TEST_E_TEMPLATE_TYPE(1285),
    /**
     * <p>
     * Cannot link to test because this would create a circular reference.
     * </p>
     * <p>
     * The value of this constant is 1287
     * </p>
     */
    TDAPI_E_LINK_TEST_CIRCLUATION(1287),
    /**
     * <p>
     * Cannot run pinned test. The test calls tests outside of the baseline.
     * </p>
     * <p>
     * The value of this constant is 1289
     * </p>
     */
    TDAPI_E_CANNOT_RUN_PINNED_TEST_SET(1289),
    /**
     * <p>
     * No permission to modify the field.
     * </p>
     * <p>
     * The value of this constant is 1300
     * </p>
     */
    FIELD_E_NO_PERMISSION(1300),
    /**
     * <p>
     * The field is a system field.
     * </p>
     * <p>
     * The value of this constant is 1301
     * </p>
     */
    FIELD_E_SYS_FIELD(1301),
    /**
     * <p>
     * The field is not an active field.
     * </p>
     * <p>
     * The value of this constant is 1302
     * </p>
     */
    FIELD_E_NOT_ACTIVE(1302),
    /**
     * <p>
     * The field is a database key field.
     * </p>
     * <p>
     * The value of this constant is 1303
     * </p>
     */
    FIELD_E_IS_KEY(1303),
    /**
     * <p>
     * The field is a read-only field.
     * </p>
     * <p>
     * The value of this constant is 1304
     * </p>
     */
    FIELD_E_NO_EDIT(1304),
    /**
     * <p>
     * Field verification failure.
     * </p>
     * <p>
     * The value of this constant is 1305
     * </p>
     */
    FIELD_E_VERIFIED(1305),
    /**
     * <p>
     * Error in field defined transition logic.
     * </p>
     * <p>
     * The value of this constant is 1306
     * </p>
     */
    FIELD_E_TRANSITION(1306),
    /**
     * <p>
     * The field is a required field.
     * </p>
     * <p>
     * The value of this constant is 1307
     * </p>
     */
    FIELD_E_REQUIRED(1307),
    /**
     * <p>
     * Invalid field value.
     * </p>
     * <p>
     * The value of this constant is 1308
     * </p>
     */
    FIELD_INVALID(1308),
    /**
     * <p>
     * Invalid field name.
     * </p>
     * <p>
     * The value of this constant is 1309
     * </p>
     */
    FIELD_NAME_INVALID(1309),
    /**
     * <p>
     * The specified user does not exist.
     * </p>
     * <p>
     * The value of this constant is 1320
     * </p>
     */
    USER_E_NOT_FOUND(1320),
    /**
     * <p>
     * Failure to create user.
     * </p>
     * <p>
     * The value of this constant is 1321
     * </p>
     */
    USER_E_CREATE(1321),
    /**
     * <p>
     * Failure to delete user.
     * </p>
     * <p>
     * The value of this constant is 1322
     * </p>
     */
    USER_E_DELETE(1322),
    /**
     * <p>
     * Failure to add user into group.
     * </p>
     * <p>
     * The value of this constant is 1323
     * </p>
     */
    USER_E_IN_GROUP(1323),
    /**
     * <p>
     * User does not exist in the group.
     * </p>
     * <p>
     * The value of this constant is 1324
     * </p>
     */
    USER_E_NOT_IN_GROUP(1324),
    /**
     * <p>
     * No filter value is defined.
     * </p>
     * <p>
     * The value of this constant is 1340
     * </p>
     */
    FILTER_E_NOVALUE(1340),
    /**
     * <p>
     * The defined filter value is invalid.
     * </p>
     * <p>
     * The value of this constant is 1341
     * </p>
     */
    FILTER_E_INVALIDVALUE(1341),
    /**
     * <p>
     * The filter condition name is invalid.
     * </p>
     * <p>
     * The value of this constant is 1342
     * </p>
     */
    FILTER_E_INVALIDNAME(1342),
    /**
     * <p>
     * Invalid date.
     * </p>
     * <p>
     * The value of this constant is 1343
     * </p>
     */
    FILTER_S_DATE_COMPLEX(1343),
    /**
     * <p>
     * Invalid code.
     * </p>
     * <p>
     * The value of this constant is 1344
     * </p>
     */
    FILTER_S_LIST_BY_CODE(1344),
    /**
     * <p>
     * Invalid system node path.
     * </p>
     * <p>
     * The value of this constant is 1345
     * </p>
     */
    FILTER_E_INVALIDPATH_ATTR(1345),
    /**
     * <p>
     * The specified requirement does not exist.
     * </p>
     * <p>
     * The value of this constant is 1360
     * </p>
     */
    REQ_E_NOT_FOUND(1360),
    /**
     * <p>
     * The requirement order is invalid.
     * </p>
     * <p>
     * The value of this constant is 1361
     * </p>
     */
    REQ_E_INVALIDORDER(1361),
    /**
     * <p>
     * The father ID is invalid.
     * </p>
     * <p>
     * The value of this constant is 1362
     * </p>
     */
    REQ_E_INVALIDFATHERID(1362),
    /**
     * <p>
     * The requirement type is invalid.
     * </p>
     * <p>
     * The value of this constant is 1363
     * </p>
     */
    REQ_E_INVALIDTYPE(1363),
    /**
     * <p>
     * Failed to create a new requirement.
     * </p>
     * <p>
     * The value of this constant is 1364
     * </p>
     */
    REQ_E_CREATE(1364),
    /**
     * <p>
     * The mode flag is invalid for the requirement options: copy, remove and find.
     * </p>
     * <p>
     * The value of this constant is 1365
     * </p>
     */
    REQ_E_INVALIDMODE(1365),
    /**
     * <p>
     * Failed to remove the specified requirement.
     * </p>
     * <p>
     * The value of this constant is 1366
     * </p>
     */
    REQ_E_DELETE(1366),
    /**
     * <p>
     * Invalid parameters sent to IReqFactory.MoveRequirements method.
     * </p>
     * <p>
     * The value of this constant is 1367
     * </p>
     */
    REQ_MOVE_LIST_INVALID_PARAMS(1367),
    /**
     * <p>
     * This property is read-only.
     * </p>
     * <p>
     * The value of this constant is 1368
     * </p>
     */
    REQ_PROPERTY_READ_ONLY(1368),
    /**
     * <p>
     * The test set does not exist.
     * </p>
     * <p>
     * The value of this constant is 1380
     * </p>
     */
    TESTSET_E_NOT_FOUND(1380),
    /**
     * <p>
     * Failure to create TestSet.
     * </p>
     * <p>
     * The value of this constant is 1381
     * </p>
     */
    TESTSET_E_CREATE(1381),
    /**
     * <p>
     * Failure to delete TestSet.
     * </p>
     * <p>
     * The value of this constant is 1382
     * </p>
     */
    TESTSET_E_DELETE(1382),
    /**
     * <p>
     * Failure to delete default' TestSet.
     * </p>
     * <p>
     * The value of this constant is 1383
     * </p>
     */
    TESTSET_E_DELETE_DEFAULT(1383),
    /**
     * <p>
     * The test instance does not exist.
     * </p>
     * <p>
     * The value of this constant is 1400
     * </p>
     */
    TSTEST_E_NOT_FOUND(1400),
    /**
     * <p>
     * Failed to remove the specified test instance.
     * </p>
     * <p>
     * The value of this constant is 1401
     * </p>
     */
    TSTEST_E_DELETE(1401),
    /**
     * <p>
     * Failure to create test in TestSet.
     * </p>
     * <p>
     * The value of this constant is 1402
     * </p>
     */
    TSTEST_E_CREATE(1402),
    /**
     * <p>
     * The item does not exist.
     * </p>
     * <p>
     * The value of this constant is 1420
     * </p>
     */
    ITEM_E_NOT_FOUND(1420),
    /**
     * <p>
     * No permission to create a new item.
     * </p>
     * <p>
     * The value of this constant is 1421
     * </p>
     */
    ITEM_E_NO_ADD(1421),
    /**
     * <p>
     * No permission to remove an item.
     * </p>
     * <p>
     * The value of this constant is 1422
     * </p>
     */
    ITEM_E_NO_REMOVE(1422),
    /**
     * <p>
     * The condition does not exist.
     * </p>
     * <p>
     * The value of this constant is 1440
     * </p>
     */
    COND_E_NOT_FOUND(1440),
    /**
     * <p>
     * Failed to create a new condition.
     * </p>
     * <p>
     * The value of this constant is 1441
     * </p>
     */
    COND_E_CREATE(1441),
    /**
     * <p>
     * The condition type is invalid.
     * </p>
     * <p>
     * The value of this constant is 1442
     * </p>
     */
    COND_E_INVALIDTYPE(1442),
    /**
     * <p>
     * The attachment does not exist.
     * </p>
     * <p>
     * The value of this constant is 1460
     * </p>
     */
    ATT_E_NOT_FOUND(1460),
    /**
     * <p>
     * Failed to create attachment.
     * </p>
     * <p>
     * The value of this constant is 1461
     * </p>
     */
    ATT_E_CREATE(1461),
    /**
     * <p>
     * Invalid request for attachment.
     * </p>
     * <p>
     * The value of this constant is 1463
     * </p>
     */
    ATT_E_INVALID_REQUEST(1463),
    /**
     * <p>
     * Failed to rename attachment.
     * </p>
     * <p>
     * The value of this constant is 1464
     * </p>
     */
    ATT_E_RENAME(1464),
    /**
     * <p>
     * Object cannot have an attachment.
     * </p>
     * <p>
     * The value of this constant is 1465
     * </p>
     */
    ATT_E_OBJECT_HAS_ATTACHMENT(1465),
    /**
     * <p>
     * The specified user group does not exist.
     * </p>
     * <p>
     * The value of this constant is 1480
     * </p>
     */
    USERSGROUP_E_NOT_FOUND(1480),
    /**
     * <p>
     * Users group system error.
     * </p>
     * <p>
     * The value of this constant is 1481
     * </p>
     */
    USERSGROUP_E_SYSTEM(1481),
    /**
     * <p>
     * Failed to create user group.
     * </p>
     * <p>
     * The value of this constant is 1482
     * </p>
     */
    USERSGROUP_E_CREATE(1482),
    /**
     * <p>
     * The specified design step does not exist.
     * </p>
     * <p>
     * The value of this constant is 1500
     * </p>
     */
    DESSTEP_E_NOT_FOUND(1500),
    /**
     * <p>
     * Failed to create design step.
     * </p>
     * <p>
     * The value of this constant is 1501
     * </p>
     */
    DESSTEP_E_CREATE(1501),
    /**
     * <p>
     * Failed to remove the specified design step.
     * </p>
     * <p>
     * The value of this constant is 1502
     * </p>
     */
    DESSTEP_E_DELETE(1502),
    /**
     * <p>
     * Tree node not found.
     * </p>
     * <p>
     * The value of this constant is 1520
     * </p>
     */
    TREE_E_NOT_FOUND(1520),
    /**
     * <p>
     * Cannot create Tree node.
     * </p>
     * <p>
     * The value of this constant is 1521
     * </p>
     */
    TREE_E_CREATE(1521),
    /**
     * <p>
     * Cannot remove Tree node.
     * </p>
     * <p>
     * The value of this constant is 1522
     * </p>
     */
    TREE_E_DELETE(1522),
    /**
     * <p>
     * Cannot rename Tree node.
     * </p>
     * <p>
     * The value of this constant is 1523
     * </p>
     */
    TREE_E_RENAME(1523),
    /**
     * <p>
     * Run does not exist.
     * </p>
     * <p>
     * The value of this constant is 1540
     * </p>
     */
    RUN_E_NOT_FOUND(1540),
    /**
     * <p>
     * Failed to create Run.
     * </p>
     * <p>
     * The value of this constant is 1541
     * </p>
     */
    RUN_E_CREATE(1541),
    /**
     * <p>
     * Failed to delete Run.
     * </p>
     * <p>
     * The value of this constant is 1542
     * </p>
     */
    RUN_E_DELETE(1542),
    /**
     * <p>
     * Step does not exist.
     * </p>
     * <p>
     * The value of this constant is 1560
     * </p>
     */
    STEP_E_NOT_FOUND(1560),
    /**
     * <p>
     * Failed to create Step.
     * </p>
     * <p>
     * The value of this constant is 1561
     * </p>
     */
    STEP_E_CREATE(1561),
    /**
     * <p>
     * Failed to delete Step.
     * </p>
     * <p>
     * The value of this constant is 1562
     * </p>
     */
    STEP_E_DELETE(1562),
    /**
     * <p>
     * No permission to modify design steps - steps won't be copied to the corresponding test.
     * </p>
     * <p>
     * The value of this constant is 1563
     * </p>
     */
    STEP_E_COPY_STEPS_OF_RUN(1563),
    /**
     * <p>
     * The extended storage action has been canceled.
     * </p>
     * <p>
     * The value of this constant is 1580
     * </p>
     */
    EXSTORAGE_CANCEL(1580),
    /**
     * <p>
     * Extended Storage is currently busy.
     * </p>
     * <p>
     * The value of this constant is 1581
     * </p>
     */
    EXSTORAGE_OCCIPIED(1581),
    /**
     * <p>
     * Filter is invalid.
     * </p>
     * <p>
     * The value of this constant is 1582
     * </p>
     */
    EXSTORAGE_INVALID_FILTER(1582),
    /**
     * <p>
     * Extended Storage IO operation disabled.
     * </p>
     * <p>
     * The value of this constant is 1584
     * </p>
     */
    EXSTORAGE_IO_OPERATION_DISABLED(1584),
    /**
     * <p>
     * The Extended Storage path is not valid.
     * </p>
     * <p>
     * The value of this constant is 1585
     * </p>
     */
    EXSTORAGE_INVALID_PATH(1585),
    /**
     * <p>
     * Cannot create one of the following objects: path, file or ES object itself.
     * </p>
     * <p>
     * The value of this constant is 1586
     * </p>
     */
    EXSTORAGE_CANT_CREATE(1586),
    /**
     * <p>
     * Internet connection specific error.
     * </p>
     * <p>
     * The value of this constant is 1587
     * </p>
     */
    EXSTORAGE_INTERNET(1587),
    /**
     * <p>
     * Server path is empty.
     * </p>
     * <p>
     * The value of this constant is 1588
     * </p>
     */
    EXSTORAGE_EMPTY_SERVER_PATH(1588),
    /**
     * <p>
     * Client path is empty.
     * </p>
     * <p>
     * The value of this constant is 1589
     * </p>
     */
    EXSTORAGE_EMPTY_ClIENT_PATH(1589),
    /**
     * <p>
     * Server path does not exist.
     * </p>
     * <p>
     * The value of this constant is 1590
     * </p>
     */
    EXSTORAGE_ERROR_SERVER_PATH(1590),
    /**
     * <p>
     * Extended storage access permission error.
     * </p>
     * <p>
     * The value of this constant is 1591
     * </p>
     */
    EXSTORAGE_ERROR_PERMISSION(1591),
    /**
     * <p>
     * Server is not connected.
     * </p>
     * <p>
     * The value of this constant is 1600
     * </p>
     */
    SERVER_NOT_CONNECTED(1600),
    /**
     * <p>
     * Failed to delete host.
     * </p>
     * <p>
     * The value of this constant is 1620
     * </p>
     */
    HOST_E_DELETE(1620),
    /**
     * <p>
     * Host does not exist.
     * </p>
     * <p>
     * The value of this constant is 1621
     * </p>
     */
    HOST_E_NOT_FOUND(1621),
    /**
     * <p>
     * Host group does not exist.
     * </p>
     * <p>
     * The value of this constant is 1640
     * </p>
     */
    HOSTGROUP_E_NOT_FOUND(1640),
    /**
     * <p>
     * Cannot paste subject to itself.
     * </p>
     * <p>
     * The value of this constant is 1660
     * </p>
     */
    COPY_SUBJECT_E_TO_ITSELF(1660),
    /**
     * <p>
     * Duplicate Tree node name.
     * </p>
     * <p>
     * The value of this constant is 1661
     * </p>
     */
    TDOLE_NODE_EXISTS(1661),
    /**
     * <p>
     * Cannot copy. Entity Subtype does not exist in target project.
     * </p>
     * <p>
     * The value of this constant is 1664
     * </p>
     */
    TDAPI_CANT_COPY_NO_SUBTYPE(1664),
    /**
     * <p>
     * Found a criterion without values.
     * </p>
     * <p>
     * The value of this constant is 1680
     * </p>
     */
    TDOLE_ANSWERLESS_QUESTION_FOUND(1680),
    /**
     * <p>
     * Found a criterion with duplicate values.
     * </p>
     * <p>
     * The value of this constant is 1681
     * </p>
     */
    TDOLE_QUESTION_WITH_DUPLICATE_ANSWERS_FOUND(1681),
    /**
     * <p>
     * Cannot Commit Risk-based Quality Management customizations due to failed validators.
     * </p>
     * <p>
     * The value of this constant is 1682
     * </p>
     */
    TDOLE_CAN_NOT_COMNMIT_RBT_CUSTOMIZATION(1682),
    /**
     * <p>
     * No alert could be cleared.
     * </p>
     * <p>
     * The value of this constant is 1690
     * </p>
     */
    TDOLE_WARNING_NO_ALERTS_CLEARED(1690),
    /**
     * <p>
     * Some of the alerts could not be cleared.
     * </p>
     * <p>
     * The value of this constant is 1691
     * </p>
     */
    TDOLE_WARNING_SOME_ALERTS_NOT_CLEARED(1691),
    /**
     * <p>
     * The alert could not be cleared.
     * </p>
     * <p>
     * The value of this constant is 1692
     * </p>
     */
    TDOLE_WARNING_ALERT_NOT_CLEARED(1692),
    /**
     * <p>
     * No graph data exists.
     * </p>
     * <p>
     * The value of this constant is 1700
     * </p>
     */
    GRAPH_DATA_EMPTY(1700),
    /**
     * <p>
     * Cannot create release coverage progress graph. One or more cycles are missing a start date.
     * </p>
     * <p>
     * The value of this constant is 1701
     * </p>
     */
    TDAPI_GRAPH_RELEASE_CYCLE_DATE_MISSING(1701),
    /**
     * <p>
     * The operation has been prevented by the error handler.
     * </p>
     * <p>
     * The value of this constant is 1800
     * </p>
     */
    EVENT_ERR_DISABLE(1800),
    /**
     * <p>
     * Mail condition does not exist.
     * </p>
     * <p>
     * The value of this constant is 1850
     * </p>
     */
    MAILCONDITION_E_NOT_FOUND(1850),
    /**
     * <p>
     * No TD parameter exists.
     * </p>
     * <p>
     * The value of this constant is 1900
     * </p>
     */
    TDPARAM_NOT_FOUND(1900),
    /**
     * <p>
     * Method is disabled by the event handler.
     * </p>
     * <p>
     * The value of this constant is 1950
     * </p>
     */
    TDOLE_DIFFERENT_UDFS(1950),
    /**
     * <p>
     * Failure to create a new link.
     * </p>
     * <p>
     * The value of this constant is 1970
     * </p>
     */
    LINK_E_CREATE(1970),
    /**
     * <p>
     * Those entities are already linked.
     * </p>
     * <p>
     * The value of this constant is 1971
     * </p>
     */
    TDAPI_E_LINK_EXISTS(1971),
    /**
     * <p>
     * Cannot link a defect to itself.
     * </p>
     * <p>
     * The value of this constant is 1972
     * </p>
     */
    TDAPI_E_DEFECT_LINKED_TO_ITSELF(1972),
    /**
     * <p>
     * Invalid request for external resource.
     * </p>
     * <p>
     * The value of this constant is 1990
     * </p>
     */
    RSC_E_INVALID_REQUEST(1990),
    /**
     * <p>
     * External resource request to extended storage failed.
     * </p>
     * <p>
     * The value of this constant is 1991
     * </p>
     */
    RSC_E_EXTENDED_STORAGE_REQUEST_FAIL(1991),
    /**
     * <p>
     * Download or upload of virtual object failed.
     * </p>
     * <p>
     * The value of this constant is 1992
     * </p>
     */
    RSC_E_VIRTUAL_OBJECT(1992),
    /**
     * <p>
     * Change of resource type after creation failed.
     * </p>
     * <p>
     * The value of this constant is 1993
     * </p>
     */
    RSC_E_CHANGE_TYPE(1993),
    /**
     * <p>
     * Cannot update user-defined field customization.
     * </p>
     * <p>
     * The value of this constant is 1076
     * </p>
     */
    TDOLE_CAN_UPDATE_UDFS(1076),
    /**
     * <p>
     * Failure in data hiding filter for login.
     * </p>
     * <p>
     * The value of this constant is 9001
     * </p>
     */
    TDOLE_CORRUPTED_DATA_HIDING(9001),
    /**
     * <p>
     * Attempt to connect to project when no user logged in.
     * </p>
     * <p>
     * The value of this constant is 30001
     * </p>
     */
    TDOLE_NOT_LOGGED_IN(30001),
    /**
     * <p>
     * The input property does not exist.
     * </p>
     * <p>
     * The value of this constant is 30002
     * </p>
     */
    TDOLE_LOGIN_INPUT_PROPERTY_DOES_NOT_EXIST(30002),
    /**
     * <p>
     * The input string is too long.
     * </p>
     * <p>
     * The value of this constant is 30003
     * </p>
     */
    TDOLE_LOGIN_INPUT_VALUE_EXCEED_MAX_LENGTH(30003),
    /**
     * <p>
     * Missing required property.
     * </p>
     * <p>
     * The value of this constant is 30004
     * </p>
     */
    TDOLE_LOGIN_INPUT_MANDATORY_PROPERTY_MISSING(30004),
    /**
     * <p>
     * OTA version is not compatible.
     * </p>
     * <p>
     * The value of this constant is 30005
     * </p>
     */
    TDOLE_OTA_VERSION_NOT_COMPATIBLE(30005),
    /**
     * <p>
     * Failed to Authenticate User.
     * </p>
     * <p>
     * The value of this constant is 20900
     * </p>
     */
    TDOLE_FAILED_TO_AUTHENTICATE_USER(20900),
    /**
     * <p>
     * The user is not an active user.
     * </p>
     * <p>
     * The value of this constant is 1325
     * </p>
     */
    TDAPI_NON_ACTIVE_USER_ERRCODE(1325),
    /**
     * <p>
     * Testing tool version not compatible.
     * </p>
     * <p>
     * The value of this constant is 20950
     * </p>
     */
    TDOLE_FAILED_TO_AUTHENTICATE_TT_VERSION(20950),
    /**
     * <p>
     * Duplicate Application Entity folder name.
     * </p>
     * <p>
     * The value of this constant is 50055
     * </p>
     */
    TDOLE_APP_ENTITY_FOLDER_EXISTS(50055),
    /**
     * <p>
     * Duplicate Change Entity folder name.
     * </p>
     * <p>
     * The value of this constant is 50056
     * </p>
     */
    TDOLE_CHANGE_ENTITY_FOLDER_EXISTS(50056),
    /**
     * <p>
     * One or more tests does not belong to the requested baseline.
     * </p>
     * <p>
     * The value of this constant is 4000
     * </p>
     */
    TDAPI_TEST_NOT_IN_BASELINE(4000),
    /**
     * <p>
     * Some of the tests were not added since they do not belong to the required baseline or they do not support pinning to a baseline.
     * </p>
     * <p>
     * The value of this constant is 4001
     * </p>
     */
    TDAPI_SOME_TESTS_NOT_IN_BASELINE(4001),
    /**
     * <p>
     * Some of the test configurations were not added to the test set because they were never checked in.
     * </p>
     * <p>
     * The value of this constant is 4002
     * </p>
     */
    TDAPI_SOME_TEST_CONFIGS_NOT_CHECKED_IN(4002),
    /**
     * <p>
     * Some of the test configurations were not added since they do not belong to the required baseline or they do not support pinning to a
     * baseline.
     * </p>
     * <p>
     * The value of this constant is 4003
     * </p>
     */
    TDAPI_SOME_CONFIGS_NOT_IN_BASELINE(4003),
    /**
     * <p>
     * An Illegal put_field command was received (Only actual_value may be modified).
     * </p>
     * <p>
     * The value of this constant is 5001
     * </p>
     */
    TDAPI_PARAM_VALUE_ILLEGAL_PUT_FIELD(5001),
    /**
     * <p>
     * Failed to remove the specified Parameter Value.
     * </p>
     * <p>
     * The value of this constant is 5002
     * </p>
     */
    TDAPI_PARAM_VALUE_E_DELETE(5002),
    /**
     * <p>
     * Duplicate test parameter names.
     * </p>
     * <p>
     * The value of this constant is 8203
     * </p>
     */
    TDAPI_TEST_PARAM_DUPLICATE_NAME(8203),
    /**
     * <p>
     * The baseline from which the library was imported was deleted. Comparison is impossible.
     * </p>
     * <p>
     * The value of this constant is 23001
     * </p>
     */
    TDAPI_EXP_LIB_BL_NOT_EXIST_ERROR_CODE(23001),
    /**
     * <p>
     * The baseline, which was created after last library import or sync, was deleted. Synchronization is impossible.
     * </p>
     * <p>
     * The value of this constant is 23002
     * </p>
     */
    TDAPI_BL_AFTER_IMPORT_NOT_EXIST_ERROR_CODE(23002),
    /**
     * <p>
     * Compare or synchronization operations could not start because one of the libraries does not exist.
     * </p>
     * <p>
     * The value of this constant is 23003
     * </p>
     */
    TDAPI_LIB_NOT_EXIST_ERROR_CODE(23003),
    /**
     * <p>
     * Compare or synchronization operations could not start because one of the baselines does not exist.
     * </p>
     * <p>
     * The value of this constant is 23004
     * </p>
     */
    TDAPI_BL_NOT_EXIST_ERROR_CODE(23004),
    /**
     * <p>
     * Compare entities failed.
     * </p>
     * <p>
     * The value of this constant is 23005
     * </p>
     */
    TDAPI_FAIL_TO_SMALL_COMPARE(23005),
    /**
     * <p>
     * Cannot import a folder under itself or under one of its sub-folders.
     * </p>
     * <p>
     * The value of this constant is 23201
     * </p>
     */
    TDAPI_LIB_CANNOT_IMPORT_UNDER_ITSELF(23201),
    /**
     * <p>
     * A cross-project field intersection operation failed unexpectedly.
     * </p>
     * <p>
     * The value of this constant is 24000
     * </p>
     */
    TDAPI_CROSSPROJECT_FIELD_INTERSECT_GENERAL_ERROR(24000),
    /**
     * <p>
     * A cross-project field intersection operation failed because of an invalid project state.
     * </p>
     * <p>
     * The value of this constant is 24001
     * </p>
     */
    TDAPI_CROSSPROJECT_FIELD_INTERSECT_PROJECTS_STATE_ERROR(24001),
    /**
     * <p>
     * A cross-project field intersection operation failed because the selected projects do not exist.
     * </p>
     * <p>
     * The value of this constant is 24002
     * </p>
     */
    TDAPI_CROSSPROJECT_FIELD_INTERSECT_PROJECTS_MISSING_ERROR(24002),
    /**
     * <p>
     * Indicates that a cross-project field intersection operation has failed because the selected entity or entities are not supported by
     * one or more projects.
     * </p>
     * <p>
     * The value of this constant is 24003
     * </p>
     */
    TDAPI_CROSSPROJECT_FIELD_INTERSECT_UNSUPPORTED_ENTITY_ERROR(24003),
    /**
     * <p>
     * New BP Component creation failed.
     * </p>
     * <p>
     * The value of this constant is 24004
     * </p>
     */
    BPCOMPONENT_E_CREATE(24004),
    /**
     * <p>
     * New BP Iteration creation failed.
     * </p>
     * <p>
     * The value of this constant is 24005
     * </p>
     */
    BPITERATION_E_CREATE(24005),
    /**
     * <p>
     * New BP Parameter creation failed.
     * </p>
     * <p>
     * The value of this constant is 24006
     * </p>
     */
    BPPARAMETER_E_CREATE(24006),
    /**
     * <p>
     * New BP Iteration Parameter creation failed.
     * </p>
     * <p>
     * The value of this constant is 24007
     * </p>
     */
    BPITERATIONPARAM_E_CREATE(24007),
    /**
     * <p>
     * Project is inactive. Cannot connect.
     * </p>
     * <p>
     * The value of this constant is 9002
     * </p>
     */
    TDAPI_PROJECT_INACTIVE_ERROR(9002), ;
    
    private final int value;
    
    TDAPI_ERRORCODES(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
