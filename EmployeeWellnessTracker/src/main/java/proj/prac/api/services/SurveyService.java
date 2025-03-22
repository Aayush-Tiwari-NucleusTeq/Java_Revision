package proj.prac.api.services;

import java.util.List;

import proj.prac.api.entities.Surveys;

public interface SurveyService {

	Surveys addSurvey(Surveys survey);
	Surveys getSurvey(int surveyId);
	List<Surveys> getAllSurverys();
	Surveys updateSurvey(Surveys survey);
	String deleteSurvey(int surveyId);
}
