package proj.prac.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	
	@Column(length = 100)
	private String queText;
	
	@Max(value = 10)
	@Min(value = 0)
	private int queRating;
	
	@ManyToOne
	@JoinColumn(name = "surveyId")
	private Surveys survey;
}
