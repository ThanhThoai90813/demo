package com.example.demo.exception;

public enum ErrorCode {
    INVALID_KEY(0000, "invalid key"),
    UNCATEGORIZED_EXCEPTION(9999, "loi khong xac dinh"),
    USER_EXISTED(1001, "User already existed"),
    USER_NOT_EXISTED(1005, "User not existed"),
    USERNAME_INVAILD(1002, "Username phai co it nhat 3 ki tu"),
    PASSWORD_INVAILD(1003, "Password phai co tu 8 den 20 ki tu"),
    UNAUTHENTICATED(1008, "unauthenticated"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
