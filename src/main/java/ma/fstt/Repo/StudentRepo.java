package ma.fstt.Repo;

import ma.fstt.Persistence.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
