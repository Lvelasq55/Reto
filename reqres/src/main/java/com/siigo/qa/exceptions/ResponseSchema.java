package com.siigo.qa.exceptions;

public class ResponseSchema extends AssertionError{

    public ResponseSchema(String message, Throwable cause){
        super(message, cause);
    }
}
