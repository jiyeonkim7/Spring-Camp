package org.springcamp.report1.model;

public class University {
    private int univ_idx;
    private String univ_name;
    private String univ_phoneNum;
    private String univ_addr;

    public University(final int univ_idx, final String univ_name, final String univ_phoneNum, final String univ_addr) {
        this.univ_idx = univ_idx;
        this.univ_name = univ_name;
        this.univ_phoneNum = univ_phoneNum;
        this.univ_addr = univ_addr;
    }

    public University() {}

    public int getUnivIdx() {
        return univ_idx;
    }

    public void setUnivIdx(final int univ_idx) {
        this.univ_idx = univ_idx;
    }

    public String getUnivName() {
        return univ_name;
    }

    public void setUnivName(final String univ_name) {
        this.univ_name = univ_name;
    }

    public String getUnivPhoneNum() {
        return univ_phoneNum;
    }

    public void setUnivPhoneNum(final String univ_phoneNum) {
        this.univ_phoneNum = univ_phoneNum;
    }

    public String getUnivAddress() {
        return univ_addr;
    }

    public void setUnivAddress(final String univ_addr) {
        this.univ_addr = univ_addr;
    }

    @Override
    public String toString() {
        return "University {" +
                " University Index = " + univ_idx +
                ", University Name = '" + univ_name + '\'' +
                ", University Phone Number = '" + univ_phoneNum + '\'' +
                ", University Address = '" + univ_addr + '\'' +
                " }";
    }
}
