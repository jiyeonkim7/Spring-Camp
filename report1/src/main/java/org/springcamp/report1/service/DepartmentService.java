package org.springcamp.report1.service;

import org.springcamp.report1.model.Department;

public interface DepartmentService {

    Department getByDepIdx(final int dep_idx);
}
