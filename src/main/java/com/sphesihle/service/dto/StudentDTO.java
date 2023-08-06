package com.sphesihle.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class StudentDTO {


    private String name ;

    private int age ;

}
