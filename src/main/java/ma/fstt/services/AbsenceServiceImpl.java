package ma.fstt.services;

import ma.fstt.Persistence.Absence;
import ma.fstt.Repo.AbsenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    @Autowired
    private AbsenceRepo absenceRepo;

    @Override
    public void save(Absence absence) {
        absenceRepo.save(absence);
    }

    @Override
    public void update(Absence absence) {
        absenceRepo.save(absence);
    }

    @Override
    public void delete(Long id) {
        absenceRepo.deleteById(id);
    }

    @Override
    public Absence getOne(Long id) {
        return absenceRepo.findById(id).orElse(null);
    }

    @Override
    public List<Absence> getAll() {
        return absenceRepo.findAll();
    }
}