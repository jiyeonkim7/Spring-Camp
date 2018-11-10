package org.springcamp.report1.model.builder;

import org.springcamp.report1.model.University;

public class UniversityBuilder {
    private int univ_idx;
    private String univ_name;
    private String univ_phoneNum;
    private String univ_addr;

    public UniversityBuilder setUnivIdx(final int univ_idx) {
        this.univ_idx = univ_idx;
        return this;
    }

    public UniversityBuilder setUnivName(final String univ_name) {
        this.univ_name = univ_name;
        return this;
    }

    public UniversityBuilder setUnivPhoneNum(final String univ_phoneNum) {
        this.univ_phoneNum = univ_phoneNum;
        return this;
    }

    public UniversityBuilder setUnivAddress(final String univ_addr) {
        this.univ_addr = univ_addr;
        return this;
    }

    public University build(){
        return new University(this.univ_idx, this.univ_name, this.univ_phoneNum, this.univ_addr);
    }

}
