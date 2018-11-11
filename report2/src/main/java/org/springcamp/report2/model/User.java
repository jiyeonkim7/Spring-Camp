package org.springcamp.report2.model;

public class User {

    private int user_idx;
    private String name;
    private String part;


    public User() {
    }

    public User(final int user_idx, final String name, final String part) {
        this.user_idx = user_idx;
        this.name = name;
        this.part = part;
    }

    public int getUserIdx() {
        return this.user_idx;
    }

    public void setUserIdx(int user_idx) {
        this.user_idx = user_idx;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
