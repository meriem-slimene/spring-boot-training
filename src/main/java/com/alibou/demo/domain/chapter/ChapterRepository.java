package com.alibou.demo.domain.chapter;

import com.alibou.demo.domain.subject.Subject;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

  List<Chapter> findBySubject(Subject subject);

}
