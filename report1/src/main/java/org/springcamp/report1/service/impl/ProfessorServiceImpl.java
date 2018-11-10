package org.springcamp.report1.service.impl;

import org.springcamp.report1.model.Professor;
import org.springcamp.report1.model.builder.ProfessorBuilder;
import org.springcamp.report1.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

    private ProfessorBuilder professorBuilder = new ProfessorBuilder();

    @Override
    public Professor getByProfIdx(final int prof_idx) {

        return professorBuilder
                .setProfIdx(prof_idx)
                .build();
    }
}
