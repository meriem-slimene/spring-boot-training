package com.alibou.demo.domain.subject.impl;

import com.alibou.demo.domain.subject.Subject;
import com.alibou.demo.domain.subject.SubjectMapper;
import com.alibou.demo.domain.subject.SubjectRepository;
import com.alibou.demo.domain.subject.SubjectRequest;
import com.alibou.demo.domain.subject.SubjectResponse;
import com.alibou.demo.domain.subject.SubjectService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository subjectRepository;
  private final SubjectMapper subjectMapper;

  @Override
  public void save(SubjectRequest subject) {

    this.subjectRepository.save(subjectMapper.toSubject(subject));
  }

  @Override
  public SubjectResponse findById(Integer id) {
    return this.subjectRepository.findById(id).map(subjectMapper::toSubjectResponse)
        .orElse(new SubjectResponse());
  }

  @Override
  public List<SubjectResponse> findAll() {
    return this.subjectRepository.findAll().stream()
        .map(subjectMapper::toSubjectResponse)
        .collect(Collectors.toList());
  }

    @Override
    public SubjectResponse findByName(String name) {
       Subject subject= subjectRepository.findByName(name);
        return subjectMapper.toSubjectResponse(subject);
    }

    @Override
  public void deleteById(Integer id) {
    this.subjectRepository.deleteById(id);
  }
}
