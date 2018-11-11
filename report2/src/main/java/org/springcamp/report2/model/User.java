package org.springcamp.report2.model;

public class User {

    private int user_idx;
    private String name;
    private String part;


    public User() {
    }

    public User(final String name, final String part) {
        this.name = name;
        this.part = part;
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

    public void setPart(String name) {
        this.part = part;
    }
}
