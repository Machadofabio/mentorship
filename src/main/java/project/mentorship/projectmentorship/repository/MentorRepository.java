package project.mentorship.projectmentorship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.mentorship.projectmentorship.domain.Mentor;

import java.util.List;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

    List<Mentor> findAll();

}
