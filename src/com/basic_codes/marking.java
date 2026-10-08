package com.basic_codes;


public class marking {

    public static void main(String[] args) {

        try {

            int age = 16;

            if (age < 18) {
                throw new ArithmeticException("Not Eligible for Voting");
            }

            String s = null;
            System.out.println(s.length());

        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: String is null");
        }

    }
}