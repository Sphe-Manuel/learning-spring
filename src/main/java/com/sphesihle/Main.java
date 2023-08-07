package com.sphesihle;

import com.sphesihle.udemy.oic.RentalLocation;
import com.sphesihle.udemy.oic.RentalService;
import com.sphesihle.udemy.oic.StoreLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Main {

    private static final String TITLE = "Forest Gump";
    public static void main(String[] args) {

        RentalService rentalService = new RentalService(new StoreLocator());

        List<RentalLocation> locations = rentalService.find(TITLE, "1602",10);

        System.out.printf("%s is available a the following locations : \n" , TITLE);

        locations.forEach(rentalLocation -> System.out.println(rentalLocation.getName()));
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    }
}