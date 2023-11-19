package com.alibou.demo.domain.subject;

import java.util.List;

public interface SubjectService {

    void save(Subject subject);
    Subject findById(Integer id);
    List<Subject> findAll();
    Subject findByName(String name);
    void deleteById(Integer id);

}
