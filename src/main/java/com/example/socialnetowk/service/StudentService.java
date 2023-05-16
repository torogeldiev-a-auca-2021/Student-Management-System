package com.example.socialnetowk.service;
import com.example.socialnetowk.entity.Student;

import java.util.List;
public interface StudentService {
    List <Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);

    Student getStudentId(Long id);

    void deleteStudent(Long id);
}
