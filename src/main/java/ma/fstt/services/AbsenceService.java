package ma.fstt.services;
import ma.fstt.Persistence.Absence;
import java.util.List;

public interface AbsenceService {
    void save(Absence absence);
    void update(Absence absence);
    void delete(Long id);
    Absence getOne(Long id);
    List<Absence> getAll();
}