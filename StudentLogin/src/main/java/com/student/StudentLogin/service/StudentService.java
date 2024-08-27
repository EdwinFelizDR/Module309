package com.student.StudentLogin.service;

import com.student.StudentLogin.dto.StudentDTO;
import com.student.StudentLogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}
