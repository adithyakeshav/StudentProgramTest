package com.example;

import java.util.Arrays;
import java.util.List;

public class Student {

    public static enum SUBJECT {
        SUBJECT1,
        SUBJECT2,
        SUBJECT3,
        SUBJECT4,
        SUBJECT5,
        SUBJECT6
    };

    private String name;
    private String usn;
    public List<Integer> marks ;

    public Student(String name, String usn, int subject_1, int subject_2, int subject_3, int subject_4, int subject_5, int subject_6) {

        this.name = name;
        this.usn = usn;
        this.marks = Arrays.asList(subject_1, subject_2, subject_3, subject_4, subject_5, subject_6);
    }

    @Override
    public String toString() {
        return "" ;
    }

    public static float getAverageOfStudents(List<Student> studentList, SUBJECT subject) {
        return 0;
    }

    public int getTotal() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SUBJECT.values()[0]);
    }
}

