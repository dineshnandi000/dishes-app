package com.dishes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dishes.model.Dishes;

@Repository
public interface DishRepository extends JpaRepository<Dishes, Long> {

}