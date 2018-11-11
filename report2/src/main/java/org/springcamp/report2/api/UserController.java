package org.springcamp.report2.api;

import org.springcamp.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    @GetMapping("/")
    public String currentTime() {
        return "Hello world!";
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        return userList;
    }

    @GetMapping("/users")
    public List<User> getUser(
            @RequestParam(value = "name", defaultValue = "") final String name,
            @RequestParam(value = "part", defaultValue = "") final String part) {


        return userList;
    }

    @GetMapping("/users/{user_idx}")
    public List<User> getUserByIdx(
            @PathVariable(value = "user_idx") final String user_idx) {


        return userList;
    }



    @PostMapping("/users")
    public void postUser(@RequestBody final User user) {

        userList.add(user);
    }

    @PutMapping("/users/{user_idx}")
    public String putUser(@RequestBody final User user) {
        return user.getPart();
    }

    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@RequestBody final User user) {

        return "delete success";
    }
}
