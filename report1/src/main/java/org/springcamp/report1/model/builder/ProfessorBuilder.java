package org.springcamp.report1.model.builder;

import org.springcamp.report1.model.Professor;

public class ProfessorBuilder {
    private int prof_idx;
    private String prof_name;
    private String prof_depart;
    private String prof_phoneNum;
    private String prof_subject;

    public ProfessorBuilder setProfIdx(final int prof_idx) {
        this.prof_idx = prof_idx;
        return this;
    }

    public ProfessorBuilder setProfName(final String prof_name) {
        this.prof_name = prof_name;
        return this;
    }

    public ProfessorBuilder setProfDepartment(final String prof_depart) {
        this.prof_depart = prof_depart;
        return this;
    }

    public ProfessorBuilder setProfPhoneNum(final String prof_phoneNum) {
        this.prof_phoneNum = prof_phoneNum;
        return this;
    }

    public ProfessorBuilder setProfSubject(final String prof_subject) {
        this.prof_subject = prof_subject;
        return this;
    }

    public Professor build(){
        return new Professor(this.prof_idx, this.prof_name, this.prof_depart, this.prof_phoneNum, this.prof_subject);
    }
}
