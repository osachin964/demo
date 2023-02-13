package com.stackroute.devsecops.service;

import com.stackroute.devsecops.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student register(Student student);
}
