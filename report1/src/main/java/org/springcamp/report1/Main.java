package org.springcamp.report1;

import org.springcamp.report1.model.Student;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        // 제너릭 사용해서 학생 타입 ArrayList 생성
        final ArrayList<Student> studentList = new ArrayList<>();

        // 3개의 학생 객체 생성
        final Student std1 = new Student();
        final Student std2 = new Student();
        final Student std3 = new Student();

        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        // ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}
