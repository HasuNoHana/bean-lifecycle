package com.kodilla.reflection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public Map<Integer, String> getStudents(@RequestBody StudentsDTO studentsDTO) throws NoSuchFieldException, IllegalAccessException {
        return this.studentService.getStudents(studentsDTO.getNumberOfStudents(), studentsDTO.getIndexLength());
    }
}
