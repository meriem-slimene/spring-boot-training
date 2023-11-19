package com.alibou.demo.domain.chapter;

import com.alibou.demo.domain.shared.Audit;
import com.alibou.demo.domain.subject.Subject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Chapter extends Audit {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "sub_id")
    private Subject subject;
}
