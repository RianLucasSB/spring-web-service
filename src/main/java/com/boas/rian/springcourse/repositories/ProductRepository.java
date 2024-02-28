package com.boas.rian.springcourse.repositories;

import com.boas.rian.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
