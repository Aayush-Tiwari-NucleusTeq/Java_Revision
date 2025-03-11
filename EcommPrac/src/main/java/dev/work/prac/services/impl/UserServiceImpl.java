package dev.work.prac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.work.prac.entities.User;
import dev.work.prac.repository.UserRepository;
import dev.work.prac.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User getUser(int userId) {
		return this.userRepository.findById(userId).orElseThrow();
	}

	@Override
	public List<User> getUsers() {
		return this.userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public String deleteUser(int userId) {
		return null;
	}

}
