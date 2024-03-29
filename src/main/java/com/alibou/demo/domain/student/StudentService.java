package com.alibou.demo.domain.student;

import java.util.List;

public interface StudentService {

    void save(StudentRequest s);
    StudentResponse findById(Integer id);
    List<StudentResponse> findAll();
    void deleteById(Integer id);
}
