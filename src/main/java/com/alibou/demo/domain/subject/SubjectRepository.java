package com.alibou.demo.domain.subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

  Subject findByName(String name);
}
