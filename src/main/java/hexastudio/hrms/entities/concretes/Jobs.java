package hexastudio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="job_titles")
@Data
public class Jobs {
	

	@Column(name="int")
	@Id
	@GeneratedValue
	private int id;
	
	
	@Column(name="titles")
	private String jobTitle;
}
