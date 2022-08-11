package com.trabajofinalap.portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trabajofinalap.portfolio.model.Experience;

@Repository
public interface ExperienceRepository extends CrudRepository<Experience, Integer>{
  
}
