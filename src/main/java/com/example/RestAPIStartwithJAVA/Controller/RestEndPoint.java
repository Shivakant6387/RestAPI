package com.example.RestAPIStartwithJAVA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class RestEndPoint {

    @Value("${default.course.name}")
    private String cName;
    @Value("${default.course.chapterCount}")
    private int chaptersCount;
    @Value("${course.chapterCount}")
    private int getChaptersCount;
    @Autowired
    private CourseConfiguration courseConfiguration;

    @RequestMapping("/defaultCourse")
    public Course getDefaultCourse(@RequestParam (value = "name",defaultValue = " Spring Boot",required = false)String name,
                              @RequestParam (value = "chepterCount",defaultValue = " 2",required = false)int cheptersCount
    ){
        return new Course(cName,cheptersCount);
    }
    @RequestMapping("/gethierarchical")
    public HashMap<String,Object> getConfigurationAnnotationProperties(){
        HashMap<String,Object>resMap=new HashMap<String,Object>();
        resMap.put("name",courseConfiguration.getName());
        resMap.put("chaptersCount",courseConfiguration.getChapterCount());
        resMap.put("rating",courseConfiguration.getRating());
        resMap.put("author",courseConfiguration.getAuthor());
        return resMap;
    }
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
