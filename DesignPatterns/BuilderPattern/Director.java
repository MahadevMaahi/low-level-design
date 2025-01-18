package DesignPatterns.BuilderPattern;

import DesignPatterns.BuilderPattern.Builder.EnggStudentBuilder;
import DesignPatterns.BuilderPattern.Builder.MBAStudentBuilder;
import DesignPatterns.BuilderPattern.Builder.StudentBuilder;

public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EnggStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){

        return studentBuilder.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createMBAStudent(){

        return studentBuilder.setRollNumber(2).setAge(24).setName("sj").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();

    }
}