package com.ikram.example.examen.Controller;

import com.ikram.example.examen.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.ikram.example.examen.Service.StudentService;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class StudentGraphController {
    private final StudentService stdService;

    @Autowired
    public StudentGraphController(StudentService stdService) {
        this.stdService = stdService;
    }

    @GetMapping("/students")
    public String showStudents(Model model) {
        List<Student> students = stdService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }
}

