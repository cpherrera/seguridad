package tutorial.misionTIC.seguridad.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tutorial.misionTIC.seguridad.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE email=? AND password=?;", nativeQuery = true)
    Optional<User> validateLogin(String email, String password);
}
