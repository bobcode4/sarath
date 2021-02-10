package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Member {

	@Id
	private Long memberId;
	
	private Long memberName;
	
	private Long technologyId;
	
	private Date dateOfBirth;
	
	private String qualification;
	
	private Long experience;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMemberName() {
		return memberName;
	}

	public void setMemberName(Long memberName) {
		this.memberName = memberName;
	}


	public Long getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Long technologyId) {
		this.technologyId = technologyId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Long getExperience() {
		return experience;
	}

	public void setExperience(Long experience) {
		this.experience = experience;
	}
	
	
}
