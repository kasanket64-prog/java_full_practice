package com.basic_codes;

class Shape {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Circle extends Shape {

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

public class setandgetmethod {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.setRadius(5);

        System.out.println("Radius = " + c.getRadius());
        System.out.println("Area = " + c.calculateArea());
        System.out.println("Perimeter = " + c.calculatePerimeter());
    }
}

