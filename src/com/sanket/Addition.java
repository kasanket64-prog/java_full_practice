package com.sanket;

public class Addition {
    public static void main(String[] args) {
        int a=121,b=122,c=124,d;
        d=a+b+c;
        System.out.println("-------Sum of addition of two numbers-------- ");
        System.out.println("where a=121,b=122,c=124,d=?");
        System.out.println("find d=?");
        System.out.println("D ="+ d);
        PythagorasTheorem obj= new  PythagorasTheorem();

        obj.showData();
    }
}
 class PythagorasTheorem{
    double a=4,b=3;
    double c =  Math.sqrt((a*a)+(b*b));
    void showData(){
    System.out.println("------By PythagorasTheorem---------");
     System.out.println("value of a=4,b=3 ,find c=? ");
     System.out.println(" c ="+c );
 }
}
