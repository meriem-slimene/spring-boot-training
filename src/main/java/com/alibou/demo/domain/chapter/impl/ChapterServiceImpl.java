package com.alibou.demo.domain.chapter.impl;

import com.alibou.demo.domain.chapter.Chapter;
import com.alibou.demo.domain.chapter.ChapterMapper;
import com.alibou.demo.domain.chapter.ChapterRepository;
import com.alibou.demo.domain.chapter.ChapterRequest;
import com.alibou.demo.domain.chapter.ChapterResponse;
import com.alibou.demo.domain.chapter.ChapterService;
import com.alibou.demo.domain.subject.Subject;
import com.alibou.demo.domain.subject.SubjectRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImpl implements ChapterService {

  private final ChapterRepository chapterRepository;
  private final SubjectRepository subjectRepository;
  private final ChapterMapper chapterMapper;


  public ChapterServiceImpl(ChapterRepository studentRepository, SubjectRepository subjectRepository,
      ChapterMapper chapterMapper) {
    this.chapterRepository = studentRepository;
    this.subjectRepository = subjectRepository;
    this.chapterMapper = chapterMapper;
  }

  @Override
  public void save(ChapterRequest chapterRequest) {
    Chapter chapter = chapterMapper.toChapter(chapterRequest);
    this.chapterRepository.save(chapter);
  }

  @Override
  public ChapterResponse findById(Integer id) {
    return this.chapterRepository.findById(id)
        .map(chapterMapper::toChapterResponse)
        .orElse(new ChapterResponse());
  }

  @Override
  public List<ChapterResponse> findAll() {
    return this.chapterRepository.findAll() .stream()
        .map(chapterMapper::toChapterResponse)
        .collect(Collectors.toList());
  }

  @Override
  public void deleteById(Integer id) {
    this.chapterRepository.deleteById(id);
  }

  @Override
  public List<ChapterResponse> findChaptersBySubjectId(Integer subjectId) {
    Subject subject = subjectRepository.findById(subjectId).orElse(null);
    return chapterRepository.findBySubject(subject) .stream()
        .map(chapterMapper::toChapterResponse)
        .collect(Collectors.toList());
  }
}
