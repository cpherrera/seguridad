package tutorial.misionTIC.seguridad.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tutorial.misionTIC.seguridad.models.Permission;

@Repository

public interface PermissionRepository extends CrudRepository<Permission, Integer> {
}
