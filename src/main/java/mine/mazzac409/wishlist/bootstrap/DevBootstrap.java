package mine.mazzac409.wishlist.bootstrap;

import mine.mazzac409.wishlist.models.Person;
import mine.mazzac409.wishlist.repositories.PersonRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by chrismazza on 2018-12-30
 **/

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PersonRepository personRepository;

    public DevBootstrap(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //Chris
        LocalDate dobChris = LocalDate.of(1972,10,2);
        Person chris = new Person("Chris", "Mazza", 'M', dobChris);
        personRepository.save(chris);

        //Madeline
        LocalDate dobMadeline = LocalDate.of(2002, 8,28);
        Person madeline = new Person("Madeline", "Mazza", 'F', dobMadeline);
        personRepository.save(madeline);

        //Lainee
        LocalDate dobLainee = LocalDate.of(2005,7,20);
        Person lainee = new Person("Lainee", "Mazza", 'F', dobLainee);
        personRepository.save(lainee);
    }
}
