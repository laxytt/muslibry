package com.example.tournamentcms.core.lib.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable ex){
        super(message, ex);
    }

    public ResourceNotFoundException(){
        super("");
    }

}
