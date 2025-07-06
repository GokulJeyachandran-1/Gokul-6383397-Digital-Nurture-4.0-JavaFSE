package com.example.country.controller;

import com.example.country.model.Country;
import com.example.country.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return service.getAll();
    }

    @GetMapping("/countries/search")
    public Country getByName(@RequestParam String name) {
        return service.getByCode(name);
    }


    @PostMapping
    public ResponseEntity<Country> add(@RequestBody Country country) {
        return ResponseEntity.ok(service.add(country));
    }

    @PutMapping("/{code}")
    public ResponseEntity<Country> update(@PathVariable String code,
                                          @RequestBody Country body) {
        return ResponseEntity.ok(service.upsert(code, body));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> delete(@PathVariable String code) {
        service.delete(code);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Country> search(@RequestParam("name") String partial) {
        return service.searchByName(partial);
    }
}