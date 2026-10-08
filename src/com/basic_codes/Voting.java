package com.basic_codes;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Voting {

    static void checkVote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        int age  = 16;

        try {
            checkVote(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}