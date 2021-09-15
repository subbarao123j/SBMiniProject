package spring.psi.subba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	
	

	public Student(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@Column(name="sfee")
	private double stdFee;

	

}
