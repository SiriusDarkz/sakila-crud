package macdia.dsc.sakila_crud.repository;

import macdia.dsc.sakila_crud.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
