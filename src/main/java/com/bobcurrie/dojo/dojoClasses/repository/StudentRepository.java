package com.bobcurrie.dojo.dojoClasses.repository;

import com.bobcurrie.dojo.dojoClasses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
