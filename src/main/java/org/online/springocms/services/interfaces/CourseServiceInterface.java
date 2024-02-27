package org.online.springocms.services.interfaces;

import org.online.springocms.models.Course;

import java.util.List;

public interface CourseServiceInterface {
    List<Course> getAllCourses();
    Course getCourse(int courseId);
}
