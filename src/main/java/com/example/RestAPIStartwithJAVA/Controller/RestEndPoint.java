package com.example.RestAPIStartwithJAVA.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestEndPoint {
    @RequestMapping("/course")
    public Course getEndPoint(@RequestParam (value = "name",defaultValue = " Spring Boot",required = false)String name,
                              @RequestParam (value = "chepterCount",defaultValue = " 2",required = false)int chepterCount
    ){
    return new Course(name,chepterCount);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/register/course")
    public String saveCourse(@RequestBody Course course){
        return "Your course named"+course.getName()+"with"+course.getChepterCount()+"chepter saved successfully";
    }
}
