package com.sa.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sa.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
