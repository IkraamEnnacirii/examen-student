package com.ikram.example.examen.Repository;

import com.ikram.example.examen.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
