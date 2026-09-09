package com.basic_codes;

import java.util.Scanner;

public class dd2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int math, english, hindi, korean;
        double totalmarks, percentage, averagemarks;

        System.out.println("Enter Marks of English");
        english = sc.nextInt();

        System.out.println("Enter Marks of Hindi");
        hindi = sc.nextInt();

        System.out.println("Enter Marks of Korean");
        korean = sc.nextInt();

        System.out.println("Enter Marks of Math");
        math = sc.nextInt();

        if (english >= 0 && english <= 100 &&
                hindi >= 0 && hindi <= 100 &&
                korean >= 0 && korean <= 100 &&
                math >= 0 && math <= 100) {

            totalmarks = english + hindi + korean + math;

            averagemarks = totalmarks / 4;

            percentage = (totalmarks * 100) / 400;

            System.out.println("-------------Grade---------------");

            System.out.println("Marks of English is: " + english);
            System.out.println("Marks of Hindi is: " + hindi);
            System.out.println("Marks of Korean is: " + korean);
            System.out.println("Marks of Math is: " + math);

            System.out.println("Total Marks is: " + totalmarks);

            System.out.println("Average is: " + averagemarks);

            System.out.println("Total Percentage is: " + percentage);

            if (percentage > 90) {
                System.out.println("Your grade is A+");
            }

            else if (percentage > 80) {
                System.out.println("Your grade is A");
            }

            else if (percentage > 70) {
                System.out.println("Your grade is B++");
            }

            else if (percentage > 60) {
                System.out.println("Your grade is B");
            }

            else if (percentage > 50) {
                System.out.println("Your grade is C++");
            }

            else if (percentage > 40) {
                System.out.println("Your grade is C");
            }

            else {
                System.out.println("Your grade is F and you have failed in the exam");
            }
        }

        else {
            System.out.println("Check your marks. Marks are invalid");
        }

        sc.close();
    }
}