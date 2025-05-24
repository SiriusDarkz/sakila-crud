package macdia.dsc.sakila_crud.repository;

import macdia.dsc.sakila_crud.model.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmActorRepository extends JpaRepository<FilmActor, Integer> {
}
