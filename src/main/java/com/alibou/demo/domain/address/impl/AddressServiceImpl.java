package com.alibou.demo.domain.address.impl;

import com.alibou.demo.domain.address.Address;
import com.alibou.demo.domain.address.AddressMapper;
import com.alibou.demo.domain.address.AddressRepository;
import com.alibou.demo.domain.address.AddressRequest;
import com.alibou.demo.domain.address.AddressResponse;
import com.alibou.demo.domain.address.AddressService;
import com.alibou.demo.domain.student.Student;
import com.alibou.demo.domain.student.StudentRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

  private final AddressRepository addressRepository;
  private final StudentRepository studentRepository;
  private final AddressMapper addressMapper;

  @Override
  public void save(AddressRequest address) {
    this.addressRepository.save(addressMapper.toAddress(address));
  }

  @Override
  public AddressResponse findById(Integer id) {
    return this.addressRepository.findById(id)
        .map(addressMapper::toAddressResponse)
        .orElse(new AddressResponse());
  }

  @Override
  public List<AddressResponse> findAll() {

    return this.addressRepository.findAll()
        .stream()
        .map(addressMapper::toAddressResponse)
        .collect(Collectors.toList());
  }

  @Override
  public void deleteById(Integer id) {
    this.addressRepository.deleteById(id);
  }

  @Override
  public List<AddressResponse> findAddressByStudentId(Integer studentId) {
    Student student = studentRepository.findById(studentId).orElse(null);
    return addressRepository.findByStudent(student)
        .stream()
        .map(addressMapper::toAddressResponse)
        .collect(Collectors.toList());
  }

}
