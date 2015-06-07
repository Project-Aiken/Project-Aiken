package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Urls database table.
 * 
 */
@Entity
@Table(name="Urls")
@NamedQuery(name="Url.findAll", query="SELECT u FROM Url u")
public class Url implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="URL_ID")
	private int urlId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="WEBSITE")
	private String website;

	public Url() {
	}

	public int getUrlId() {
		return this.urlId;
	}

	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}