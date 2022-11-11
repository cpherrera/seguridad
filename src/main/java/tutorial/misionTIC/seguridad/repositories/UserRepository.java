package tutorial.misionTIC.seguridad.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tutorial.misionTIC.seguridad.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
