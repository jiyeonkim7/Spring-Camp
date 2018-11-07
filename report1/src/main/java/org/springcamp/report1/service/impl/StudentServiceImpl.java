package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.Student;
import org.springcamp.report1.model.builder.StudentBuilder;
import org.springcamp.report1.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student getByStudentIdx(int studentIdx) {

        Student student = new Student();

        // builder로 객체 생성해서 변환
        return student;
    }
}
