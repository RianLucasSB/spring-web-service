package com.boas.rian.springcourse.repositories;

import com.boas.rian.springcourse.entities.Order;
import com.boas.rian.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
