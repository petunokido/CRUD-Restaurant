package com.testepratico.Teste.exceptions;

import com.testepratico.Teste.controller.response.HttpErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

public class ExceptionsHandler
{
    @ExceptionHandler({DishNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HttpErrorResponse handleGenericException(DishNotFound exception) {
        return new HttpErrorResponse(
                404,
                exception.getMessage(),
                LocalDateTime.now());
}

}
