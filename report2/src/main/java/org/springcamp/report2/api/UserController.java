package org.springcamp.report2.api;

import org.springcamp.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    @GetMapping("/")
    public String currentTime() {

        long time = System.currentTimeMillis();

        SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String str = dayTime.format(new Date(time));

        return str;
    }

/*
    @GetMapping("/users")
    public List<User> getUserList() {

        return userList;
    }
*/

    @GetMapping("/users")
    public List<User> getUserList(
            @RequestParam(value = "name", defaultValue = "") final String name,
            @RequestParam(value = "part", defaultValue = "") final String part) {

        List<User> users = new LinkedList<>();

        // all of users
        if(name == "" && part == ""){
            return userList;
        }
        // by name
        else if(name != ""){
            for(int i=0; i<userList.size(); ++i){
                if(userList.get(i).getName() == name){
                    users.add(userList.get(i));
                }
            }
        }
        // by part
        else if(part != ""){
            for(int i=0; i<userList.size(); ++i){
                if(userList.get(i).getPart() == part){
                    users.add(userList.get(i));
                }
            }
        }

        /*
        if(users.size() == 0){
            return "없습니다.";
        }
        */

        return users;
    }

    @GetMapping("/users/{user_idx}")
    public List<User> getUserByIdx(
            @PathVariable(value = "user_idx") final int user_idx) {

        List<User> users = new LinkedList<>();

        for(int i=0; i<userList.size(); ++i){
            if(userList.get(i).getUserIdx() == user_idx){
                users.add(userList.get(i));
            }
        }

        /*
        if(users.size() == 0){
            return "없습니다.";
        }
        */

        return users;
    }



    @PostMapping("/users")
    public void postUser(@RequestBody final User user) {

        userList.add(user);
    }

    @PutMapping("/users/{user_idx}")
    public String putUser(
            @PathVariable(value = "user_idx") final int user_idx,
            @RequestBody final User user) {

        for(User u : userList){
            if(u.getUserIdx() == user_idx){
                u.setName(user.getName());
                u.setPart(user.getPart());
            }
        }

        return user.getPart();
    }

    @DeleteMapping("/users/{user_idx}")
    public void deleteUser(
            @PathVariable(value = "user_idx") final int user_idx) {

        for(int i=0; i<userList.size(); ++i){
            if(userList.get(i).getUserIdx() == user_idx){
                userList.remove(i);
            }
        }

    }
}
