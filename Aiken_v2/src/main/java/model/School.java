package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Schools database table.
 * 
 */
@Entity
@Table(name="Schools")
@NamedQuery(name="School.findAll", query="SELECT s FROM School s")
public class School implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SCHOOL_ID")
	private int schoolId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="SCHOOL_NAME")
	private String schoolName;

	//bi-directional many-to-many association to Degree
	@ManyToMany(mappedBy="schools")
	private List<Degree> degrees;

	public School() {
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Degree> getDegrees() {
		return this.degrees;
	}

	public void setDegrees(List<Degree> degrees) {
		this.degrees = degrees;
	}

}