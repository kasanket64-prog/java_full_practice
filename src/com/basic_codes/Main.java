package com.basic_codes;

abstract class Time {
    int hr, min, sec;
    Time() {
        hr = 0;
        min = 0;
        sec = 0;}
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;}
    abstract void display();}
class Demo extends Time {
    Demo() {
        super();
    }
    Demo(int hr, int min, int sec) {
        super(hr, min, sec);
    }
    void display() {
        System.out.println("Time: " + hr + ":" + min + ":" + sec);
    }
}
public class Main {
    public static void main(String[] args) {

        Time t1 = new Demo();
        Time t2 = new Demo(10, 20, 30);

        t1.display();
        t2.display();
    }
}
