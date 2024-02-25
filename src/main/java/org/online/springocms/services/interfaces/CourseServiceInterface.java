package org.online.springocms.services.interfaces;

import org.online.springocms.models.Course;

import java.util.List;

public interface CourseServiceInterface {
    List<Course> getAll();
    Course getById(int id);
    Course create (Course course);

}
