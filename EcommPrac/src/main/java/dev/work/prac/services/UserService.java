package dev.work.prac.services;

import java.util.List;

import dev.work.prac.entities.User;

public interface UserService {

	User saveUser(User user);
	User getUser(int userId);
	List<User> getUsers();
	User updateUser(User user);
	String deleteUser(int userId);
}
