package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Language database table.
 * 
 */
@Entity
@NamedQuery(name="Language.findAll", query="SELECT l FROM Language l")
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LANGUAGE_ID")
	private int languageId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="LANGUAGE_NAME")
	private String languageName;

	@Column(name="PROFICIENCY")
	private String proficiency;

	public Language() {
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getProficiency() {
		return this.proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

}