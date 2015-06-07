package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Applicant database table.
 * 
 */
@Entity
@NamedQuery(name="Applicant.findAll", query="SELECT a FROM Applicant a")
public class Applicant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="ADDRESS")
	private String address;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY")
	private String country;

	@Column(name="Current_Job")
	private String current_Job;

	@Lob
	@Column(name="DETAILS")
	private String details;

	@Column(name="EMAIL")
	private String email;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="LastName")
	private String lastName;

	@Column(name="MILITARY")
	private byte military;

	@Column(name="NUM_OF_CONNECTIONS")
	private int numOfConnections;

	@Column(name="STATE")
	private String state;

	public Applicant() {
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrent_Job() {
		return this.current_Job;
	}

	public void setCurrent_Job(String current_Job) {
		this.current_Job = current_Job;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getMilitary() {
		return this.military;
	}

	public void setMilitary(byte military) {
		this.military = military;
	}

	public int getNumOfConnections() {
		return this.numOfConnections;
	}

	public void setNumOfConnections(int numOfConnections) {
		this.numOfConnections = numOfConnections;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}