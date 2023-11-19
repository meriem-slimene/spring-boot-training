package com.alibou.demo.domain.chapter;

import jakarta.validation.constraints.NotEmpty;
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
public class ChapterRequest {

  @NotNull(message = "chapter name must not be null")
  @NotEmpty(message = "chapter name must not be empty")
  private String name;
}
