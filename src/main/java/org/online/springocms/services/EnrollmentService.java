package org.online.springocms.services;

import org.online.springocms.models.Enrollment;
import java.util.List;
import org.online.springocms.services.interfaces.EnrollServiceInterface;
import org.online.springocms.repositories.EnrollmentRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService implements EnrollServiceInterface {

    private final EnrollmentRepositoryInterface repo;

    public EnrollmentService(EnrollmentRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public void enrollUserInCourse(int userId, int courseId) {

    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return repo.findAll();
    }
}
