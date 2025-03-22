package proj.prac.api.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "surveys")
public class Surveys {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	
	@Column(length = 50)
	private String title;
	
	@Column(length = 150)
	private String description;
	
	@Column(length = 10)
	private String status;
	
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@Column(length = 50)
	private String createdBy;
	
	@OneToMany(mappedBy = "survey",cascade = CascadeType.ALL)
	private List<Questions> questions;
	
}
