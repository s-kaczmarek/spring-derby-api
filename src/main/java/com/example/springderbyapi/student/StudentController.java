package com.example.springderbyapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable Long id) throws Exception {
        Optional<Student> studentById = studentRepository.findById(id);

        if (!studentById.isPresent())
            throw new Exception("id-" + id);

        return studentById.get();
    }

    @PostMapping("/students")
    public void addStudentFromJSONBody(@RequestBody Student student){
        studentRepository.save(student);
    }

}
