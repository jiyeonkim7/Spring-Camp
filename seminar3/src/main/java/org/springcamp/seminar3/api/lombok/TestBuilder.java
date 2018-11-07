package org.springcamp.seminar3.api.lombok;

import lombok.Builder;

@Builder
public class TestBuilder {
    private int userIdx;
    private String name;
    private String email;
}
