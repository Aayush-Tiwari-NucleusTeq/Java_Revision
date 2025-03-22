package proj.prac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.prac.api.entities.Surveys;

public interface SurveyRepository extends JpaRepository<Surveys, Integer> {

}
