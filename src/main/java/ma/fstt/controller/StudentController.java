package ma.fstt.controller;

import ma.fstt.Persistence.Student;
import ma.fstt.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentService.save(student);
        return "redirect:/student/all";
    }

    @GetMapping("/all")
    public String all(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "listStudents";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        studentService.delete(id);
        return "redirect:/student/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable Long id) {
        Student student = studentService.getOne(id);
        model.addAttribute("student", student);
        return "addStudent";
    }
}