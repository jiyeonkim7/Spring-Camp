package org.springcamp.report1.model;

public class Student extends Department{
    private int std_idx;
    private String std_name;
    private int std_grade;
    private String std_depart;
    private String std_email;
    private String std_addr;
    private int std_age;
    private String std_state;


    public Student(){}

    public Student(final int std_idx, final String std_name, final int std_grade, final String std_depart, final String std_email, final String std_addr, final int std_age, final String std_state) {
        super();
        this.std_idx = std_idx;
        this.std_name = std_name;
        this.std_grade = std_grade;
        this.std_depart = std_depart;
        this.std_email = std_email;
        this.std_addr = std_addr;
        this.std_age = std_age;
        this.std_state = std_state;
    }

    public Student(final int univ_idx, final String univ_name, final String univ_phoneNum, final String univ_addr,
                   final int dep_idx, final String dep_name, final String dep_phoneNum, final String dep_type,
                   final int std_idx, final String std_name,  final int std_grade, final String std_depart, final String std_email, final String std_addr, final int std_age,  final String std_state) {
        super(univ_idx, univ_name, univ_phoneNum, univ_addr, dep_idx, dep_name, dep_phoneNum, dep_type);
        this.std_idx = std_idx;
        this.std_name = std_name;
        this.std_grade = std_grade;
        this.std_depart = std_depart;
        this.std_email = std_email;
        this.std_addr = std_addr;
        this.std_age = std_age;
        this.std_state = std_state;
    }

    public int getStdIdx() {
        return std_idx;
    }

    public void setStdIdx(final int std_idx) {
        this.std_idx = std_idx;
    }

    public String getStdName() {
        return std_name;
    }

    public void setStdName(final String std_name) {
        this.std_name = std_name;
    }

    public int getStdGrade() {
        return std_grade;
    }

    public void setStdGrade(final int std_grade) {
        this.std_grade = std_grade;
    }

    public String getStdDepartment() {
        return std_depart;
    }

    public void setStdDepartment(final String std_depart) {
        this.std_depart = std_depart;
    }

    public String getStdEmail() {
        return std_email;
    }

    public void setStdEmail(final String std_email) {
        this.std_email = std_email;
    }

    public String getStdAddress() {
        return std_addr;
    }

    public void setStdAddress(final String std_addr) {
        this.std_addr = std_addr;
    }

    public int getStdAge() {
        return std_age;
    }

    public void setStdAge(final int std_age) {
        this.std_age = std_age;
    }

    public String getStdState() {
        return std_state;
    }

    public void setStdState(final String std_state) {
        this.std_state = std_state;
    }

    @Override
    public String toString() {
        return "Student{" +
                " Student Index = " + std_idx +
                ", Student Name = '" + std_name + '\'' +
                ", Student Grade = " + std_grade +
                ", Student Department = " + std_depart +
                ", Student Email = '" + std_email + '\'' +
                ", Student Address = '" + std_addr + '\'' +
                ", Student Age = " + std_age +
                ", Student State = '" + std_state + '\'' +
                " }";
    }
}
