package org.online.springocms.controllers;
import org.online.springocms.models.Enrollment;
import org.online.springocms.services.interfaces.EnrollServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    private final EnrollServiceInterface service;

    public EnrollmentController(EnrollServiceInterface service) {
        this.service = service;
    }

    @RequestMapping(value = "/enroll/{user_id}/{course_id}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> enrollUserInCourse(@PathVariable("user_id") int userId,
                                                     @PathVariable("course_id") int courseId) {
        service.enrollUserInCourse(userId, courseId);
        return new ResponseEntity<>("User successfully enrolled in the course", HttpStatus.OK);
    }


    @GetMapping("/getAll")
    public List<Enrollment> getAllEnrollments(){
        return service.getAllEnrollments();
    }
}

