package mine.mazzac409.wishlist.controllers;

import mine.mazzac409.wishlist.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chrismazza on 2018-12-30
 **/

@Controller
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/persons")
    private String getPersons(Model Person){
        Person.addAttribute("persons", personRepository.findAll());
        //Person.addAttribute("title", "Controller Injected Title");

        return "person";
    }
}
