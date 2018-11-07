package org.springcamp.seminar3.api.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestGetterSetter {

    private int userIdx;
    private String name;
    private String email;

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
