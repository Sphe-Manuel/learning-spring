package com.sphesihle.udemy.oic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KioskLocator implements SourceLocator{


    private  static final List<RentalLocation> locations = new ArrayList<>();

    static {

        locations.add(new RentalLocation("Kiosk A" , Arrays.asList("Forest Gump" , "Speed")));
        locations.add(new RentalLocation("Kiosk B" , Arrays.asList("Jaws" , "Ghost")));
        locations.add(new RentalLocation("Kiosk C" , Arrays.asList("Forest Gump" , "Hook")));
    }

    @Override
    public List<RentalLocation> find(String zipcode , int radius){
        return locations;
    }
}
