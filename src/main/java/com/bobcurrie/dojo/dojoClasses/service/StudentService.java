package com.bobcurrie.dojo.dojoClasses.service;

import com.bobcurrie.dojo.dojoClasses.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
}
