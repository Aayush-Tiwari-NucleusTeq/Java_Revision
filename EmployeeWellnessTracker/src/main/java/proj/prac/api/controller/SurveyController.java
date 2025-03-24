package proj.prac.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proj.prac.api.entities.Surveys;
import proj.prac.api.services.SurveyService;

@RestController
@RequestMapping("survey")
public class SurveyController {

	@Autowired
	private SurveyService surveyService;
	
	@PostMapping
	public ResponseEntity<Surveys> addSurvey(@RequestBody Surveys survey){
		Surveys savedSurvey = this.surveyService.addSurvey(survey);
		return ResponseEntity.ok(savedSurvey);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Surveys>> getAllSurveys(){
		return ResponseEntity.ok(this.surveyService.getAllSurverys());
	}
	
	@GetMapping
	public ResponseEntity<Surveys> getSingleSurvey(@RequestParam("surveyId") int surveyId){
		return ResponseEntity.ok(this.surveyService.getSurvey(surveyId));
	}
	
	@DeleteMapping
	public ResponseEntity<String> DeleteSurvey(@RequestParam("surveyId") int surveyId){
		return ResponseEntity.ok(this.surveyService.deleteSurvey(surveyId));
	}
}
