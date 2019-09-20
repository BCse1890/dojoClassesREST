package com.bobcurrie.dojo.dojoClasses.controller;

import com.bobcurrie.dojo.dojoClasses.model.Student;
import com.bobcurrie.dojo.dojoClasses.repository.StudentRepository;
import com.bobcurrie.dojo.dojoClasses.service.StudentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Getter
@Setter

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createStudent";
    }

    @RequestMapping("/savestudent")
    public String saveStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
        Student studentSaved = studentService.saveStudent(student);
        String msg = "Student saved with id: " + studentSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "displayStudents";
    }

    @RequestMapping("/displayStudents")
    public String displayStudents(ModelMap modelMap) {
        List<Student> students = studentService.getAllStudents();
        modelMap.addAttribute("students", students);
        return "displayStudents";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id") int id, ModelMap modelMap) {
        Student student = new Student();
        student.setId(id);
        studentService.deleteStudent(student);
        List<Student> students = studentService.getAllStudents();
        modelMap.addAttribute("students", students);
        return "displayStudents";
    }

    @RequestMapping("/showUpdate")
    public String updateStudent(@RequestParam("id") int id, ModelMap modelMap) {
        Student student = studentService.getStudentById(id);
        modelMap.addAttribute("student", student);
        return "updateStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
        studentService.updateStudent(student);
        List<Student> students = studentService.getAllStudents();
        modelMap.addAttribute("students", students);
        return "displayStudents";
    }


}
