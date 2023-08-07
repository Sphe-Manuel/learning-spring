package com.sphesihle.udemy.oic;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class RentalLocation {

    private String name ;

    private List<String> titles;



}
