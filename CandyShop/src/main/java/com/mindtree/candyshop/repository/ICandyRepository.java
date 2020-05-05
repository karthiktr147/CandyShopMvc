package com.mindtree.candyshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.candyshop.entity.Candy;

public interface ICandyRepository extends JpaRepository<Candy, Integer> {
	Optional<Candy> findBycandyName(String name);
}
