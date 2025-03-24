package proj.prac.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.prac.api.entities.Responses;
import proj.prac.api.entities.Users;
import proj.prac.api.exception.ResourceNotFoundException;
import proj.prac.api.repository.ResponseRepository;
import proj.prac.api.repository.UserRepository;
import proj.prac.api.services.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService {
	
	@Autowired
	private ResponseRepository responseRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Responses addResponse(Responses response) {
		Users user = this.userRepository.findById(1).orElseThrow(() -> new ResourceNotFoundException("User is not present"));
		response.setUser(user);
		return this.responseRepository.save(response);
	}

	@Override
	public List<Responses> getAllResponses() {
		return this.responseRepository.findAll();
	}

	@Override
	public List<Responses> getAllResponsesByUserId(int userId) {
		return this.responseRepository.findResponsesByUserId(userId);
	}

	@Override
	public List<Responses> getAllResponsesByUserIdAndSurveyId(int userId, int surveyId) {
		return this.responseRepository.findByUserIdAndSurveyId(userId, surveyId);
	}

}
