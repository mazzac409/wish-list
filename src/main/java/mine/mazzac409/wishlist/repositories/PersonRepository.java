package mine.mazzac409.wishlist.repositories;

import mine.mazzac409.wishlist.models.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chrismazza on 2018-12-30
 **/

public interface PersonRepository extends CrudRepository<Person, Long> {

}
