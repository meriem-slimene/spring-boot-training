package com.alibou.demo.domain.subject;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

  private final SubjectService subjectService;

  public SubjectController(SubjectService service) {
    this.subjectService = service;
  }

  @PostMapping
  public void save(@RequestBody SubjectRequest subject) {
    subjectService.save(subject);
  }

  @GetMapping("/{subject-id}")
  public SubjectResponse findById(@PathVariable("subject-id") Integer subjectId) {
    return subjectService.findById(subjectId);
  }

  @GetMapping("/search")
  public List<SubjectResponse> findByName(@RequestParam(value = "name") String name) {
    return subjectService.findAll();
  }

  @GetMapping
  public List<SubjectResponse> findAll() {
    return subjectService.findAll();
  }
}
