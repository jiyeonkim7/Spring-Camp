package org.springcamp.report2.service.impl;

import org.springcamp.report2.model.User;
import org.springcamp.report2.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public User getByUserIdx(final int user_idx){

        User user = new User();

        return user;
    }

    @Override
    public User getByName(final String name){

        User user = new User();

        return user;
    }

    @Override
    public User getByPart(final String part){

        User user = new User();

        return user;
    }




    @Override
    public String getCurrentTime(){
        return new Date().toString();
    }

    @Override
    public List<String> getUserList(final Optional<String> name, final Optional<String> part, List<User> userList){

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

    @Override
    public List<String> getUserByIdx(final int user_idx){

    }

    @Override
    public User getByUserIdx(final int user_idx){

    }

    @Override
    public User getByName(final String name){

    }

    @Override
    public User getByPart(final String part){

    }
}
