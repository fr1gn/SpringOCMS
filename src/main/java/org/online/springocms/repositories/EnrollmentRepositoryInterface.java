package org.online.springocms.repositories;

import org.online.springocms.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepositoryInterface extends JpaRepository<Enrollment, Integer> {
}
