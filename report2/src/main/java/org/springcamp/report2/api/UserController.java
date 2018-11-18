package org.springcamp.report2.api;

import org.springcamp.report2.model.User;
import org.springcamp.report2.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();
    UserServiceImpl userService = new UserServiceImpl();


    @GetMapping("/")
    public String getCurrentTime() {

        return userService.getCurrentTime();
    }

    // SELECT
    @GetMapping("/users")
    public List<String> getUserList(
            @RequestParam(value = "name") final Optional<String> name,
            @RequestParam(value = "part") final Optional<String> part) {

        return userService.getUserList(name, part, userList);

    }

    @GetMapping("/users/{user_idx}")
    public List<String> getUserByIdx(
            @PathVariable(value = "user_idx") final int user_idx) {

        return userService.getUserByIdx(user_idx, userList);
    }



    // INSERT
    @PostMapping("/users")
    public String postUser(@RequestBody final User user) {

        userList.add(user);

        return "Insert Success :: " + user.toString();
    }

    // UPDATE
    @PutMapping("/users/{user_idx}")
    public String putUser(
            @PathVariable(value = "user_idx") final int user_idx,
            @RequestBody final User user) {

        String result = "Update Error";

        for(User u : userList){
            if(u.getUserIdx() == user_idx){
                u.setName(user.getName());
                u.setPart(user.getPart());
                result = "Update Success :: " + u.toString();
                break;
            }
        }

        return result;
    }

    // DELETE
    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(
            @PathVariable(value = "user_idx") final int user_idx) {

        String result = "Delete Error";

        for(User u : userList){
            if(u.getUserIdx() == user_idx){
                userList.remove(u);
                result = "Delete Success :: " + u.toString();
                break;
            }
        }

        return result;
    }
}
