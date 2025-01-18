package DesignPatterns.BuilderPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Finance");
        subjects.add("Marketing");
        subjects.add("Sales");
        this.subjects = subjects;
        return this;
    }
}
