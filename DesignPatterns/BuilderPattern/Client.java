package DesignPatterns.BuilderPattern;

import DesignPatterns.BuilderPattern.Builder.EnggStudentBuilder;
import DesignPatterns.BuilderPattern.Builder.MBAStudentBuilder;

public class Client {
    public static void main(String[] args) {
        Director directorObj1 = new Director(new EnggStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.getStudentInfo());
        System.out.println(mbaStudent.getStudentInfo());
    }
}
