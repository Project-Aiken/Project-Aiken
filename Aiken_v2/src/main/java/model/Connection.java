package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Connections database table.
 * 
 */
@Entity
@Table(name="Connections")
@NamedQuery(name="Connection.findAll", query="SELECT c FROM Connection c")
public class Connection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONNECTION_ID")
	private int connectionId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="NAME")
	private String name;

	@Column(name="TITLE")
	private String title;

	public Connection() {
	}

	public int getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}