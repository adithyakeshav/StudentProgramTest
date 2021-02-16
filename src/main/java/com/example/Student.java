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

        /*
        "Name : Adithya\nUSN : 4KV16CS001\nSUBJECT1 : 70\nSUBJECT2 : 80\nSUBJECT3 : 60\nSUBJECT4 : 80\nSUBJECT5 : 75\nSUBJECT6 : 86\n";
         */
        StringBuilder result = new StringBuilder("Name : " + name +
                "\nUSN : " + usn + "\n");

        for(int i = 0; i< 6; i++) {
            result.append(SUBJECT.values()[i]).append(" : ");
            result.append(marks.get(i)).append("\n");
        }

        return result.toString();
    }

    public static float getAverageOfStudents(List<Student> studentList, SUBJECT subject) {
        int total = 0;

        for(Student student : studentList) {
            total += student.marks.get(subject.ordinal());
        }

        return (float)total / studentList.size();
    }

    public int getTotal() {

        int sum = 0;

        for(int mark : marks) {
            sum += mark;
        }

        return sum;
    }

}

