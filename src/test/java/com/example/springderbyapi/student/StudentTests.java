package com.example.springderbyapi.student;

import com.example.springderbyapi.index.Grade;
import com.example.springderbyapi.index.Index;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void addStudentToDatabase(){
        Student testStudent = new Student("Jon","ABC985412367");
        Index index = new Index();
        testStudent.setStudentsIndex(index);
        Grade grade1 = new Grade("Archeology", index, new Double("4.5"));
        Grade grade2 = new Grade("Latin", index, new Double("3.5"));
        studentRepository.save(testStudent);
        List<Student> allStudentsFromDatabase = studentRepository.findAll();
        for(Student student : allStudentsFromDatabase){
            if(student.getName().equals(testStudent.getName()) && student.getStudentNumber().equals(testStudent.getStudentNumber())){
                Assert.assertEquals(testStudent,student);
                System.out.println(student.toString());
            }
        }
    }

}
