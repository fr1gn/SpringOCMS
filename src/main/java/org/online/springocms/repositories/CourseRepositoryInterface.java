package org.online.springocms.repositories;

import org.online.springocms.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositoryInterface extends JpaRepository<Course, Integer> {
}
