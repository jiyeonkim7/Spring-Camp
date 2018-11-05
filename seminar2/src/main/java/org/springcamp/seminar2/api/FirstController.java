package org.springcamp.seminar2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/name/{name}")
    public String name(@PathVariable(value = "name") final String name){
        return name;
    }

    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue= "") final String part){
        return part;
    }

    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name") final String name,
            @RequestParam(value = "type", defaultValue= "yb") final String type){
        return name + "이고 " + type + "입니다.";
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num){
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

}
