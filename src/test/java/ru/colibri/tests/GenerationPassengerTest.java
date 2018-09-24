package ru.colibri.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class GenerationPassengerTest {

    public static  void  main(String args[]) {

        Locale locale = new Locale("ru");
        Faker faker = new Faker(locale);

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println("name " + name);
        System.out.println("firstName " + firstName);
        System.out.println("lastName " + lastName);
        System.out.println("streetAddress " + streetAddress);
    }
}
