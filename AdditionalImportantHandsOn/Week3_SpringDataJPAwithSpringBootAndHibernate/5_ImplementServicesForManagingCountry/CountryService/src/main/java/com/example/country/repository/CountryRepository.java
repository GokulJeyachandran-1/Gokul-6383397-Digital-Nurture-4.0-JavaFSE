package com.example.country.repository;

import com.example.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCode(String code);
    List<Country> findByNameContainingIgnoreCase(String partial);
    List<Country> findAll();
}