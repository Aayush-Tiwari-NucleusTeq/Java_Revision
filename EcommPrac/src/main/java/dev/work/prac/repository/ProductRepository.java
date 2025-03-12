package dev.work.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.work.prac.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
