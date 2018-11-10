package org.springcamp.report1.model;

public class Professor extends Department{
    private int prof_idx;
    private String prof_name;
    private String prof_depart;
    private String prof_phoneNum;
    private String prof_subject;

    public Professor(){}

    public Professor(final int prof_idx, final String prof_name, final String prof_depart, final String prof_phoneNum, final String prof_subject) {
        super();
        this.prof_idx = prof_idx;
        this.prof_name = prof_name;
        this.prof_depart = prof_depart;
        this.prof_phoneNum = prof_phoneNum;
        this.prof_subject = prof_subject;
    }

    public Professor(final int univ_idx, final String univ_name, final String univ_phoneNum, final String univ_addr,
                     final int dep_idx, final String dep_name, final String dep_phoneNum, final String dep_type,
                     final int prof_idx, final String prof_name, final String prof_depart, final String prof_phoneNum, final String prof_subject) {
        super(univ_idx, univ_name, univ_phoneNum, univ_addr, dep_idx, dep_name, dep_phoneNum, dep_type);
        this.prof_idx = prof_idx;
        this.prof_name = prof_name;
        this.prof_depart = prof_depart;
        this.prof_phoneNum = prof_phoneNum;
        this.prof_subject = prof_subject;
    }

    public int getProfIdx() {
        return prof_idx;
    }

    public void setProfIdx(final int prof_idx) {
        this.prof_idx = prof_idx;
    }

    public String getProfName() {
        return prof_name;
    }

    public void setProfName(final String prof_name) {
        this.prof_name = prof_name;
    }

    public String getProfDepartment() {
        return prof_depart;
    }

    public void setProfDepartment(final String prof_depart) {
        this.prof_depart = prof_depart;
    }

    public String getProfPhoneNum() {
        return prof_phoneNum;
    }

    public void setProfPhoneNum(final String prof_phoneNum) {
        this.prof_phoneNum = prof_phoneNum;
    }

    public String getProfSubject() {
        return prof_subject;
    }

    public void setProfSubject(final String prof_subject) {
        this.prof_subject = prof_subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                " Professor Index = " + prof_idx +
                ", Professor Name = '" + prof_name + '\'' +
                ", Professor Department = '" + prof_depart + '\'' +
                ", Professor Phone Number = '" + prof_phoneNum + '\'' +
                ", Professor Subject = '" + prof_subject + '\'' +
                " }";
    }

}

