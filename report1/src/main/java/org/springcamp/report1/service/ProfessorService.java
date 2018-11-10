package org.springcamp.report1.service;

import org.springcamp.report1.model.Professor;

public interface ProfessorService {

    Professor getByProfIdx(final int prof_idx);
}
