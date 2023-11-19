package com.alibou.demo.domain.address;

import java.util.List;

public interface AddressService {

    void save(AddressRequest addressRequest);
    AddressResponse findById(Integer id);
    List<AddressResponse> findAll();
    void deleteById(Integer id);
    List<AddressResponse> findAddressByStudentId(Integer studentId);

}
