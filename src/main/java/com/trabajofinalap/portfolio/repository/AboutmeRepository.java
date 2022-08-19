package com.trabajofinalap.portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trabajofinalap.portfolio.model.Aboutme;

@Repository
public interface AboutmeRepository extends CrudRepository<Aboutme, Integer> {
}
