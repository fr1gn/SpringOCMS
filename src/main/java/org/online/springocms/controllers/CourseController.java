package org.online.springocms.controllers;

import org.online.springocms.services.interfaces.CourseServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CourseController {
    private final CourseServiceInterface service;

    public CourseController(CourseServiceInterface service) {
        this.service = service;
    }

    @RestController
    @RequestMapping("courses")
    public class EnrollmentController {
        @GetMapping("name")
        public String listOfCourses(){
            return "Java" +
                    "\nC++" +
                    "\nC#";
        }
    }
}
