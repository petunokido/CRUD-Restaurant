package com.testepratico.Teste.repository;

import com.testepratico.Teste.model.Chef;
import com.testepratico.Teste.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends JpaRepository<Chef, Long> {
}
