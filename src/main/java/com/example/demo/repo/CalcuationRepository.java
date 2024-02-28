package com.example.demo.repo;

import com.example.demo.model.Calcuation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalcuationRepository extends CrudRepository<Calcuation,Integer> {
}
