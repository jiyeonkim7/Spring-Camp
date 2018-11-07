package org.springcamp.seminar3.api.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestNonNull {

    private int userIdx;
    @NonNull
    private String name;
    private final String email;

}
