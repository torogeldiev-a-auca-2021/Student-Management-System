package com.example.socialnetowk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.socialnetowk.entity.Student;
public interface StudentRepository extends JpaRepository<Student , Long> {
}
