package com.cognizant.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}

