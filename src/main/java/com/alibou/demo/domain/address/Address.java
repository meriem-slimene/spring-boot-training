package com.alibou.demo.domain.address;

import com.alibou.demo.domain.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String homeAddress;
    private String postalCode;
    private String city;

    @OneToOne
    @JoinColumn(name = "std_id")
    private Student student;
}
