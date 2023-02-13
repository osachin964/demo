package com.stackroute.devsecops.repository;

import com.stackroute.devsecops.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,Integer> {
}
