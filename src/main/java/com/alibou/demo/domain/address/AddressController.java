package com.alibou.demo.domain.address;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  private final AddressService addressService;

  public AddressController(AddressService addressService) {
    this.addressService = addressService;
  }

  @GetMapping("/{address-id}")
  public AddressResponse findById(
      @PathVariable("address-id") Integer addressId) {
    return addressService.findById(addressId);
  }

  @PostMapping
  public void save(@RequestBody AddressRequest address) {
    addressService.save(address);
  }

  @GetMapping("/student/{student-id}")
  public List<AddressResponse> findByFirstSubject(
      @PathVariable(value = "student-id") Integer studentId) {
    return addressService.findAddressByStudentId(studentId);
  }

  @GetMapping
  public List<AddressResponse> findAll() {
    return addressService.findAll();
  }
}
