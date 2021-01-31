package maratk.demo.controller;

import maratk.demo.entity.Person;
import maratk.demo.repository.PerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private static final String GET_PERSON_BY_ID_REQUEST =
            "/persons/by-city";

    private PerRepository personsRepository;

    public Controller(PerRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping(GET_PERSON_BY_ID_REQUEST)
    public List<Person> getPersonsById(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }

}