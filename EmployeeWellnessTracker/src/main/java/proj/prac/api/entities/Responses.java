package proj.prac.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "responses")
public class Responses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int responseId;
	
	@Column(length = 150)
	private String answerText;
	
	@Column(nullable = false)
	private int surveyId;
	
	@Column(nullable = false)
	private int questionId;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "userId")
	private Users user;
}
