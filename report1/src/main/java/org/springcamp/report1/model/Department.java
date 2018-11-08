package org.springcamp.report1.model;

public class Department extends University {

    private int dep_idx;
    private String dep_name;
    private String dep_phoneNum;
    private String dep_type;

    public Department(){}

    public Department(final int dep_idx, final String dep_name, final String dep_phoneNum, final String dep_type) {
        super();
        this.dep_idx = dep_idx;
        this.dep_name = dep_name;
        this.dep_phoneNum = dep_phoneNum;
        this.dep_type = dep_type;
    }

    public Department(final int univ_idx, final String univ_name, final String univ_phoneNum, final String univ_addr, final int dep_idx, final String dep_name, final String dep_tele, final String dep_type) {
        super(univ_idx, univ_name, univ_phoneNum, univ_addr);
        this.dep_idx = dep_idx;
        this.dep_name = dep_name;
        this.dep_phoneNum = dep_phoneNum;
        this.dep_type = dep_type;
    }

    public int getDepIdx(){
        return dep_idx;
    }

    public void setDepIdx(final int dep_idx){
        this.dep_idx = dep_idx;
    }

    public String getDepName(){
        return dep_name;
    }

    public void setDepName(final String dep_name){
        this.dep_name = dep_name;
    }

    public String getDepPhoneNum(){
        return dep_name;
    }

    public void setDepPhoneNum(final String dep_phoneNum){
        this.dep_phoneNum = dep_phoneNum;
    }

    public String getDepType() {
        return dep_type;
    }

    public void setDepType(final String dep_type){
        this.dep_type = dep_type;
    }

    @Override
    public String toString() {
        return "Department { " +
                "Department Index =" + dep_idx +
                ", Department Name ='" + dep_name + '\'' +
                ", Department Telephone Number ='" + dep_phoneNum + '\'' +
                ", Department Type ='" + dep_type + '\'' +
                " }";
    }

}
