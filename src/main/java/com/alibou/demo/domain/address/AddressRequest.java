package com.alibou.demo.domain.address;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressRequest {

  @NotNull(message = "the home address must not be null")
  private String homeAddress;
  @NotNull(message = "The postalCode  must not be null")
  private String postalCode;
  @NotNull(message = "The city  must not be null")
  private String city;
}
