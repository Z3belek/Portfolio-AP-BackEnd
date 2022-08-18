package com.trabajofinalap.portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trabajofinalap.portfolio.model.Education;

@Repository
public interface EducationRepository extends CrudRepository<Education, Integer> {
}
