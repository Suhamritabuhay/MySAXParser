package com.company;

public class ArgumentException extends Exception {
    public ArgumentException(String message) {
        super(message);
    }
    //throw new ArgumentException("not supported key:" + args[2]);
}
