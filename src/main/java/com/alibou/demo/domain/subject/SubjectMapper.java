package com.alibou.demo.domain.subject;

import org.springframework.stereotype.Service;

@Service
public class SubjectMapper {

  public SubjectResponse toSubjectResponse(Subject subject) {
    return SubjectResponse.builder()
        .id(subject.getId())
        .name(subject.getName())
        .build();
  }

  public Subject toSubject(SubjectRequest subjectRequest) {
    return Subject.builder()
        .name(subjectRequest.getName())
        .build();
  }
}
