package example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.model.Dog;

@Repository("dogRepository")
public interface DogRepository extends CrudRepository<Dog, Long>{

}
