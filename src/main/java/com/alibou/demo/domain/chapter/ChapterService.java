package com.alibou.demo.domain.chapter;

import java.util.List;

public interface ChapterService {

    void save(ChapterRequest chapterRequest);
    ChapterResponse findById(Integer id);
    List<ChapterResponse> findAll();
    void deleteById(Integer id);
    List<ChapterResponse> findChaptersBySubjectId(Integer subjectId);

}
