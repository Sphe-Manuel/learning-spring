package com.sphesihle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // I want a Bean of type Employee

        Employee employeeBean = context.getBean(Employee.class);

        employeeBean.displayName();


    }
}