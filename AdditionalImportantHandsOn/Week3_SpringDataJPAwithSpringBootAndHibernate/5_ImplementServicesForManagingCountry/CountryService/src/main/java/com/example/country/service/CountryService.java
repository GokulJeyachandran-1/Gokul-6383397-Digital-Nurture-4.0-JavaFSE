package com.example.country.service;

import com.example.country.model.Country;
import com.example.country.repository.CountryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    private final CountryRepository repo;

    public CountryService(CountryRepository repo) {
        this.repo = repo;
    }

    // Find a country by its ISO‑2 code - IN, US
    public Country getByCode(String code) {
        return repo.findByCode(code.toUpperCase());
    }

    public List<Country> getAll() {
    return repo.findAll();
}
  

    /** Add a new country (or overwrite if code already exists). */
    public Country add(Country country) {
        country.setCode(country.getCode().toUpperCase());
        return repo.save(country);
    }

    // Update country name by code
public Country upsert(String code, Country updated) {
    String key = code.toUpperCase();
    // ensure the path variable "code" wins over whatever is in the body
    updated.setCode(key);
    Country existing = repo.findByCode(key);
    if (existing != null) {
        existing.setName(updated.getName());
        return repo.save(existing); // update path
    } else {
        return repo.save(updated); // insert path
    }
}

    /** Delete a country by code. */
    public void delete(String code) {
        repo.deleteById(code.toUpperCase());
    }

    /** Search countries whose names contain the given substring (case‑insensitive). */
    public List<Country> searchByName(String partial) {
        return repo.findByNameContainingIgnoreCase(partial);
    }
}
