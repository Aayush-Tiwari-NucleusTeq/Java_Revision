package proj.prac.api.services;

import java.util.List;

import proj.prac.api.entities.Users;

public interface UserService {

	Users saveUser(Users user);
	List<Users> getAllUsers();
	List<Users> getAllUsersByManagerId(int managerId);
	Users getSingleUser(int userId);
	Users updateUser(Users user);
	String deleteUser(int userId);
	Users getUserByEmailAndPassword(String email, String password);
	
}
