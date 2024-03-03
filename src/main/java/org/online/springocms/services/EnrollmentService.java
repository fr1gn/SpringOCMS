package org.online.springocms.services;
import org.online.springocms.models.Enrollment;
import java.util.List;
import org.online.springocms.services.interfaces.EnrollServiceInterface;
import org.online.springocms.repositories.EnrollmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnrollmentService implements EnrollServiceInterface {

    private final EnrollmentRepositoryInterface repo;

    public EnrollmentService(EnrollmentRepositoryInterface repo) {
        this.repo = repo;
    }


    @Transactional
    @Override
    public void enrollUserInCourse(int userId, int courseId) {
        repo.enrollById(userId, courseId);
    }


    @Override
    public List<Enrollment> getAllEnrollments() {
        return repo.findAll();
    }

    @Override
    public List<Enrollment> getEnrollmentsByUserId(int userId) {
        return repo.getEnrollmentsByUserId(userId);
    }
}
