package org.springcamp.report2.service;

import org.springcamp.report2.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String getCurrentTime();

    List<String> getUserList(final Optional<String> name, final Optional<String> part, List<User> userList);

    List<String> getUserByIdx(final int user_idx, List<User> userList);


    /*
    User getByUserIdx(final int user_idx, List<User> userList);

    User getByName(final String name, List<User> userList);

    User getByPart(final String part, List<User> userList);
    */
}
