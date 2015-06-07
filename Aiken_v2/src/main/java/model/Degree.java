package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Degrees database table.
 * 
 */
@Entity
@Table(name="Degrees")
@NamedQuery(name="Degree.findAll", query="SELECT d FROM Degree d")
public class Degree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEGREE_ID")
	private int degreeId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="DEGREE")
	private String degree;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="FIELD_OF_STUDY")
	private String fieldOfStudy;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	//bi-directional many-to-many association to School
	@ManyToMany
	@JoinTable(
		name="SchoolDegree"
		, joinColumns={
			@JoinColumn(name="DEGREES_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="SCHOOLS_ID")
			}
		)
	private List<School> schools;

	public Degree() {
	}

	public int getDegreeId() {
		return this.degreeId;
	}

	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<School> getSchools() {
		return this.schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

}