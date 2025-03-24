package proj.prac.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.prac.api.entities.Questions;
import proj.prac.api.entities.Surveys;
import proj.prac.api.exception.ResourceNotFoundException;
import proj.prac.api.repository.SurveyRepository;
import proj.prac.api.services.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	@Autowired
	private SurveyRepository surveyRepository;

	@Override
	public Surveys addSurvey(Surveys survey) {
		List<Questions> questions = survey.getQuestions();
		for (Questions question : questions) {
			question.setSurvey(survey);
		}
		survey.setQuestions(questions);
		return this.surveyRepository.save(survey);
	}

	@Override
	public Surveys getSurvey(int surveyId) {
		return this.surveyRepository.findById(surveyId).orElseThrow(() -> new ResourceNotFoundException("The survey with id " + surveyId + " is not present in the database"));
	}

	@Override
	public List<Surveys> getAllSurverys() {
		return this.surveyRepository.findAll();
	}

	@Override
	public Surveys updateSurvey(Surveys survey) {
		return this.surveyRepository.save(survey);
	}

	@Override
	public String deleteSurvey(int surveyId) {
		Optional<Surveys> survey = this.surveyRepository.findById(surveyId);
		if(!survey.isEmpty()) {
			this.surveyRepository.deleteById(surveyId);
			return "Survey is deleted successfully";
		} else {
			return "Please check survey ID, it is not present in the database";
		}
	}
	
}
