package com.ikram.example.examen.Service;
import com.ikram.example.examen.Entity.Student;
import com.ikram.example.examen.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository stdRepository;

    @Autowired
    public StudentService(StudentRepository stdRepository) {
        this.stdRepository = stdRepository;
    }

    public List<Student> getAllStudents() {
        return stdRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        return stdRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));
    }

    public Student saveStudent(Student student) {
        return stdRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        stdRepository.deleteById(studentId);
    }
}