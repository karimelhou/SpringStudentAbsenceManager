package ma.fstt.Repo;

import ma.fstt.Persistence.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepo extends JpaRepository<Absence, Long> {
}
