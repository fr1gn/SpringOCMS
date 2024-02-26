package org.online.springocms.services;
import org.online.springocms.models.Enrollment;
import java.util.List;
import org.online.springocms.services.interfaces.EnrollServiceInterface;
import org.online.springocms.repositories.EnrollmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class EnrollmentService implements EnrollServiceInterface {

    private final EnrollmentRepositoryInterface repo;

    public EnrollmentService(EnrollmentRepositoryInterface repo) {
        this.repo = repo;
    }

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    public void enrollUserInCourse(int userId, int courseId) {
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

        try {
            repo.enrollbyid(userId, courseId);
            transactionManager.commit(status);
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return repo.findAll();
    }
}
