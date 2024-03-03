package org.online.springocms.services.interfaces;

import org.online.springocms.models.Enrollment;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface EnrollServiceInterface {
    // Default operations for enrollment
    void enrollUserInCourse(int userId, int courseId);
    List<Enrollment> getAllEnrollments();
    List<Enrollment> getEnrollmentsByUserId( int userId);
}
