package com.mlawrow.rectask.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Response<T> {

    private final String status;
    private final String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T response;

    public static <T> Response<T> buildResponse(ResponseStatus status, String message) {
        return new Response<>(status.name(), message, null);
    }
}
