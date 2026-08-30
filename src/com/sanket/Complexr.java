package com.sanket;

class Complex {
    double real;
    double imag;

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Complexr {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum = "); sum.display();

        Complex diff = c1.subtract(c2);
        System.out.print("Difference = "); diff.display();

        Complex prod = c1.multiply(c2);
        System.out.print("Product = "); prod.display();
    }
}

