package com.mlawrow.rectask.exception;

import com.mlawrow.rectask.api.response.ResponseStatus;
import lombok.Getter;

public class GithubException extends RuntimeException {

    @Getter
    private final ResponseStatus responseStatus;

    public GithubException(String message, ResponseStatus responseStatus) {
        super(message);
        this.responseStatus = responseStatus;
    }

}
