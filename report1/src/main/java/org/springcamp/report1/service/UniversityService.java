package org.springcamp.report1.service;

import org.springcamp.report1.model.University;

public interface UniversityService {

    // 학번으로 학생 조회
    public University getByUnivIdx(final int universityIdx);
}
