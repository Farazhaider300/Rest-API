package com.example.StudentsDetails.DaoRepository;

import com.example.StudentsDetails.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Courses, Long> {
}
