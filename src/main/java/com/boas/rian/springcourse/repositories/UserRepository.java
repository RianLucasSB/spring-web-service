package com.boas.rian.springcourse.repositories;

import com.boas.rian.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
