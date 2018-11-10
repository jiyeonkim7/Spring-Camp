package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.Department;
import org.springcamp.report1.model.builder.DepartmentBuilder;
import org.springcamp.report1.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentBuilder departmentBuilder = new DepartmentBuilder();

    @Override
    public Department getByDepIdx(final int dep_idx) {
        
        return departmentBuilder
                .setDepIdx(dep_idx)
                .build();
    }
}
