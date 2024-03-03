package org.online.springocms.repositories;

import org.online.springocms.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnrollmentRepositoryInterface extends JpaRepository<Enrollment, Integer> {

    @Modifying
    @Query("UPDATE Enrollment e SET e.courseId = :courseId WHERE e.userId = :userId")
    void enrollById(@Param("userId") int userId, @Param("courseId") int courseId);

    List<Enrollment> getEnrollmentsByUserId(int userId);

}
