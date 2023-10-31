package ma.fstt.services;

import ma.fstt.Persistence.Student;
import ma.fstt.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student getOne(Long id) {
        return studentRepo.findById(id).orElse(null);
    }


    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }
}