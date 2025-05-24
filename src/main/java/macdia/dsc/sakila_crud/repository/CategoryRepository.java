package macdia.dsc.sakila_crud.repository;

import macdia.dsc.sakila_crud.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
