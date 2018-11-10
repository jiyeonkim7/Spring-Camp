package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.Student;
import org.springcamp.report1.model.builder.StudentBuilder;
import org.springcamp.report1.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentBuilder studentBuilder = new StudentBuilder();

    @Override
    public Student getByStdIdx(int student_idx) {

        return studentBuilder
                .setStdIdx(student_idx)
                .build();
    }
}
