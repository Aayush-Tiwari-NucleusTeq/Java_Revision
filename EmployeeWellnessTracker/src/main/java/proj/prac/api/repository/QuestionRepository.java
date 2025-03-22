package proj.prac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.prac.api.entities.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Integer>{

}
