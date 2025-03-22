package proj.prac.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.prac.api.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	List<Users> findByManagerId(int managerId);
	Optional<Users> findByEmailAndPassword(String email, String password);
}
