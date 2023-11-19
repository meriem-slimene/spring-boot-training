package com.alibou.demo.domain.address;

import com.alibou.demo.domain.student.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

  List<Address> findByStudent(Student student);

}
