package org.springcamp.seminar5.api;

import static org.springcamp.seminar5.model.DefaultRes.FAIL_DEFAULT_RES;
import org.springcamp.seminar5.dto.User;
import org.springcamp.seminar5.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;


    public UserController(final UserService userService) {

        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity getUser(
            @RequestParam("name") final Optional<String> name) {

        try {
            if(name.isPresent()) return new ResponseEntity<>(userService.findByName(name.get()), HttpStatus.OK);
            return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity postUser(
            @RequestBody final User user) {

        try {
            return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{userIdx}")
    public ResponseEntity putUser(
            @PathVariable(value = "userIdx") final int userIdx,
            @RequestBody final User user) {

        try {
            return new ResponseEntity<>(userService.update(userIdx, user), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userIdx}")
    public ResponseEntity deleteUser(
            @PathVariable(value = "userIdx") final int userIdx) {

        try {
            return new ResponseEntity<>(userService.deleteByUserIdx(userIdx), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}