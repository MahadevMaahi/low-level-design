package DesignPatterns.BuilderPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class EnggStudentBuilder extends StudentBuilder {
    
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("OS");
        subjects.add("Computer Architechture");
        this.subjects = subjects;
        return this;
    }
}
