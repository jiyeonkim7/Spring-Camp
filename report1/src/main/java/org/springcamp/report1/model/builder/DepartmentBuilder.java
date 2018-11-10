package org.springcamp.report1.model.builder;

import org.springcamp.report1.model.Department;

public class DepartmentBuilder {

    private int dep_idx;
    private String dep_name;
    private String dep_phoneNum;
    private String dep_type;

    public DepartmentBuilder setDepIdx(final int dep_idx){
        this.dep_idx = dep_idx;
        return this;
    }

    public DepartmentBuilder setDepName(final String dep_name){
        this.dep_name = dep_name;
        return this;
    }

    public DepartmentBuilder setDepPhoneNum(final String dep_phoneNum){
        this.dep_phoneNum = dep_phoneNum;
        return this;
    }

    public DepartmentBuilder setDepType(final String dep_type){
        this.dep_type = dep_type;
        return this;
    }

    public Department build(){
        return new Department(this.dep_idx, this.dep_name, this.dep_phoneNum, this.dep_type);
    }
}
