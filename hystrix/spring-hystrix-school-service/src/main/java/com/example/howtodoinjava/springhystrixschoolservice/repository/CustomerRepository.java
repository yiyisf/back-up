package com.example.howtodoinjava.springhystrixschoolservice.repository;

import com.example.howtodoinjava.springhystrixschoolservice.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(@Param("lastName") String lastName);

}
