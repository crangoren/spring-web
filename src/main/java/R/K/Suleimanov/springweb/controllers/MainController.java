package R.K.Suleimanov.springweb.controllers;

import R.K.Suleimanov.springweb.model.Student;
import R.K.Suleimanov.springweb.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private StudentRepository studentRepository;

    public MainController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/add")
    @ResponseBody
    public int add(@RequestParam int a, @RequestParam int b){
        return a+b;
    }


    @GetMapping("/students")
    public String showStudentsPage(Model model) {
        model.addAttribute("students", studentRepository.getAllStudents());
        return "students_page";
    }

    @GetMapping("/students/{id}")
    public String showStudentInfo(Model model, @PathVariable Long id) {
        Student student = studentRepository.findById(id);
        model.addAttribute("student", student);
        return "student_info_page";
    }
}
