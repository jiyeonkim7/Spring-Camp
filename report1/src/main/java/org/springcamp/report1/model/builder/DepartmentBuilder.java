package org.springcamp.report1.model.builder;

import org.springcamp.report1.model.University;
import org.springcamp.report1.service.UniversityService;

public class DepartmentBuilder implements UniversityService {

    private UniversityBuilder universityBuilder = new UniversityBuilder();

    @Override
    public University getByUnivIdx(final int universityIdx){
        return universityBuilder
                .setUnivIdx(universityIdx)
                .build();
    }
}
