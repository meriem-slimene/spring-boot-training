package com.alibou.demo.domain.subject;

import java.util.List;

public interface SubjectService {

    void save(SubjectRequest subject);
    SubjectResponse findById(Integer id);
    List<SubjectResponse> findAll();
    SubjectResponse findByName(String name);
    void deleteById(Integer id);

}
