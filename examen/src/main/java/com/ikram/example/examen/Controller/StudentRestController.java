package com.ikram.example.examen.Controller;

import com.ikram.example.examen.Entity.Student;
import com.ikram.example.examen.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentRestController {
    private final StudentService stdService;

    @Autowired
    public StudentRestController(StudentService stdService) {
        this.stdService = stdService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return stdService.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Long studentId) {
        return stdService.getStudentById(studentId);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return stdService.saveStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
        stdService.deleteStudent(studentId);
    }
}
