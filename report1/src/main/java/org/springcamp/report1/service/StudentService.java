package org.springcamp.report1.service;

import org.springcamp.report1.model.Student;

public interface StudentService {

    // 학번으로 학생 조회
    Student getByStudentIdx(final int studentIdx);
}
