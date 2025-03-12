package dev.work.prac.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 35, nullable = false)
	private String firstName;
	
	@Column(length = 35, nullable = false)
	private String lastName;
	
	@Column(length = 75)
	private String address;
	
	@Column(length = 35, nullable = false)
	private String email;
	
	@Column(length = 10)
	private String contact;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Product> products;
}
