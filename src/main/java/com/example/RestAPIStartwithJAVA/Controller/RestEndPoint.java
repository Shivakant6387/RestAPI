package com.example.RestAPIStartwithJAVA.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoint {
    @RequestMapping("/course")
    public Course getEndPoint(@RequestParam (value = "name",defaultValue = " Spring Boot",required = false)String name,
                              @RequestParam (value = "chepterCount",defaultValue = " 2",required = false)int chepterCount
    ){
    return new Course(name,chepterCount);
    }
}
