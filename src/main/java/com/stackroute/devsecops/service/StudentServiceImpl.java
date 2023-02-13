package com.stackroute.devsecops.service;


import com.stackroute.devsecops.model.Student;
import com.stackroute.devsecops.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;


    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList=studentRepo.findAll();
        return studentList;
    }

    @Override
    public Student register(Student student) {
        studentRepo.save(student);
        return student;
    }


}
