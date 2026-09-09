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
        if(sum>10){
            if(sum<20){
        System.out.println("sum="+sum+", your value is higher than 10 but less than 20");
        }
        else if(sum>20){
            System.out.println("sum="+sum+", your value is higher than 20 but less than 20");}
        }
        else if(sum<10){
            System.out.println("sum="+sum+", your value is lesser than 10");
        }
        else{
            System.out.println(sum+", your value is higher than 20");

    }

}
}