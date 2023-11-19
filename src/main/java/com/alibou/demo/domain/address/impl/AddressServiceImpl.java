package com.alibou.demo.domain.address.impl;

import com.alibou.demo.domain.address.AddressService;
import com.alibou.demo.domain.address.Address;
import com.alibou.demo.domain.address.AddressRepository;
import com.alibou.demo.domain.student.Student;
import com.alibou.demo.domain.student.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

  private final AddressRepository addressRepository;
  private final StudentRepository studentRepository;

  public AddressServiceImpl(AddressRepository addressRepository, StudentRepository studentRepository) {
    this.addressRepository = addressRepository;
    this.studentRepository = studentRepository;
  }

  @Override
  public void save(Address address) {
    this.addressRepository.save(address);
  }

  @Override
  public Address findById(Integer id) {
    return this.addressRepository.findById(id)
        .orElse(null);
  }
  @Override
  public List<Address> findAll() {
    return this.addressRepository.findAll();
  }

  @Override
  public void deleteById(Integer id) {
    this.addressRepository.deleteById(id);
  }

  @Override
  public List<Address> findAddressByStudentId(Integer studentId) {
    Student student = studentRepository.findById(studentId).orElse(null);
    return addressRepository.findByStudent(student);
  }

}
