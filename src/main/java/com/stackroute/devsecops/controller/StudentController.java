package com.stackroute.devsecops.controller;

import com.stackroute.devsecops.model.Student;
import com.stackroute.devsecops.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    StudentService studentService;
    ResponseEntity responseEntity;

    @PostMapping("/register")
    public ResponseEntity<?> registerStudent(@RequestBody Student student){
       return new ResponseEntity<>(studentService.register(student), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        List<Student> list=studentService.getAllStudent();
        return list;
    }
    @GetMapping("/get")
    public String get(){
        return "HII";
    }

}
