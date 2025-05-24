package macdia.dsc.sakila_crud.repository;

import macdia.dsc.sakila_crud.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
