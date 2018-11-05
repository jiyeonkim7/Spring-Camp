package org.springcamp.seminar2.api;

import org.springcamp.seminar2.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("delete")
public class DeleteController {

    @DeleteMapping("")
    public String deleteUser(@RequestBody final User user){

        return "delete success";
    }

}
