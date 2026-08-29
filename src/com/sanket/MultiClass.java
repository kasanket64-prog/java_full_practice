package com.sanket;



    // Employee class
    class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
        }
    }


    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDept() {
            System.out.println("Department: " + deptName);
        }
    }


    public class MultiClass {
        public static void main(String[] args) {
            Employee e1 = new Employee(101, "Sanket", 50000);
            Department d1 = new Department("Computer Science");

            e1.display();
            d1.showDept();
        }
    }


