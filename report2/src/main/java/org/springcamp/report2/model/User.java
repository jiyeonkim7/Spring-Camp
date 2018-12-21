package org.springcamp.report2.model;

public class User {

    private int user_idx;
    private String name;
    private String part;
    private static int count = 10;

    public User(final String name, final String part) {
        this.user_idx = ++count;
        this.name = name;
        this.part = part;
    }

    public int getUserIdx() {
        return this.user_idx;
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

    @Override
    public String toString() {
        return "User Index = " + user_idx +
                ", Name = '" + name + "'" +
                ", Part = '" + part + "'";
    }
}
