package com.student.StudentLogin.repository;

import com.student.StudentLogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
    Student findByEmail(String email);
}

