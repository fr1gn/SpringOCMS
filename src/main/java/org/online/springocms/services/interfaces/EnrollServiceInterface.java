package org.online.springocms.services.interfaces;

import org.online.springocms.models.Enrollment;

import java.util.List;
public interface EnrollServiceInterface {
    // Default operations for enrollment
    void enrollUserInCourse(int userId, int courseId);
    List<Enrollment> getAllEnrollments();
}
