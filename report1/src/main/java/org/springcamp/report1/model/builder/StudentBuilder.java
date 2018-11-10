package org.springcamp.report1.model.builder;

import org.springcamp.report1.model.Student;

public class StudentBuilder {
    private int std_idx;
    private String std_name;
    private int std_grade;
    private String std_depart;
    private String std_email;
    private String std_addr;
    private int std_age;
    private String std_state;

    public StudentBuilder setStdIdx(final int std_idx) {
        this.std_idx = std_idx;
        return this;
    }

    public StudentBuilder setStdName(final String std_name) {
        this.std_name = std_name;
        return this;
    }

    public StudentBuilder setStdGrade(final int std_grade) {
        this.std_grade = std_grade;
        return this;
    }

    public StudentBuilder setStdDepartment(final String std_depart) {
        this.std_depart = std_depart;
        return this;
    }

    public StudentBuilder setStdEmail(final String std_email) {
        this.std_email = std_email;
        return this;
    }

    public StudentBuilder setStdAddress(final String std_addr) {
        this.std_addr = std_addr;
        return this;
    }

    public StudentBuilder setStdAge(final int std_age) {
        this.std_age = std_age;
        return this;
    }

    public StudentBuilder setStdState(final String std_state) {
        this.std_state = std_state;
        return this;
    }

    public Student build(){
        return new Student(this.std_idx, this.std_name, this.std_grade, this.std_depart, this.std_email, this.std_addr, this.std_age, this.std_state);
    }

}
