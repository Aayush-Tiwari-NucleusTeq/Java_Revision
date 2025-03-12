package dev.work.prac.services.impl;

import java.util.List;
import java.util.Optional;

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
	public User updateUser(int userId ,String address, String contact) {
		User user = this.userRepository.findById(userId).orElseThrow();
		user.setAddress(address);
		user.setContact(contact);
		System.out.println(user);
		return this.userRepository.save(user);
	}

	@Override
	public String deleteUser(int userId) {
		Optional<User> user = this.userRepository.findById(userId);
		System.out.println(user);
		if(!user.isEmpty()) {
			this.userRepository.deleteById(userId);
			return "User with " + userId + " id is deleted successfully";
		}
		else {
			return "User with " + userId + " id is not present in db";
		}
	}

}
