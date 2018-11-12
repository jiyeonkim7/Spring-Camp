package org.springcamp.report2.api;

import org.springcamp.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/users")
    public List<String> getUserListByNameAndPart(
            @RequestParam(value = "name") final Optional<String> name,
            @RequestParam(value = "part") final Optional<String> part) {

        System.out.println(name);
        System.out.println(part);

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
    public String postUser(@RequestBody final User user) {

        userList.add(user);

        return "Insert Success :: " + user.toString();
    }

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
