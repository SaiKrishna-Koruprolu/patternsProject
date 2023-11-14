/**
 * 
 */
package com.skClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.skClasses.DMS.Models.Dog;

/**
 * @author Sai Krishna Koruprolu
 * @dateNov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
