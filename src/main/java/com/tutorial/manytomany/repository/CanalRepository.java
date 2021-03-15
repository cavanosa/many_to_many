package com.tutorial.manytomany.repository;

import com.tutorial.manytomany.entity.Canal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {
}
