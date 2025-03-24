package proj.prac.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import proj.prac.api.entities.Responses;

public interface ResponseRepository extends JpaRepository<Responses, Integer> {

	@Query(value = "select * from responses r where r.user_id=:userId", nativeQuery = true)
	List<Responses> findResponsesByUserId(@Param("userId") int userId);
	
	@Query(value = "select * from responses r where r.user_id=:userId and r.survey_id=:surveyId", nativeQuery = true)
	List<Responses> findByUserIdAndSurveyId(@Param("userId") int userId,@Param("surveyId") int surveyId);
}
