package dev.work.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.work.prac.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
