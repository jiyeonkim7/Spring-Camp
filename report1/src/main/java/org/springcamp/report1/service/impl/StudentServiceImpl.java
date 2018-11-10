package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.Student;
import org.springcamp.report1.model.builder.StudentBuilder;
import org.springcamp.report1.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentBuilder studentBuilder = new StudentBuilder();

    @Override
    public Student getByStudentIdx(int studentIdx) {

        return studentBuilder
                .setStdIdx(studentIdx)
                .build();
    }
}
