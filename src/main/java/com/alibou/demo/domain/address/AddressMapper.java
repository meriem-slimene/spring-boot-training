package com.alibou.demo.domain.address;

import com.alibou.demo.domain.student.Student;
import org.springframework.stereotype.Service;

@Service
public class AddressMapper {

  public AddressResponse toAddressResponse(Address address) {
    return AddressResponse.builder()
        .id(address.getId())
        .homeAddress(address.getHomeAddress())
        .postalCode(address.getPostalCode())
        .city(address.getCity())
        .build();
  }

  public Address toAddress(AddressRequest addressRequest) {
      return Address.builder()
          .homeAddress(addressRequest.getHomeAddress())
          .postalCode(addressRequest.getPostalCode())
          .city(addressRequest.getCity())
          .build();
  }
}
