package DesignPatterns.BuilderPattern;

import java.util.List;

import DesignPatterns.BuilderPattern.Builder.StudentBuilder;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    
    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.rollNumber = studentBuilder.rollNumber;
        this.subjects = studentBuilder.subjects;
    }

    public String getStudentInfo() {
        return ""+ " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }
}
