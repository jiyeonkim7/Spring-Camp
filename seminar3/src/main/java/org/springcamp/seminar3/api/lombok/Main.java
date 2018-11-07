package org.springcamp.seminar3.api.lombok;

public class Main {

    public static void main(String... args){

        TestAllArgsConstructor testAllArgsConstructor
                = new TestAllArgsConstructor(1, "김지연", "jiyean9629@gmail.com");

    TestBuilder.TestBuilderBuilder builder = new TestBuilder.TestBuilderBuilder();

    TestBuilder.builder()
            .userIdx(1)
            .name("김지연")
            .email("jiyean9629@gmail.com")
            .build();



    }
}
