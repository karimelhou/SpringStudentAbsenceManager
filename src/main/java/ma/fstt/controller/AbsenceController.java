package ma.fstt.controller;

import ma.fstt.Persistence.Absence;
import ma.fstt.Persistence.Student;
import ma.fstt.services.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ma.fstt.services.StudentService;

import java.util.List;

@Controller
@RequestMapping("/absence")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public String add(Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        model.addAttribute("absence", new Absence());
        return "addAbsence";
    }

    @PostMapping("/save")
    public String save(@RequestParam("studentId") Long studentId, @ModelAttribute Absence absence){
        Student student = studentService.getOne(studentId);
        absence.setStudent(student);
        absenceService.save(absence);
        return "redirect:/absence/all";
    }


    @GetMapping("/all")
    public String all(Model model) {
        List<Absence> absences = absenceService.getAll();
        model.addAttribute("absences", absences);
        return "listAbsences";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        absenceService.delete(id);
        return "redirect:/absence/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable Long id) {
        Absence absence = absenceService.getOne(id);
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        model.addAttribute("absence", absence);
        return "addAbsence";
    }

}
