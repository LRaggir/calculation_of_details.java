package com.example.demo.repo;

import com.example.demo.model.Remen;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RemenRepository extends CrudRepository<Remen,Integer> {

}


