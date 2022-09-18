package com.mlawrow.rectask.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {

    OK(200, "Success. Request processed"),
    NOT_FOUND(404, "Resource could not be found. Request not processed."),
    INTERNAL_SERVER_ERROR(500, "Internal server error. Request not processed.");

    private final int httpCode;
    private final String message;
}
