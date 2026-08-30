package com.basic_codes;
class Student {
    String name;
    int rollNo;
    int grade;

    Student(String name, int rollNo, int grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class School {
    String schoolName;
    Student student;
    Teacher teacher;

    School(String schoolName, Student student, Teacher teacher) {
        this.schoolName = schoolName;
        this.student = student;
        this.teacher = teacher;
    }

    void displaySchool() {
        System.out.println("School Name: " + schoolName);
        System.out.println("--- Student Details ---");
        student.displayStudent();
        System.out.println("--- Teacher Details ---");
        teacher.displayTeacher();
    }
}

public class MuliticlassSchoolProgram  {
    public static void main(String[] args) {
        Student s1 = new Student("Sanket", 101, 10);
        Teacher t1 = new Teacher("Mrs. Sharma", "Mathematics");
        School sch = new School("stela High School", s1, t1);

        sch.displaySchool();
    }
}



