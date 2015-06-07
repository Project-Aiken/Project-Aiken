package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Patents database table.
 * 
 */
@Entity
@Table(name="Patents")
@NamedQuery(name="Patent.findAll", query="SELECT p FROM Patent p")
public class Patent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PATENT_ID")
	private int patentId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="INVENTORS_ID")
	private int inventorsId;

	@Column(name="INVENTORS_NAME")
	private String inventorsName;

	@Column(name="NUMBER")
	private int number;

	@Column(name="OFFICE")
	private String office;

	@Temporal(TemporalType.DATE)
	@Column(name="PATENT_DATE")
	private Date patentDate;

	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="STATUS_NAME")
	private String statusName;

	@Lob
	@Column(name="SUMMARY")
	private String summary;

	@Column(name="TITLE")
	private String title;

	@Column(name="URL")
	private String url;

	public Patent() {
	}

	public int getPatentId() {
		return this.patentId;
	}

	public void setPatentId(int patentId) {
		this.patentId = patentId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public int getInventorsId() {
		return this.inventorsId;
	}

	public void setInventorsId(int inventorsId) {
		this.inventorsId = inventorsId;
	}

	public String getInventorsName() {
		return this.inventorsName;
	}

	public void setInventorsName(String inventorsName) {
		this.inventorsName = inventorsName;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Date getPatentDate() {
		return this.patentDate;
	}

	public void setPatentDate(Date patentDate) {
		this.patentDate = patentDate;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}