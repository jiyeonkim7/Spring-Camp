package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.University;
import org.springcamp.report1.model.builder.UniversityBuilder;
import org.springcamp.report1.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

    private UniversityBuilder universityBuilder = new UniversityBuilder();

    @Override
    public University getByUnivIdx(final int univ_idx) {

        return universityBuilder
                .setUnivIdx(univ_idx)
                .build();
    }
}
