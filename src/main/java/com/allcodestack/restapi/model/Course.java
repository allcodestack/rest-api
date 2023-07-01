package com.allcodestack.restapi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Course
{

    private String courseID;

    private String courseName;

    private String courseDesc;

    public Course(String courseID, String courseName, String courseDesc)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }



}
