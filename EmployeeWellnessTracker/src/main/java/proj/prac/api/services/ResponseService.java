package proj.prac.api.services;

import java.util.List;

import proj.prac.api.entities.Responses;

public interface ResponseService {

	Responses addResponse(Responses response);
	List<Responses> getAllResponses();
	List<Responses> getAllResponsesByUserId(int userId);
	List<Responses> getAllResponsesByUserIdAndSurveyId(int userId);
}
