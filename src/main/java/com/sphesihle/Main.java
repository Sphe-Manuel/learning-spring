package com.sphesihle;

import com.sphesihle.udemy.oic.RentalLocation;
import com.sphesihle.udemy.oic.RentalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


public class Main {

    private static final String TITLE = "Forest Gump";
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("udemy.xml");

        RentalService rentalServiceStore = context.getBean("rentalLocationStore",RentalService.class);

        List<RentalLocation> locationStore = rentalServiceStore.find(TITLE,"1602", 10);
        System.out.printf("%s is available at the following locations :\n" , TITLE);

        System.out.println("Bean id : rentalLocationStore");
        locationStore.forEach(location -> System.out.println(location.getName()));
        System.out.println();

        RentalService rentalServiceKiosk = context.getBean("rentalLocationKiosk", RentalService.class);
        List<RentalLocation> locationKiosk = rentalServiceKiosk.find(TITLE , "1602", 10);

        System.out.println("Bean id : rentalLocationKiosk");
        locationKiosk.forEach(location -> System.out.println(location.getName()));

        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    }
}