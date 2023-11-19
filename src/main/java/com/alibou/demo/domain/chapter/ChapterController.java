package com.alibou.demo.domain.chapter;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/chapters")
public class ChapterController {

  private final ChapterService chapterService;

  @GetMapping("/{chapter-id}")
  public ChapterResponse findById(
      @PathVariable("chapter-id") Integer chapterId) {
    return chapterService.findById(chapterId);
  }

  @PostMapping
  public void save(@RequestBody ChapterRequest chapter) {
    chapterService.save(chapter);
  }

  @GetMapping("/search")
  public List<ChapterResponse> findByFirstSubject(
      @RequestParam(value = "subjectId") Integer subjectId) {
    return chapterService.findChaptersBySubjectId(subjectId);
  }

  @GetMapping
  public List<ChapterResponse> findAll() {
    return chapterService.findAll();
  }
}
