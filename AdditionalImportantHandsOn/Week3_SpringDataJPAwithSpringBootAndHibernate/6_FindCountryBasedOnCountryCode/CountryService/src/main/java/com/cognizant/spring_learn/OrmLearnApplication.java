package com.cognizant.spring_learn;
import java.util.*;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        getAllCountriesTest();
    }

    private static void getAllCountriesTest() throws CountryNotFoundException {
    LOGGER.info("Start");
    System.out.println("Enter a country code to find:");
    String code = new Scanner(System.in).nextLine().trim().toUpperCase();
    try {
        Country country = countryService.findCountryByCode(code);
        LOGGER.debug("Country found: {}", country);
        System.out.println("Country found: " + country);
    } catch (CountryNotFoundException e) {
        LOGGER.error("Exception: {}", e.getMessage());
        System.out.println("Error: " + e.getMessage());
    }
    LOGGER.info("End");
}

    }

