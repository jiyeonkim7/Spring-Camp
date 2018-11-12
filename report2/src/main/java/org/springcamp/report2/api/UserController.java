package org.springcamp.report2.api;

import org.springcamp.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    // SELECT
    @GetMapping("/")
    public String getCurrentTime() {

        return new Date().toString();
    }

    @GetMapping("/users")
    public List<String> getUserList(
            @RequestParam(value = "name") final Optional<String> name,
            @RequestParam(value = "part") final Optional<String> part) {

        List<String> users = new LinkedList<>();

        // by name
        if(name.isPresent()){
            for(User u : userList){
                if(u.getName().equals(name.get())){
                    users.add(u.toString());
                }
            }
        }
        // by part
        else if(part.isPresent()){

            for(User u : userList){
                if(u.getPart().equals(part.get())){
                    users.add(u.toString());
                }
            }
        }
        // all of users
        else {
            for(User u : userList){
                users.add(u.toString());
            }
        }

        if(users.size() == 0) {
            users.add("없습니다.");
        }

        return users;
    }

    @GetMapping("/users/{user_idx}")
    public List<String> getUserByIdx(
            @PathVariable(value = "user_idx") final int user_idx) {

        List<String> users = new LinkedList<>();

        for(User u : userList) {
            if (u.getUserIdx() == user_idx) {
                users.add(u.toString());
                break;
            }
        }

        if(users.size() == 0) {
            users.add("없습니다.");
        }

        return users;
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
