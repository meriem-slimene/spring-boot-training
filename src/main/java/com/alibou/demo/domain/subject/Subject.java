package com.alibou.demo.domain.subject;

import com.alibou.demo.domain.chapter.Chapter;
import com.alibou.demo.domain.student.Student;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "subjects")
    @JsonBackReference
    private List<Student> students;

    @OneToMany(mappedBy = "subject")
    private List<Chapter> chapters;
}
