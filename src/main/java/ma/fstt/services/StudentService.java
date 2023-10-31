package ma.fstt.services;
import ma.fstt.Persistence.Student;
import java.util.List;

public interface StudentService {
    void save(Student student);
    void update(Student student);
    void delete(Long id);
    Student getOne(Long id);

    List<Student> getAll();

}
