package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Companies database table.
 * 
 */
@Entity
@Table(name="Companies")
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COMPANY_ID")
	private int companyId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="EMAIL_DOMAINS")
	private String emailDomains;

	@Column(name="INDUSTRY")
	private int industry;

	@Column(name="LOGO_URL")
	private String logoUrl;

	@Column(name="NAME")
	private String name;

	@Column(name="SQUARE_LOGO_URL")
	private String squareLogoUrl;

	@Column(name="STATUS")
	private String status;

	@Column(name="TICKER")
	private String ticker;

	@Column(name="TYPE")
	private byte type;

	@Column(name="UNIVERSAL_NAME")
	private String universalName;

	@Column(name="WEBSITE")
	private String website;

	public Company() {
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getEmailDomains() {
		return this.emailDomains;
	}

	public void setEmailDomains(String emailDomains) {
		this.emailDomains = emailDomains;
	}

	public int getIndustry() {
		return this.industry;
	}

	public void setIndustry(int industry) {
		this.industry = industry;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSquareLogoUrl() {
		return this.squareLogoUrl;
	}

	public void setSquareLogoUrl(String squareLogoUrl) {
		this.squareLogoUrl = squareLogoUrl;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public String getUniversalName() {
		return this.universalName;
	}

	public void setUniversalName(String universalName) {
		this.universalName = universalName;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}