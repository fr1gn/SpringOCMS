package org.online.springocms.repositories;

import org.online.springocms.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseRepositoryInterface extends JpaRepository<Course, Integer> {
    List<Course> findByCourseName(String courseName);
}
