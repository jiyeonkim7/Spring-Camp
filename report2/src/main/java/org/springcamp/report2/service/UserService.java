package org.springcamp.report2.service;

import org.springcamp.report2.model.User;

public interface UserService {

    User getByUserIdx(final int user_idx);

    User getByName(final String name);

    User getByPart(final String part);
}
