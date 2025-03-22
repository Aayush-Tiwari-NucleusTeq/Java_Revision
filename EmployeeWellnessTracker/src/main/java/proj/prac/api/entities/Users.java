package proj.prac.api.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(nullable = false)
	@Enumerated
	private Designation role;
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(length = 10)
	private String contact;
	
	@Column(nullable = false)
	private String password;
	
	private int managerId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Responses> responses;
	
}
