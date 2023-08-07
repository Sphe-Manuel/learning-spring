package com.sphesihle.udemy.oic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {


    private final SourceLocator sourceLocator ;

    public RentalService(SourceLocator sourceLocator){
        this.sourceLocator = sourceLocator ;
    }

    public List<RentalLocation> find(String title , String zipcode , int miles){

        List<RentalLocation> locations = sourceLocator.find(zipcode , miles);

        return locations.stream()
                .filter(location -> location.getTitles().contains(title)).collect(Collectors.toList());
    }

}
