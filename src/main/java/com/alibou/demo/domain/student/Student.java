package com.alibou.demo.domain.student;

import com.alibou.demo.domain.address.Address;
import com.alibou.demo.domain.shared.Audit;
import com.alibou.demo.domain.subject.Subject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends Audit {

  @Column(nullable = false)
  private String firstname;
  @Column(nullable = false)
  private String lastname;
  @Column(nullable = false)
  private int age;

  @OneToOne(mappedBy = "student")
  private Address address;

  @ManyToMany
  @JoinTable(
      name = "std_sub",
      joinColumns = {@JoinColumn(name = "std_id", referencedColumnName = "id")},
      inverseJoinColumns = {@JoinColumn(name = "sub_id", referencedColumnName = "id")}
  )
  // @JsonManagedReference
  private List<Subject> subjects;
}
