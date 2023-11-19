package com.alibou.demo.domain.chapter;

import org.springframework.stereotype.Service;

@Service
public class ChapterMapper {

  public ChapterResponse toChapterResponse(Chapter chapter) {
    return ChapterResponse.builder()
        .id(chapter.getId())
        .name(chapter.getName())
        .build();
  }

  public Chapter toChapter(ChapterRequest chapterRequest) {
    return Chapter.builder()
        .name(chapterRequest.getName())
        .build();
  }
}
