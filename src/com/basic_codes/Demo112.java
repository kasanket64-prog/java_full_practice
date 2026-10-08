package com.basic_codes;
class IllegalAgeException extends Exception {
    IllegalAgeException(String msg) {
        super(msg);
    }
}

public class Demo112 {

    static void age() throws IllegalAgeException {
        throw new IllegalAgeException("Age is not equal to 18 or above");
    }

    public static void main(String[] args) {

        try {
            age();
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}