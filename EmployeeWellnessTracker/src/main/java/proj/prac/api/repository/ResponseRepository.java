package proj.prac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.prac.api.entities.Responses;

public interface ResponseRepository extends JpaRepository<Responses, Integer> {

}
