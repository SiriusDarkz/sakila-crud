package macdia.dsc.sakila_crud.repository;

import macdia.dsc.sakila_crud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
