package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Skills database table.
 * 
 */
@Entity
@Table(name="Skills")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SKILL_ID")
	private int skillId;

	@Column(name="APPLICANT_ID")
	private int applicantId;

	@Column(name="SKILL")
	private String skill;

	public Skill() {
	}

	public int getSkillId() {
		return this.skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}