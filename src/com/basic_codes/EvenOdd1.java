package com.basic_codes;
import java.util.Scanner;
class mentor {
    String name;
    String subject;
    mentor (String name , String subject){
        this.name = name;
        this.subject = subject;

    }
    void takeinfo(){
        System.out.println("enter name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("enter subject");
        subject = sc.nextLine();




    }
    void showdata(){
        System.out.println("your name"+name);
        System.out.println("your subject"+subject);


    }
}

public class EvenOdd1 {
    static void main(String[]args){

        int a,b,c;
       String name, subject;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
         a=sc.nextInt();
        System.out.println("enter the values of b");
        b=sc.nextInt();
        System.out.println("enter the valuesof c");
        c=sc.nextInt();

        Mentor mm1 = new Mentor("", ""); // empty initially
        mm1.takeInfo(); // take input from user
        mm1.showData(); // display entered info

        // Example usage of numbers
        System.out.println("Sum of a+b+c = " + (a + b + c));

        sc.close();



    }
}
