package tutorial.misionTIC.seguridad.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tutorial.misionTIC.seguridad.models.Rol;


@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {
}
