package com.xeridia.paisespersistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class CountriesController {
    @Autowired
    CountryRepository countryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCountry (@RequestParam String code, @RequestParam String name,@RequestParam String continent, @RequestParam String region, @RequestParam long surface, @RequestParam int indepYear, @RequestParam long population,@RequestParam double lifeExpectancy){

        Country n = new Country();
        n.setCode(code);
        n.setName(name);
        n.setContinent(continent);
        n.setIndepYear(indepYear);
        n.setPopulation(Long.parseLong(region));
        n.setLifeExpectancy(lifeExpectancy);
        n.setSurfaceArea(surface);
        countryRepository.save(n);
        return "Saved";
    }

    @GetMapping("/{name}")
    public @ResponseBody Country country (@PathVariable String name){
        return countryRepository.findByNameLikeIgnoreCase(name);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable <Country> getAllCountries(){
        return countryRepository.findAll();
    }

}
