package org.online.springocms.services;

import org.online.springocms.models.Course;
import org.online.springocms.repositories.CourseRepositoryInterface;
import org.online.springocms.services.interfaces.CourseServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseService implements CourseServiceInterface {
    private final CourseRepositoryInterface repo;
    public CourseService(CourseRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    @Override
    public Course getCourse(int courseId) {
        return repo.findById(courseId).orElse(null);
    }

    @Override
    public Course create(Course course) {
        return repo.save(course);
    }

    @Override
    public List<Course> getByCourseName(String courseName) {
        return repo.findByCourseName(courseName);
    }


}
