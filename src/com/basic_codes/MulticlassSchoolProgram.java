package com.basic_codes;

class Pupil {
    String name;
    int rollNo;
    int grade;

    Pupil(String name, int rollNo, int grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void displayPupil() {
        System.out.println("Pupil Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

class Mentor {
    String name;
    String subject;

    Mentor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayMentor() {
        System.out.println("Mentor Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class SchoolProgram {
    String schoolName;
    Pupil pupil;
    Mentor mentor;

    SchoolProgram(String schoolName, Pupil pupil, Mentor mentor) {
        this.schoolName = schoolName;
        this.pupil = pupil;
        this.mentor = mentor;
    }

    void displaySchool() {
        System.out.println("School Name: " + schoolName);
        System.out.println("--- Pupil Details ---");
        pupil.displayPupil();
        System.out.println("--- Mentor Details ---");
        mentor.displayMentor();
    }
}

public class MulticlassSchoolProgram {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Sanket", 101, 10);
        Mentor m1 = new Mentor("Mrs. Sharma", "Mathematics");
        SchoolProgram sch = new SchoolProgram("Stela High School", p1, m1);

        sch.displaySchool();
    }
}
