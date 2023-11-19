package com.alibou.demo.domain.subject.impl;

import com.alibou.demo.domain.subject.Subject;
import com.alibou.demo.domain.subject.SubjectRepository;
import com.alibou.demo.domain.subject.SubjectService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository subjectRepository;

  public SubjectServiceImpl(SubjectRepository studentRepository) {
    this.subjectRepository = studentRepository;
  }

  @Override
  public void save(Subject subject) {
    this.subjectRepository.save(subject);
  }

  @Override
  public Subject findById(Integer id) {
    return this.subjectRepository.findById(id)
        .orElse(null);
  }

  @Override
  public List<Subject> findAll() {
    return this.subjectRepository.findAll();
  }

    @Override
    public Subject findByName(String name) {
        return subjectRepository.findByName(name);
    }

    @Override
  public void deleteById(Integer id) {
    this.subjectRepository.deleteById(id);
  }
}
