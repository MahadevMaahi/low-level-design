package DesignPatterns.BuilderPattern.Builder;

import java.util.List;

import DesignPatterns.BuilderPattern.Student;

public abstract class StudentBuilder {
    public int rollNumber;
    public int age;
    public String name;
    public String fatherName;
    public String motherName;
    public List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
