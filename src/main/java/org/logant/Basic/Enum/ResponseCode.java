package org.logant.Basic.Enum;


public enum ResponseCode {
    SERVER_ERROR("250", "Server Error"),
    SUCCESS("200", "Success"),
    INVALID("210", "Request data provided is invalid");

    private final String code;
    private final String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

