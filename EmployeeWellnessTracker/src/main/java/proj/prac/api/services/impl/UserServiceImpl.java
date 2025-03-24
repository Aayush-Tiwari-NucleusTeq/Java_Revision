package proj.prac.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.prac.api.entities.Users;
import proj.prac.api.exception.InvalidCredentialException;
import proj.prac.api.exception.ResourceNotFoundException;
import proj.prac.api.repository.UserRepository;
import proj.prac.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Users saveUser(Users user) {
		return this.userRepository.save(user);
	}
	
	@Override
	public List<Users> getAllUsers() {
		return this.userRepository.findAll();
	}

	@Override
	public List<Users> getAllUsersByManagerId(int managerId) {
		return this.userRepository.findByManagerId(managerId);
	}

	@Override
	public Users getSingleUser(int userId) {
		Users user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " is not present in the database"));
		if(user != null) {
			return user;
		}
		return null;
	}

	@Override
	public Users updateUser(Users user) {
		return this.userRepository.save(user);
	}

	@Override
	public String deleteUser(int userId) {
		Optional<Users> user = this.userRepository.findById(userId);
		if(!user.isEmpty()) {
			this.userRepository.deleteById(userId);
			return "Employee is successfully deleted";
		}
		return "Employee is not present in the database with id - " + userId;
	}

	@Override
	public Users getUserByEmailAndPassword(String email, String password) {
		System.out.println("Entering");
		Users user = this.userRepository.findByEmailAndPassword(email, password).orElseThrow(() -> new InvalidCredentialException("Check email and password"));
		return user;
	}

}
