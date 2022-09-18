package com.mlawrow.rectask.exception;

import static com.mlawrow.rectask.api.response.ResponseStatus.INTERNAL_SERVER_ERROR;
import static com.mlawrow.rectask.api.response.ResponseStatus.NOT_FOUND;

import com.mlawrow.rectask.api.response.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
@AllArgsConstructor
public class GithubControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<Response<Object>> handleExceptions(HttpClientErrorException ex) {
        log.error("GithubException occurred:", ex);
        var response = Response.buildResponse(NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(ex.getStatusCode()).body(response);
    }
}
