package com.example.demo.repo;

import com.example.demo.model.Coefficient;
import com.example.demo.model.Remen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CoefficientRepository extends CrudRepository<Coefficient,Integer> {

}


