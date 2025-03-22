package proj.prac.api.services;

import java.util.List;

import proj.prac.api.entities.Questions;

public interface QuestionService {
	
	Questions addQuestion(Questions question);
	List<Questions> getQuestions(int surveyId);
	String deleteQuestion(int questionId);
	
}
