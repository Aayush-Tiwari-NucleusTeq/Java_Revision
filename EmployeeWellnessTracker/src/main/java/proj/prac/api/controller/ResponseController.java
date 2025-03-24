package proj.prac.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proj.prac.api.entities.Responses;
import proj.prac.api.services.ResponseService;

@RestController
@RequestMapping("response")
public class ResponseController {

	@Autowired
	private ResponseService responseService;
	
	@PostMapping
	public ResponseEntity<Responses> addResponse(@RequestBody Responses response){
		Responses savedResponse = this.responseService.addResponse(response);
		return ResponseEntity.ok(savedResponse);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Responses>> getAllResponses(){
		return ResponseEntity.ok(this.responseService.getAllResponses());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Responses>> getAllResponsesByUserId(@PathVariable("userId") int userId){
		return ResponseEntity.ok(this.responseService.getAllResponsesByUserId(userId));
	}
	
	@GetMapping
	public ResponseEntity<List<Responses>> getAllResponsesByUserIdAndSurveyId(@RequestParam("userId") int userId, @RequestParam("surveyId") int surveyId){
		return ResponseEntity.ok(this.responseService.getAllResponsesByUserIdAndSurveyId(userId, surveyId));
	}
}
