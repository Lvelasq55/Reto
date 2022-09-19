package com.siigo.qa.exceptions;

public class ResponseCode extends AssertionError{

    public ResponseCode(String message, Throwable cause){
        super(message, cause);
    }

}
