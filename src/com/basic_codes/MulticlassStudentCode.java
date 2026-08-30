package com.basic_codes;
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    void inputDetails(Scanner sc) {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }}
class School {
    String schoolName;
    Student student;
    School(String schoolName, Student student) {
        this.schoolName = schoolName;
        this.student = student;
    }
    void displaySchool() {
        System.out.println("School Name: " + schoolName);
        System.out.println("--- Student Details ---");
        student.displayDetails();
    }}
public class MulticlassStudentCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        stu.inputDetails(sc);
        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();
        School sch = new School(schoolName, stu);
        System.out.println("\n--- School Information ---");
        sch.displaySchool();

        sc.close();
    }}
