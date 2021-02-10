package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
