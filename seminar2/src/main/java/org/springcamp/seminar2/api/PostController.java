package org.springcamp.seminar2.api;

import org.springcamp.seminar2.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("post")
public class PostController {

    @PostMapping("")
    public String postUser(@RequestBody final User user) {
        return user.getName();
    }
}
