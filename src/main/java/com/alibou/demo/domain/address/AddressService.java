package com.alibou.demo.domain.address;

import java.util.List;

public interface AddressService {

    void save(Address address);
    Address findById(Integer id);
    List<Address> findAll();
    void deleteById(Integer id);
    List<Address> findAddressByStudentId(Integer studentId);

}
