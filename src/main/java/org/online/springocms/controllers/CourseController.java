package org.online.springocms.controllers;

import org.online.springocms.models.Course;
import org.online.springocms.services.interfaces.CourseServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")

public class CourseController {

    private final CourseServiceInterface service;

    public CourseController(CourseServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }
    @GetMapping("/{course_id}")
    public ResponseEntity<Course> getCourse(@PathVariable("course_id") int courseId){
        Course course = service.getCourse(courseId);
        if(course == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Course> create(@RequestBody Course course){
        Course createdCourse = service.create(course);
        if(createdCourse == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

}
