package com.vicmar57.dogshelter.repo;

import com.vicmar57.dogshelter.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog,Long> {
	
	Dog findByName(String name);

}
