package com.basic_codes;
import java.util.Scanner;
public class basic1{
    public static void main(String[]args){
        int a,b,c,d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        a=sc.nextInt();
        sc.nextLine();
        System.out.println("enter value of b");
        b=sc.nextInt();
        sc.nextLine();
        System.out.println("enter value of c");
        c=sc.nextInt();
        sc.nextLine();
        System.out.println("enter value of d");
        d=sc.nextInt();
        sc.nextLine();
        sum =a+b+c+d;
        System.out.println("sum"+sum);

    }

}