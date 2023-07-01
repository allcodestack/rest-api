package com.allcodestack.restapi.controller;

import com.allcodestack.restapi.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {


    @GetMapping("courses")
    public List<Course> getAllCourses()
    {

        Course zeroCodeCourse = new Course("CR1", "ZeroCode", "ZeroCode description");
        Course restAssuredCourse = new Course("CR1", "ZeroCode", "ZeroCode description");

        return List.of( zeroCodeCourse, restAssuredCourse );

    }


}
