package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        LOGGER.info("STARTED");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country code: ");
        String code = scanner.nextLine();
        System.out.print("Enter country name: ");
        String name = scanner.nextLine();
        scanner.close();

        Country country = new Country(code, name);
        countryService.addCountry(country);

        try {
            Country foundCountry = countryService.findCountryByCode(code);
            LOGGER.info("Country: {}", foundCountry);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Error: {}", e.getMessage());
        }

        LOGGER.info("END");
    }
}
